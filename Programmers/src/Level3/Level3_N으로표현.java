package Level3;

public class Level3_N으로표현 {
	
	public static int answer = Integer.MAX_VALUE;
	public static int target;
	public static int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(5, 12));
	}

    public static int solution(int N, int number) {
        target = number;
        n = N;
        dfs(0, 0);
        return answer == Integer.MAX_VALUE ? -1 : answer; 
    }
    
    
    public static void dfs(int count, int prev) {
        if(count > 8){
            answer = -1;
            return;
        }
        
        if(prev == target){
            answer = Math.min(answer, count);
            return;
        }
        
        int tmpN = n;
        for(int i = 0; i < 8 - count; i++){
            int newCnt = count + i + 1;
            dfs(newCnt, prev + tmpN);
            dfs(newCnt, prev * tmpN);
            dfs(newCnt, prev - tmpN);
            dfs(newCnt, prev / tmpN);
            
            tmpN = tmpN * 10 + n;  // 해당 숫자 여러번 붙인 숫자
        }
    }

}
