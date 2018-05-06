package log;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static log.LogManager.function;


/**
 * Created by aga on 29.04.18.
 */
public class LogTest {
    @Test
    public void testZPrzykladu1() {
        ArrayList<String> a = new ArrayList<String>();

        a.add("2017-03-10 08:13:11");
        a.add("2017-03-10 19:01:27");
        a.add("2017-03-11 07:35:55");
        a.add("2017-03-11 16:15:11");
        a.add("2017-03-12 08:01:41");
        a.add("2017-03-12 17:19:08");

        Assert.assertEquals(function(a), "True");

    }

    @Test
    public void testZPrzykladu2() {
        ArrayList<String> b = new ArrayList<String>();

        b.add("2017-03-10 18:58:11");
        b.add("2017-03-10 19:01:27");
        b.add("2017-03-11 07:35:55");
        b.add("2017-03-11 16:15:11");
        b.add("2017-03-12 08:01:41");
        b.add("2017-03-12 17:19:08");

        Assert.assertEquals(function(b), "False");

    }

    @Test
    public void testZPrzykladu3() {
        ArrayList<String> c = new ArrayList<String>();

        c.add("2017-03-08 17:11:13");
        c.add("2017-03-11 17:22:47");
        c.add("2017-03-11 19:23:51");
        c.add("2017-03-11 22:03:12");
        c.add("2017-03-12 08:32:04");
        c.add("2017-03-12 13:19:08");
        c.add("2017-03-12 17:19:08");

        Assert.assertEquals(function(c), "False");

    }

    @Test
    public void testSprawdzajacyDniPoKolei() {
        ArrayList<String> d = new ArrayList<String>();

        d.add("2017-03-08 17:11:13");
        d.add("2017-03-09 17:22:47");
        d.add("2017-03-09 19:23:51");
        d.add("2017-03-09 22:03:12");
        d.add("2017-03-10 08:32:04");
        d.add("2017-03-12 13:19:08");
        d.add("2017-03-12 17:19:08");

        Assert.assertEquals(function(d), "False");

    }

    @Test
    public void testSprawdzajacyLiczbeSesji() {
        ArrayList<String> e = new ArrayList<String>();

        e.add("2018-03-12 11:00:00");
        e.add("2018-03-13 11:00:00");
        e.add("2018-03-14 11:00:00");

        Assert.assertEquals(function(e), "False");

    }

    @Test
    public void testsprawdzajacyLiczbeSesji2() {
        ArrayList<String> f = new ArrayList<String>();

        f.add("2017-03-10 08:13:11");
        f.add("2017-03-10 19:01:27");
        f.add("2017-03-11 07:35:55");
        f.add("2017-03-11 16:15:11");
        f.add("2017-03-12 08:01:41");
        f.add("2017-03-12 08:19:08");

        Assert.assertEquals(function(f), "False");
    }

    @Test
    public void testSprawdzajacyLiczbeSesjiPrzyZmianieDnia(){
        ArrayList<String> g = new ArrayList<String>();

        g.add("2017-03-10 08:13:11");
        g.add("2017-03-10 19:01:27");
        g.add("2017-03-11 07:35:55");
        g.add("2017-03-11 23:55:11");
        g.add("2017-03-12 00:01:41");
        g.add("2017-03-12 18:19:08");

        Assert.assertEquals(function(g), "False");
    }

    @Test
    public void testSprawdzajacyLiczbeSesjiPrzyZmianieDnia2(){
        ArrayList<String> h = new ArrayList<String>();

        h.add("2017-03-10 08:13:11");
        h.add("2017-03-10 19:01:27");
        h.add("2017-03-11 07:35:55");
        h.add("2017-03-11 23:11:11");
        h.add("2017-03-12 00:01:41");
        h.add("2017-03-12 18:19:08");

        Assert.assertEquals(function(h), "True");

    }
}
