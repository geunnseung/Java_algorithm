package ProgrammersPokemon;


import java.util.HashSet;
import java.util.Set;

public class Pokemon {

    public int solution(int[] nums) {

        Set<Integer> set = new HashSet<>();
        int answer = 0;
        int max = nums.length / 2;

        for (int idx : nums) {
            set.add(idx);
        }

        if (max > set.size()){
            answer = set.size();
        }else{
            answer = max;
        }

        return answer;
    }
}