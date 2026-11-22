import java.util.Comparator;

public class RollNoComparator implements Comparator<Student> {
	
	public int compare(Student o1,Student o2) {
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		return Integer.compare(s1.rollno, s2.rollno);
	}
}

/*
Return value	Meaning
Negative		o1 comes before o2
Zero			o1 and o2 are equal for sorting
Positive		o1 comes after o2
*/