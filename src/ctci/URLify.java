package ctci;

/**
 * Created by iyousuf.
 */
public class URLify {

    public final String twn = "%20";

    public String urlme(String s, int len, String rep) {

        char[] ch = s.toCharArray();
        char[] c = new char[len];
        if(ch.length > len){
            for(int p=0; p< len;p++){
                c[p] = ch[p];
            }
        }


        int r = rep.toCharArray().length;
        int count = 0;
        for(int i=0; i < len; i++) {
            if (c[i] == ' ') {
                count++;
            }
        }
        int newCharSize = count*r -r +len+1;

        char[] newSize = new char[newCharSize];
        int m =0;
            for (int k = 0; k < newCharSize; k++) {
                if (c[m] == ' ') {
                    newSize[k] = '%';
                    newSize[k + 1] = '2';
                    newSize[k + 2] = '0';
                    k = k + 2;
                    m = m + 1;
                } else {
                    newSize[k] = c[m];
                    m = m + 1;
                }
        }
        String urifyDone = new String(newSize).trim();
        return urifyDone;
    }

    public String urlme2(String s, int len) {
        String sn = s.substring(0,len);
        String done = sn.replace(" ","%20");
        return done;
    }

    public static void main (String[] args){
        URLify ur = new URLify();
        System.out.print(ur.urlme("Mr John Smith ", 13, "%20"));
    }
}
