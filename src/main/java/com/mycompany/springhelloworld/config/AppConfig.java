package com.mycompany.springhelloworld.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *
 * @author redlodlongcity
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.mycompany.springhelloworld")
public class AppConfig extends WebMvcConfigurerAdapter {

}
