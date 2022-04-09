import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TaskableTest {

	Taskable o;
	String[] trueseq0;
	String[] falseseq0;
	String[][] prio;
    @BeforeEach
    void setUp() throws Exception {
    	prio = new String[][] {{ "A" , "C" }, { "C", "D" }, { "B", "C" }};
    	o = new Task(prio);
    	trueseq0 = new String[]{ "A" , "B", "C", "D" };
    	falseseq0 = new String[]{"D" , "C", "B", "A" };
    }

    
    @Test
    void testIsWellSortedTrue() {
    	assertTrue(o.isWellSorted(trueseq0));
    }
    
    @Test
    void testIsWellSortedFalse() {
    	assertFalse(o.isWellSorted(falseseq0));
    }

}