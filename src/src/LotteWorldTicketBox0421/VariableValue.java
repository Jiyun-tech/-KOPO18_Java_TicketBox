package LotteWorldTicketBox0421;

import java.util.ArrayList;

public class VariableValue {
	
	// �Է� ����
	private int inputTicketSelect_place; 		// ���� ����(���)*
	private int inputTicketSelect_time; 		// ���� ����(�ð�) *
	private int inputTicketSelect_Baby; // ���ƿ� ���� ���� *
	private char [] socialID;		// ����� �ֹε�Ϲ�ȣ String -> Character
	private int inputBenefit;	// ������ 
	private int inputBenefit_Elder;	// ��� ��� ����� �߰� ���� (��� ��� vs ��� ���)
	ArrayList<Integer> priceList = new ArrayList<Integer>();
	
	// ��� ����
	private int birthYearIndex; // 1,2,3,4 (���� �� �¾ ����(1900���&2000���) �ĺ���)
	private int todayYear;	// Ƽ�� ���� ��
	private int todayMonth;	// Ƽ�� ���� ��
	private int todayDay;	// Ƽ�� ���� ��
	private int userBirthYear; 	// ����� ����
	private int userAge;				// **����� ���� 
	private int continueTicketPurchase; // Ƽ�� �߱� ���μ��� �ݺ� ���� ���� 
	
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
