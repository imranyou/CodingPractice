package ctci;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by iyousuf.
 */
public class ArraysStringTest {


    @Test
    public void HashNoDuplicate(){
        isUnique as = new isUnique();
        Assert.assertEquals(true,as.bfUnique("abc"));
        Assert.assertEquals(false,as.bfUnique("abbnc"));
        Assert.assertEquals(true,as.checkUniqueUsingHash("abc"));
        Assert.assertEquals(false,as.checkUniqueUsingHash("abbnc"));

    }

    @Test
    public void permutationTest(){
        Permutation p = new Permutation();
        String expected = "[ACB, BCA, ABC, CBA, BAC, CAB]";
        Assert.assertEquals(expected, p.createCombinations("ABC").toString());

    }

    @Test
    public void ArrayPermutationTest(){
        ArrayPermutation ap = new ArrayPermutation();
        int[] a = {1,2,3};
    }

    @Test
    public void firstRecuringCharacterTest(){
        firstRecuringCharacter fsc = new firstRecuringCharacter();
        Assert.assertEquals("A", fsc.recuring("ABDAB"));
    }

    @Test
    public void urify(){
        URLify u = new URLify();
        String expected = "Mr%20John%20Smith";
        //Assert.assertEquals(expected,u.urlme("Mr John Smith", 13, "%20"));
        Assert.assertEquals(expected,u.urlme2("Mr John Smith", 13));
    }
}
