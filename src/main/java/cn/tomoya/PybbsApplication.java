package cn.tomoya;

import cn.tomoya.config.yml.SiteConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;

/**
 * Created by tomoya.
 * Copyright (c) 2016, All Rights Reserved.
 * http://tomoya.cn
 */
@EnableCaching
@SpringBootApplication
@EnableConfigurationProperties(SiteConfig.class)
// @EnableAutoConfiguration注解加上，有异常不会找默认error页面了，而是直接输出字符串
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class PybbsApplication {

  public static void main(String[] args) {
    SpringApplication.run(PybbsApplication.class, args);
  }

}
