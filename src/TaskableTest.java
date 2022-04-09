import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TaskableTest {

	Taskable o;
	String[] trueseq0;
	String[] falseseq0;
    @BeforeEach
    void setUp() throws Exception {
    	o = new Task();
    	trueseq0 = new String[]{ "A" , "B", "C", "D" };
    	falseseq0 = new String[] {"D" , "C", "B", "A" };
    }

    @Test
<<<<<<< Updated upstream
    void testIsWellSortedTrue() {
    	assertTrue(o.isWellSorted(trueseq0));
    }
    
    @Test
    void testIsWellSortedFalse() {
    	assertFalse(o.isWellSorted(falseseq0));
=======
    void testIsWellSorted() {
	assertTrue(true);
>>>>>>> Stashed changes
    }

}
