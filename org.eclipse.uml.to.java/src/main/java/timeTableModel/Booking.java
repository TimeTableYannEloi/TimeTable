/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package timeTableModel;

import java.util.Date;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Booking.
 * 
 * @author Eloi
 */
public class Booking {
	/**
	 * Description of the property dateBegin.
	 */
	public Integer dateBegin = Integer.valueOf(0);

	/**
	 * Description of the property dateEnd.
	 */
	public Integer dateEnd = Integer.valueOf(0);

	/**
	 * Description of the property bookId.
	 */
	public Integer bookId = Integer.valueOf(0);

	// Start of user code (user defined attributes for Booking)

	// End of user code

	/**
	 * The constructor.
	 * @param roomId 
	 * @param dateEnd 
	 * @param dateBegin 
	 * @param login 
	 * @param bookingId 
	 */
	public Booking(Integer bookingId, Integer login, Date dateBegin, Date dateEnd, Integer roomId) {
		// Start of user code constructor for Booking)
		super();
		// End of user code
	}


	/**
	 * Description of the method setTeacherLogin.
	 */
	public void setTeacherLogin() {
		// Start of user code for method setTeacherLogin
		// End of user code
	}

	/**
	 * Description of the method addBooking.
	 */
	

	/**
	 * Description of the method booksIdToString.
	 */
	public void booksIdToString() {
		// Start of user code for method booksIdToString
		// End of user code
	}

	/**
	 * Description of the method getBookingsDate.
	 */
	public void getBookingsDate() {
		// Start of user code for method getBookingsDate
		// End of user code
	}

	/**
	 * Description of the method getBookingMaxId.
	 */
	public void getBookingMaxId() {
		// Start of user code for method getBookingMaxId
		// End of user code
	}

	// Start of user code (user defined methods for Booking)

	// End of user code
	/**
	 * Returns dateBegin.
	 * @return dateBegin 
	 */
	public Integer getDateBegin() {
		return this.dateBegin;
	}

	/**
	 * Sets a value to attribute dateBegin. 
	 * @param newDateBegin 
	 */
	public void setDateBegin(Integer newDateBegin) {
		this.dateBegin = newDateBegin;
	}

	/**
	 * Returns dateEnd.
	 * @return dateEnd 
	 */
	public Integer getDateEnd() {
		return this.dateEnd;
	}

	/**
	 * Sets a value to attribute dateEnd. 
	 * @param newDateEnd 
	 */
	public void setDateEnd(Integer newDateEnd) {
		this.dateEnd = newDateEnd;
	}

	/**
	 * Returns bookId.
	 * @return bookId 
	 */
	public Integer getBookId() {
		return this.bookId;
	}

	/**
	 * Sets a value to attribute bookId. 
	 * @param newBookId 
	 */
	public void setBookId(Integer newBookId) {
		this.bookId = newBookId;
	}

}
