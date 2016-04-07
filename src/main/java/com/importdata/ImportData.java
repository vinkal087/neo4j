package com.importdata;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Result;
import org.neo4j.graphdb.Transaction;

import com.vmware.utils.GraphDB;

public class ImportData {

	public static void importData() {
		GraphDatabaseService gds = GraphDB.instance();

		String s = " " + "LOAD CSV WITH HEADERS FROM \"file:/tmp/infoblox_state_types.csv\" AS row "
				+ "CREATE (:InfobloxStateType {name: row.name, key: row.key, modified_by: row.modified_by, sort_order: row.sort_order});";

		try (Transaction tx = gds.beginTx()) {
			Result result = gds.execute(s);
			tx.success();
		}
		gds.shutdown();
	}
}
