package algorithm;

import java.util.Scanner;

/**
 * 과제명: hw4_1 작성일: 21/03/25
 * 
 * @author 김솔 소요시간: 도움 받은 정도: 어려운 점: 느낀 점:
 */
public class hw4_1 {
	static int pivot;
	static String[] str;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("hw4_1 : 김솔");
		System.out.println("단어 개수를 입력하시오: ");
		int size = sc.nextInt();
		while (size <= 0) {
			System.out.println("다시 입력해주세요");
			size = sc.nextInt();
		}
		String[] str = new String[size];

		System.out.println(size + "개의 단어를 입력하시오.");
		for (int i = 0; i < size; i++) {
			str[i] = sc.next();
			System.out.println(i + 1 + "개 입력 완료");
		}

		quickSort(str, 0, size-1);
		System.out.println("퀵 정렬 결과: ");
		for (String j : str) {
			System.out.println(j);
		}
		
		sc.close();
	}

	public static void quickSort(String[] str, int min, int max) {
		if (min < max) {
			int re = partition(str, min, max);
			quickSort(str, min, re - 1);
			quickSort(str, re + 1, max);
		}
	}

	public static int partition(String[] str, int min, int max) {
		String pivot = str[max];
		int i = min -1;
		for (int j = min; j < max; j++) {
			if (str[i].toLowerCase().compareTo(pivot.toLowerCase()) <= 0) {
				String temp = str[++i];
				str[i] = str[j];
				str[j] = temp;
				System.out.println(i);
			}
		}
		String temp = str[i + 1];
		str[i + 1] = str[max];
		str[max] = temp;
		return i + 1;
	}
}
