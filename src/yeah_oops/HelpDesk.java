/**
 * COSC 2100 - Project 3
 * This class will work with the HelpDeskRunner to simulate a help desk for Comp Sci students.
 * @author [Nabil Hussaini and Thomas Harmeyer]
 * Instructor [Dennis Brylow]
 * TA-BOT:MAILTO [nabil.hussaini@marquette.edu]
 */

public class HelpDesk {

	private int time;
	private DSStackInterface<person> students;
	private DSStackInterface<String> forLog;

	public HelpDesk() {
		time = 0;
		students = new DSLinkedStack<person>();
		forLog = new DSLinkedStack<String>();
	}

	public void step() {
		time++;
		if (!students.isEmpty()) {
			if (students.gettimeLeft() == 0){
				forLog.push("Time " + time + ", Finished helping " + students.top.getname + " from COSC" + students.top.getClassNumber);
				students.pop();
			}
			else
				students.settimeLeft(students.gettimeLeft() - 1);
		}
	}

	public void addStudent(String name, int course, int workload) {
		bool toAdd = false;
		if (students.isEmpty())
			toAdd = true;
		else if (course < students.top.getClassNumber)
			toAdd = true;
		if (toAdd) {
			students.push(new person(name, course, workload));
			forLog.push("Time " + time + ", Started helping " + name + " from COSC" + course + " for " + workload
					+ " minutes.");
		} 
		else
			forLog.push("Time " + time + ", Turned away " + name + " from COSC" + course + " for " + workload
					+ " minutes.");
	}

	public int getTime() {
		return time;
	}

	public String toString() {
		if (students.isEmpty())
			return ("Time " + time + ", IDLE");
		else
			return ("Time " + time + ", Helping " + students.top.getname + " from COSC" + students.top.getClassNumber);
	}

	public String getLog(){
		String log = "";
		while(!forLog.isEmpty()){
			log += forLog.top() + "/n";
			forLog.pop();
		}
		return log;
	}

}
