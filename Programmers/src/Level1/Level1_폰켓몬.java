package Level1;

import java.util.HashSet;

public class Level1_폰켓몬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3, 1, 2, 3};
		System.out.println(solution(nums));
	}
	
	public static int solution(int[] nums) {
        int answer = nums.length / 2;
        
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++){
            hs.add(nums[i]);
        }
        
        //System.out.println(hs.toString());
        
        if(answer > hs.size()){
            answer = hs.size();
        }
        return answer;
    }
}
