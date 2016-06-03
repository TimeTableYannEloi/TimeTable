/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package timeTableModel;
import java.util.*;
import timeTableModel.TimeTable;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of TeacherTT.
 * 
 * @author Eloi
 */
public class TeacherTT extends TimeTable {
	// Start of user code (user defined attributes for TeacherTT)

	private Integer TimeTableId;
	
	// End of user code

	/**
	 * The constructor.
	 * @param TimeTableId 
	 */
	public TeacherTT(Integer TimeTableId) {
		super(TimeTableId);
		this.TimeTableId=TimeTableId;
		this.bookings = new HashSet<Booking>();
	}
		// End of user code
	

	
}
