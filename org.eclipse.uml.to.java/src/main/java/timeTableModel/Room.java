/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package timeTableModel;

import java.util.HashSet;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Room.
 * 
 * @author Eloi
 */
public class Room {
	/**
	 * Description of the property capacity.
	 */
	public Integer capacity = Integer.valueOf(0);

	/**
	 * Description of the property bookings.
	 */
	public HashSet<Booking> bookings = new HashSet<Booking>();

	/**
	 * Description of the property roomId.
	 */
	public Integer roomId = Integer.valueOf(0);

	// Start of user code (user defined attributes for Room)

	// End of user code

	/**
	 * The constructor.
	 */
	public Room() {
		// Start of user code constructor for Room)
		super();
		// End of user code
	}

	/**
	 * Description of the method roomsIdToString.
	 */
	public void roomsIdToString() {
		// Start of user code for method roomsIdToString
		// End of user code
	}

	/**
	 * Description of the method roomsToString .
	 */
	public void roomsToString() {
		// Start of user code for method roomsToString 
		// End of user code
	}

	/**
	 * Description of the method addRoom.
	 */
	public void addRoom() {
		// Start of user code for method addRoom
		// End of user code
	}

	/**
	 * Description of the method removeRoom.
	 */
	public void removeRoom() {
		// Start of user code for method removeRoom
		// End of user code
	}

	// Start of user code (user defined methods for Room)

	// End of user code
	/**
	 * Returns capacity.
	 * @return capacity 
	 */
	public Integer getCapacity() {
		return this.capacity;
	}

	/**
	 * Sets a value to attribute capacity. 
	 * @param newCapacity 
	 */
	public void setCapacity(Integer newCapacity) {
		this.capacity = newCapacity;
	}

	/**
	 * Returns bookings.
	 * @return bookings 
	 */
	public HashSet<Booking> getBookings() {
		return this.bookings;
	}

	/**
	 * Returns roomId.
	 * @return roomId 
	 */
	public Integer getRoomId() {
		return this.roomId;
	}

	/**
	 * Sets a value to attribute roomId. 
	 * @param newRoomId 
	 */
	public void setRoomId(Integer newRoomId) {
		this.roomId = newRoomId;
	}

}
