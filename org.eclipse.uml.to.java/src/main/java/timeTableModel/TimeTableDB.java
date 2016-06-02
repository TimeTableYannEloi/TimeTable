/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package timeTableModel;
import java.io.File;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.IOException;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.jdom2.*;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of TimeTableDB.
 * 
 */


public class TimeTableDB {
	protected HashMap <Integer,Room> RoomMap = new HashMap();
	protected HashMap <Integer,TimeTable> TimeTableMap = new HashMap();
	protected HashMap <Integer,Booking> BookingMap = new HashMap();
	/**
	 * Description of the property timeTables.
	 */
	
	
	
	public HashSet<TimeTable> timeTables = new HashSet<TimeTable>();

	/**
	 * Description of the property teacherTTs.
	 */
	public HashSet<TeacherTT> teacherTTs = new HashSet<TeacherTT>();

	/**
	 * Description of the property file.
	 */
	/**
	 * Description of the property rooms.
	 */
	public HashSet<Room> rooms = new HashSet<Room>();

	// Start of user code (user defined attributes for TimeTableDB)

	// End of user code

	/**
	 * 
	 * Le fichier contenant la base de données.
	 * 
	 */
	protected org.jdom2.Document file;

	public TimeTableDB(String file) {
		// Start of user code constructor for TimeTableDB)
		super();
		// End of user code
	}

	/**
	 * Description of the method saveDB.
	 */
	public void showDB() {
		try{
			XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
			sortie.output(file, ));}
		catch (java.io.IOException e){}
	}
	
	public void saveDB() {
		try{
			XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
			sortie.output(file, new FileOutputStream("timeTableDB.xml"));}
		catch (java.io.IOException e){}
	}

	/**
	 * Description of the method loadDB.
	 */
	public void loadDB() {
		SAXBuilder sxb = new SAXBuilder();
		try{
			file = sxb.build(new File("timeTableDB.xml"));}
			catch(Exception e){}
		org.jdom2.Element TTDBElt = file.getRootElement();
		List<org.jdom2.Element> RoomsElts = TTDBElt.getChildren("Rooms");
		List<org.jdom2.Element> TTElts = TTDBElt.getChildren("TimeTables");
		Iterator<org.jdom2.Element> ItRooms = RoomsElts.iterator();
		Iterator<org.jdom2.Element> ItTT = TTElts.iterator();
		while(ItRooms.hasNext()){
			Element Room = (Element)ItRooms.next();
			Integer RoomId = ((org.jdom2.Element) Room).getChild("RoomId").getText();
			String capacity = ((org.jdom2.Element) Room).getChild("Capacity").getText();
			if (!(RoomMap.containsKey(RoomId))){
				Room NRoom = new Room (RoomId, capacity);
				RoomMap.put(RoomId,NRoom);
				
			}
					}
		
		while(ItTT.hasNext()){
			Element TT = (Element)ItTT.next();
			String GroupId = ((org.jdom2.Element) TT).getChild("GroupId").getText();
			List<org.jdom2.Element> BooksElts = ((org.jdom2.Element) TT).getChildren("Books");
			Iterator<org.jdom2.Element> ItBooks = BooksElts.iterator();
			while(ItBooks.hasNext()){
				Element Books = (Element)ItTT.next();
				String BookingId = ((org.jdom2.Element) Books).getChild("BookingId").getText();
				String Login = ((org.jdom2.Element) Books).getChild("Login").getText();
				String DateBegin = ((org.jdom2.Element) Books).getChild("DateBegin").getText();
				String DateEnd = ((org.jdom2.Element) Books).getChild("DateEnd").getText();
				String RoomId = ((org.jdom2.Element) Books).getChild("RoomId").getText();
				if (!(BookingMap.containsKey(BookingId))){
					Booking Book = new Booking (BookingId, Login, DateBegin, DateEnd, RoomId);
					BookingMap.put(BookingId,Book);
				}
			}
						
			if (!(TimeTableMap.containsKey(GroupId))){
				TimeTable TTI = new TimeTable (GroupId);
				TimeTableMap.put(GroupId,TTI);
			}
					}

	}
	

	/**
	 * Description of the method CheckDB.
	 */
	public void CheckDB() {
		// Start of user code for method CheckDB
		// End of user code
	}

	// Start of user code (user defined methods for TimeTableDB)

	// End of user code
	/**
	 * Returns timeTables.
	 * @return timeTables 
	 */
	public HashSet<TimeTable> getTimeTables() {
		return this.timeTables;
	}

	/**
	 * Returns teacherTTs.
	 * @return teacherTTs 
	 */
	public HashSet<TeacherTT> getTeacherTTs() {
		return this.teacherTTs;
	}

	/**
	 * Returns file.
	 * @return file 
	 */
	public String getFile() {
		return file;
	}

	/**
	 * Sets a value to attribute file. 
	 * @param newFile 
	 */
	public void setFile(String file) {
		this.file = file;
	}

	/**
	 * Returns rooms.
	 * @return rooms 
	 */
	public HashSet<Room> getRooms() {
		return this.rooms;
	}

}
