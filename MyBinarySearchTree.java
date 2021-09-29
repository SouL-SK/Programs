package algorithm;

public class MyBinarySearchTree {
	private Node root;
	
	private class Node {
		String key;
		Node llink;
		Node rlink;
	}
	
	/**
	 * 트리의 루트를 가리키는 노드 타입 변수(root) - null로 초기화
	 */
	public MyBinarySearchTree() {
		this.root = null;
	}
	
	/**
	 * 문자열을 매개변수로 받아 트리에 삽입. 이미 존재하는 키값이면 삽입 실패
	 * @param 문자열
	 */
	public void add(String value) {
		Node input = new Node();
		input.key = value;
		input.llink = null;
		input.rlink = null;
		
		if(this.root == null) {
			this.root = input;
		} else {
			if(this.root.key.toLowerCase().compareTo(input.key.toLowerCase()) > 0) {
				if(this.root.llink == null) {					
					this.root.llink =  input;
				} else {
					Node temp = new Node();
					temp = this.root;
					this.root = temp.llink;
					add(input.key);
					this.root = temp;
				}
			} else if (this.root.key.toLowerCase().compareTo(input.key.toLowerCase()) < 0) {
				if(this.root.rlink == null) {					
					this.root.rlink = input;
				} else {
					Node temp = new Node();
					temp = this.root;
					this.root = temp.rlink;
					add(input.key);
					this.root = temp;
				}
			}
		}
	}
	
	/**
	 * 트리를 중순위 순회하며 키값을 출력하는 재귀 메소드
	 * @param 중순위 순회할 트리(서브트리)의 루트
	 * @return 조회 후 문자열
	 */
	private String inorder(Node root) {
		String result = "";
		if(root.llink != null) {
			result += inorder(root.llink) + " ";
		} 
		result += root.key + " ";
		if(root.rlink != null) {
			result += inorder(root.rlink) + " ";
		}
		result = result.trim();
		return result;
	}
	
	@Override
	public String toString() {
		if(this.root != null) {	
			return inorder(this.root);
		} else {
			return "";
		}
	}
	
}

