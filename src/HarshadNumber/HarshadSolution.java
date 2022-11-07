package HarshadNumber;

public class HarshadSolution {
    public boolean solution(int x) {

        int originX = x;
        //자릿수 합
        int sumOfDigit = 0;
        while(x > 0) {
            sumOfDigit += x%10;
            x = x/10;
        }
        System.out.println(sumOfDigit);

        //자릿 수 합으로 나누어 떨어지는가
        return originX % sumOfDigit ==0;
    }
    public static void main(String[] args) {

        HarshadSolution harshadSolution = new HarshadSolution();



    }

}
