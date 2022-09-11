package Level1;

public class Level1_나머지가1이되는수찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(10));
	}
	
	public static int solution(int n) {
        int answer = 0;
        int x = n;
        
        while(x != 0){
            if(n % x == 1){
                answer = Math.min(n, x);
            }
            x--;            
        }
        return answer;
    }

}
