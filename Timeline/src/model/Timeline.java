package model;

import java.util.LinkedList;

/**
 * Super class for the different kinds of timelines. Holds a string 
 * for description of a timeline, a string for the title of the of 
 * the timeline aswell as an linked list with the events of the timeline.
 * @author Jakob
 *
 */
public abstract class Timeline 
{
	private String title;
	private String description;
	private LinkedList<Event> events;
	private static final int MAX_CHARS_TITLE = 30;
	
	/**
	 * The super constructor for all timelines. Takes a string containing the description
	 * of the event and a string containing the title as arguments. 
	 * @param t the title
	 * @param d
	 */
	public Timeline(String t, String d)
	{
		if (t.length() > MAX_CHARS_TITLE) {throw new IllegalArgumentException("The title "
				+ " can be maximum " + MAX_CHARS_TITLE + " characters long.");}
		title = t;
		description = d;
		events = new LinkedList<Event>();
	}

	/**
	 * Getter for the title of the time-line.
	 * @return the title
	 */
	public String getTitle() { return title; }

	/**
	 * Setter for the title of a time-line.
	 * @param title
	 */
	public void setTitle(String title) 
	{
		if (title.length() > MAX_CHARS_TITLE) {throw new IllegalArgumentException("The title "
				+ " can be maximum " + MAX_CHARS_TITLE + " characters long.");}
		this.title = title;
	}

	/**
	 * Getter for the description of the time-line.
	 * @return
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for the description of the time-line.
	 * @param description
	 */
	public void setDescription(String description) { this.description = description; }

	public void addEvent(Event e) { events.add(e); }
	
	public void removeEvent(Event e) { events.remove(e); }

	
	
}