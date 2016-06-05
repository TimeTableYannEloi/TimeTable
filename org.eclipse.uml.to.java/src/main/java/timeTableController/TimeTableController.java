/* 2016, All rights reserved.
 *******************************************************************************/
package timeTableController;
import java.util.*;
import java.util.Map.Entry;
import timeTableModel.Booking;
import timeTableModel.Room;
import timeTableModel.TimeTable;
import timeTableModel.TimeTableDB;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of TimeTableController.
 * 
 * @author Eloi
 */
public class TimeTableController implements ITimeTableController {
	/**
	 * Class timeTableDB.
	 */
	public TimeTableDB timeTableDB;

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
	 * timeTableDB.
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
		this.timeTableDB=newTimeTableDB;
	}
	
	/**
	 * Get the values of the different roomId in a list of strings
	 * @return TabRoomsId
	 */
	
	public String[] roomsIdToString() {
		// Start of user code for method roomsIdToString
		HashSet<Room> RoomsSet = TimeTableDB.RoomsSet;		//Récupération du HashSet contenant les Rooms
		Iterator<Room> it1 = RoomsSet.iterator();			//Initialisation de l'itérateur et calcul de la longueur du tableau
		int i =RoomsSet.size();								//Récupération des roomsId sous la forme d'int conversion en string et ajout dans le tableau de sortie
		String TabRoomsId[] = new String[i];
		i =0;
		while (it1.hasNext()) {
			String cle = "" + it1.hasNext();
	    	TabRoomsId[i]=cle;
	    	i++;
		}
	    return TabRoomsId;
		// End of user code
	}


	/**
	 * Get the values of the different timeTableId in a list of strings
	 * @return TabTimeTableId
	 */
	public String[] roomsToString() {
		// Start of user code for method roomsIdToString
		HashSet<TimeTable> TTSet = TimeTableDB.TTSet;		//Récupération du HashSet contenant les TimeTable
		Iterator<TimeTable> it1 = TTSet.iterator();			//Initialisation de l'itérateur et calcul de la longueur du tableau
		int i =TTSet.size();								//Récupération des TimeTableId sous la forme d'int conversion en string et ajout dans le tableau de sortie
		String TabTimeTableId[] = new String[i];
		i =0;
		while (it1.hasNext()) {
			String cle = "" + it1.hasNext();
			TabTimeTableId[i]=cle;
		   	i++;
		}
	    return TabTimeTableId;
		
	}

	
	/**
	 * Fonction qui crée une salle et qui la sauvegarde dans la base de données. 
	 * @param roomId
	 * 		L'identifiant de la salle
	 * @param capacity
	 * 		La capacité de la salle
	 * @return
	 * 		Un boolean indiquant si la salle a bien été crée
	 */
	public boolean addRoom(int roomId, int capacity){
		HashSet<Room> RoomsSet = TimeTableDB.RoomsSet;
		Room newroom = new Room(roomId,capacity);
		boolean b;
		if((RoomsSet.contains(newroom))){
			b=false;
		}
		else{
			b=true;
			RoomsSet.add(newroom);
		}
	
		return b;
	}

	@Override
	public String getTeacherLogin(int timeTableId, int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeRoom(int roomId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getRoom(int timeTableId, int bookId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean addTimeTable(int timeTableId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeTimeTable(int timeTableId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addBooking(int timeTableId, int bookingId, String login, Date dateBegin, Date dateEnd, int roomId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void getBookingsDate(int timeTableId, Hashtable<Integer, Date> dateBegin, Hashtable<Integer, Date> dateEnd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean removeBook(int timeTableId, int bookId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getBookingsMaxId(int timeTableId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String[] timeTablesIDToString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] booksIdToString(int timeTableId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveDB() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean loadDB() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}