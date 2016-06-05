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
	 * Une TimeTable comporte 2 variables : Une id & une collection de reservations, propre à cette TimeTable
	 */
	private String timeTableId;
	public HashSet<Booking> bookings;


	/**
	 * Constructeur du TimeTable
	 * Il possède :
	 * @param groupId2 
	 * Et bookings, qui est une collection de reservation propre a cette TimeTable
	 */
	public TimeTable (Integer groupId2) {
		super();
		String groupId2s;
		groupId2s = "" + groupId2;
		timeTableId=groupId2s;
		this.bookings = new HashSet<Booking>();
	}

	/**
	 * Returns groupId.
	 * @return groupId 
	 */
	public Object getGroupId() {
		return this.timeTableId;
	}

	/**
	 * Pour les changements d'id d'une TimeTable
	 * @param newGroupId 
	 */
	public void settimeTableId(String newtimeTableId) {
		this.timeTableId = newtimeTableId;
	}
	
	/**
	 * Ajout d'une reservation, qui doit etre creee au prealable
	 * @param Booking book
	 */
	public void addBooking(Booking book){
		this.bookings.add(book);
	}
	
	
	/**
	 * Supprime une reservation de la collection
	 * @param Booking book
	 */
	public void removeBooking(Booking book){
		this.bookings.remove(book);
	}
	
	/**
	 * Renvois la collection de reservation propre a cette TimeTable
	 */
	public HashSet<Booking> getBookings() {
		return this.bookings;
	}
}
