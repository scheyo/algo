package Level1;

public class Level1_숫자문자열과영단어 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("one4seveneight"));
		System.out.println(solution("23four5six7"));
		System.out.println(solution("2three45sixseven"));
	}
	
	public static int solution(String s) {
        int answer = 0;
        String tmp = "";
        //int i = 0;
        
        String[] digit = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] english = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < 10; i++){
            s = s.replaceAll(english[i], digit[i]);
        }
        
        answer = Integer.parseInt(s);
        
        /*방법2
        while(i != s.length()){
            switch(s.charAt(i)){
                case 'z':
                    if(i + 4 <= s.length() && "zero".equals(s.substring(i, i + 4))){
                        tmp += "0";
                        i += 4;
                    }
                break;
                    
                case 'o':
                    if(i + 3 <= s.length() && "one".equals(s.substring(i, i + 3))){
                         tmp += "1";
                         i += 3;
                    }  
                break;
                
                case 't':
                    if(i + 3 <= s.length() && "two".equals(s.substring(i, i + 3))){
                        tmp += "2";
                        i += 3;
                    } 
                    if(i + 5 <= s.length() && "three".equals(s.substring(i, i + 5))){
                        tmp += "3";
                        i += 5;
                    }
                break;
                
                case 'f':
                    if(i + 4 <= s.length() && "four".equals(s.substring(i, i + 4))){
                        tmp += "4";
                        i += 4;
                    } 
                    if(i + 4 <= s.length() && "five".equals(s.substring(i, i + 4))){
                        tmp += "5";
                        i += 4;
                    }
                break;
                    
                case 's':
                    if(i + 3 <= s.length() && "six".equals(s.substring(i, i + 3))){
                        tmp += "6";
                        i += 3;
                    }
                    if(i + 5 <= s.length() && "seven".equals(s.substring(i, i + 5))){
                        tmp += "7";
                        i += 5;
                    }
                break;
                
                case 'e':
                    if(i + 5 <= s.length() && "eight".equals(s.substring(i, i + 5))){
                        tmp += "8";
                        i += 5;
                    }
                break;
                
                 case 'n':
                    if(i + 4 <= s.length() && "nine".equals(s.substring(i, i + 4))){
                        tmp += "9";
                        i += 4;
                    }
                break;
                    
                default:
                    tmp += s.charAt(i);
                    i++;     
            } 
            answer = Integer.parseInt(tmp);
        }
        */
        
        return answer;
    }

}
