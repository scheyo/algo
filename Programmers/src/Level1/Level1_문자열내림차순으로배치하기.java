package Level1;

import java.util.Arrays;

public class Level1_문자열내림차순으로배치하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("Zbcdefg"));
	}
	
	public static String solution(String s) {
        String answer = "";
        
        /*방법1
        ArrayList<Character> list = new ArrayList<>();
        
        for(int i = 0; i < s.length(); i++){
            list.add(s.charAt(i));
        }
        Collections.sort(list, Collections.reverseOrder());
        
        for(int i = 0; i < s.length(); i++){
            answer += list.get(i);
        }
        */
        
        //방법2
        
        char[] tmp = s.toCharArray();  // toCharArray() : 문자열 -> char형 배열로 변환
        Arrays.sort(tmp);
        
        StringBuffer sb = new StringBuffer();
        sb.append(tmp);
        answer = sb.reverse().toString();
        
        return answer;
    }
}
