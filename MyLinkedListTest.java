package datastructure;

public class MyLinkedListTest {

	public static void main(String[] args) {
		System.out.println("hw6_1 : 김솔");
		MyLinkedList list = new MyLinkedList();
		System.out.println("초기 리스트" + list.toString()+", 길이="+list.size());
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		list.add(66);
		list.add(77);
		list.add(88);
		list.add(99);
		System.out.println("원소 9개 삽입 후" + list.toString()+", 길이="+list.size());
		list.remove(0);
		System.out.println("인덱스 0 삭제 후"+list.toString()+", 길이="+list.size());
		list.remove(4);
		System.out.println("인덱스 4 삭제 후"+list.toString()+", 길이="+list.size());
		list.remove(6);
		System.out.println("인덱스 6 삭제 후"+list.toString()+", 길이="+list.size());
		list.remove(6);
		System.out.println("인덱스 6 삭제 후"+list.toString()+", 길이="+list.size());
	}
}
