package SimpleSearch;

import java.util.Scanner;

public class SimpleSearch_Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] number = new int[n];

        for (int i = 0; i < n; i++) {
            number[i] = scanner.nextInt();
        }

        int j = -1;
        int k = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if (number[i] == k) {
                j = i + 1;
                break;
            }
        }

        System.out.println(j);
    }
}
