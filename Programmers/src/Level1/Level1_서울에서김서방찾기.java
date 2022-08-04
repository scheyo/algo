package Level1;

public class Level1_서울에서김서방찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] seoul = {"Jane", "Kim"};
		System.out.println(solution(seoul));
	}
	
	public static String solution(String[] seoul) {
        String answer = "김서방은 ";
        for(int i = 0; i < seoul.length; i++){
            if("Kim".equals(seoul[i])){ // equals 사용을 높이기!
                answer += Integer.toString(i);
                break;
            }
        }
        answer += "에 있다";
        return answer;
    }
}
