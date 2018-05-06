package log;

/**
 * Created by aga on 06.05.18.
 */
public class Porownywacz {

    private final int day;
    private final int previousDay;
    private final int hour;
    private final int previousHour;
    private final int min;
    private final int previousMin;


    public Porownywacz(String log, String poprzedniLog) {
        day = Integer.valueOf(log.substring(8, 10));
        previousDay = Integer.valueOf(poprzedniLog.substring(8, 10));

        hour = Integer.valueOf(log.substring(11, 13));
        previousHour = Integer.valueOf(poprzedniLog.substring(11, 13));

        min = Integer.valueOf(log.substring(14, 16));
        previousMin = Integer.valueOf(poprzedniLog.substring(14, 16));
    }

    public boolean czyLogiRozniaSieOWiecejNizDzien() {
        return day - previousDay > 1;
    }

    public boolean czyLogiRozniaSieOJedenDzien() {
        return day - previousDay == 1;
    }

    public boolean czyLogiRozniaSiePrzynajmniejOPolGodziny() {
        if(day - previousDay == 1) {
            return !(hour == 0 && previousHour == 23) || (60 - previousMin) + min >= 30;
        }
        return (hour * 60) + min - ((previousHour * 60) + previousMin) >= 30;
    }
}
