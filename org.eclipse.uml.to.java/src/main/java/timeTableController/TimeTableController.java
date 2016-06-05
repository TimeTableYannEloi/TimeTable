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
	 * timeTableDB Class.
	 */
	public TimeTableDB TimeTableDB;

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
		return this.TimeTableDB;
	}

	/**
	 * Sets a value to attribute timeTableDB. 
	 * @param newTimeTableDB 
	 */
	public void setTimeTableDB(TimeTableDB newTimeTableDB) {
		this.TimeTableDB=newTimeTableDB;
	}
	
	/**
	 * Get the values of the different roomId in a list of strings
	 * @return TabRoomsId
	 * 		Le tableau des TabRoomsId en string
	 */
	
	public String[] roomsToString() {
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
	
	public String[] roomsIdToString() {
		// Start of user code for method roomsIdToString
		HashSet<Room> RoomsSet = TimeTableDB.RoomsSet;		//Récupération du HashSet contenant les Rooms
		Iterator<Room> it1 = RoomsSet.iterator();			//Initialisation de l'itérateur et calcul de la longueur du tableau
		int i =RoomsSet.size();								//Récupération des roomsId sous la forme d'int conversion en string et ajout dans le tableau de sortie
		String TabRoomsId[] = new String[i];
		i =0;
		while (it1.hasNext()) {
			Room RR = (Room)it1;
			it1.next();
			String cle = "" + RR.getRoomId();
	    	TabRoomsId[i]=cle;
	    	i++;
		}
	    return TabRoomsId;
		// End of user code
	}
	
	/**
	 * Fonction permettant de rÃ©cupÃ©rer tous les identifiants des emplois du temps sous la forme d'un 
	 * tableau de chaÃ®nes de caractÃ¨res oÃ¹ chaque ligne contient l'identifiant d'un emploi du temps.
	 * 
	 * @return
	 * 		Un tableau de String contenant toutes les identifiants de tous les emplois du temps.
	 */
	public String[] timeTablesIDToString(){
		// Start of user code for method roomsIdToString
		HashSet<Room> RoomsSet = TimeTableDB.RoomsSet;		//Récupération du HashSet contenant les Rooms
		Iterator<Room> it1 = RoomsSet.iterator();			//Initialisation de l'itérateur et calcul de la longueur du tableau
		int i =RoomsSet.size();								//Récupération des roomsId sous la forme d'int conversion en string et ajout dans le tableau de sortie
		String TabRoomsId[] = new String[i];
		i =0;
		while (it1.hasNext()) {
            Room RR = (Room)it1.next();
            String cle = "" + RR.getRoomId();
            TabRoomsId[i]=cle;
            i++;
        }
	    return TabRoomsId;
		// End of user code
	}

	
	/**
     * Fonction qui supprime une salle et qui sauvegarde la base de donnÃ©es. 
     * @param roomId
     *         L'identifiant de la salle
     * @return
     *         Un boolean indiquant si la salle a bien Ã©tÃ© supprimÃ©e
     */
    public boolean removeRoom(int roomId) {

        Iterator<Room> parcourtRooms = TimeTableDB.RoomsSet.iterator();     // Création d'un itérateur pour parcourir RoomsSet
        while(parcourtRooms.hasNext()){
            // on parcourt le set de rooms en cherchant un élément égal
            //à l'id de la room que l'on veut supprimer
            if(parcourtRooms.next().getRoomId()== roomId){
                int capacity = parcourtRooms.next().getCapacity();       //Récupération de la capacité de la salle
                Room Remove = new Room(roomId, capacity);                //Création d'un Objet Room 
                TimeTableDB.RoomsSet.remove(Remove);                     //Supression de la salle 
                saveDB();
                return true;
            }
        }
        return false;

    }

	/**
	 * Fonction qui crÃ©e un emploi du temps et qui le sauvegarde dans la base de donnÃ©es
	 * @param timeTableId
	 * 		L'identifiant d'emploi du temps
	 * @return
	 * 		Un boolean indiquant si l'emploi du temps a bien Ã©tÃ© crÃ©Ã©
	 */
	public boolean addTimeTable(int timeTableId) {
        TimeTable NewTT = new TimeTable(timeTableId);
        if (TimeTableDB.TTSet.contains(NewTT)){
            TimeTableDB.TTSet.add(NewTT);
            return true;
        }
        return false;
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
	public int getRoom(int timeTableId, int bookId) {
		HashSet<TimeTable> TTSet = TimeTableDB.TTSet;
		Iterator<TimeTable> it1=TTSet.iterator();
		String ttId=""+timeTableId; //conversion du parametre en String
		while(it1.hasNext()){
			TimeTable TT=(TimeTable)it1.next();
			if (TT.getGroupId()==ttId){//Si on a le bon TimeTable, il faut trouver la bonne reservation
				HashSet<Booking> Booking=TT.getBookings();
				Iterator<Booking> it2=Booking.iterator();
				while(it2.hasNext()){
					Booking BK=(Booking)it2.next();
					if(BK.getRoomId()==bookId){
						int SalleID=BK.getRoomId();
						return SalleID;
					}
				}
			}
		}
		return 0;
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


	/**
     * Fonction permettant de rÃ©cupÃ©rer tous les identifiants des rÃ©servations de l'emploi du temps timeTableId sous la forme d'un 
     * tableau de chaÃ®nes de caractÃ¨res oÃ¹ chaque ligne contient l'identifiant d'une rÃ©servation.
     * 
     * @param timeTableId
     *             Un identifiant d'emploi du temps
     * @return
     *         Un tableau de String contenant toutes les informations de tous les groupes.
     */
    public String[] booksIDToString(){
        HashSet<Booking> Bookings = TimeTable.bookings;        //Récupération du HashSet contenant les Books
        Iterator<Booking> it1 = Bookings.iterator();            //Initialisation de l'itérateur et calcul de la longueur du tableau
        int i =Bookings.size();                                //Récupération des booksId sous la forme d'int conversion en string et ajout dans le tableau de sortie
        String TabBookId[] = new String[i];
        i =0;
        while (it1.hasNext()) {
            Booking BB = (Booking)it1.next();
            String cle = "" + BB.getbookId();
            TabBookId[i]=cle;
            i++;
        }
        return TabBookId;
        // End of user code
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