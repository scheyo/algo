package Level1;
import java.util.ArrayList;
import java.util.Collections;

public class Level1_정수내림차순으로배치하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(118372));
	}
	
	public static long solution(long n) {
        long answer = 0;
        String tmp = Long.toString(n);
        
        ArrayList<Character> list = new ArrayList<>();  //Character형
        
        for(int i = 0; i < tmp.length(); i++){
            list.add(tmp.charAt(i));  //문자열의 인덱스는 charAt() : Char형
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        long len = list.size();
        tmp = "";
        
        for(int i = 0; i < list.size(); i++){
           tmp += list.get(i);
        }
        
        //parseLong(String형), Wapper Type의 첫 문자는 대문자
        answer = Long.parseLong(tmp);
        
        return answer;
    }

}
