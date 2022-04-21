package LotteWorldTicketBox0421;

import java.util.ArrayList;

public class VariableValue {
	
	// 입력 변수
	private int inputTicketSelect_place; 		// 권종 선택(장소)*
	private int inputTicketSelect_time; 		// 권종 선택(시간) *
	private int inputTicketSelect_Baby; // 유아용 권종 선택 *
	private char [] socialID;		// 사용자 주민등록번호 String -> Character
	private int inputBenefit;	// 우대사항 
	private int inputBenefit_Elder;	// 경로 우대 대상자 추가 선택 (경로 우대 vs 상시 우대)
	ArrayList<Integer> priceList = new ArrayList<Integer>();
	
	// 계산 변수
	private int birthYearIndex; // 1,2,3,4 (성별 및 태어난 연도(1900년대&2000년대) 식별자)
	private int todayYear;	// 티켓 구매 연
	private int todayMonth;	// 티켓 구매 월
	private int todayDay;	// 티켓 구매 일
	private int userBirthYear; 	// 사용자 생년
	private int userAge;				// **사용자 나이 
	private int continueTicketPurchase; // 티켓 발권 프로세스 반복 여부 선택 
	
	public int getInputTicketSelect_place() {
		return inputTicketSelect_place;
	}
	public void setInputTicketSelect_place(int inputTicketSelect_place) {
		this.inputTicketSelect_place = inputTicketSelect_place;
	}
	public int getInputTicketSelect_time() {
		return inputTicketSelect_time;
	}
	public void setInputTicketSelect_time(int inputTicketSelect_time) {
		this.inputTicketSelect_time = inputTicketSelect_time;
	}
	public int getInputTicketSelect_Baby() {
		return inputTicketSelect_Baby;
	}
	public void setInputTicketSelect_Baby(int inputTicketSelect_Baby) {
		this.inputTicketSelect_Baby = inputTicketSelect_Baby;
	}
	public char[] getSocialID() {
		return socialID;
	}
	public void setSocialID(char[] socialID) {
		this.socialID = socialID;
	}
	public int getInputBenefit() {
		return inputBenefit;
	}
	public void setInputBenefit(int inputBenefit) {
		this.inputBenefit = inputBenefit;
	}
	public int getInputBenefit_Elder() {
		return inputBenefit_Elder;
	}
	public void setInputBenefit_Elder(int inputBenefit_Elder) {
		this.inputBenefit_Elder = inputBenefit_Elder;
	}
	public ArrayList<Integer> getPriceList() {
		return priceList;
	}
	public void setPriceList(ArrayList<Integer> priceList) {
		this.priceList = priceList;
	}
	public int getBirthYearIndex() {
		return birthYearIndex;
	}
	public void setBirthYearIndex(int birthYearIndex) {
		this.birthYearIndex = birthYearIndex;
	}
	public int getTodayYear() {
		return todayYear;
	}
	public void setTodayYear(int todayYear) {
		this.todayYear = todayYear;
	}
	public int getTodayMonth() {
		return todayMonth;
	}
	public void setTodayMonth(int todayMonth) {
		this.todayMonth = todayMonth;
	}
	public int getTodayDay() {
		return todayDay;
	}
	public void setTodayDay(int todayDay) {
		this.todayDay = todayDay;
	}
	public int getUserBirthYear() {
		return userBirthYear;
	}
	public void setUserBirthYear(int userBirthYear) {
		this.userBirthYear = userBirthYear;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public int getContinueTicketPurchase() {
		return continueTicketPurchase;
	}
	public void setContinueTicketPurchase(int continueTicketPurchase) {
		this.continueTicketPurchase = continueTicketPurchase;
	}

}
