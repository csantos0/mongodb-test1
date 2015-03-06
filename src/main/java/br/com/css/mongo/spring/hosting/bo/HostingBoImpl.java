package br.com.css.mongo.spring.hosting.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.css.mongo.spring.hosting.dao.HostingDao;
import br.com.css.mongo.spring.hosting.model.Hosting;
import br.com.css.mongo.spring.seq.dao.SequenceDao;
import br.com.css.mongo.spring.seq.exception.SequenceException;

/**
 * @author cvs
 * @create Mar 6, 2015
 */
@Service("hostingBo")
public class HostingBoImpl implements HostingBo {

    private static final String HOSTING_SEQ_KEY = "hosting";

    @Autowired
    private SequenceDao sequenceDao;

    @Autowired
    private HostingDao hostingDao;

    /*
     * (non-Javadoc)
     * @see br.com.css.mongo.spring.hosting.bo.HostingBo#save(java.lang.String)
     */
    @Override
    public void save(final String pName) throws SequenceException {
	final Hosting hosting = new Hosting();
	hosting.setId(this.sequenceDao.getNextSequenceId(HOSTING_SEQ_KEY));
	hosting.setName(pName);
	this.hostingDao.save(hosting);
	System.out.println(hosting);
    }

}
