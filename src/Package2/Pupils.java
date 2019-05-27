package Package2;


import Package1.*;

public class Pupils extends Students {
	static {
		System.out.println("Africa My Continent");
	}


	public static void main(String[] args) {
		Pupils obj = new Pupils();
		//obj.showMyVolume();
		//obj.myFormula();
		obj.myMonths();
	}

}
