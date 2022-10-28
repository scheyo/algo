package Day2_0726;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList<String> list = new ArrayList<>();
		
		//Array 배열 (자동 3크기 만큼 만들어짐)
		int arr[] = {1, 2, 3};
		
		//배열 출력 ( 배열은 클래스가 아니라 원시타입이므로 주소 값 찍힘)
		System.out.println(arr.toString());
		
		//Arrays의 toString으로 파라미터에 주소값넣어 출력 가능 
		System.out.println(Arrays.toString(arr));
		
		// 이 방식으로 자주 씀
		List<Integer> list = new ArrayList<Integer>();
		
		//데이터 추가
		list.add(1);  // 0 
		list.add(10); // 1 
		list.add(100);  // 2
		list.add(1000); // 3
		//list.addAll(list새로운거 붙일 수 있음)
		
		//출력 (List의 toString 함수로 List에 뭐 있는지 다 보임 )
		System.out.println(list.toString());
		
		//데이터 삭제
		list.remove(1);
		list.removeAll(list);  // Collection 타입을 파라미터로 (리스트를 아예 삭제) : 반환값 boolean
		
		//데이터 삭제되는 순간 -> 삭제된 값 말고 인덱스 바뀔 수 있다는거 염두!
		System.out.println(list.toString());
		
		
		//List를 Array로 변환방법
		//최상위 클래스 : Object로 반환 -> toArray
		//toArray로 사용 -> 사이즈로 넘김
		Integer[] arr2 = list.toArray(new Integer[list.size()]);
		
		
		//Array가 List로 변환
		List<Integer> list2 = Arrays.asList(arr2);
		
	
	}

}
