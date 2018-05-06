package log;

/**
 * Created by aga on 06.05.18.
 */
public class Log {
    private final int day;
    private final int hour;
    private final int min;

    public Log(String log) {
        day = Integer.valueOf(log.substring(8, 10));
        hour = Integer.valueOf(log.substring(11, 13));
        min = Integer.valueOf(log.substring(14, 16));
    }

    public boolean czyLogiRozniaSieOWiecejNizDzien(Log previousLog) {
        return day - previousLog.day > 1;
    }

    public boolean czyLogiRozniaSieOJedenDzien(Log previousLog) {
        return day - previousLog.day == 1;
    }

    public boolean czyLogiRozniaSiePrzynajmniejOPolGodziny(Log previousLog) {
        if(day - previousLog.day == 1) {
            return !(hour == 0 && previousLog.hour == 23) || (60 - previousLog.min) + min >= 30;
        }
        return (hour * 60) + min - ((previousLog.hour * 60) + previousLog.min) >= 30;
    }
}
