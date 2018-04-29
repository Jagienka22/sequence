package log;

import java.util.ArrayList;

/**
 * Created by aga on 25.04.18.
 */
public class Log {
    public static String function(ArrayList<String> a) {
        String wynik;
        int numberOfDays = 0;
        int numberOfSession = 0;

        for (int i = a.size() - 1; i > 0; i--) {

            String day = a.get(i).substring(8, 10);
            int day1 = Integer.valueOf(day);
            String day02 = a.get(i - 1).substring(8, 10);
            int day0 = Integer.valueOf(day02);

            String hour = a.get(i).substring(11, 13);
            int hour0 = Integer.valueOf(hour);
            String minutes = a.get(i).substring(14, 16);
            int min = Integer.valueOf(minutes);
            String hour2 = a.get(i - 1).substring(11, 13);
            int hour1 = Integer.valueOf(hour2);
            String minutes2 = a.get(i - 1).substring(14, 16);
            int min0 = Integer.valueOf(minutes2);

            int roznicaMinutDwochLogowan = (hour0 * 60) + min - ((hour1 * 60) + min0);

            if (day1 - day0 > 1) {
                break;
            }
            if (day1 - day0 == 1) {
                numberOfDays++;
                if (hour0 == 0 && hour1 == 23) {
                    if ((60 - min0) + min >= 30) {
                        numberOfSession++;
                    }
                } else
                    numberOfSession++;
            }

            if (day1 - day0 == 0) {
                if (roznicaMinutDwochLogowan >= 30) {
                    numberOfSession++;
                }
            }
        }
        if (numberOfDays >= 2 && numberOfSession >= 5) {
            wynik = "True";
        } else
            wynik = "False";

        return wynik;
    }
}
