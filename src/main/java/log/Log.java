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
                //System.out.println(roznicaMinutDwochLogowan);
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

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        ArrayList<String> b = new ArrayList<String>();
        ArrayList<String> c = new ArrayList<String>();
        ArrayList<String> d = new ArrayList<String>();
        ArrayList<String> e = new ArrayList<String>();
        ArrayList<String> f = new ArrayList<String>();
        ArrayList<String> g = new ArrayList<String>();
        ArrayList<String> h = new ArrayList<String>();

        a.add("2017-03-10 08:13:11");
        a.add("2017-03-10 19:01:27");
        a.add("2017-03-11 07:35:55");
        a.add("2017-03-11 16:15:11");
        a.add("2017-03-12 08:01:41");
        a.add("2017-03-12 17:19:08");

        b.add("2017-03-10 18:58:11");
        b.add("2017-03-10 19:01:27");
        b.add("2017-03-11 07:35:55");
        b.add("2017-03-11 16:15:11");
        b.add("2017-03-12 08:01:41");
        b.add("2017-03-12 17:19:08");

        c.add("2017-03-08 17:11:13");
        c.add("2017-03-11 17:22:47");
        c.add("2017-03-11 19:23:51");
        c.add("2017-03-11 22:03:12");
        c.add("2017-03-12 08:32:04");
        c.add("2017-03-12 13:19:08");
        c.add("2017-03-12 17:19:08");

        d.add("2017-03-08 17:11:13");
        d.add("2017-03-09 17:22:47");
        d.add("2017-03-09 19:23:51");
        d.add("2017-03-09 22:03:12");
        d.add("2017-03-10 08:32:04");
        d.add("2017-03-12 13:19:08");
        d.add("2017-03-12 17:19:08");

        e.add("2018-03-12 11:00:00");
        e.add("2018-03-13 11:00:00");
        e.add("2018-03-14 11:00:00");

        f.add("2017-03-10 08:13:11");
        f.add("2017-03-10 19:01:27");
        f.add("2017-03-11 07:35:55");
        f.add("2017-03-11 16:15:11");
        f.add("2017-03-12 08:01:41");
        f.add("2017-03-12 08:19:08");

        g.add("2017-03-10 08:13:11");
        g.add("2017-03-10 19:01:27");
        g.add("2017-03-11 07:35:55");
        g.add("2017-03-11 23:55:11");
        g.add("2017-03-12 00:01:41");
        g.add("2017-03-12 18:19:08");

        h.add("2017-03-10 08:13:11");
        h.add("2017-03-10 19:01:27");
        h.add("2017-03-11 07:35:55");
        h.add("2017-03-11 23:11:11");
        h.add("2017-03-12 00:01:41");
        h.add("2017-03-12 18:19:08");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(function(a));
        System.out.println(function(b));
        System.out.println(function(c));
        System.out.println(function(d));
        System.out.println(function(e));
        System.out.println(function(f));
        System.out.println(function(g));
        System.out.println(function(h));

    }
}
