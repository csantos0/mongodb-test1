package br.com.css.mongo;

import java.net.UnknownHostException;
import java.util.Date;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

/**
 * Hello world!
 * 
 */
public class SimpleMongoApp {

    /**
     * @param collection
     */
    private static void listAll(final DBCollection collection) {
	final DBCursor cursor = collection.find();
	while (cursor.hasNext()) {
	    System.out.println(cursor.next());
	}
    }

    /**
     * @param collection
     */
    private static void listByName(final DBCollection collection, final String name) {
	final BasicDBObject searchQuery = new BasicDBObject();
	searchQuery.put("name", name);

	final DBCursor cursor = collection.find(searchQuery);
	while (cursor.hasNext()) {
	    System.out.println(cursor.next());
	}
    }

    /**
     * @param args
     */
    public static void main(final String[] args) {
	try {
	    final MongoClient mongo = new MongoClient("localhost", 27017);
	    final DB db = mongo.getDB("java-test");
	    final DBCollection collection = db.getCollection("user");

	    // saveDocument(collection);
	    // listByName(collection, "Ciro Santos");
	    // upateDocument(collection);
	    removeDocument(collection, "Ciro Santos1");
	    listAll(collection);

	} catch (final UnknownHostException e) {
	    e.printStackTrace();
	}
    }

    /**
     * 
     */
    private static void removeDocument(final DBCollection collection, final String name) {
	final BasicDBObject searchQuery = new BasicDBObject();
	searchQuery.put("name", name);
	collection.remove(searchQuery);
    }

    /**
     * @param collection
     */
    private static void saveDocument(final DBCollection collection) {
	final BasicDBObject document = new BasicDBObject();
	document.put("name", "Ciro Santos1");
	document.put("age", 26);
	document.put("createdDate", new Date());
	collection.insert(document);
    }

    /**
     * @param collection
     */
    private static void upateDocument(final DBCollection collection) {
	final BasicDBObject query = new BasicDBObject();
	query.put("name", "Ciro Santos");

	final BasicDBObject newDocument = new BasicDBObject();
	newDocument.put("name", "Fatima");

	final BasicDBObject updateObj = new BasicDBObject();
	updateObj.put("$set", newDocument);

	collection.update(query, updateObj);
    }

}
