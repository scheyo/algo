package Level1;

import java.util.Arrays;

public class Level1_예산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] d = {1, 3, 2, 5, 4};
		System.out.println(solution(d, 9));
	}
	
	public static int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0, cnt = 0;
        
        Arrays.sort(d);
        
        for(int i = 0; i < d.length; i++){
            sum += d[i];
            if(sum <= budget){
                cnt++;
            }
        }
        answer = cnt;
        return answer;
    }

}
