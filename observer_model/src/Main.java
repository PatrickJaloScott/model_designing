import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClockTimer timer = new ClockTimer();
        DigitalClock wristWatch = new DigitalClock(timer);
        timer.attach(wristWatch);
        Scanner keyInput = new Scanner(System.in);
        System.out.print("Enter amount of seconds that time moves forward: ");
        int clockTicks = keyInput.nextInt();
        timer.startTicks(clockTicks);
    }
}
