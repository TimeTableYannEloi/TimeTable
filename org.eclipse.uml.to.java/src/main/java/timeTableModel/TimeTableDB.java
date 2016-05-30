/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package timeTableModel;
import java.io.File;

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

import java.util.HashSet;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of TimeTableDB.
 * 
 * @author Eloi
 */
public class TimeTableDB {
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
	 * Le fichier contenant la base de donnÃ©es.
	 * 
	 */
	private String file;
	/**
	 * 
	 * Constructeur de TimeTableDB. 
	 * 
	 * @param file
	 * 		Le nom du fichier qui contient la base de donnÃ©es.
	 */
	public TimeTableDB(String file) {
		// Start of user code constructor for TimeTableDB)
		super();
		// End of user code
	}

	/**
	 * Description of the method saveDB.
	 */
	public String document;
	
	public void saveDB(String file) {
		try
		   {
		      //On utilise ici un affichage classique avec getPrettyFormat()
		      XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
		      //Remarquez qu'il suffit simplement de créer une instance de FileOutputStream
		      //avec en argument le nom du fichier pour effectuer la sérialisation.
		      sortie.output(document, new FileOutputStream(file));
		   }
		   catch (java.io.IOException e){}
	}

	/**
	 * Description of the method loadDB.
	 */
	public void loadDB() {
		// Start of user code for method loadDB
		// End of user code
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
