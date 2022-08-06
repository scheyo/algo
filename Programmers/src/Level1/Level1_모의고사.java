package Level1;

import java.util.ArrayList;
import java.util.Arrays;

public class Level1_모의고사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answer = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(solution(answer)));
	}
	
	public static int[] solution(int[] answers) {
        int[] answer = {};
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int success1 = 0, success2 = 0, success3 = 0;
        
        for(int i = 0; i < answers.length; i++){
            //1번 2번 3번 사람 모두 확인 필요
            if(answers[i] == one[i % one.length]){
                success1++;
            }
            if(answers[i] == two[i % two.length]){
                success2++;
            }
            if(answers[i] == three[i % three.length]){
                success3++;
            }
        }
        ArrayList<Integer> tmp = new ArrayList<>();
        
        int max = Math.max(success1, Math.max(success2, success3));
        
        if(max == success1){
            tmp.add(1);
        }
        if(max == success2){
            tmp.add(2);
        }
        if(max == success3){
            tmp.add(3);
        }
        
        answer = new int[tmp.size()];
        
        for(int i = 0; i < tmp.size(); i++){
            answer[i] = tmp.get(i);
        }

        return answer;
    }
}
