package Level1;

public class Level1_시저암호 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("AB", 1));
	}
	
	public static String solution(String s, int n) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                answer += " ";
            }
            else if(Character.isUpperCase(s.charAt(i)) == true){
                answer += (char)('A' + (s.charAt(i) + n - 'A') % 26);  
                // 알파벳 26개 반복, s.charAt(i) + n는 정수
            }
            else{
                answer += (char)('a' + (s.charAt(i) + n - 'a') % 26);
            }
        }
       
        return answer;
    }

}
