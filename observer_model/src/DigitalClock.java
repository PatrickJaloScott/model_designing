import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {
    private ClockTimer timer;
    public DigitalClock(ClockTimer ct) {
        timer = ct;
        timer.attach(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o == timer) {
            draw();
        }
    }

    private void draw() {
        int hour = timer.getHour(),
        minute = timer.getMinute(),
        second = timer.getSecond();
        String s_hour = (hour > 9 ? "" : "0") + hour,
                s_minute = (minute > 9 ? "" : "0") + minute,
                s_second = (second > 9 ? "" : "0") + second;
        // print to screen sout
        System.out.printf("The current time is %s:%s:%s\n", s_hour, s_minute, s_second);
    }
}
