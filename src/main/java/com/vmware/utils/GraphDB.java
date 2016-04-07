package com.vmware.utils;

import java.util.ResourceBundle;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.neo4j.kernel.EmbeddedGraphDatabase;

public class GraphDB {
	
	private static ResourceBundle bundle = ResourceBundle.getBundle("neo4j");
	private static GraphDatabaseService graphDb  = null;
	
	public static GraphDatabaseService instance() {
		/*synchronized (graphDb) {
			if (graphDb == null) {
				synchronized (graphDb) {
					graphDb = new GraphDatabaseFactory().newEmbeddedDatabase(bundle.getString("LOCAL_PATH"));
				}
			}
		}*/		
		if(graphDb==null){
			graphDb = new GraphDatabaseFactory().newEmbeddedDatabase(bundle.getString("LOCAL_PATH"));
		}
		System.out.println(bundle.getString("LOCAL_PATH"));
		return graphDb;
	}
}
