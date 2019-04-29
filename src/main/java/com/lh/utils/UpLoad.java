package com.lh.utils;

import org.csource.common.MyException;
import org.csource.fastdfs.*;

import java.io.FileInputStream;
import java.io.IOException;

public class UpLoad {
    //1.声明对象
    private TrackerClient trackerClient = null;
    private TrackerServer trackerServer = null;
    private StorageClient storageClient = null;
    private StorageServer storageServer = null;
    private FileInputStream fis = null;

    public UpLoad() throws Exception{
        String path = this.getClass().getResource("/").getPath();
        ClientGlobal.init("client.conf");
        //监听器 服务端 客户端
        trackerClient = new TrackerClient();
        trackerServer = trackerClient.getConnection();
        //存储器
        storageClient = new StorageClient(trackerServer,storageServer);
    }
    public String upLoadFile(byte[] b,String suffix) throws Exception {
        String[] str = storageClient.upload_file(b,0,b.length,suffix,null);
        return "http://59.110.228.151/"+str[0]+"/"+str[1];
    }
    public int deleteFile(String filename) throws Exception {
        return storageClient.delete_file("group1",filename);
    }
}
