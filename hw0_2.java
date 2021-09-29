package algorithm;

/**
 * 과제명 : hw0_2 
 * 작성일 : 21/03/16
 * @author SouL
 * 소요시간 : 5시간 이상
 * 도움 받은 정도 : 재귀함수 String 관련 알고리즘 검색 및 String 배열 재귀함수 관련 구글링, StringBuffer 검색
 * 어려운 점 : 처음에는 for 문을 못쓰니까 정말 힘들었다. for문을 쓰던 생각에만 갇혀있다보니 더 안풀려서 16일에는 결국 못하고 17일이 되서야 풀렸다. 
 * 느낀 점 : 너무 한가지 생각에만 갇혀있다보니 좀 어려웠지만 하루 지나서 다시 생각해보니 잘 풀렸다.
 */
import java.util.Scanner;

public class hw0_2 {
	static String str = "";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while (true) {
			System.out.println("양의 정수 n 을 입력하시오.");
			n = sc.nextInt();
			if (n <= 0) {
				System.out.println("잘못된 입력입니다.");
				continue;
			} else {
				break;
			}
		}
		int result = factorial(n);
		String list = show(n);
		System.out.println("factorial(" + n + ") = " + result);
		System.out.println("show(" + n + ") = " + list);

		sc.close();
	}

	/**
	 * n을 입력받아 1부터 n 까지의 곱을 구하는 메서드
	 * 
	 * @param n
	 * @return 1부터 n까지의 곱
	 */
	public static int factorial(int n) {
		if (n == 1) {
			return n;
		} else
			return factorial(n - 1) * n;
	}

	/**
	 * 1부터 n까지의 숫자들을 나열해 목록화하는 메서드
	 * 
	 * @param n
	 * @return 1부터 n까지의 숫자 문자열
	 */
	public static String show(int n) {
		StringBuffer sb = new StringBuffer();
		StringBuffer st;
		str += Integer.toString(n) + " ";
		if (n <= 0) {
			str = str.substring(0, str.length() - 3);
			sb.append(str);
			st = sb.reverse();
			str = st.toString();
			return str;
		} else {
			return show(n - 1);
		}
	}
}
