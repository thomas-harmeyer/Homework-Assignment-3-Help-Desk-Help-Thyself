/**
 * COSC 2100 - Project 3
 * This class will work with the HelpDeskRunner to simulate a help desk for Comp Sci students.
 * @author [Nabil Hussaini and Thomas Harmeyer]
 * Instructor [Dennis Brylow]
 * TA-BOT:MAILTO [nabil.hussaini@marquette.edu]
 */

package yeah_oops;

public class HelpDesk {

	private int time;
	private DSLinkedStack students= new DSLinkedStack();
	private DSLinkedStack forLog = new DSLinkedStack();

	public HelpDesk() {
		time = 0;
	}

	public void step() {
		time++;
		if (!students.isEmpty()) {
			if ( ((person) students.top()).gettimeLeft() == 0){
				forLog.push("Time " + time + ", Finished helping " + ((person) students.top()).getname() + " from COSC" + ((person) students.top()).getClassNumber());
				students.pop();
			}
			else
				((person) students.top()).settimeLeft(((person) students.top()).gettimeLeft() - 1);
		}
	}

	public void addStudent(String name, int course, int workload) {
		boolean toAdd = false;
		if (students.isEmpty()){
			toAdd = true;
		}
		else if (course < ((person) students.top()).getClassNumber()){
			toAdd = true;
		}
		if (toAdd) {
			students.push(new person(name, course, workload));
			forLog.push("Time " + time + ", Started helping " + name + " from COSC" + course + " for " + workload
					+ " minutes.");
		} 
		else{
			forLog.push("Time " + time + ", Turned away " + name + " from COSC" + course + " for " + workload
					+ " minutes.");
		}
	}

	public int getTime() {
		return time;
	}

	public String toString() {
		if (students.isEmpty())
			return ("Time " + time + ", IDLE");
		else
			return ("Time " + time + ", Helping " + ((person) students.top()).getname() + " from COSC" + ((person) students.top()).getClassNumber());
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
