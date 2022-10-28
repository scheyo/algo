package Day2_0726;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedList_Point {
	
	//사용자 정의 클래스
	class Tmp{
		int x, y;
		
		//toString() 생성 ( 우클릭 후 Source -> toString() )
		@Override
		public String toString() {
			return "Tmp [x=" + x + ", y=" + y + "]";
		}
		
		//생성자 ( 우클릭 -> Source )
		
		public Tmp() {
			super();
		}
		
		public Tmp(int x) {
			super();
			this.x = x;
		}

		public Tmp(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list.toString());
		
		list.remove(0);
		
		System.out.println(list.toString());
		
		
		//Queue -> 링크드 리스트 구현
		
		//큐는 링크드리스트로 초기화
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		
		System.out.println(queue);
		
		//앞에 들어간거부터 빠져나옴 (큐)
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		//boolean 형 ( poll로 다 빠져나와서 null )
		System.out.println(queue.isEmpty());
		
		
		//Point ( awt 라이브러리 )  : 자바 재정의
		Point p = new Point(1, 2);  // x는 1, y는 2
		
		//Object -> 오버라이딩 ( toString으로 다 출가능)
		System.out.println(p.toString());
		
	

	}

}
