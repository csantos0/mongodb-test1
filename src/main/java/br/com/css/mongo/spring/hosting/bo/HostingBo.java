package br.com.css.mongo.spring.hosting.bo;

import br.com.css.mongo.spring.seq.exception.SequenceException;

/**
 * @author cvs
 * @create Mar 6, 2015
 */
public interface HostingBo {

    /**
     * @param name
     * @throws SequenceException
     */
    void save(String name) throws SequenceException;
}
