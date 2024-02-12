public class ClockTimer extends Subject {
    private int hour, minute, second;
    public int getHour() {
        return this.hour;
    }
    public int getMinute() {
        return this.minute;
    }
    public int getSecond() {
        return this.second;
    }
    void tick() {
        this.second++;
        if (this.second == 60) {
            this.minute++;
            this.second = 0;
            if(this.minute == 60) {
                this.hour++;
                this.minute = 0;
                if(this.hour == 24) {
                    this.hour = 0;
                }
            }
        }
        notifyObservers();
    }
    public void startTicks(int tickCount) {
        for (int i = 0; i < tickCount; i++) {
            tick();
        }
    }
}
