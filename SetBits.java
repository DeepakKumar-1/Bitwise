package BitManipulation;

public class SetBits {
    // Find Number of Set Bits in a Given Number
    public static void main(String [] args){
        int num = 9;
        System.out.println(Integer.toBinaryString(num));
        int count = 0;
        while(num > 0){
            count ++;
            num = num & (num - 1);
        }
        System.out.println(count);
    }
}
