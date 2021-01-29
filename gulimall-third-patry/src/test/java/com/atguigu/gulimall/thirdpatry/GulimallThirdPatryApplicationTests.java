package com.atguigu.gulimall.thirdpatry;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;


@SpringBootTest
class GulimallThirdPatryApplicationTests {

    //注入ossclient
    @Autowired
    OSSClient ossClient;

   @Test
    void uploadTest() throws FileNotFoundException {
// 上传文件流。
        InputStream inputStream = new FileInputStream("C:\\Users\\admin\\Desktop\\3.jpg");
        ossClient.putObject("gulimall-best", "4.jpg", inputStream);

// 关闭OSSClient。
        ossClient.shutdown();
        System.out.println("上传成功");
    }

}
