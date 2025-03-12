package algorithms.with.oop.activityselectionproblem;

import java.util.ArrayList;
import java.util.Collections;

public class ASPMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ActivitySelectionProblem> list = new ArrayList<>();
		ActivitySelectionProblem activity1 = new ActivitySelectionProblem();
		activity1.setActivity("A1");
		activity1.setStart(0);
		activity1.setFinish(6);
		
		ActivitySelectionProblem activity2 = new ActivitySelectionProblem();
		activity2.setActivity("A2");
		activity2.setStart(3);
		activity2.setFinish(4);
		
		ActivitySelectionProblem activity3 = new ActivitySelectionProblem();
		activity3.setActivity("A3");
		activity3.setStart(1);
		activity3.setFinish(2);
		
		list.add(activity1);
		list.add(activity2);
		list.add(activity3);
		
		Collections.sort(list, new ASPComparator());
		
		for(ActivitySelectionProblem problem: list) {
			System.out.println(problem.getActivity());
		}
		
		
		//Implement your activity selection problem 
		//algorithm in a method here 
	}

}
