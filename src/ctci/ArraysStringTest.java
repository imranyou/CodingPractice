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
        Assert.assertEquals(true,p.bfPermutation("abcabbac","abc"));

    }
}
