package com.lh.utils;

import com.lh.entity.MsRoom;
import net.sf.ehcache.pool.sizeof.filter.PassThroughFilter;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Date;

public class Load {
    //头像路径
    private static final String USER_IMG_PATH = "C:/Users/NASHEN/Desktop/jia/userImg";
    //文章路径
    private static final String ARTICLE_PATH = "C:/Users/NASHEN/Desktop/jia/article";
    //房间图片路径
    private static final String ROOM_IMG_PATH = "C:/Users/NASHEN/Desktop/jia/roomImg";

    //客户端上传头像
    public static String upLoadUserImg (HttpServletRequest request,
                                         HttpServletResponse response,
                                         MultipartFile image){
        try {
            return Load.downLoad(request,response,image.getBytes(),USER_IMG_PATH,".jpg");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    //客户端上传文章
    public static String upLoadArticle(HttpServletRequest request,
                                       HttpServletResponse response,
                                       String file){
        return Load.downLoad(request,response,file.getBytes(),ARTICLE_PATH,".txt");
    }

    //客户端上传房屋照片
    public static String upLoadRoomImg(HttpServletRequest request,
                                       HttpServletResponse response,
                                       MultipartFile image){
        try {
            return Load.downLoad(request,response,image.getBytes(),ROOM_IMG_PATH,".jpg");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String downLoad(HttpServletRequest request, HttpServletResponse response,
                                   byte[] bs, String str, String str1){
        try {
            if (bs.length > 0) {
                File validateCodeFolder = new File(str);
                if (!validateCodeFolder.exists()) validateCodeFolder.mkdirs();
                String filename = new Date().getTime() + str1;
                InputStream in = new ByteArrayInputStream(bs);
                File file = new File(str, filename);
                FileOutputStream fos = new FileOutputStream(file);
                byte[] b = new byte[1024];
                int nRead = 0;
                while ( (nRead = in.read(b)) != -1 ) fos.write(b, 0, nRead);
                fos.flush();
                fos.close();
                in.close();
                return str+"/"+filename;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
