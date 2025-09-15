import java.awt.Robot;
import java.awt.event.KeyEvent;

public class TestProgram {

    private static final int INTERVAL_MINUTES = 2;

    public static void main(String[] args) {
        try {  
            Robot robot = new Robot();

            while (true) {
                robot.keyPress(KeyEvent.VK_Q);
                robot.keyRelease(KeyEvent.VK_Q);
                Thread.sleep(INTERVAL_MINUTES * 60 * 1000L)   ;
            }
  
        } catch (Exception e) {       
            e.printStackTrace();
        }
    }
}
    