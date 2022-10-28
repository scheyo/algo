package Level1;

public class Level1_부족한금액계산하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(3, 20, 4));
	}
	
	public static long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;
        
        for(int i = 1; i <= count; i++){
            sum += (price * i);
        }
        
        if(sum < money){
            answer = 0;
            return answer;
        }
        
        answer = sum - money;

        return answer;
    }

}
