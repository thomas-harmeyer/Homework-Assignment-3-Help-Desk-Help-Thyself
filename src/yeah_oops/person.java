package yeah_oops;

public class person {
	private int starttime;
	private String name;
	private int classNumber;
	private int timeLeft;

	public person(int starttime, String name, int classNumber, int timeLeft) {
		super();
		this.starttime = starttime;
		this.name = name;
		this.classNumber = classNumber;
		this.timeLeft = timeLeft;
	}

	public int getstarttime() {
		return starttime;
	}

	public void setstarttime(int starttime) {
		this.starttime = starttime;
	}

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
