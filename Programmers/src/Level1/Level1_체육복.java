package Level1;

public class Level1_체육복 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lost = {2, 4};
		int[] reserve = {1, 3, 5};
		
		System.out.println(solution(5, lost, reserve));
	}
	
	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int[] check = new int[n];

        for(int i = 0; i < reserve.length; i++){
            check[reserve[i] - 1]++;
        }
        
        for(int i = 0; i < lost.length; i++){
            check[lost[i] - 1]--;
        }

        for(int i = 0; i < check.length; i++){
            if(check[i] == -1){ 
                if(i - 1 >= 0 && check[i - 1] == 1){ // 앞의 학생부터 먼저 체크 필요
                    check[i]++;
                    check[i - 1]--;
                }
                else if(i + 1 < check.length && check[i + 1] == 1){
                    check[i]++;
                    check[i + 1]--;
                }
                else{ //양 옆의 모든 학생한테 빌릴 수 없을 때
                    answer--;
                }
            }
        }
        
        return answer;
    }

}
