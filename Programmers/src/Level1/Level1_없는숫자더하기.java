package Level1;

public class Level1_없는숫자더하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tmp = {1, 2, 3, 4, 6, 7, 8, 0};
		System.out.println(solution(tmp));
	}
	
	public static int solution(int[] numbers) {
        int answer = 0;
        
        for(int i = 0; i < numbers.length; i++){
            answer += numbers[i];
        }
        return 45 - answer;
    }

}
