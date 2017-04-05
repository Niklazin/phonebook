package javaschool.app;


public class Reminder extends Note {
    private String Time;

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;

    }
    @Override
    public String toString() {
        return super.toString() + " " + Time;

    }
}
