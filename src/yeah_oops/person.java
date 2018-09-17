/**
 * COSC 2100 - Project 3
 * This class is used in the HelpDesk class to store student information.
 * @author [Nabil Hussaini and Thomas Harmeyer]
 * Instructor [Dennis Brylow]
 * TA-BOT:MAILTO [nabil.hussaini@marquette.edu]
 */
public class person {
	//private int starttime;
	private String name;
	private int classNumber;
	private int timeLeft;
	
	public person(String name, int course, int workload){
		this.name = name;
		classNumber = course;
		timeLeft = workload;
	}

	/*public person(int starttime, String name, int classNumber, int timeLeft) {
		super();
		this.starttime = starttime;
		this.name = name;
		this.classNumber = classNumber;
		this.timeLeft = timeLeft;
	}
	public person() {
		super();
		this.starttime = 0;
		this.name = "Idle";
		this.classNumber = 0;
		this.timeLeft = 0;
	}

	public int getstarttime() {
		return starttime;
	}

	public void setstarttime(int starttime) {
		this.starttime = starttime;
	}
	*/

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}

	public int gettimeLeft() {
		return timeLeft;
	}

	public void settimeLeft(int timeLeft) {
		this.timeLeft = timeLeft;
	}
}
