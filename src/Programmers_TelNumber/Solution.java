package Programmers_TelNumber;

import java.util.HashSet;

public class Solution {

    public boolean solution(String[] phone_book) {

        HashSet<String> hash = new HashSet<>();

        for (String phoneNum : phone_book) {
            hash.add(phoneNum);
        }

        for (String phoneNum : phone_book) {
            // phone_book 최대 100만
            for (int i = 0; i < phoneNum.length(); i++) {
                // phonenum의 최대길이 == 20
                if (hash.contains(phoneNum.substring(0, i)))
                    return false;
            }
        }

        return true;
    }

}