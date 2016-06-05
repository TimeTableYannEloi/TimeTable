/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package timeTableModel;

import java.util.HashSet;

// Start of user code (user defined imports)

// End of user code

/**
 * Classe Room, constructeur & methodes inherentes
 * 
 * @author Eloi
 */
public class Room {
	/**
	 * La capacité est un entier, indiquant le nombre de places qu'offre la room
	 */
	public int capacity;

	/**
	 * L'id de la room
	 */
	public int roomId;


	/**
	 * Constructeur de la room
	 * @param roomId
	 * @param capacity
	 */
	public Room(int roomId, int capacity) {
		super();
		roomId=this.roomId;
		capacity=this.capacity;
		
	}

	/**
	 * Methode de classe qui renvoit la capacite de la room
	 * @return capacity 
	 */
	public int getCapacity() {
		return this.capacity;
	}

	/**
	 * Methode de classe qui permet de modifier la capacite de la room
	 * @param newCapacity 
	 */
	public void setCapacity(int newCapacity) {
		this.capacity = newCapacity;
	}

	/**
	 * Methode de classe qui renvois l'id de la room
	 * @return roomId 
	 */
	public int getRoomId() {
		return this.roomId;
	}

	/**
	 * Methode de classe qui permet de modifier l'id de la room
	 * @param newRoomId 
	 */
	public void setRoomId(int newRoomId) {
		this.roomId = newRoomId;
	}
	
	/**
	 * Returns bookings.
	 * @return bookings 
	 */
	/*public HashSet<Booking> getBookings() {//incompléte, doit renvoyer toutes les resa qui prennent place dans cette room
		return this.bookings;
	}*/


}
