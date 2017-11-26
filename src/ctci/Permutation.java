package ctci;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iyousuf.
 */

 // Given two strings check if one of them is permutaion of the other.

public class Permutation {

    public boolean bfPermutation(String s1, String s2){
        boolean isPermutable = false;
        if(s1.equals(s2)){
            isPermutable = true;
        }
        String[] permuteString = s2.split("");
        String[] mainString = s1.split("");

        List permutationOfS2 = new ArrayList<String>();


        for(int i=0; i < mainString.length - permuteString.length + 1; i++){
            String k = s1.substring(i,i+(permuteString.length));
            int km = s2.length();
            if(k.equals(s1)){
                isPermutable = true;
                break;
            }
        }

        return isPermutable;
    }


    public ArrayList<String> createCombinations (String s){
        ArrayList<String> allCombinations = new ArrayList<String>();

        for (int i = 0; i < s.length() ; i++) {
            
        }

        return allCombinations;
    }

}
