package Level1;
import java.util.*;

public class Level1_K번째수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		System.out.println(Arrays.toString(solution(array, commands)));
	}
	
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++){
            
            ArrayList<Integer> list = new ArrayList<>();

            for(int a = commands[i][0] - 1; a <= commands[i][1] - 1; a++){
                list.add(array[a]);
            }
            Collections.sort(list);
            answer[i] = list.get(commands[i][2] - 1);
           
        }
        return answer;
    }

}
