/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package timeTableModel;

import java.util.Date;

// Start of user code (user defined imports)

// End of user code

/**
 * Fonction permettant de cr�er une r�servation.
 * 
 * @author Yann
 * @param <EDate>
 */
public class Booking {
	/**
	 * bookId est l'Identifiant de la r�servation .
	 */
	private int bookId;

	/**
	 * login est l'identifiant du prof qui fait la r�servation.
	 */
	private String login;

	/**
	 * dateBegin est la date de d�but de la r�servation.
	 */
	private Date dateBegin;

	/**
	 * dateEnd est la date de fin de la r�servation.
	 */
	private Date dateEnd;

	/**
	 * roomId est l'identifiant de la salle dans laquelle se fait la r�servation.
	 */
	private int roomId;
	
	

	// Start of user code (user defined attributes for Booking)


	/**
	 * Le constructeur.
	 * Une r�servation est constitu�e d'un identifiant, de l'id du prof qui fait la r�servation
	 * d'une date de d�but et de fin, et de l'identifiant de la salle 
	 * dans laquelle se fait la r�servation.
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
	 * R�cup�re l'identifiant du professeur qui fait la r�servation
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
	 * R�cup�re la date de d�but de la r�servation.
	 * @return dateBegin
	 * 			La date de d�but de la r�servation
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
	 * R�cup�re la date de fin de la r�servation.
	 * @return dateEnd
	 * 			La date de fin de la r�servation
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
	 * R�cup�re l'identifiant de la salle dans laquelle se fait la r�servation.
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
	 * R�cup�re l'identifiant de la r�servation.
	 * @return bookId 
	 * 		L'identifiant de la r�servation
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
