import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task implements Taskable {
    private String[][] prio;

    public Task(String[][] prio) {
	this.prio = prio;
    }

    public boolean isWellSorted(String[] seq) {
	var sequence = Arrays.asList(seq);
	var map = initMap(prio);
	fillMap(map, prio);
	for (int i = 0; i < sequence.size(); i++) {
	    for (var entry : map.entrySet()) {
		var key = entry.getKey();
		var value = entry.getValue();
		var itr = value.iterator();
		if (sequence.get(i) == key) {
		    if (value.isEmpty()) {
			removeValueFromMap(map, key);
			continue;
		    } else {
			return false;
		    }
		}
	    }
	}
	return true;
    }

    private static void removeValueFromMap(HashMap<String, List<String>> map, String valueToRemove) {
	for (var entry : map.entrySet()) {
	    var key = entry.getKey();
	    var value = entry.getValue();
	    var itr = value.iterator();
	    while (itr.hasNext()) {
		var i = itr.next();
		if (i == valueToRemove) {
		    itr.remove();
		}
	    }
	}

    }

    private static HashMap<String, List<String>> initMap(String[][] prios) {
	String[] temp = flatten(prios);
	Set<String> set = new HashSet<>(Arrays.asList(temp));
	HashMap<String, List<String>> results = new HashMap<>();
	for (String i : set) {
	    results.put(i, new ArrayList<String>());
	}
	return results;
    }

    private static void fillMap(HashMap<String, List<String>> map, String[][] prio) {
	for (var seq : prio) {
	    var temp = Arrays.copyOfRange(seq, 1, seq.length);
	    for (int i = 0; i < temp.length; i++) {
		var temp1 = Arrays.copyOfRange(seq, 0, i + 1);
		for (int j = 0; j < temp1.length; j++) {
		    map.get(temp[i]).add(temp1[j]);
		}
	    }
	}
    }

    private static String[] flatten(String[][] arr) {
	var result = new ArrayList<String>();
	for (int i = 0; i < arr.length; i++) {
	    for (int j = 0; j < arr[i].length; j++) {
		result.add(arr[i][j]);
	    }
	}
	return result.toArray(new String[0]);
    }
    
    @Override
    public String toString() {
	var map = initMap(prio);
	fillMap(map, prio);
        return map.toString();
    }

}
