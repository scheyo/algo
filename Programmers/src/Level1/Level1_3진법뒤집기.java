package Level1;

public class Level1_3진법뒤집기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(45));
	}
	
	public static int solution(int n) {
        int answer = 0;
        String tmp = "";
        
        while(n!= 0){
            tmp += (n % 3);
            n = n / 3;
        }
        //n진수 -> 10진수 : Integer.parseInt(문자열, n진법);
        //10진수 -> n진수 : Integer.toString(정수, n진법);
        answer = Integer.parseInt(tmp, 3);
        return answer;
    }

}
