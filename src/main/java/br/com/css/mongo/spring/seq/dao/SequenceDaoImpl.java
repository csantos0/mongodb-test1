package br.com.css.mongo.spring.seq.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import br.com.css.mongo.spring.seq.exception.SequenceException;
import br.com.css.mongo.spring.seq.model.SequenceId;

/**
 * @author cvs
 * @create Mar 6, 2015
 */
@Repository
public class SequenceDaoImpl implements SequenceDao {

    @Autowired
    private MongoOperations mongoOperation;

    @Override
    public long getNextSequenceId(final String key) throws SequenceException {

	final Query query = new Query(Criteria.where("_id").is(key));

	final Update update = new Update();
	update.inc("seq", 1);

	final FindAndModifyOptions options = new FindAndModifyOptions();
	options.returnNew(true);

	final SequenceId seqId = mongoOperation.findAndModify(query, update, options, SequenceId.class);

	if (seqId == null) {
	    throw new SequenceException("Unable to get sequence id for key : " + key);
	}

	return seqId.getSeq();

    }

}