/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package timeTableModel;
import java.util.*;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of TimeTable.
 * 
 * @author Eloi
 */
public class TimeTable {
	/**
	 * Description of the property groupId.
	 */
	private String timeTableId;
	public HashSet<Booking> bookings;

	
	// Start of user code (user defined attributes for TimeTable)
	
	// End of user code

	/**
	 * The constructor.
	 * @param groupId2 
	 */
	public TimeTable(Integer groupId2) {
		super();
		// Start of user code constructor for TimeTable)
		String groupId2s;
		groupId2s = "" + groupId2;
		timeTableId=groupId2s;
		this.bookings = new HashSet<Booking>();
		// End of user code
	}

	// Start of user code (user defined methods for TimeTable)

	// End of user code
	/**
	 * Returns groupId.
	 * @return groupId 
	 */
	public Object getGroupId() {
		return this.timeTableId;
	}

	/**
	 * Sets a value to attribute groupId. 
	 * @param newGroupId 
	 */
	public void settimeTableId(String newtimeTableId) {
		this.timeTableId = newtimeTableId;
	}
	/**
	 * Add a new booking object to the timetable 
	 * @param Booking book
	 */
	public void addBooking(Booking book){
		this.bookings.add(book);
	}
	
	
	/**
	 * Remove a new booking object to the timetable 
	 * @param Booking book
	 */
	public void removeBooking(Booking book){
		this.bookings.remove(book);
	}
	
}
