package ctci;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by iyousuf.
 */
public class SplitWordsByN {

    public ArrayList<String> splitWords (String s, int n){
        ArrayList<String> words = new ArrayList<>();
        ArrayList<Integer> positionOfSpaces = new ArrayList<>();
        String[] eachAlpha = s.split("");
        int numOfParts = s.length() / n + 1;
        int div =0;

        for(int i=0; i < eachAlpha.length; i++) {
            if (eachAlpha[i].equals(" ")) {
                positionOfSpaces.add(i);
            } else {
                continue;
            }
        }

        for(int k=0; k < eachAlpha.length - 10; k++){
            if(eachAlpha[k+n].equals(" ")){
                words.add(s.substring(k,k+n));
            }
            if(s.substring(k,k+n).contains(" ") && !eachAlpha[k+n].equals(" ")){

                for(int l: positionOfSpaces){
                    if(k+n > l){
                        div = l;
                    }
                }
                words.add(s.substring(k,div));
                k = div;
            }
            if(k+10 > eachAlpha.length){
                div = positionOfSpaces.get(positionOfSpaces.size()-1);
                words.add(s.substring(k,div) + s.substring(div,eachAlpha.length));
                break;
            }
            else{
                continue;
            }

        }


        return words;
    }



    public static void main (String[] args){
        String test = "The quick fox jumps over the lazy dog";
        SplitWordsByN sw = new SplitWordsByN();
        System.out.print(sw.splitWords(test,10).toString());
    }
}
