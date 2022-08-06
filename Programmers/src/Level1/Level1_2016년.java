package Level1;

public class Level1_2016년 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(5, 24).toString());
	}
	
	public static String solution(int a, int b) {
        String answer = "";
        int[] day = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int tmp = 5; // 1월 1일 요일 : 금요일
        
        for(int i = 2; i <= a; i++){
            if(day[i - 2] == 31){
                tmp = (tmp + 3) % 7;
            }
            else if(day[i - 2] == 30){
                tmp = (tmp + 2) % 7;
            }
            else{
                tmp = (tmp + 1) % 7;
            }
        }        
        answer = week[(tmp + b - 1) % 7];
        return answer;
    }

}
