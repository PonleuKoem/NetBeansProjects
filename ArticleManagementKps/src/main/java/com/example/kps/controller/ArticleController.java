/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kps.controller;

import com.example.kps.controller.SearchController.SearchController;
import com.example.kps.model.ArticleModel;
import com.example.kps.model.Category;
import com.example.kps.model.Filter.ArticleFilter;
import com.example.kps.repository.ArticleRepository;
import com.example.kps.repository.CategoryRepository;
import com.example.kps.service.ArticleService;
import com.example.kps.service.CategoryService;
import com.example.kps.service.CategoryServiceIpl;
import com.example.kps.service.UploadService;
import com.example.kps.service.UploadServiceTest;
import static java.nio.file.Files.list;
import java.util.List;
import static java.util.Locale.filter;
import javax.validation.Valid;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author UC
 */
@Controller
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @Autowired
    private CategoryService categoryService;
    public ArticleController(ArticleService articleService){
        this.articleService = articleService;
    }
    
//    @GetMapping("/")
//    public String HomePageRedirect(){
//        return "redirect:/?page=1&limit5";
//    }
    
    
    @GetMapping(value={"/article/pagination/view"})
    public String articlePage(ArticleFilter filter,ModelMap model, Category category){
        try{
            
        int page = filter.getPage();
        int limit = filter.getLimit();
        System.out.println(filter);
        //find pg and page for url request
        
        
        int j = articleService.findAllarticle(filter).size();
        System.out.println(j+"size"+articleService.findAllarticle(filter).size());
        int k = j/filter.getLimit();
        int pg;//this is page total count
        if(j%limit==0){
            pg = k;
        }else{
            pg=k+1;
        }
        filter.setPg(pg);
        
        }catch(NullPointerException e){
            filter.setPage(1);
            filter.setLimit(5);
            filter.setOffset(0);
            int j = articleService.findAllarticle(filter).size();
        System.out.println(j+"size"+articleService.findAllarticle(filter).size());
        int k = j/filter.getLimit();
        int pg;//this is page total count
        int limit = filter.getLimit();
        if(j%limit==0){
            pg = k;
        }else{
            pg=k+1;
        }
        filter.setPg(pg);
            System.out.println(filter+""+category+""+e);
            
        }
        List<ArticleModel> articles = articleService.findAll(filter);
        model.addAttribute("category", category);
        model.addAttribute("filter", filter);
        model.addAttribute("article", articles);
        return "article";
    }
    //+++++++++++++++++++++++++++++++++++Article page detail++++++++++++++++++++++++++++++++++++++++++++++
    @GetMapping("/article/view")
    public String articleViewPage(ModelMap model, @RequestParam("id") Integer id){
        ArticleModel article = articleService.findOne(id);
        model.addAttribute("article", article);
        return "articledetail";
    }
    
    //+++++++++++++++++++++++++++++++++++Delete Record++++++++++++++++++++++++++++++++++++++++++++++
    @GetMapping("/article/remove/{id}")
    public String articleViewPage1(ModelMap model, @PathVariable("id") Integer id){
        articleService.remove(id);
        return "redirect:/article";
    }
    
    //+++++++++++++++++++++++++++++++++++View page save++++++++++++++++++++++++++++++++++++++++++++++
    @GetMapping("/article/savepage")
    public String SavePage(ModelMap model){
        List<Category> category = categoryService.findAll();
        ArticleModel article = new ArticleModel();        
            article.setId(articleService.findAllarticle1().get(articleService.findAllarticle1().size()-1).getId()+1);
            System.out.println(articleService.findAllarticle1().size()+" 111");
        model.addAttribute("category", category);
        model.addAttribute("article", article);
        model.addAttribute("addStatus", true);
        return "article_save";
    }
    
    //+++++++++++++++++++++++++++++++++++Save function++++++++++++++++++++++++++++++++++++++++++++++
    @Autowired
    private UploadService uploadService;
    @PostMapping("/article/save")
    public String ActionSave(@RequestParam("file") MultipartFile file, @Valid @ModelAttribute("article") ArticleModel article, BindingResult result, ModelMap model){//@ModelAttribute("article") for declare that it is a type of model. As define different name so need to declare
        
        if(result.hasErrors()){
            model.addAttribute("article", article);
            model.addAttribute("addStatus", true);
            System.out.println(result.getAllErrors());
            return "article_save";
        }
        if(file.getSize()!=0){
            String thumbnail = uploadService.upload(file);
            article.setThumbnail(thumbnail);
            article.setId(articleService.findAllarticle1().get(articleService.findAllarticle1().size()-1).getId()+1);
            if(articleService.save(article)){   
                System.out.println("success");
            }
            
        return "redirect:/article";
        }else{
            model.addAttribute("article", article);
            model.addAttribute("addStatus", true);
            System.out.println(result.getAllErrors());
            return "article_save";
        }
        
    }
    
    //+++++++++++++++++++++++++++++++++++View page update+++++++++++++++++++++++++++++++++++++++++++++
    @GetMapping("/article/updatepage")
    public String updatenewArticle(ArticleModel article,ModelMap model, @PathParam("id") Integer id)
    {
        List<Category> category = categoryService.findAll();
        model.addAttribute("article",articleService.findOne(id));
        model.addAttribute("category",category);
        model.addAttribute("addStatus",false);
        return "article_save";
    }
    
    //+++++++++++++++++++++++++++++++++++Update function++++++++++++++++++++++++++++++++++++++++++++++
    @PostMapping("/article/update") 
    public String updateArticle(Category category, @RequestParam("file") MultipartFile file, @Valid ArticleModel article,BindingResult result, ModelMap model)
    {
        model.addAttribute("category", category);
       if(result.hasErrors()){           
            model.addAttribute("article", article);
            model.addAttribute("addStatus", false);
            return "article_save";
        }
       if(file.getSize()!=0){
            
            String thumbnail = uploadService.upload(file);
            article.setThumbnail(thumbnail);
            }else{
                System.out.println("This is failed to update!!!!");
            }
        if(articleService.update(article)){   
            System.out.println("Success!");
        }else{
            return "article/updatepage?id="+article.getId();
        }
        return "redirect:/article";
    }  
    
    
}
