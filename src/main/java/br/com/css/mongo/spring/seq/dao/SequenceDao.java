package br.com.css.mongo.spring.seq.dao;

import br.com.css.mongo.spring.seq.exception.SequenceException;

/**
 * @author cvs
 * @create Mar 6, 2015
 */
public interface SequenceDao {

    /**
     * @param key
     * @return long
     * @throws SequenceException
     */
    long getNextSequenceId(String key) throws SequenceException;

}