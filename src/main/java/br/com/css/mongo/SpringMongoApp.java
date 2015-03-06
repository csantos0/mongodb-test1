package br.com.css.mongo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.com.css.mongo.spring.config.AppConfig;
import br.com.css.mongo.spring.hosting.bo.HostingBo;
import br.com.css.mongo.spring.seq.exception.SequenceException;

/**
 * @author cvs
 * @create Mar 6, 2015
 */
public class SpringMongoApp {

    /**
     * @param args
     */
    public static void main(final String[] args) {

	try {

	    final ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	    final HostingBo hostingBo = (HostingBo) ctx.getBean("hostingBo");

	    hostingBo.save("cloud.google.com");
	    hostingBo.save("aws.com");
	    hostingBo.save("cloudbees.com");

	} catch (final SequenceException ex) {
	    ex.printStackTrace();
	}
    }
}
