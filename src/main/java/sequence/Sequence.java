package sequence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import java.util.Set;


/**
 * Created by aga on 24.04.18.
 */
public class Sequence {

    public static ArrayList<Integer> function(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> c = new ArrayList<Integer>();
        HashMap<Integer, Integer> liczbaWystapien = new HashMap<Integer, Integer>();
        for (Integer element : B) {
            int n = element;
            if (liczbaWystapien.containsKey(n)) {
                int number = (liczbaWystapien.get(n)) + 1;
                liczbaWystapien.put(n, number);
            } else {
                liczbaWystapien.put(n, 1);
            }
        }


        Set key = liczbaWystapien.keySet();

        for (Integer element : A) {
            if (!(czyPierwsza(liczbaWystapien.getOrDefault(element, 0)))) {
                c.add(element);
            }
        }
        return c;
    }

    public static boolean czyPierwsza(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
