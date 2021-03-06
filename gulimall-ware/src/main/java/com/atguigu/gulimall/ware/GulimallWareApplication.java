package com.atguigu.gulimall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *1.整合Mybatis-plus
 * <dependency>
 *     <groupId>com.baomidou</groupId>
 *     <artifactId>mybatis-plus-boot-starter</artifactId>
 *     <version>3.2.0</version>
 * </dependency>
 *
 * 2.配置
 *      1.配置数据源
 *          1)、导入数据库驱动
 *          2)、在application.yml 中配置相关信息
 *      2.配置Mybatis-Plus
 *          1)、使用@Mapper-Scan
 *          2)、告诉Mybatis-Plus.SQl 映射文件位置
*/

@SpringBootApplication
public class GulimallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallWareApplication.class, args);
    }

}
