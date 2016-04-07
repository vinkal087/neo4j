package neo4j.com.neo4j;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

import com.importdata.ImportData;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
     //   GraphDatabaseService graphDb = new GraphDatabaseFactory().newEmbeddedDatabase( "/Users/vvishnoi/Desktop" );
      //  Node firstNode;
       // Node secondNode;
        //Relationship relationship;
       // GraphDatabaseService graphDb
        //try ( Transaction tx = graphDb.beginTx() )
        //{
        	ImportData.importData();
        	/*firstNode = graphDb.createNode();
        	firstNode.setProperty( "message", "Hello, " );
        	secondNode = graphDb.createNode();
        	secondNode.setProperty( "message", "World!" );

        	//relationship = firstNode.createRelationshipTo( secondNode, RelTypes.KNOWS );
        	//relationship.setProperty( "message", "brave Neo4j " );
        	System.out.print( firstNode.getProperty( "message" ) );
        	System.out.print( secondNode.getProperty( "message" ) );*/
        	
            // Database operations go here
       //     tx.success();
        //}
        //graphDb.shutdown();


    }
}
