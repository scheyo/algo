package Level1;

import java.util.Arrays;

public class Level1_행렬의덧셈 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1 = {{1, 2}, {2, 3}};
		int[][] arr2 = {{3, 4}, {5, 6}};
		
		solution(arr1, arr2);
		
	}
	
	public static void solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1[0].length][arr1.length];
        
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[0].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
                System.out.println(answer[i][j]);
            }
        }
        //return answer;
        System.out.println(Arrays.toString(answer[0]));
        System.out.println(Arrays.toString(answer[1]));
    }

}
