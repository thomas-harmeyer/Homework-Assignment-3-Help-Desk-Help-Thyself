/*package yeah_oops;

import java.util.ArrayList;
import java.util.Scanner;

public class NabilTakeCareOfThisCodePWEESE {

	private static ArrayList<person> people = new ArrayList<person>();

	public static void runner() {
		System.out.println("Tsst?");
		// Scanner input = new Scanner(System.in);
		Scanner input = new Scanner("20\r\n" + "2 Robin 2010 8\r\n" + "5 Jill 1020 6\r\n" + "7 Jack 3100 2");
		int maxTime = input.nextInt();
		input.nextLine();
		for (int time = 0; input.hasNextLine(); time++) {
			String[] info = input.nextLine().split(" ");
			people.add(new person(Integer.parseInt(info[0]), info[1], Integer.parseInt(info[2]),
					Integer.parseInt(info[3])));
		}
		for (int time = 0; time < maxTime; time++) {
			System.out.println(methodd(time).getname());
		}
	}

	public static person methodd(int time) {
		int personIn = 0;
		if (people.size() == 0) {
			return new person();
		}
		for (int y = 0; y < people.size(); y++) {
			if (people.get(y).gettimeLeft() < 1) {
				people.remove(y);
				y = 0;
				if (people.size() == 0) {
					return new person();
				}
			}
			if (people.get(y).getstarttime() <= time) {
				if (people.get(y).getClassNumber() < people.get(personIn).getClassNumber()) {
					personIn = y;
				}
			}
		}

		for (int y = 0; y < people.size(); y++) {
			if (y != personIn) {
				if (people.get(personIn).getClassNumber() < people.get(y).getClassNumber()) {
					if (people.get(y).getstarttime() == time) {
						people.remove(y);
						y--;
					}
				}
			}
		}

		if (people.get(personIn).getstarttime() <= time) {
			// stack.push(people.get(personIn));
			people.get(personIn).settimeLeft(people.get(personIn).gettimeLeft() - 1);
			return people.get(personIn);
		} else {
			return new person();
		}
	}
}
*/