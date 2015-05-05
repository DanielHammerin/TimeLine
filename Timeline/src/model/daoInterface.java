package model;

import java.util.LinkedList;

public interface daoInterface {
	
	public void saveToDataBase(Timeline newTimeline) throws Exception; // saves Timeline in the database
	public void deleteFromDatabase(Timeline myTimeline); // deletes Timeline from the database
	public boolean lookUp(String title) throws Exception; // returns true if the Timeline is found in the database
	public Timeline getTimeline(String title) throws Exception; // retrieves a specific Timeline from the database
	public void updateTimeline(Timeline myTimeline, String newTitle, String newDescription); // updates Timeline info and saves is to the database
	public void printDatabase(); // prints out all Timelines in the database
	public void clearDatabase() throws Exception; // deletes all Timelines in the database
	public boolean isEmpty(); // returns true is the database is currently empty
	public LinkedList <Timeline> getAllTimelines() throws Exception; // Retrieves LInkedList containing all Timelines in the database
	
}