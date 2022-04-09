import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	var s = new String[][] { { "A", "C" }, { "C", "D" }, { "B", "C" } };
	var a = new String[] { "A", "B", "C", "D" };
	
	var task = new Task(s);
	System.out.println(Arrays.toString(Task.flatten(s)));
    }
}
