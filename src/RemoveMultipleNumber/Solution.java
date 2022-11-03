package RemoveMultipleNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        int N = 50;
        //50미만의 소수 구하기

        //N-1개 만큼 2~50까지
        int[] nums = new int[N-1];
        boolean[] checks = new boolean[nums.length];//nums만큼 checks생성
        Arrays.fill(checks, true); //checks를 true로 초기화 cuz 기본값 false
        for (int i = 0; i < nums.length; i++) nums[i] = i +2; // 2~50까지 nums에 채우기


    }
}
