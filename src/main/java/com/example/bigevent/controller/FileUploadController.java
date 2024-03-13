package com.example.bigevent.controller;

import com.example.bigevent.pojo.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author xi
 * @create 2024/3/13 12:30
 */
@RestController
public class FileUploadController {
    @PostMapping("/upload")
    public Result<String> upload(MultipartFile file) throws IOException {
        //把文件内容存储到本地磁盘
        String originalFilename = file.getOriginalFilename();
        //保证文件名字唯一性,防止文件覆盖
        String filename= UUID.randomUUID().toString()+originalFilename.substring(originalFilename.lastIndexOf("."));
        file.transferTo(new File("C:\\Users\\cheng\\Desktop\\file\\"+filename));
        return Result.success("url访问地址...");
    }
}
