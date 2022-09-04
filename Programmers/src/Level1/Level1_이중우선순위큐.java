package Level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Level1_이중우선순위큐 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] operations = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
		System.out.println(Arrays.toString(solution(operations)));
	}
	
	public static int[] solution(String[] operations) {
        int[] answer = {0, 0};
        
        PriorityQueue<Integer> min_pq = new PriorityQueue<>(); // 기본은 오름차순
        PriorityQueue<Integer> max_pq = new PriorityQueue<>(Collections.reverseOrder()); //내림차순
        
        for(int i = 0; i < operations.length; i++){

            String Alpha = operations[i].substring(0 , 1);
            int Num = Integer.parseInt(operations[i].substring(2));
            
            //System.out.println(Alpha + " " + Num);
            if("I".equals(Alpha)){
                min_pq.add(Num);
                max_pq.add(Num);
            }
            if("D".equals(Alpha)){
                if(min_pq.isEmpty() || max_pq.isEmpty()){
                    continue;
                }
                if(Num == -1){
                    int min = min_pq.peek(); // 꼭 변수에 담아줘야함
                    min_pq.remove(min);  // 큐에서 삭제가능
                    max_pq.remove(min);
                }
                else{
                    int max = max_pq.peek();
                    min_pq.remove(max);
                    max_pq.remove(max);
                }
            }
        }
        
        if(!min_pq.isEmpty() || !max_pq.isEmpty()){
            answer[0] = max_pq.peek();
            answer[1] = min_pq.peek();
        }
        //System.out.println(min_pq.toString());
        return answer;
    }

}
