package Level2;

import java.util.PriorityQueue;

public class Level2_더맵게 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scoville = {1, 2, 3, 9, 10, 12};
		System.out.println(solution(scoville, 7));
	}
	
	public static int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> queue = new PriorityQueue();  // min 
        
        for(int i = 0; i < scoville.length; i++){
            queue.add(scoville[i]);
        }
        
        while(queue.peek() <= K){
            if(queue.size() == 1){
                answer = -1;
                break;
            }
            int first = queue.peek();
            queue.poll();
            int second = queue.peek();
            queue.poll();
            int last = first + (second * 2);
            queue.add(last);
            answer++;
        }
        return answer;
    }

}
