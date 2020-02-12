package Test;

public class RobotTest {
	
	public static void main(String[] args) {
		Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		for (int i = 0; i < arr.length; i++) {
			action(arr[i]);
			
		}
		
	}
	
	public static void action(Robot r) { //instanceof
		
		if(r instanceof DrawRobot) {
			((DrawRobot)r).draw();
		} else if (r instanceof SingRobot) {
			((SingRobot)r).sing();
		} else
			((DanceRobot)r).dance();
	}

}
