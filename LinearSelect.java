package algorithm;

import java.util.Scanner;

/**
 * 과제명: hw5_1
 * 작성일: 21/04/09
 * 소요시간: 1시간 30분~2시간
 * 도움받은 정도: 구글링을 통한 선택 알고리즘 글 10개 가량 정독
 * 어려운 점: 아웃오브인덱스 오류 때문에 꽤나 고생했다
 * 느낀 점: 재귀적으로 푸는게 꽤나 힘들었다 그리고 알고리즘을 머리로는 이해해도 구현하는 것은 또다른 차원의 어려움이라는 것을 알았다.
 * @author 김솔
 *
 */
public class LinearSelect {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("hw5_1 : 김솔");
		String[] list = new String[20];
		System.out.println("20개의 단어를 입력하시오.");
		for (int i = 0; i < list.length; i++) {
			list[i] = sc.next();
			System.out.println((i+1)+"개의 단어를 입력했습니다.");
		}
		System.out.printf("20개의 단어 입력: ");
		for (String string : list) {
			System.out.printf(string+" ");
		}
		System.out.println();
		System.out.println("1번째 작은 단어 = "+select(list, 0, 19, 1));
		System.out.println("6번째 작은 단어 = "+select(list, 0, 19, 6));
		System.out.println("17번째 작은 단어 = "+select(list, 0, 19, 17));
		System.out.println("20번째 작은 단어 = "+select(list, 0, 19, 20));
		sc.close();
	}
	
	/**
	 * 기준 값을 이용해 찾을 원소의 인덱스를 반환하는 메서드
	 * @param 탐색할 리스트
	 * @param 최소 인덱스
	 * @param 최대 인덱스
	 * @return 탐색할 원소의 인덱스
	 */
	static int partition(String[] A, int p, int r){
		String x = A[r];
	    int i = p-1;
	    
	    String temp;
	    for(int j = p; j < r; j++){
	    	if( A[j].toLowerCase().compareTo(x.toLowerCase())<= 0 ){
	    		temp = A[j];
	            A[j] = A[++i];
	            A[i] = temp;
			} 
		}
	    temp = A[r];
	    A[r] = A[i + 1];
	    A[i + 1] = temp;
	    
	    
	    return i+1;
	}

	/**
	 * 찾을 원소를 재귀적으로 돌리기 위해 왼쪽 그룹에서 돌릴지 오른쪽 그룹에서 돌릴지 방향을 맞춰주는 메서드
	 * @param 탐색할 리스트
	 * @param 최소 인덱스
	 * @param 최대 인덱스
	 * @param 찾을 원소의 크기순 인덱스 값
	 * @return
	 */
	static String select(String[] A, int p, int r, int i){
		if(p == r){
			return A[p];
		}
		
		int q = partition(A, p, r);
		int k = q - p + 1;
		
		if(i<k){
			return select(A, p, q-1, i);
		}else if(i == k){
			return A[q];
		}else{
			return select(A, q+1, r, i-k);
		}
	}

}

