/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kps.controller;

import java.io.IOException;
import java.nio.file.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author UC
 */
@Controller
public class uploadImageController {
    
    String Location="UploadData/";
    @GetMapping("/upload")
    public String uploadPage(){
        return "uploadfile";
    }
    @PostMapping("/upload/file")
    public String upload(@RequestParam("file") MultipartFile file){
        try {
            byte[] bytes=file.getBytes();
            Path path=Paths.get(Location, file.getOriginalFilename());
            Files.write(path, bytes);
            System.out.println("Success!!!");
        } catch (IOException ex) {
            System.out.println("Opp something wrong!!!");
        }    
        return "redirect:/upload";
    }
    
}
