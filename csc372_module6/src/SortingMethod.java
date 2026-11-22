import java.util.ArrayList;
import java.util.Comparator;

public class SortingMethod {

    public static void mergeSort(ArrayList<Student> students, Comparator<Student> comparator) {
        ArrayList<Student> temp = new ArrayList<>(students);
        mergeSort(students, temp, 0, students.size() - 1, comparator);
	}
    
    private static void mergeSort(ArrayList<Student> students, ArrayList<Student> temp, int l, int r, Comparator<Student> comparator) {
    	if (l >= r) {
        	return;
        }
        int m = (l + r) / 2;
        mergeSort(students, temp, l, m, comparator);
        mergeSort(students, temp, m + 1, r, comparator);
        merge(students, temp, l, m, r, comparator);
	}

	private static void merge(ArrayList<Student> students, ArrayList<Student> temp, int l, int m, int r, Comparator<Student> comparator) {
		for (int i = l; i <= r; i++) {
			temp.set(i, students.get(i));
		}
		int i = l;
		int j = m + 1;
		int k = l;
		
		while (i <= m && j <= r) {
			if (comparator.compare(temp.get(i), temp.get(j)) <= 0) {
				students.set(k, temp.get(i));
				i++;
			} else {
				students.set(k, temp.get(j));
				j++;
			}
			k++;
		}
		
		while (i <= m) {
			students.set(k, temp.get(i));
			i++;
			k++;
		}
		
		while (j <= r) {
			students.set(k, temp.get(j));
			j++;
			k++;
		}
	}
}
