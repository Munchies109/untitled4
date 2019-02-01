
public class Solution {


    public static int sum(int[] myArray) {

        int sum = 0;
        for(int i : myArray)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {
        int[] intArray = {1 , 2,  3 , 4};
        int sumOfArray = sum(intArray);

        System.out.println(sumOfArray);
    }

}
