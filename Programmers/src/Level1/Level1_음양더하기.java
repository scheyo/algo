package Level1;

public class Level1_음양더하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] absolutes = {4, 7, 12};
		boolean[] signs = {true, false, true};
		System.out.println(solution(absolutes,signs));
	}
	
	public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i = 0; i < absolutes.length; i++){
            if(signs[i] == true){
                answer += absolutes[i] * 1;
            }
            else{
                answer += absolutes[i] * -1;
            }
        }
        return answer;
    }

}
