package sequence;

import java.util.ArrayList;

/**
 * Created by aga on 24.04.18.
 */
public class Sequence {

    public static ArrayList<Integer> function(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> c = new ArrayList<Integer>();
        int number = 0;
        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < B.size(); j++) {
                if (A.get(i).equals(B.get(j))) {
                    number++;
                }
            }
            if (czyPierwsza(number).equals("NIE")) {
                c.add(A.get(i));
            }
            number = 0;
        }
        return c;
    }

    public static String czyPierwsza(int number) {
        String wynik = "TAK";
        if (number < 2) {
            wynik = "NIE";
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                wynik = "NIE";
            }
        }

        return wynik;
    }

}
