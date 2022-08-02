package Level1;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Level1_제일작은수제거하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4, 3, 2, 1};
		arr = solution(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static int[] solution(int[] arr) {
        int[] answer = {};
       
        if(arr.length > 1){
            int[] tmp = {};
            tmp = arr.clone();
            Arrays.sort(tmp);
            
            List<Integer> list = new ArrayList<>();

            for(int i = 0; i < arr.length; i++){
                if(arr[i] == tmp[0]){
                    continue;
                }
                list.add(arr[i]);
            }
            
            answer = new int[list.size()];
            
            for(int i = 0; i < list.size(); i++){
                //answer[i] = Integer.parseInt(list.get(i).toString());
                answer[i] = list.get(i);
            }

        }
        else{
            answer = new int[arr.length];
            answer[0] = -1;
        }
        //원래 원본의 데이터 위치를 지켜야 하므로 정렬하면 안됨
        /*
            Collections.sort(list, Collections.reverseOrder());
            list.remove(arr.length - 1);
            System.out.print(list.toString());
        */
        
        return answer;
    }
}
