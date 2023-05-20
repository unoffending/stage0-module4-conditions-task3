package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if(month > 12 || month < 1) {
            System.out.println("wrong number!");
        } else if(month < 3 || month == 12) {
            System.out.println("Winter");
        } else if(month > 2 && month < 6) {
            System.out.println("Spring");
        } else if(month > 5 && month < 9) {
            System.out.println("Summer");
        } else {
            System.out.println("Autumn");
        }
    }
}
