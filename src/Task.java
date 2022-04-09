public class Task implements Taskable {
    private String[][] prioirty;

    public Task(String[][] prioirty) {
	this.prioirty = prioirty;
    }

    public boolean isWellSorted(String[] sequence)
    {
        for (int iPrio = 0; iPrio < prioirty.length; iPrio++)
        {
            for (int jPrio = prioirty[iPrio].length - 1; jPrio >= 1; jPrio--)
            {
                for (int i = sequence.length - 1; i >= 0; i--)
                {
                    if (sequence[i] == prioirty[iPrio][jPrio])
                    {
                        if (Contains(sequence, i + 1, prioirty[iPrio][jPrio - 1]))
                        {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }

    private boolean Contains(String[] sequence, int from, String value)
    {
        for (int i = from; i < sequence.length; i++)
        {
            if (sequence[i] == value)
                return true;
        }

        return false;
    }

}

