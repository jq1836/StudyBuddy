package studybuddy.application.schedule;

public class DayBlock {

    private HourBlock[] dayBlock = new HourBlock[24];
    private int day;

    public DayBlock(int day, HourBlock[] dayBlock) {
        this.day = day;
        this.dayBlock = dayBlock;
    }

    public DayBlock(int day) {
        this.day = day;
        for (int i = 0; i < 24; i++) {
            dayBlock[i] = new HourBlock(i + 1);
        }
    }

}
