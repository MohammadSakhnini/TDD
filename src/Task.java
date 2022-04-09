import java.util.ArrayList;
import java.util.List;

public class Task implements Taskable {
    private String[][] priority;

    public Task(String[][] priority) {
	this.priority = priority;
    }

    public boolean isWellSorted(String[] sequence) {

	for (String string : sequence) {

	}

	return false;
    }

    public static String[] flatten(String[][] arr) {
	List<String> result = new ArrayList<String>();
	for (int i = 0; i < arr.length; i++) {
	    for (int j = 0; j < arr[i].length; j++) {
		result.add(arr[i][j]);
	    }
	}
	return result.toArray(new String[0]);
    }

}
