package ctci;

import java.util.HashMap;

/**
 * Created by iyousuf.
 */
public class firstRecuringCharacter {

    public String recuring (String s){
        String[] sa = s.split("");
        String result = "";
        HashMap<Integer,String> hp = new HashMap<Integer,String >();
        for(int i=0; i < s.length(); i++){
            if(hp.containsValue(sa[i])){
                result = sa[i];
                break;
            }else{
                hp.put(i,sa[i]);
            }
        }
        return result;
    }


    public static void main(String args[]){
        firstRecuringCharacter ds = new firstRecuringCharacter();
        System.out.print(ds.recuring("ABCDAB"));
    }

}
