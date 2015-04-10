package model;

import java.util.Date;


public class EventTime extends Event{

	Date startTime;
	Date finishTime;
	
	public EventTime(String t, String d, Date st, Date ft) {
		super(t, d);
		this.setStartTime(st);
		this.setFinishTime(ft);
	}

	 public void setStartTime (Date date) {
		 this.startTime = date;
	 }
	 
	 public Date getStartTime (){
		 return startTime;
	 }
	 
	 public void setFinishTime (Date date) {
		 this.finishTime = date;
	 }
	 
	 public Date getFinishTime (){
		 return finishTime;
	 }
 
}