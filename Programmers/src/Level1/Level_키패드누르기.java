package Level1;

public class Level_키패드누르기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		String hand = "right";
		System.out.println(solution(numbers, hand));
	}
	
	public static String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10, right = 12;
        
        for(int i = 0 ; i < numbers.length; i++){
            int tmp = numbers[i];
            
            if(tmp == 1 || tmp == 4 || tmp == 7){
                left = numbers[i];
                answer += 'L';
            }
            if(tmp == 3 || tmp == 6 || tmp == 9){
                right = numbers[i];
                answer += 'R';
            }
            if(tmp == 2 || tmp == 5 || tmp== 8 || tmp == 0){
                // 공통으로 쓰는 변수를 따로 만들 것, 굳이 여기서 만들면 어긋날 수 있음 ex) int tmp = numbers[i];(X)
                if(tmp == 0){
                   tmp = 11; // 0은 숫자순서에 맞게 11
                }
                
                //위아래는 / 3, 왼쪽 오른쪽은 % 3으로 두개의 거리를 더함
                int a = (Math.abs(left - tmp) / 3) + (Math.abs(left - tmp) % 3);
                int b = (Math.abs(right - tmp) / 3) + (Math.abs(right - tmp) % 3);   

                
                if(a < b){
                    left = tmp;
                    answer += 'L';
                }
                else if(a > b){
                    right = tmp;
                    answer += 'R';
                }
                else{
                    if("right".equals(hand)){
                        right = tmp;
                        answer += 'R';
                    }
                    else{
                        left = tmp;
                        answer += 'L';
                    }
                }
            }
        }
        return answer;
    }

}
