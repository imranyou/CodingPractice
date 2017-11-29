package ctci;


import org.junit.Assert;
import org.junit.Test;

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
}
