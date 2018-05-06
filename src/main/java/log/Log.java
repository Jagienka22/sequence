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
            Porownywacz porownywacz = new Porownywacz(a.get(i), a.get(i - 1));

            if (porownywacz.czyLogiRozniaSieOWiecejNizDzien()) {
                break;
            }
            if (porownywacz.czyLogiRozniaSieOJedenDzien()) {
                numberOfDays++;
            }
            if (porownywacz.czyLogiRozniaSiePrzynajmniejOPolGodziny()) {
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
