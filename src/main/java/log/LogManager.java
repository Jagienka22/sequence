package log;

import java.util.ArrayList;

/**
 * Created by aga on 25.04.18.
 */
public class LogManager {
    public static String function(ArrayList<String> a) {
        String wynik;
        int numberOfDays = 0;
        int numberOfSession = 0;

        for (int i = a.size() - 1; i > 0; i--) {
            Log log = new Log(a.get(i));
            Log previousLog = new Log(a.get(i-1));

            if (log.czyLogiRozniaSieOWiecejNizDzien(previousLog)) {
                break;
            }
            if (log.czyLogiRozniaSieOJedenDzien(previousLog)) {
                numberOfDays++;
            }
            if (log.czyLogiRozniaSiePrzynajmniejOPolGodziny(previousLog)) {
                numberOfSession++;
            }
        }
        if (numberOfDays >= 2 && numberOfSession >= 5) {
            wynik = "True";
        } else
            wynik = "False";

        return wynik;
    }
}
