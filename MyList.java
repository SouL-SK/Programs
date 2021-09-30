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
public class MyList {
	private int listSize;
	private int[] list;

	/**
	 * 생성자 - 초기 배열 크기를 매개변수로 받아 공백 리스트 객체를 생성
	 * 
	 * @param 초기 배열 크기
	 */
	public MyList(int size) {
		this.listSize = -1;
		this.list = new int[size];
	}

	/**
	 * add - int형 원소를 매개변수로 받아 리스트의 맨 뒤에 삽입
	 * @param 추가할 원소 값
	 */
	public void add(int i) {
		if (listSize != list.length) {
			listSize++;
			this.list[listSize] = i;
		} else {
			System.out.println("배열이 가득 찼습니다.");
		}
	}

	/**
	 * remove - 인덱스를 매개변수로 받아 인덱스 위치의 원소를 삭제하여 리턴
	 * @param 삭제할 인덱스 번호
	 * @return 삭제한 원소 값
	 */
	public Integer remove(int index) {			// null 객체 반환을 위해서 Wrapper class 사용했다. 
		if (index <= listSize && index >= 0) {
			int removed = list[index];
			for (int i = index + 1; i <= listSize; i++) {
				list[i - 1] = list[i];
			}
			list[listSize] = 0;
			listSize--;
			return removed;
		}
		System.out.println("인덱스의 값을 확인해주세요.");
		return null;
	}

	/**
	 * size - 리스트의 길이를 리턴
	 * @return 리스트의 길이
	 */
	public int size() {
		return this.listSize + 1;
	}

	/**
	 * toString 오버라이드 - 리스트의 원소를 하나의 문자열로 만들어 리턴
	 */
	@Override
	public String toString() {
		String str = "MyList [list=";
		if (listSize != -1) {

			for (int i = 0; i < listSize; i++) {
				str += list[i] + ", ";
			}
			str += list[listSize] + ""; // \b 문자 사용시 콘솔 깨짐 버그가 있어서 마지막 인덱스는 따로 넣어줬다.
		}
		str += "]";
		return str;
	}

}
