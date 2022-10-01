package studybuddy.application.schedule;

public class WeekBlock implements Schedule {

    private DayBlock[] weekBlock = new DayBlock[7];

    public WeekBlock(DayBlock[] weekBlock) {
        this.weekBlock = weekBlock;
    }

    public WeekBlock() {
        for (int i = 0; i < 7; i++) {
            weekBlock[i] = new DayBlock(i + 1);
        }
    }

}
