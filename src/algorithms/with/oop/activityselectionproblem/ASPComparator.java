package algorithms.with.oop.activityselectionproblem;

import java.util.Comparator;

public class ASPComparator implements Comparator<ActivitySelectionProblem>{

	//@Override
	public int compare(ActivitySelectionProblem o1,ActivitySelectionProblem o2) {
		// TODO Auto-generated method stub
		return o1.getFinish()-o2.getFinish();
	}

}
