package Package1;

import java.util.LinkedList;
import java.util.Queue;

public class Programming {
	protected void myFormula() {
		Queue<Integer> students = new LinkedList<>();
		for (int i = 1; i <= 20; i++) {
			((LinkedList<Integer>) students).add(i);

			System.out.println(students + " = ");
		}
	}
		public void myMonths(){
			Queue<String> months = new LinkedList<>();
			((LinkedList<String>) months).add("Jan");
			((LinkedList<String>) months).add("Feb");
			((LinkedList<String>) months).add("Mar");
			((LinkedList<String>) months).add("Apr");
			((LinkedList<String>) months).add("May");
			((LinkedList<String>) months).add("Jun");
			((LinkedList<String>) months).add("Jan");
			((LinkedList<String>) months).add("Jul");
			((LinkedList<String>) months).add("Aug");
			((LinkedList<String>) months).add("Sep");
			((LinkedList<String>) months).add("Oct");
			((LinkedList<String>) months).add("Nov");
			((LinkedList<String>) months).add("Dec");
			System.out.println(months);

			boolean hasAug = months.contains("Aug");
			System.out.println(hasAug);

			String myMo = ((LinkedList<String>) months).remove(4);
			System.out.println(months);
			System.out.println(months);
			String myName = months.remove();
			System.out.println(months);
			System.out.println(months.peek());
			System.out.println();
			System.out.println(((LinkedList<String>) months).peekFirst());
			System.out.println();
			System.out.println(((LinkedList<String>) months).peekLast());
		}

	}


