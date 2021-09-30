package datastructure;

/**
 * 과제명: hw6_1
 * 작성일: 21/04/08
 * 소요시간: 50분
 * 도움받은 정도: 생활코딩 영상 및 자바 linkedlist 구현 구글링(거의 대부분을 구글링해서 짠거 같다)
 * 어려운 점: 노드를 구성하고 이 객체들을 서로 연결해서 넣는 것이 꽤나 어려웠다, 머리로는 어떻게 할지 생각은 드는데 막상 구현하려니 꽤나 복잡하기도 했고 특히 삽입할 때는 last 변수가 없으면 잘 성공시키질 못했다.
 * 느낀 점: 객체에 관해서 더 공부를 해야겠다. 특히 객체끼리 연결짓는 작업과 새로운 변수를 클래스로 만들어서 내 취향대로 만드는 작업을 더 많이 해봐야겠다.
 * @author 김솔
 */
public class MyLinkedList {
	private Node head;
	private Node last;
	private int listSize = 0;

	/**
	 * 노드의 구조를 구성하는 클래스
	 */
	private class Node {
		private int data;
		private Node link;

		public Node(int data) {
			this.data = data;
			this.link = null;
		}

	}

	@Override
	public String toString() {
		String str = "";
		if (head == null) {
			str += "=[ ]";
			return str;
		}
		Node temp = head;
		str += "=[";
		while (temp.link != null) {
			str += temp.data + ", ";
			temp = temp.link;
		}

		str += temp.data + "]";
		return str;
	}
	/**
	 * 데이터를 받아 리스트의 맨 끝에 삽입하는 메서드
	 * @param 삽입할 값
	 */
	public void add(int data) {
		Node newNode = new Node(data);
		if (listSize == 0) {
			newNode.link = head;
			head = newNode;
			listSize++;
			if (head.link == null) {
				last = head;
			}
		} else {
			last.link = newNode;
			last = newNode;
			listSize++;
		}
	}

	/**
	 * 리스트의 길이를 반환하는 메서드
	 * @return 리스트의 길이
	 */
	public int size() {
		return this.listSize;
	}

	/**
	 * 특정한 위치(입력받은 인덱스)에 있는 노드를 가져오기 위한 메서드
	 * @param 가져올 노드의 인덱스
	 * @return 해당 위치의 노드
	 */
	Node node(int index) {
	    Node x = head;
	    for (int i = 0; i < index; i++)
	        x = x.link;
	    return x;
	}
	
	/**
	 * 특정한 위치(입력받은 인덱스)에 있는 노드를 삭제하는 메서드
	 * @param 삭제할 노드의 인덱스
	 */
	public void remove(int index) {
		if (index == 0) { //첫번째 노드인 경우
			Node temp = head;
			head = temp.link;
			temp = null;
			listSize--;
		}
		else if (index <0 || index >= listSize){ //인덱스가 범위를 벗어난 경우
			throw new IndexOutOfBoundsException("삭제 인덱스 " + index + ": 범위를 벗어났습니다.");
		}else { //중간이나 마지막 노드인 경우
			 Node temp = node(index-1);
			    Node toDeleted = temp.link;
			    temp.link = temp.link.link;
			    if(toDeleted == last){
			        last = temp;
			    }
			    toDeleted = null; 
			    listSize--;
		}
	}
}
