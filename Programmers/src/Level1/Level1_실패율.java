package Level1;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Level1_실패율 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tmp = {2, 1, 2, 6, 2, 4, 3, 3};
		System.out.println(Arrays.toString(solution(5, tmp)));  //배열 출력시는 Arrays.toString(배열이름)
	}
	
	static class Point implements Comparable<Point>{
        int x;
        double y;
        
        //초기화
        public Point(int x, double y){
            this.x = x;
            this.y = y;
        }
        
        @Override
        public int compareTo(Point o){  //Comparable 인터페이스를 사용하려면 compareTo를 꼭 오버라이딩
            if(o.y == this.y){  // 실패율이 같다면
                return this.x - o.x;  // 스테이지별로 오름차순
            }
            return Double.compare(o.y, this.y); 
            // 아니라면 실패율 내림차순으로 Double형으로 리턴하도록 (compareTo의 리턴타입이 int라서)
        }
        
        /*구조체를 출력해볼려면 toString() 오버라이딩필요
        @Override
        public String toString() {
            return x + ", " + y;
        }
        */

    }
	
	public static int[] solution(int N, int[] stages) {
        int[] answer = {};
        List<Point> list = new ArrayList<>();
        Arrays.sort(stages);
        double cnt = 0.0;
        double size = stages.length;
        
        for(int i = 1; i <= N; i++){
            for(int j = 0; j < stages.length; j++){
                if(i == stages[j]){
                    cnt++;
                }
            }
            //System.out.println(cnt + "쳌" + size);
            if(cnt != 0){
                list.add(new Point(i, (double)(cnt / size)));
            }
            else{
                list.add(new Point(i, 0.0));
            }
            
            size = size - cnt;
            cnt = 0; 
        }
        
        Collections.sort(list);  // Point 구조체에서 정의한 정렬의 기준대로 정렬됨
        
        //System.out.println(list.toString());
        
        answer = new int[N];
        
        for(int i = 0; i < N; i++){
            answer[i] = list.get(i).x;  // list의 스테이지번호를 answer에 넣어줌
        }
        
        
        return answer;
    }

}
