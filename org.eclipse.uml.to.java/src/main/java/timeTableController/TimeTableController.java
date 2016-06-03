/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package timeTableController;
import java.util.*;
import java.util.Map.Entry;


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
		HashMap <Integer,Room> TimeTableMap = this.TimeTableMap;    //récupération du hashmap global
		Set<Integer> listKeys=TimeTableMap.keySet();				//récupération des clés du hashmap que l'ont met dans un tableau d'entiers
		int size =listKeys.size();									//récupération de la longueur de la liste de clés
		String TabTimeTableId[] = new String[size];					//initialisation du tableau de string qui sera la sortie
		int i =0;													//initialisation de l'itérateur
	    for (Entry<Integer, Room> entry : TimeTableMap.entrySet()){	//code du prof
			int key=entry.getKey();									//récupération des int conversion en string remplissage du tableau de sortie
	    	String cle = "" + key;
	    	TabTimeTableId[i]=cle;
	    	i++;
	    }
	    return TabTimeTableId;
		// End of user code
	}
}
