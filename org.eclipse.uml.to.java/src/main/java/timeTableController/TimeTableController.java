/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package timeTableController;
import java.util.*;
import java.util.Map.Entry;

import timeTableModel.Booking;


// Start of user code (user defined imports)

// End of user code

/**
 * Description of TimeTableController.
 * 
 * @author Eloi
 */
public class TimeTableController implements ITimeTableController {
	/**
	 * Description of the property timeTableDB.
	 */
	public TimeTableDB timeTableDB = null;

	// Start of user code (user defined attributes for TimeTableController)

	// End of user code

	/**
	 * The constructor.
	 * @param tTfile 
	 */
	public TimeTableController(String tTfile) {
		// Start of user code constructor for TimeTableController)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for TimeTableController)

	// End of user code
	/**
	 * Returns timeTableDB.
	 * @return timeTableDB 
	 */
	public TimeTableDB getTimeTableDB() {
		return this.timeTableDB;
	}

	/**
	 * Sets a value to attribute timeTableDB. 
	 * @param newTimeTableDB 
	 */
	public void setTimeTableDB(TimeTableDB newTimeTableDB) {
		if (this.timeTableDB != null) {
			this.timeTableDB.set(null);
		}
		this.timeTableDB.set(this);
	}
	
	/**
	 * Get the values of the different roomId
	 * @return TabRoomsId
	 */
	
	public String[] roomsIdToString() {
		// Start of user code for method roomsIdToString
		HashMap <Integer,Room> RoomMap = this.RoomMap;
		Set<Integer> listKeys=RoomMap.keySet();
		int size =listKeys.size();
		String TabRoomsId[] = new String[size];
		int i =0;
	    for (Entry<Integer, Room> entry : RoomMap.entrySet()){
			int key=entry.getKey();
	    	String cle = "" + key;
	    	TabRoomsId[i]=cle;
	    	i++;
	    }
	    return TabRoomsId;
		// End of user code
	}


	/**
	 * Get the values of the different timeTableId
	 * @return TabTimeTableId
	 */
	public String[] roomsToString() {
		// Start of user code for method roomsToString
		HashMap <Integer,Room> TimeTableMap = this.TimeTableMap;    //rÈcupÈration du hashmap global
		Set<Integer> listKeys=TimeTableMap.keySet();				//rÈcupÈration des clÈs du hashmap que l'ont met dans un tableau d'entiers
		int size =listKeys.size();									//rÈcupÈration de la longueur de la liste de clÈs
		String TabTimeTableId[] = new String[size];					//initialisation du tableau de string qui sera la sortie
		int i =0;													//initialisation de l'itÈrateur
	    for (Entry<Integer, Room> entry : TimeTableMap.entrySet()){	//code du prof
			int key=entry.getKey();									//rÈcupÈration des int conversion en string remplissage du tableau de sortie
	    	String cle = "" + key;
	    	TabTimeTableId[i]=cle;
	    	i++;
	    }
	    return TabTimeTableId;
		// End of user code
	}
	
	/**
	 * Fonction qui ajoute une r√©servation dans l'emploi du temps TimeTableId et qui la sauvegarde dans la base de donn√©es
	 * 
	 * @param timeTableId
	 * 		L'identifiant d'emploi du temps
	 * @param bookingId
	 * 		L'identifiant de r√©servation
	 * @param login
	 * 		Le login du professeur faisant la r√©servation
	 * @param dateBegin
	 * 		La date de d√©but de r√©servation
	 * @param dateEnd
	 * 		La date de fin de r√©servation
	 * @param roomId
	 * 		L'identifiant de la salle r√©serv√©e
	 * @return
	 * 		Un boolean indiquant si la r√©servation a bien √©t√© faite
	 */
	
	public void addBooking(int bookId, String login,Date dateBegin,Date dateEnd, int roomId) {
		this.BookingId=BookingId;
		this.Login=Login;
		this.DateBegin=DateBegin;
		this.DateEnd=DateEnd;
		this.RoomId=RoomId;
		HashMap <Integer,Room> TimeTableMap = this.TimeTableMap;
		Booking Book = new Booking (BookingId, Login, DateBegin, DateEnd, RoomId);
		BookingMap.put(BookingId,Book);
	}
	
	/**
	 * Fonction qui cr√©e une salle et qui la sauvegarde dans la base de donn√©es. 
	 * @param roomId
	 * 		L'identifiant de la salle
	 * @param capacity
	 * 		La capacit√© de la salle
	 * @return
	 * 		Un boolean indiquant si la salle a bien √©t√© cr√©√©e
	 */
	public boolean addRoom(int roomId, int capacity){
		this.roomId=roomId;
		this.capacity=capacity;
	}
	
	
}
