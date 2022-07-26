package Level2;

public class Level2_땅따먹기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		System.out.println(solution(land));
	}
	
	public static int solution(int[][] land) {
			int answer = 0;
	        //DP사용
	        for(int i = 1; i < land.length; i++){ // 행 1부터 시작해서 이전행들의 최댓값 합산
	            land[i][0] += Math.max(land[i-1][1], Math.max(land[i-1][2], land[i-1][3]));
	            land[i][1] += Math.max(land[i-1][0], Math.max(land[i-1][2], land[i-1][3]));
	            land[i][2] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][3]));
	            land[i][3] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][2])); 
	        }
	        
	        for(int i = 0; i < 4; i++){
	            answer = Math.max(answer, land[land.length - 1][i]);
	        }
	        return answer;
	    }

}
