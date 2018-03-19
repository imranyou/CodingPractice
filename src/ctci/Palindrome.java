package ctci;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by iyousuf.
 *  String given "TACT CAO"  --> [ "TACO CAT" , "ATCO CTA" ]
 */
public class Palindrome {

    ArrayList<String> aCombo = new ArrayList<>();

    public String oneWord (String s){
        return s.replace(" ","");
    }

    public String palindrome(String s){
        return allCombo("","ABCD");
    }

    public String allCombo(String prefix, String s){

        for (int i = 0; i < s.length(); i++) {
                aCombo.add(prefix);
                allCombo(prefix+s.charAt(i),s.substring(0,i)+s.substring(i+1,s.length())); //prefix+charAt(i) = newPrefix
        }

        return aCombo.toString();

    }


    public static void main (String args[]){
        Palindrome pd = new Palindrome();
        System.out.println(pd.palindrome("IM"));

    }

}
