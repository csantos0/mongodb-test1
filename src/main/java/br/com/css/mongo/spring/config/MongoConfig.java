package br.com.css.mongo.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;
import com.mongodb.WriteConcern;

/**
 * @author cvs
 * @create Mar 6, 2015
 */
@Configuration
public class MongoConfig {

    /**
     * @return
     * @throws Exception
     */

    public @Bean
    MongoDbFactory mongoDbFactory() throws Exception {

	final MongoClient mongo = new MongoClient("localhost", 27017);
	final SimpleMongoDbFactory simpleMongoDbFactory = new SimpleMongoDbFactory(mongo, "java-spring-test");
	return simpleMongoDbFactory;
    }

    /**
     * @return
     * @throws Exception
     */
    public @Bean
    MongoTemplate mongoTemplate() throws Exception {
	final MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
	mongoTemplate.setWriteConcern(WriteConcern.SAFE);
	return mongoTemplate;
    }
}
