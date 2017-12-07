package ctci;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by iyousuf.
 */
public class ArrayPermutation {


    private String allCombinations (int[] combo){
        ArrayList<int[]> combinations = intialCombo(combo);
        HashSet<String> hs = new HashSet<String>();

        for (int[] a: combinations){
            hs.add(intialCombo(a).toString());
        }

        return hs.toString();

    }

    private ArrayList<int[]> intialCombo (int[] acombo){
        ArrayList<int[]> initialCombination = new ArrayList<int[]>();
        if (acombo.length > 1){
            for(int i=0; i<acombo.length - 1; i++){
                int[] aclone = acombo.clone();
                int temp = aclone[i];
                aclone[i] = aclone[i+1];
                aclone[i+1] = temp;
                initialCombination.add(aclone);
                }
            }
            return initialCombination;
        }



    public static void main(String args[]) {

        int[] test = {1,2,3};
        ArrayPermutation ap = new ArrayPermutation();
        System.out.print(ap.allCombinations(test).toString());


    }
}
