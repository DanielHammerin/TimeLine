package model;

import java.io.File;

import com.db4o.*;

public class databaseTest {

	public static void main(String[] args) {

	        new File (".", "yoloBase420.data"); // creates the .data file
	        
	        ObjectContainer db = null; // creates the object data base
	        
	        try
	        {
	            db = Db4o.openFile("yoloBase420.data"); // open file in the object
	
				EventNT firstSemester = new EventNT ("First Semester", "First Semester for Software Technology Program"); // created some objects
				EventNT secondSemester = new EventNT ("Second Semester", "Second Semester for Software Technology Program");
				EventNT thirdSemester = new EventNT ("Third Semester", "Third Semester for Software Technology Program");
				EventNT fourthSemester = new EventNT ("Fourth Semester", "Fourth Semester for Software Technology Program");

				
				db.store(firstSemester); // store objects on the database
				db.store(secondSemester);
				db.store(thirdSemester);
				db.store(fourthSemester);
				
				db.commit(); // commit
				
				ObjectSet retrieve = db.query(EventNT.class);
				
				while (retrieve.hasNext()){
					System.out.println (retrieve.next().toString());
								
				}
				
	        }
	        
	        finally
	        
	        {
	            if (db != null)
	                db.close(); 
	        }
	    }
	}