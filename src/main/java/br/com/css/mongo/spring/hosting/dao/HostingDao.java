package br.com.css.mongo.spring.hosting.dao;

import br.com.css.mongo.spring.hosting.model.Hosting;

/**
 * @author cvs
 * @create Mar 6, 2015
 */
public interface HostingDao {

    /**
     * @param hosting
     */
    void save(Hosting hosting);
}
