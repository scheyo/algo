package Level1;

public class Level1_신규아이디추천 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
	}
	
	public static String solution(String new_id) {
        String answer = "";
        
        
        //1단계
        for(int i = 0; i < new_id.length(); i++){
            new_id = new_id.toLowerCase();
        }
        
        //2단계(제거 X -> 새 문자열에 추가)
        String Tmp = "";
        
        for(int i = 0; i < new_id.length(); i++){
                      
            if(Character.isLetterOrDigit(new_id.charAt(i)) == true
                || new_id.charAt(i) == '-'
                || new_id.charAt(i) == '_'
                || new_id.charAt(i) == '.')
            {
                Tmp += new_id.charAt(i);
            }
            else{
                continue;
            }
        }
        
        //3단계(.이 1개가 될때 까지 계속 치환)
        while(Tmp.contains("..")){
            Tmp = Tmp.replace("..", ".");
        }
        
        //4단계
        if(Tmp.length() > 0){ // 길이 체크 꼭 필수
            if(Tmp.charAt(0) == '.'){
                Tmp = Tmp.substring(1, Tmp.length());
            }
        }
        
        if(Tmp.length() > 0){
            if(Tmp.charAt(Tmp.length() - 1) == '.'){
              Tmp = Tmp.substring(0, Tmp.length() - 1);  
            }
        }
        
        //5단계
        if(Tmp.isEmpty() == true){
            Tmp += "a";
        }
        
        //6단계
        if(Tmp.length() >= 16){
            Tmp = Tmp.substring(0, 15);
            if(Tmp.charAt(14) == '.'){
                Tmp = Tmp.substring(0, 14);
            } 
        }
        
        //7단계
        if(Tmp.length() <= 2){
            char a = Tmp.charAt(Tmp.length() - 1);
            
            while(Tmp.length() != 3){
                Tmp += a;
            }
        }
        answer = Tmp;
        return answer;
    }

}
