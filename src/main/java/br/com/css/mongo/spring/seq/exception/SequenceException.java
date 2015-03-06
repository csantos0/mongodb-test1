package br.com.css.mongo.spring.seq.exception;

/**
 * @author cvs
 * @create Mar 6, 2015
 */
public class SequenceException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String errCode;
    private String errMsg;

    /**
     * @param errMsg
     */
    public SequenceException(@SuppressWarnings("hiding") final String errMsg) {
	this.errMsg = errMsg;
    }

    /**
     * @param errCode
     * @param errMsg
     */
    public SequenceException(@SuppressWarnings("hiding") final String errCode, @SuppressWarnings("hiding") final String errMsg) {
	this.errCode = errCode;
	this.errMsg = errMsg;
    }

    /**
     * @return
     */
    @SuppressWarnings("javadoc")
    public String getErrCode() {
	return errCode;
    }

    /**
     * @return
     */
    @SuppressWarnings("javadoc")
    public String getErrMsg() {
	return errMsg;
    }

    /**
     * @param errCode
     */
    public void setErrCode(@SuppressWarnings("hiding") final String errCode) {
	this.errCode = errCode;
    }

    /**
     * @param errMsg
     */
    public void setErrMsg(@SuppressWarnings("hiding") final String errMsg) {
	this.errMsg = errMsg;
    }

}