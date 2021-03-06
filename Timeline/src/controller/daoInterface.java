package controller;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.TreeSet;

import model.*;

/**
 * An interface for the DAO database access object class.
 * @author Mauro & Hatem
 */
public interface daoInterface {
	public void saveToDataBase(Timeline newTimeline) throws Exception; // saves Timeline in the database
	public void saveV2(DayTimeline timeline) throws Exception;
	public void deleteFromDatabase(Timeline myTimeline); // deletes Timeline from the database
	public boolean lookUp(String title); // returns true if the Timeline is found in the database
	public Timeline getTimeline(String title) throws Exception; // retrieves a specific Timeline from the database
	public DayTimeline getDayTimeline(String title) throws Exception;
	public void updateTimeline(DayTimeline myTimeline, String newTitle, String newDescription, GregorianCalendar startDate, GregorianCalendar endDate, TreeSet<EventNT> eventNt, TreeSet<EventTime> eventTime) throws Exception; //updates Timeline info and saves is to the database
	public void printDatabase(); // prints out all Timelines in the database
	public void clearDatabase(); // deletes all Timelines in the database
	public boolean isEmpty(); // returns true is the database is currently empty
	public LinkedList<DayTimeline> getAllTimelines(); // Retrieves LInkedList containing all Timelines in the database
	public void updateTimelineV2(DayTimeline oldTimeline, DayTimeline newTimeline); //Updates a specific timeline.
}