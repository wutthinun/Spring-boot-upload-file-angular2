package com.example;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by wutthinan on 3/4/2017 AD.
 */
@RestController
public class UploadController {

    @GetMapping()
    public String index() {
        System.out.println("Index");
        return "Hello Index";
    }

    @PostMapping()
    public String upload(Upload model) {
        String fileName = model.getFile().getOriginalFilename();
        try {
            OutputStream outputStream = new FileOutputStream(fileName);
            IOUtils.copy(model.getFile().getInputStream(), outputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }
}
