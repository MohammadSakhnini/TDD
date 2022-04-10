public class Main {

    public static void main(String[] args) {
	var prio = new String[][] { { "A", "B" }, { "B", "C" }};
	var task = new Task(prio);
	
	String[] seq1 = new String[] { "A", "B", "C", "D" };
	String[] seq2 = new String[] { "A", "B", "D", "C" };
	String[] seq3 = new String[] { "A", "B", "A", "D", "C" };
	String[] seq4 = new String[] { "A", "A", "C", "D" };
	String[] seq5 = new String[] { "B", "A", "C", "D" };
	String[] seq6 = new String[] { "C", "A"};
	
	System.out.println(task.isWellSorted(seq1));
	System.out.println(task.isWellSorted(seq2));
	System.out.println(task.isWellSorted(seq3));
	System.out.println(task.isWellSorted(seq4));
	System.out.println(task.isWellSorted(seq5));
	System.out.println(task.isWellSorted(seq6));
    }

    
}
