package Level1;

public class Level1_소수만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tmp = {1, 2, 3, 4};
		System.out.println(solution(tmp));
	}
	
	public static int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                for(int a = j + 1; a < nums.length; a++){
                    if(test(nums[i] + nums[j] + nums[a])){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
            
        
    public static boolean test(int c){
        
        for(int i = 2; i <= (int)Math.sqrt(c); i++){
            if(c % i == 0){
               return false;
            }
        }
        return true;
    }

}
