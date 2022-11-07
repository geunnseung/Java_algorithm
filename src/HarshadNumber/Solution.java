package HarshadNumber;

public class Solution {
    public boolean solution(int x) {

        //자릿수 합
        int sumOfDigit = 0;
        while(x > 0) {
            sumOfDigit += x%10;
            x = x/10;
        }
        System.out.println(sumOfDigit);


        return false;
    }
    public static void main(String[] args) {

    }

}
