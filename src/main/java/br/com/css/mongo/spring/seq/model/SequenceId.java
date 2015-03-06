package br.com.css.mongo.spring.seq.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author cvs
 * @create Mar 6, 2015
 */
@Document(collection = "sequence")
public class SequenceId {

    @Id
    private String id;

    private long seq;

    /**
     * @return the id
     */
    public String getId() {
	return id;
    }

    /**
     * @return the seq
     */
    public long getSeq() {
	return seq;
    }

    /**
     * @param pId
     *            the id to set
     */
    public void setId(final String pId) {
	id = pId;
    }

    /**
     * @param pSeq
     *            the seq to set
     */
    public void setSeq(final long pSeq) {
	seq = pSeq;
    }

    @Override
    public String toString() {
	return "SequenceId [id=" + id + ", seq=" + seq + "]";
    }
}
