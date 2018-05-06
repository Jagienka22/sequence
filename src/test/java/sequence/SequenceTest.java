package sequence;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static sequence.Sequence.function;

/**
 * Created by aga on 27.04.18.
 */

public class SequenceTest {
    @Test
    public void testZPrzykladu(){
        ArrayList<Integer> first = new ArrayList<Integer>();
        ArrayList<Integer> second = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();


        first.add(2);
        first.add(3);
        first.add(9);
        first.add(2);
        first.add(5);
        first.add(1);
        first.add(3);
        first.add(7);
        first.add(10);

        second.add(2);
        second.add(1);
        second.add(3);
        second.add(4);
        second.add(3);
        second.add(10);
        second.add(6);
        second.add(6);
        second.add(1);
        second.add(7);
        second.add(10);
        second.add(10);
        second.add(10);

        result.add(2);
        result.add(9);
        result.add(2);
        result.add(5);
        result.add(7);
        result.add(10);

        Assert.assertEquals(function(first, second), result);
    }

    @Test
    public void innyTest(){
        ArrayList<Integer> first = new ArrayList<Integer>();
        ArrayList<Integer> second = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();

        first.add(11);
        first.add(12);
        first.add(13);

        second.add(12);
        second.add(11);
        second.add(13);
        second.add(13);
        second.add(13);
        second.add(12);
        second.add(11);
        second.add(12);
        second.add(12);
        second.add(11);
        second.add(12);
        second.add(13);
        second.add(13);
        second.add(13);

        result.add(13);

        Assert.assertEquals(result, function(first, second));

    }


}