package Level1;

import java.util.*;

public class Level1_자연수뒤집어배열로만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Arrays.toString(solution(12345)));
	}
	
	public static int[] solution(long n) {
        int[] answer = {};
  
        List<Integer> list = new ArrayList<>();
        
        while(n != 0){
            list.add((int)(n % 10));  // 형변환하려는 곳에 꼭 괄호로 표시하기
            n = n / 10;
        }  
        
        answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }

}
