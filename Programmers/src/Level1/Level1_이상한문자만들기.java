package Level1;

import java.util.StringTokenizer;

public class Level1_이상한문자만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("try hello world"));
	}
	
	public static String solution(String s) {
        String answer = "";
       
        StringTokenizer st = new StringTokenizer(s, " ", true); 
        // 3번째 인자는 구분자를 포함하고 싶다면 true, 아니면 false(디폴트)
        
        while(st.hasMoreTokens()){
            String tmp = st.nextToken();
            
            for(int i = 0; i < tmp.length(); i++){
                
                String Tchar = tmp.substring(i, i + 1);
                
                if(i % 2 == 0){
                    answer += Tchar.toUpperCase();
                }
                else{
                    answer += Tchar.toLowerCase();
                }
            }
            
        }
        
        /*
        <특정 문자를 삭제하고 싶을 때>
        
        StringBuilder sb = new StringBuilder();
        sb.append(answer);
        
        answer = sb.deleteCharAt(sb.length() - 1).toString();
        */
        return answer;
    }
}
