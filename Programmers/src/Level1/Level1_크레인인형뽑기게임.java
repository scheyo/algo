package Level1;

import java.util.Stack;

public class Level1_크레인인형뽑기게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
		System.out.println(solution(board, moves));
	}
	
	public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
               
        for(int a = 0; a < moves.length; a++){
            int tmp = 0;
            for(int i = 0; i < board.length; i++){
                if(board[i][moves[a] - 1] != 0 ){
                    tmp = board[i][moves[a] - 1];
                    
                    if(!stack.isEmpty() && stack.peek() == tmp){
                        stack.pop();
                        answer = answer + 2;
                    }
                    else{
                        stack.push(board[i][moves[a] - 1]);
                    }
                    board[i][moves[a] - 1] = 0;  // 0처리는 꼭 해줘야 함
                    //System.out.println(stack.toString());
                    break;
                }
            }
        }
        //System.out.println(Arrays.deepToString(board));
        //System.out.println(stack.toString());
        
        return answer;
    }

}
