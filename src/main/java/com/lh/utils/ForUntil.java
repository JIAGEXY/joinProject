package com.lh.utils;

import org.springframework.web.multipart.MultipartFile;

public class ForUntil {
    public static void toFor(MultipartFile[] img, StringBuilder roomImg) throws Exception {
        for (MultipartFile i : img) {
            //图片名字
            String fileName = i.getOriginalFilename();
            //后缀
            String suffix = fileName.substring(fileName.lastIndexOf(".")+1);
            UpLoad upLoad = null;
            upLoad = new UpLoad();
            roomImg.append( upLoad.upLoadFile(i.getBytes(),suffix) );
        }
    }
}
