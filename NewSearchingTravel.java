package javaProgramming;

import java.util.ArrayList;
import java.util.List;

public class NewSearchingTravel {
	public static final String COUNTRY_VIETNAM = "vietnam";
	public static final String COUNTRY_PHILLIPHINE = "philliphine";
	public static final String COUNTRY_TAILAND = "tailand";

	/**
	 * 여행 상품 저장하는 리스트
	 */
//	private List<TravelInfo> travelInfoList = new ArrayList<>();
	private List<TravelInfoVO> travelInfoList = new ArrayList<>();

	public NewSearchingTravel() {
		initializeProduct();
	}

	/**
	 * 데이터를 초기화 하여 외부에서 호출하지 못하도록 private로 선언
	 */
	public void initializeProduct() {
		TravelInfoVO cebu = new TravelInfoVO();
		cebu.setName("cebu Travel");
		cebu.setCountry(COUNTRY_PHILLIPHINE);
		cebu.setCity("cebu");
		cebu.setDays(5);
		cebu.setNights(3);
		travelInfoList.add(cebu);

		TravelInfoVO boracay = new TravelInfoVO();
		boracay.setName("boracay Travel");
		boracay.setCountry(COUNTRY_PHILLIPHINE);
		boracay.setCity("boracay");
		boracay.setDays(5);
		boracay.setNights(3);
		travelInfoList.add(boracay);

		TravelInfoVO hanoi = new TravelInfoVO();
		hanoi.setName("hanoi Travel");
		hanoi.setCountry(COUNTRY_VIETNAM);
		hanoi.setCity("hanoi");
		hanoi.setDays(3);
		hanoi.setNights(2);
		travelInfoList.add(hanoi);

		TravelInfoVO danang = new TravelInfoVO();
		danang.setName("danang Travel");
		danang.setCountry(COUNTRY_VIETNAM);
		danang.setCity("danang");
		danang.setDays(6);
		danang.setNights(4);
		travelInfoList.add(danang);

		TravelInfoVO bankok = new TravelInfoVO();
		bankok.setName("bankok Travel");
		bankok.setCountry(COUNTRY_TAILAND);
		bankok.setCity("bankok");
		bankok.setDays(5);
		bankok.setNights(3);
		travelInfoList.add(bankok);
	}

	/**
	 * 국가 정보에 기반하여 여행 상품을 조회하는 메서드
	 * 
	 * @param 국가 정보
	 * @return 여행 상품 정보 리스트
	 */
	public List<TravelInfoVO> searchTravelInfo(TravelInfoFilter searchCodition) {
		List<TravelInfoVO> reVal = new ArrayList<>();

		for (TravelInfoVO travelInfo : travelInfoList) {
			if (searchCondition.isMatched(travelInfo)) {
				reVal.add(travelInfo);
			}
		}
		return reVal;
	}

	public static void main(String[] agrs) {
		SearchingTravel travelSearch = new SearchingTravel();
		List<TravelInfoVO> searchTravel = travelSearch.searchTravelInfo(new TravelInfoFilter() {
			@Override
			public boolean isMatched(TravelInfoVO travelInfo) {
				if (travelInfo.get) {
					
				}
			}
		}
		
		System.out.println("201914132 김솔");
		List<TravelInfoVO> searchList = travelSearch.searchTravelInfo(SearchingTravel.COUNTRY_TAILAND);

		for (TravelInfoVO searchTravel : searchList) {
			System.out.println(searchTravel);
		}
	}
}
