package com.example;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by wutthinan on 3/4/2017 AD.
 */
public class Upload {
    private MultipartFile file;
    private String remark;

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
