package algorithms.with.oop.activityselectionproblem;

public class ActivitySelectionProblem {
	private String activity;
	private int start;
	private int finish;
	
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getFinish() {
		return finish;
	}
	public void setFinish(int finish) {
		this.finish = finish;
	}
	@Override
	public String toString() {
		return "ActivitySelectionProblem [activity=" + activity + ", start=" + start + ", finish=" + finish + "]";
	}
	
	
	
}
