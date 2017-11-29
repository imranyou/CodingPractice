package ctci;

import java.util.ArrayList;
import java.util.HashSet;
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


    public HashSet<String> createCombinations (String s){   // O(n^2 * n!)
        ArrayList<String> getInitial = permute(s); // O(n!)
        ArrayList<String> temp = new ArrayList<String>();

        HashSet<String> hs = new HashSet<String >();

            for(String sl : getInitial){          // O(n)
                temp = permute(sl);               // 0 (n!)
                for (String t : temp){           // O(n)
                    hs.add(t);
                    }
                }




        return hs;
    }

    public ArrayList<String> permute (String s) {
        ArrayList<String> allCombinations = new ArrayList<String>();
        if (s.isEmpty()) {
            return allCombinations;
        }
        if (s.length() > 2) {
            String[] schar = s.split("");
            for (int i = 0; i < s.length(); i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(schar[i]);
                sb.append(s.substring(0,i));
                sb.append(s.substring(i + 1, schar.length));
                allCombinations.add(sb.toString());

            }

        }
        return allCombinations;
    }


    public static void main(String[] args){
        Permutation p = new Permutation();
        System.out.println(p.createCombinations("ABCD").toString());
    }



}
