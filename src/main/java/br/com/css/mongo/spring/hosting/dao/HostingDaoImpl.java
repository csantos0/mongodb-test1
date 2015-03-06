package br.com.css.mongo.spring.hosting.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

import br.com.css.mongo.spring.hosting.model.Hosting;

/**
 * @author cvs
 * @create Mar 6, 2015
 */
@Repository
public class HostingDaoImpl implements HostingDao {

    @Autowired
    private MongoOperations mongoOperation;

    /*
     * (non-Javadoc)
     * @see br.com.css.mongo.spring.hosting.dao.HostingDao#save(br.com.css.mongo.spring.hosting.model.Hosting)
     */
    @Override
    public void save(final Hosting pHosting) {
	this.mongoOperation.save(pHosting);
    }

}
