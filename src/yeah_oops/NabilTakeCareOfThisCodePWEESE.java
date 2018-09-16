package yeah_oops;

import java.util.ArrayList;
import java.util.Scanner;

public class NabilTakeCareOfThisCodePWEESE {
	public static void main(String[] args) {
		boolean hasPerson=false;
		int personIn = Integer.MAX_VALUE;
		ArrayList<person> people = new ArrayList<person>();
		Scanner input = new Scanner(System.in);
		for (int x = 0; x < input.nextInt(); x++) {
			for (person person : people) {
				if (person.getstarttime() < people.get(personIn).getstarttime() && person.getClassNumber() < people.get(personIn).getClassNumber()) {
					personIn = person;
					hasPerson = true;
				}				
			}
			if(!hasPerson) {
				stack.push(null);
			}
		}
	}
}
