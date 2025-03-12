package algorithms.without.oop;
public class ASP {
	public static void printMaxActivities(String items[], int s[], int f[],
            int n)
	{
	int i, j;
	System.out.println("Following activities are selected");

	// The first activity always gets selected
	i = 0;
	System.out.print(items[i] + " ");

	// Consider rest of the activities
	for (j = 1; j < n; j++) {
		// If this activity has start time greater than
		// or equal to the finish time of previously
		// selected activity, then select it
		if (s[j] >= f[i]) {
			System.out.print(items[j] + " ");
			i = j;
		}
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String items[] = {"A3", "A2", "A1","A5", "A6", "A4"};
        int s[] = { 1, 3, 0, 5, 8, 5 };
        int f[] = { 2, 4, 6, 7, 9, 9 };
        int n = s.length;

        // Function call
        printMaxActivities(items, s, f, n);
	}

}
