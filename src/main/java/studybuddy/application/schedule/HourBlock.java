package studybuddy.application.schedule;

public class HourBlock {

    private String description;
    private boolean isAvailable;
    private int hour;

    public HourBlock(int hour) {
        this.hour = hour;
        isAvailable = true;
    }

    public HourBlock(int hour, String description) {
        this.description = description;
        this.hour = hour;
        isAvailable = false;
    }

    public void setDescription(String description) {
        this.description = description;
        isAvailable = false;
    }

    public void removeDescription() {
        isAvailable = true;
    }

    @Override
    public String toString() {
        return String.format("%d hr: %s", hour, isAvailable ? "-" : description);
    }

}
