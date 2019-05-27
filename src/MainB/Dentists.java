package MainB;

import Main.*;

public class Dentists extends Clinics{
	String name = "Dr Amoah";
	public void CalDose(){
		System.out.println("My dream is to be a programmer");
	}

	public static void main(String[] args) {
		Clinics obj = new Dentists();
((Dentists) obj).CalDose();
}
}
