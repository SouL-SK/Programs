package algorithm;
/**
 * 과제명: hw9_1
 * 작성일: 21/05/22
 * author: 김솔
 * (1) 소요 시간: 장장 5시간 이상
 * (2) 도움 받은 정도: 구글링, 교재
 * (3) 어려운 점: 선택과제를 하려고 했는데 도저히 안되서 기본 과제만 했다.
 * (4) 느낀 점: 어렵다...
 */
import java.util.Scanner;

public class MyLCS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("hw9_1 : 김솔");
		System.out.print("첫번째 문자열 입력: ");
		String txt1 = sc.nextLine();
		System.out.print("두번째 문자열 입력: ");
		String txt2 = sc.nextLine();
		System.out.println("LCS 길이 ="+LCS(txt1, txt2));
		sc.close();
	}
	public static int LCS(String x,String y) {
		  int i = x.length();
		  int j = y.length();
		  int[][] result;
		  result = new int[i+1][j+1];
		  String[] tmp1 = x.split("");
		  String[] tmp2 = y.split("");
		  for (int k = 0; k <= i; k++) {
		    for (int l = 0; l <= j; l++) {
		      if (k == 0 || l == 0) { // 베이스 값 설정
		        result[k][l] = 0;
		      } else if (tmp1[k - 1].equals(tmp2[l - 1])) { // 마지막 두 문자 비교, 같으면
		        result[k][l] = result[k - 1][l - 1] + 1;
		      } else { // 마지막 두 문자가 다르면
		        result[k][l] = Math.max(result[k - 1][l], result[k][l - 1]);
		      }
		    }
		  }
		  return result[i][j];
		}
}
