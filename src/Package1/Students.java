package Package1;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Students extends Programming{

	private String myVolume(double x, double y, double z) {
		double volume = x * y * z;
		return "The volume of the cubiod with dimension " + x + ", " + y + ", " + z + " is " + volume;
	}

	public void showMyVolume() {
		this.myVolume(3, 3, 3);
		System.out.println(myVolume(4, 4, 5));

	}
}
