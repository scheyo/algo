package Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Level1_문자열내마음대로정렬하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tmp = {"sun", "bed", "car"};
		System.out.println(Arrays.toString(solution(tmp, 1)));
	}
	
	public static String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i < strings.length; i++){
            list.add(strings[i].charAt(n) + strings[i]);
        }

        answer = new String[list.size()];
        
        Collections.sort(list);
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i).substring(1, list.get(i).length());
            /*
            sustring : 자를 문자열의 시작점, 자를 문자열의 원하는 끝 인덱스+ 1(1 더해야함) 
            ==> (뽑히는것은 시작점~ 끝)
            */
        }
        return answer;
    }

}
