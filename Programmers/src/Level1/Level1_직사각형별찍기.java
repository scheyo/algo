package Level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Level1_직사각형별찍기 {

	public static void main(String[] args) throws Exception{
	        
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	        
	        int a = Integer.parseInt(st.nextToken());
	        int b = Integer.parseInt(st.nextToken());
	        
	        for(int i = 0; i < b; i++){
	            for(int j = 0; j < a; j++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        
	    }

}
