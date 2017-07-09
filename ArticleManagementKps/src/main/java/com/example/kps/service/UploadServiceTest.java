/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kps.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author UC
 */
@Service
public class UploadServiceTest {
    String Location="UploadData/";
    public String upload(@RequestParam("file") MultipartFile file){
        try {
            byte[] bytes=file.getBytes();
            Path path=Paths.get(Location, file.getOriginalFilename());
            Files.write(path, bytes);
            System.out.println("Success!!!");
        } catch (IOException ex) {
            System.out.println("Opp something wrong!!!");
        }    
        return "UploadData/"+file;
    }
}
