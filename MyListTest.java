package datastructure;

/**
 * 과제명 : hw5_2 
 * 작성일 : 21/03/25
 * @author 김솔
 * 소요시간 : 50분
 * 도움 받은 정도 : 구굴에서 삽질을 굉장히 많이 했다.
 * 어려운 점 : 프라이빗 변수를 처음에 어떻게 하는지 이해를 못했다.
 * 느낀 점 : 재미있었다.
 */
public class MyListTest {
	public static void main(String[] args) {
		MyList ml = new MyList(100);
		int removed = 0;
		System.out.println("hw5_2 : 김솔");
		System.out.println("초기 리스트=" + ml.toString() + ", 길이=" + ml.size());
		for (int i = 0; i < 9; i++) {
			ml.add(11 * (i + 1));
		}
		System.out.println("원소 9개 삽입 후" + ml.toString() + ", 길이=" + ml.size());
		removed = ml.remove(0);
		System.out.println("인덱스 0 삭제 후" + ml.toString() + ", 삭제된 원소=" + removed + ", 길이=" + ml.size());
		removed = ml.remove(4);
		System.out.println("인덱스 4 삭제 후" + ml.toString() + ", 삭제된 원소=" + removed + ", 길이=" + ml.size());
		removed = ml.remove(6);
		System.out.println("인덱스 6 삭제 후" + ml.toString() + ", 삭제된 원소=" + removed + ", 길이=" + ml.size());
	}
}
