package SelectionSort;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        int arr[] = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        int i=0;
        // arr[0]번쨰에 들어갈 값 찾기
        // 그 값이 들어있는 index 찾기 --0
        int minIdx =0;
        for (int j =0; j < arr.length; j++) {
            if(arr[minIdx] > arr[j]) minIdx =j;

        }
        int temp = arr[0];
        arr[0] = arr[minIdx];
        arr[minIdx] = temp;
        System.out.println(Arrays.toString(arr));

        i=1;
        // arr[1]번쨰에 들어갈 값 찾기
        // 그 값이 들어있는 index 찾기 -- 8
        // 0번은 정렬이 끝났기 때문에 7, 4, 9, 10, 223, 111, 23, 3, 39 만 생각
        minIdx =1;
        for (int j =1; j < arr.length; j++) {
            if(arr[minIdx] > arr[j]) minIdx =j;

        }
        temp = arr[1];
        arr[1] = arr[minIdx];
        arr[minIdx] = temp;
        System.out.println(Arrays.toString(arr));

        i=2;
        //arr[2]번째에 들어갈 값 찾기
        minIdx =2;
        for (int j =2; j < arr.length; j++) {
            if(arr[minIdx] > arr[j]) minIdx =j;

        }
        temp = arr[2];
        arr[2] = arr[minIdx];
        arr[minIdx] = temp;
        System.out.println(Arrays.toString(arr));

    }
}
