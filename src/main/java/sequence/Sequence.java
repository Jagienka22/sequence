package sequence;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

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


    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        ArrayList<Integer> testa = new ArrayList<Integer>();
        ArrayList<Integer> testb = new ArrayList<Integer>();

        a.add(2);
        a.add(3);
        a.add(9);
        a.add(2);
        a.add(5);
        a.add(1);
        a.add(3);
        a.add(7);
        a.add(10);

        b.add(2);
        b.add(1);
        b.add(3);
        b.add(4);
        b.add(3);
        b.add(10);
        b.add(6);
        b.add(6);
        b.add(1);
        b.add(7);
        b.add(10);
        b.add(10);
        b.add(10);

        testa.add(2);
        testa.add(3);
        testa.add(9);
        testa.add(2);
        testa.add(5);
        testa.add(1);
        testa.add(3);
        testa.add(7);
        testa.add(10);
        testa.add(11);
        testa.add(12);
        testa.add(13);

        testb.add(2);
        testb.add(1);
        testb.add(3);
        testb.add(4);
        testb.add(3);
        testb.add(10);
        testb.add(6);
        testb.add(12);
        testb.add(11);
        testb.add(6);
        testb.add(13);
        testb.add(13);
        testb.add(13);
        testb.add(1);
        testb.add(12);
        testb.add(11);
        testb.add(7);
        testb.add(12);
        testb.add(10);
        testb.add(10);
        testb.add(10);
        testb.add(12);
        testb.add(11);
        testb.add(12);
        testb.add(13);
        testb.add(13);
        testb.add(13);


        System.out.println(a);
        System.out.println(b);
        System.out.println(function(a, b));

        System.out.println("Ok: [2,9,2,5,7,10]");
        System.out.println(testa);
        System.out.println(testb);
        System.out.println(function(testa, testb));

        System.out.println(czyPierwsza(0) + "0");
        System.out.println(czyPierwsza(2) + "2");
        System.out.println(czyPierwsza(1) + "1");
        System.out.println(czyPierwsza(3) + "3");
        System.out.println(czyPierwsza(4) + "4");
    }


}
