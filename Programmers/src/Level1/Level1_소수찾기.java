package Level1;

public class Level1_소수찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(10));
	}
	public static int solution(int n) {
        int answer = 0;
        /*자연수 n이 소수이기 위한 필요 충분 조건은 
        n이 n의 제곱근보다 작은 어떤 소수로도 나눠지지 않는다는 성질 이용*/
        
        for(int i = 2; i <= n; i++){ // n은 2부터 시작
          boolean flag = true;
            
          for(int j = 2; j <= (int)Math.sqrt(i); j++){  //1은 소수가 아니므로 제외
            if(i % j == 0){
                flag = false;
                break;
            }
          }
          if(flag == true){
              answer++;
          }
              
        }
        return answer;
    }
}
