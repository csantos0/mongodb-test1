package br.com.css.mongo.spring.hosting.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author cvs
 * @create Mar 6, 2015
 */
@Document(collection = "hosting")
public class Hosting {

    @Id
    private long id;

    private String name;

    public long getId() {
	return id;
    }

    public String getName() {
	return name;
    }

    public void setId(final long id) {
	this.id = id;
    }

    public void setName(final String name) {
	this.name = name;
    }

    @Override
    public String toString() {
	return "Hosting [id=" + id + ", name=" + name + "]";
    }

}
