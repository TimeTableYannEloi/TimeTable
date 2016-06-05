/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package timeTableModel;

import java.util.Date;

// Start of user code (user defined imports)

// End of user code

/**
 * Fonction permettant de créer une réservation.
 * 
 * @author Yann
 * @param <EDate>
 */
public class Booking {
	/**
	 * bookId est l'Identifiant de la réservation .
	 */
	private int bookId;

	/**
	 * login est l'identifiant du prof qui fait la réservation.
	 */
	private String login;

	/**
	 * dateBegin est la date de début de la réservation.
	 */
	private Date dateBegin;

	/**
	 * dateEnd est la date de fin de la réservation.
	 */
	private Date dateEnd;

	/**
	 * roomId est l'identifiant de la salle dans laquelle se fait la réservation.
	 */
	private int roomId;
	
	

	// Start of user code (user defined attributes for Booking)


	/**
	 * Le constructeur.
	 * Une réservation est constituée d'un identifiant, de l'id du prof qui fait la réservation
	 * d'une date de début et de fin, et de l'identifiant de la salle 
	 * dans laquelle se fait la réservation.
	 * 
	 */
	public Booking(int bookId, String login,Date dateBegin,Date dateEnd, int roomId) {
		this.bookId=bookId;
		this.login=login;
		this.dateBegin=dateBegin;
		this.dateEnd=dateEnd;
		this.roomId=roomId;
	}

	
	/**
	 * Fonction permettant de fixer le login du professeur
	 * @param login
	 * 			L'identifiant du professeur 
	 */
	
	public void setlogin(String login) {
		this.login = login;
	}
	
	
	/**
	 * Récupère l'identifiant du professeur qui fait la réservation
	 * @return login
	 * 			L'identifiant du professeur
	 */
	public String getlogin() {
		return this.login;
	}

	

	/**
	 * Sets a value to attribute dateBegin. 
	 * @param dateBegin 
	 */
	public void setdateBegin(Date dateBegin) {
		this.dateBegin = dateBegin;
	}

	
	
	/**
	 * Récupère la date de début de la réservation.
	 * @return dateBegin
	 * 			La date de début de la réservation
	 */
	public Date getdateBegin() {
		return this.dateBegin;
	}

	
	/**
	 * Sets a value to attribute dateEnd
	 * @param dateEnd
	 */
	public void setdateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	
	/**
	 * Récupère la date de fin de la réservation.
	 * @return dateEnd
	 * 			La date de fin de la réservation
	 */
	public Date getdateEnd() {
		return this.dateEnd;
	}

	
	/**
	 * Sets a value to attribute roomId. 
	 * @param roomId 
	 * 		L'identifiant de la salle  
	 */
	public void setRoomId (int roomId) {
		this.roomId = roomId;
	}
	
	
	/**
	 * Récupère l'identifiant de la salle dans laquelle se fait la réservation.
	 *@return roomId
	 * 			L'identifiant de la salle  
	 */
	public int getRoomId() {
		return this.roomId;
	}

	
	
	/**
	 * Sets a value to attribute bookId. 
	 * @param bookId 
	 */
	public void setbookId(int bookId) {
		this.bookId = bookId;
	}
	
	
	/**
	 * Récupère l'identifiant de la réservation.
	 * @return bookId 
	 * 		L'identifiant de la réservation
	 */
	public int getbookId() { 
		return this.bookId;
		
	}

	
	/**
	 * Sets a value to attribute roomId. 
	 * @param roomId 
	 */
	public void setroomId(int roomId) {
		this.roomId = roomId;
	}
	

	
// End of user code

}
