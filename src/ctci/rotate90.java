package ctci;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iyousuf.
 *
 *  | 1 2 3 |    | 7 4 1 |
 *  | 4 5 6 | => | 8 5 2 |
 *  | 7 8 9 |    | 9 6 3 |
 *
 *
 */
public class rotate90 {


    public int[][] rotate90clockWise(int[][] matrix){
        int[][] temp = matrix.clone();

        //getting n
        int matSize = matrix.length;

        //get top original row
        int[] top = matrix[0];

        //get original bottom row
        int[] bottom = matrix[matSize-1];


        int[] right = new int[matSize];
        int[] left = new int[matSize];


        for(int[] i: matrix){
            for(int k=0; k< i.length; k++){
                right[matSize-1-k] = matrix[k][0];
                left[matSize-1-k] = matrix[k][matSize-1];
            }
        }

        // move top to right
        temp[0] = right;

        //move bottom to left
        temp[matSize-1]=left;

        //top=left

        for(int n=0; n < top.length; n++){
            //move right to top
            temp[n][matSize-1] = top[n];
            //move bottom to right
            temp[n][0] = bottom[n];

        }

        return temp;
    }

    public String printIt(int[][] matrix){
        int sizeRow = matrix[0].length;
        String s="";
        int count = 0;

        for(int[] i : matrix){
            for(int k : i){
                s = s + " " + k;
                count++;
                if (count % sizeRow == 0){
                    s = s + "\n";
                }
            }
        }

        return s;
    }

    public static void main(String[] args){
        rotate90 r = new rotate90();
        int[][] matrix = {{-1,-2,-3,-4},{-5,-6,-7,-8},{-9,10,11,12},{13,14,15,16}};
        System.out.println(r.printIt(matrix));

        System.out.println("#####################");

        System.out.println(r.printIt(r.rotate90clockWise(matrix)));


    }
}
