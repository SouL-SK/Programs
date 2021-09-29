package algorithm;
/**
 * 과제명: hw6_1
 * 작성일: 21/04/16
 * @author 김솔
 * 소요시간: 12시간
 * 도움 받은 정도: 구글링, 선배님 자문
 * 어려운 점: Node 클래스를 만들어서 연결짓는 것이 헷갈렸다
 * 느낀 점: 구글에서 코드를 복붙해서 고쳐쓰는 것은 실력 향상에 도움이 되지 않는 것 같다.
 */
public class BinarySearchTreeTest {
	
	public static void main(String[] args) {
		MyBinarySearchTree tree = new MyBinarySearchTree();
		System.out.println("hw6_1 : 김솔");
		// tree를 중순위 순회하여 출력
		  System.out.print("\n오름차순 출력 = ");
//		  tree.printTree();   // 또는 System.out.println(tree.toString());
		  System.out.println(tree.toString());

		  

		  // tree에 다음과 같이 1개의 단어를 삽입한 후 tree를 중순위 순회하여 출력
		  tree.add("cat");
		  System.out.print("\n오름차순 출력 = ");
//		  tree.printTree();   // 또는 System.out.println(tree.toString());
		  System.out.println(tree.toString());

		  

		  // tree에 다음과 같이 13개의 단어를 추가로 삽입한 후 tree를 중순위 순회하여 출력
		  tree.add("HAT");
		  tree.add("ant");
		  tree.add("BEE");
		  tree.add("dog");
		  tree.add("Last");
		  tree.add("KEY");
		  tree.add("Korea");
		  tree.add("egg");
		  tree.add("ink");
		  tree.add("juice");
		  tree.add("free");
		  tree.add("go");
		  tree.add("CAT");  // 이미 존재하는 단어이므로 삽입되지 않을 것임
		  System.out.print("\n오름차순 출력 = ");
//		  tree.printTree();   // 또는 System.out.println(tree.toString());
		  System.out.println(tree.toString());
		  
	}
}
