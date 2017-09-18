import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Main {
  public static void main(String[] argv) throws Exception {
    Robot robot = new Robot();
    
    System.out.println("Left Button");
    robot.mousePress(InputEvent.BUTTON1_MASK);
    robot.mouseRelease(InputEvent.BUTTON1_MASK);
    robot.delay(1000);
    System.out.println("Waiting");
    System.out.println("Right Button");
    robot.mousePress(InputEvent.BUTTON3_MASK);
    robot.mouseRelease(InputEvent.BUTTON3_MASK);
    System.out.println("Left Button");
    robot.mousePress(InputEvent.BUTTON1_MASK);
    robot.mouseRelease(InputEvent.BUTTON1_MASK);

    //robot.mouseWheel(-1);
    //robot.mouseWheel(+1);
  }
}
