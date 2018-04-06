package ctci;

/**
 * Created by iyousuf.
 */
public class OneStepAway {

    public String compress(String s){
        String k = "";
        int sum=1;
        for(int i=0; i < s.length() -1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                sum = sum + 1;
            }else{
                k = k + s.charAt(i) + sum;
                sum = 1;
            }

        }
        k = k + s.charAt(s.length()-1) + sum;
        return k;
    }
    

    public static void main(String[] args){
        OneStepAway os = new OneStepAway();
        System.out.println(os.compress("aabbcdddd"));
    }
}
