package Level1;

public class Level1_정수제곱근판별 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(121));
		
	}
	public static long solution(long n) {
        long answer = 0;
        
        //Math.sqrt() , Math.pow()는 반환타입 double로 각각 다 long타입으로 변환 필요 
        if(((long)Math.sqrt(n) * (long)Math.sqrt(n)) == n){
            answer = (long)(Math.sqrt(n) + 1) * (long)(Math.sqrt(n) + 1);
        }
        else{
            answer = -1;
        }
        
        return answer;
    }

}
