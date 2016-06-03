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
 * @author Yann
 * @param <EDate>
 */
public class Booking {
	/**
	 * Description of the property bookId.
	 */
	private int bookId;

	/**
	 * Description of the property login.
	 */
	private String login;

	/**
	 * Description of the property dateBegin.
	 */
	private Date dateBegin;

	/**
	 * Description of the property dateEnd.
	 */
	private Date dateEnd;

	/**
	 * Description of the property roomId.
	 */
	private int roomId;
	
	private int i;

	// Start of user code (user defined attributes for Booking)


	/**
	 * The constructor.
	 */
	public Booking(int bookId, String login,Date dateBegin,Date dateEnd, int roomId) {
		this.bookId=bookId;
		this.login=login;
		this.dateBegin=dateBegin;
		this.dateEnd=dateEnd;
		this.roomId=roomId;
	}

	
	/**
	 * Sets a value to attribute login. 
	 * @param loginr 
	 */
	public void setlogin(String login) {
		this.login = login;
	}
	
	
	/**
	 * Description of the method getTeacherId.
	 */
	public String getlogin() {
		return this.login;
	}

	

	/**
	 * Sets a value to attribute dateBegin. 
	 * @param datebegin 
	 */
	public void setdateBegin(Date dateBegin) {
		this.dateBegin = dateBegin;
	}

	
	
	/**
	 * Description of the method getdateBegin.
	 */
	public Date getdateBegin() {
		return this.dateBegin;
	}

	
	/**
	 * Description of the method setdateEnd.
	 */
	public void setdateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	
	/**
	 * Description of the method getdateEnd.
	 */
	public Date getdateEnd() {
		return this.dateEnd;
	}

	
	/**
	 * Description of the method setRoomId.
	 */
	public void setRoomId (int roomId) {
		this.roomId = roomId;
	}
	
	
	/**
	 * Description of the method getRoomId.
	 */
	public int getRoomId() {
		return this.roomId;
	}

	
	
	/**
	 * Sets a value to attribute login. 
	 * @param bookId 
	 */
	public void setbookId(int bookId) {
		this.bookId = bookId;
	}
	
	
	/**
	 * Returns login.
	 * @return login 
	 */
	public int getbookId() {
		i = Integer.parseInt(login); 
		return this.i;
		
	}

	
	/**
	 * Sets a value to attribute roomId. 
	 * @param roomId 
	 */
	public void setroomId(int roomId) {
		this.roomId = roomId;
	}
	

	/**
	 * Returns roomId.
	 * @return roomId 
	 */
	public int getroomId() {
		return this.roomId;
	}

// End of user code

}
