package ctci;

/**
 * Created by iyousuf.
 */
public class OneStepAway {
    
    public boolean lengthIsOk(String s, String c){
        int ori = s.length();
        int com = c.length();
        
        int oneLess = ori-1;
        int oneMore = ori+1;
        
        if(com==ori || com==oneLess || com==oneMore){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean oneStepRemove(String s , String c){
        char[] oriChar = s.toCharArray();
        char[] comChar = c.toCharArray();
        //abcd //abecd
        if(c.length() > s.length() ){
            for(int i=0; i<c.length(); i++){
                if(i==0){
                    String k = c.substring(1,c.length());
                }else{
                    String k = c.substring(0,i-1)+c.substring(i+1,c.length());

                }
            }


        }
    }
    
    
    // abcd //aecdb
    
    public boolean isOneStepAway(String s,String c){
        if(lengthIsOk(s,c)){

            //first check remove

        }else{
            return false;
        }
    }
    
    
    public static void  main ( String[] args){
        OneStepAway osa = new OneStepAway();
        
    }
}
