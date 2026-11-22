import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
	
	public int compare(Student o1, Student o2) {
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		return s1.name.compareTo(s2.name);
	}
}

/*
Return value	Meaning
Negative		o1 comes before o2
Zero			o1 and o2 are equal for sorting
Positive		o1 comes after o2
*/