package Level3;
import java.util.Arrays;

public class Level3_입국심사 {
	
	public static long solution(int n, int[] times) {
        long answer = Long.MAX_VALUE;
        
        Arrays.sort(times);  // 오름차순으로 정렬
        long start = 0, mid = 0, person = 0;
        long end = answer;
        
        //mid : 심사를 하는데 주어지는 시간 
        //person : mid내 심사한 인원
        //모든시간을 체크하면서 최소시간을 구해야하므로 완전탐색이 아닌 이분탐색 사용
        
        while(start <= end){
            mid = (start + end)/ 2;
            person = 0;  // 최소 시간을 찾을 때 마다 인원 초기화
            
            for(int i = 0; i < times.length; i++){
                person += (mid / times[i]);
                
                if(n <= person){
                    break;
                }
            }
            
            if(n > person){  // 시간이 부족할 때
                start = mid + 1;
            }
            else{// 시간이 남아 최소 시간을 찾아야 할 때
                end = mid - 1;
                answer = Math.min(answer, mid);
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] times = {7, 10};
		System.out.println(solution(6, times));
	
	}

}




