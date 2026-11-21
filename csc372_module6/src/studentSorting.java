import java.util.ArrayList;

public class studentSorting {
	
	public static void main (String[] args) {
		//Create arraylist with 10 Students
		ArrayList<Student> students = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			students.add(new Student());
		}
		
		//Used for testing. Populates ArrayList with test data.
		new populateTestInfo(students);
		
		//Create the program window
		new studentSortWindow(students);
	}
}