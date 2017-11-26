package ctci;

import java.util.HashMap;

/**
 * Created by iyousuf.
 */
public class isUnique {

    // Check if string has all unique characters

    //runtime O(n)
    public boolean checkUniqueUsingHash(String s){
        boolean isUnique = true;
        String[] characters = s.split("");
        HashMap<Integer,String> chars = new HashMap<Integer,String>();
        for (int i = 0; i < characters.length ; i++) {
            if(chars.containsValue(characters[i])){
                isUnique = false;
            }else{
                chars.put(i,characters[i]);
            }

        }

        return isUnique;

    }

    // runtime O(n^2)
    public boolean bfUnique(String s){
        boolean isUnique = true;

        String[] characters = s.split("");

        for (int i = 0; i < characters.length; i++) {
            for(int j=i+1; j < characters.length - 1; j++){
                if(characters[i].equals(characters[j])){
                    isUnique = false;
                    break;
                }
            }

        }

        return isUnique;
    }

}
