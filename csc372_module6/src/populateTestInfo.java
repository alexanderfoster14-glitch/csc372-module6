import java.util.ArrayList;

public class populateTestInfo {
	
	ArrayList<Student> students;
	
	populateTestInfo(ArrayList<Student> students) {
		this.students = students;
		
		//Student #1
		students.get(0).rollno = 123;
		students.get(0).name = "Michael Anderson";
		students.get(0).address = "1248 Maple Street, Denver, CO 80203";
		
		//Student #2
		students.get(1).rollno = 234;
		students.get(1).name = "Sarah Mitchell";
		students.get(1).address = "567 Oak Avenue, Boulder, CO 80302";
		
		//Student #3
		students.get(2).rollno = 134;
		students.get(2).name = "James Thompson";
		students.get(2).address = "892 Pine Road, Aurora, CO 80012";
		
		//Student #4
		students.get(3).rollno = 13;
		students.get(3).name = "Emily Parker";
		students.get(3).address = "341 Cedar Lane, Lakewood, CO 80226";
		
		//Student #5
		students.get(4).rollno = 9875;
		students.get(4).name = "Daniel Rodriguez";
		students.get(4).address = "765 Birch Drive, Arvada, CO 80002";
		
		//Student #6
		students.get(5).rollno = 273;
		students.get(5).name = "Olivia Bennett";
		students.get(5).address = "210 Willow Court, Littleton, CO 80120";
		
		//Student #7
		students.get(6).rollno = 8;
		students.get(6).name = "Christopher Morgan";
		students.get(6).address = "1539 Aspen Way, Thornton, CO 80229";
		
		//Student #8
		students.get(7).rollno = 712;
		students.get(7).name = "Jessica Coleman";
		students.get(7).address = "478 Cherry Street, Golden, CO 80401";
		
		//Student #9
		students.get(8).rollno = 412;
		students.get(8).name = "Matthew Sullivan";
		students.get(8).address = "926 Elm Boulevard, Westminster, CO 80031";
		
		//Student #10
		students.get(9).rollno = 413;
		students.get(9).name = "Ashley Richardson";
		students.get(9).address = "605 Spruce Avenue, Centennial, CO 80112";
		
	}
}
