package BitManipulation;

import java.util.Arrays;

public class FindUnique2 {
    public static void main(String [] args){
        int [] arr = {1,1,1,2,3,2,2,3,3,4};
        System.out.println(" Unique Number in Array " + Arrays.toString(arr) + " is: " + unique(arr));
    }

    static int unique(int [] arr){
        int unique = 0;
        for(int i=0; i< arr.length; i++)
            unique ++;
        unique = unique % 3;
        return unique;
    }
}
