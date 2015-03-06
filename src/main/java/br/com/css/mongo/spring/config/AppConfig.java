package br.com.css.mongo.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author cvs
 * @create Mar 6, 2015
 */
@Configuration
@ComponentScan({ "br.com.css.mongo.spring.config", "br.com.css.mongo.spring.seq", "br.com.css.mongo.spring.hosting" })
@Import({ MongoConfig.class })
public class AppConfig {

    /**
     * 
     */
}
