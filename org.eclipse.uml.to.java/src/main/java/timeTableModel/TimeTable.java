/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package timeTableModel;
import java.util.*;
// Start of user code (user defined imports)

// End of user code

/**
 * Classe TimeTable, constructeur & methodes inherentes
 * 
 * @author Eloi
 */
public class TimeTable {
	/**
	 * L'id de cette TimeTable, utilisee pour s'y referer
	 */
	private String timeTableId;
	/**
	 * Collection des reservations contenu dans cette TimeTable
	 */
	public static HashSet<Booking> bookings;


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
	 * Methode de classe qui renvoit l'id de cette TimeTable
	 * @return groupId 
	 */
	public String getGroupId() {
		return this.timeTableId;
	}

	/**
	 * Methode de classe qui permet de modifier l'id de cette TimeTable
	 * @param newGroupId 
	 */
	public void settimeTableId(String newtimeTableId) {
		this.timeTableId = newtimeTableId;
	}
	
	/**
	 * Methode de classe qui permet d'ajouter une reservation (creee au prealable) à cette TimeTable
	 * @param Booking book
	 */
	public void addBooking(Booking book){
		this.bookings.add(book);
	}
	
	
	/**
	 * Methode de classe qui permet de supprimer une reservation de cette TimeTable
	 * @param Booking book
	 */
	public void removeBooking(Booking book){
		this.bookings.remove(book);
	}
	
	/**
	 * Methode de classe qui renvoit la collection de reservations qui composent cette TimeTable
	 * @return bookings
	 */
	public HashSet<Booking> getBookings() {
		return this.bookings;
	}
}
