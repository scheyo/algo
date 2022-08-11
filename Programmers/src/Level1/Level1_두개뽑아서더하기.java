package Level1;

import java.util.Arrays;
import java.util.HashSet;

public class Level1_두개뽑아서더하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {2, 1, 3, 4, 1};
		
		System.out.println(Arrays.toString(solution(numbers)));
	}
	
	public static int[] solution(int[] numbers) {
        int[] answer = {};
        
        HashSet<Integer> s = new HashSet<>();
        
        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                s.add(numbers[i] + numbers[j]);
            }
        }
     
        answer = new int[s.size()];
    
        //Set 원소 -> 배열에 넣는 방법 1
        int i = 0;
        for(int c : s){
            answer[i++] = c;
        }
        
        Arrays.sort(answer);
        return answer;
    }

}
