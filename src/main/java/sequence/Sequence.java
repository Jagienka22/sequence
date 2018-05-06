package sequence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;


/**
 * Created by aga on 24.04.18.
 */
public class Sequence {

    public static ArrayList<Integer> function(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> c = new ArrayList<Integer>();
        int number = 1;
        HashMap<Integer, Integer> liczbaWystapien = new HashMap<Integer, Integer>();
        for (int i = 0; i < B.size(); i++) {
            int n = B.get(i);
            if (liczbaWystapien.containsKey(n)) {
                number = (liczbaWystapien.get(n)) + 1;
                liczbaWystapien.put(n, number);
            } else {
                liczbaWystapien.put(n, number);
            }
            number = 1;
        }

        Set key = liczbaWystapien.keySet();
        for (int j = 0; j < A.size(); j++) {
            if (!(key.contains(A.get(j)))) {
                c.add(A.get(j));
            }
            if (key.contains(A.get(j)) && !(czyPierwsza(liczbaWystapien.get(A.get(j))))) {
                c.add(A.get(j));
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
