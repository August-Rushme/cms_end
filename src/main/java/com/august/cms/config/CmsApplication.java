package com.august.cms.config;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;



/**
 * @author august
 */
@ComponentScan("com.august")
@SpringBootApplication
@MapperScan("com.august.cms.mapper")
public class CmsApplication {
    private static final Logger LOG = LoggerFactory.getLogger(CmsApplication.class);
    public static void main(String[] args) {
        SpringApplication app =  new SpringApplication(CmsApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("server is running！！");
        LOG.info("address: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
    }

}
