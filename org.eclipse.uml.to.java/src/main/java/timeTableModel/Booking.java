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
 * @author aguler
 * @param <EDate>
 */
public class Booking {
	/**
	 * Description of the property id_reservation.
	 */
	private int id_reservation;

	/**
	 * Description of the property login_teacher.
	 */
	private String login_teacher;

	/**
	 * Description of the property start_date.
	 */
	private Date start_date;

	/**
	 * Description of the property end_date.
	 */
	private Date end_date;

	/**
	 * Description of the property id_room.
	 */
	private int id_room;

	// Start of user code (user defined attributes for Booking)

	// End of user code

	/**
	 * The constructor.
	 */
	public Booking(int id_of_reservation, String the_login_teacher,Date new_start_date,Date new_end_date, int the_room_id) {
		this.id_reservation=id_of_reservation;
		this.login_teacher=the_login_teacher;
		this.start_date=new_start_date;
		this.end_date=new_end_date;
		this.id_room=the_room_id;
	}

	/**
	 * Description of the method getTeacherId.
	 */
	public String getTeacherId() {
		return this.login_teacher;
	}

	/**
	 * Description of the method getStartDate.
	 */
	public Date getStartDate() {
		return this.start_date;
	}

	/**
	 * Description of the method getEndDate.
	 */
	public Date getEndDate() {
		return this.end_date;
	}

	/**
	 * Description of the method getRoomId.
	 */
	public int getRoomId() {
		return this.id_room;
	}

	/**
	 * Description of the method setTeacherId.
	 */
	public void setTeacherId(String idTeacher) {
		this.login_teacher = idTeacher;
	}

	/**
	 * Description of the method setStartDate.
	 */
	public void setStartDate(Date Date_Start) {
		this.start_date = Date_Start;
	}

	/**
	 * Description of the method setEndDate.
	 */
	public void setEndDate(Date Date_End) {
		this.end_date = Date_End;
	}

	/**
	 * Description of the method setRoomId.
	 */
	public void setRoomId (int IDRoom) {
		this.id_room = IDRoom;
	}

	// Start of user code (user defined methods for Booking)

	// End of user code
	/**
	 * Returns id_reservation.
	 * @return id_reservation 
	 */
	public int getId_reservation() {
		return this.id_reservation;
	}

	/**
	 * Sets a value to attribute id_reservation. 
	 * @param newId_reservation 
	 */
	public void setId_reservation(int newId_reservation) {
		this.id_reservation = newId_reservation;
	}

	/**
	 * Returns login_teacher.
	 * @return login_teacher 
	 */
	public String getLogin_teacher() {
		return this.login_teacher;
	}

	/**
	 * Sets a value to attribute login_teacher. 
	 * @param newLogin_teacher 
	 */
	public void setLogin_teacher(String newLogin_teacher) {
		this.login_teacher = newLogin_teacher;
	}

	/**
	 * Returns start_date.
	 * @return start_date 
	 */
	public Date getStart_date() {
		return this.start_date;
	}

	/**
	 * Sets a value to attribute start_date. 
	 * @param newStart_date 
	 */
	public void setStart_date(Date newStart_date) {
		this.start_date = newStart_date;
	}

	/**
	 * Returns end_date.
	 * @return end_date 
	 */
	public Date getEnd_date() {
		return this.end_date;
	}

	/**
	 * Sets a value to attribute end_date. 
	 * @param newEnd_date 
	 */
	public void setEnd_date(Date newEnd_date) {
		this.end_date = newEnd_date;
	}

	/**
	 * Returns id_room.
	 * @return id_room 
	 */
	public int getId_room() {
		return this.id_room;
	}

	/**
	 * Sets a value to attribute id_room. 
	 * @param newId_room 
	 */
	public void setId_room(int newId_room) {
		this.id_room = newId_room;
	}

}
