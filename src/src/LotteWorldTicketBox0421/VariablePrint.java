package LotteWorldTicketBox0421;

public class VariablePrint {
	// 데이터 관리용 변수 (출력)
	private String ticketTypeName;	// 1. 티켓 종류 이름
	private String ageTypeName;	// 2. 나이
	private int ticketPrice;	// 3. 티켓 가격
	private int inputNumberOfTicket;	// 4. 수량
	private int totalTicketPrice;	// 5. 총 가격 (티켓 가격 x 수량)
	private String benefitType;	// 6. 우대사항 적용 항목 (이름)
	private float appliedBenefit;	// 7. 우대 할인율
	private int benefitAmountPerTicket;	// 8. 우대 할인액 (우대 요율 x 티켓 가격)
	private int benefitAppliedTicketNumber;	// 9. 우대 수량
	private int discountedTicketPrice;	// 10. 총 우대금액 (우대 할인액 x 우대 수량)
	private int finalTicketPrice;	// 11. 최종 가격 (총 가격 - 총 우대금액)
	private int accumulatedTicketNumber = 0;	// 12. 누적 티켓 수량 (총 결제 필요 수량)
	private int accumulatedFinalPrice = 0;	// 13. 누적 금액 (총 결제 필요 금액)
	
	public String getTicketTypeName() {
		return ticketTypeName;
	}
	public void setTicketTypeName(String ticketTypeName) {
		this.ticketTypeName = ticketTypeName;
	}
	public String getAgeTypeName() {
		return ageTypeName;
	}
	public void setAgeTypeName(String ageTypeName) {
		this.ageTypeName = ageTypeName;
	}
	public int getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public int getInputNumberOfTicket() {
		return inputNumberOfTicket;
	}
	public void setInputNumberOfTicket(int inputNumberOfTicket) {
		this.inputNumberOfTicket = inputNumberOfTicket;
	}
	public int getTotalTicketPrice() {
		return totalTicketPrice;
	}
	public void setTotalTicketPrice(int totalTicketPrice) {
		this.totalTicketPrice = totalTicketPrice;
	}
	public String getBenefitType() {
		return benefitType;
	}
	public void setBenefitType(String benefitType) {
		this.benefitType = benefitType;
	}
	public float getAppliedBenefit() {
		return appliedBenefit;
	}
	public void setAppliedBenefit(float appliedBenefit) {
		this.appliedBenefit = appliedBenefit;
	}
	public int getBenefitAmountPerTicket() {
		return benefitAmountPerTicket;
	}
	public void setBenefitAmountPerTicket(int benefitAmountPerTicket) {
		this.benefitAmountPerTicket = benefitAmountPerTicket;
	}
	public int getBenefitAppliedTicketNumber() {
		return benefitAppliedTicketNumber;
	}
	public void setBenefitAppliedTicketNumber(int benefitAppliedTicketNumber) {
		this.benefitAppliedTicketNumber = benefitAppliedTicketNumber;
	}
	public int getDiscountedTicketPrice() {
		return discountedTicketPrice;
	}
	public void setDiscountedTicketPrice(int discountedTicketPrice) {
		this.discountedTicketPrice = discountedTicketPrice;
	}
	public int getFinalTicketPrice() {
		return finalTicketPrice;
	}
	public void setFinalTicketPrice(int finalTicketPrice) {
		this.finalTicketPrice = finalTicketPrice;
	}
	public int getAccumulatedTicketNumber() {
		return accumulatedTicketNumber;
	}
	public void setAccumulatedTicketNumber(int accumulatedTicketNumber) {
		this.accumulatedTicketNumber = accumulatedTicketNumber;
	}
	public int getAccumulatedFinalPrice() {
		return accumulatedFinalPrice;
	}
	public void setAccumulatedFinalPrice(int accumulatedFinalPrice) {
		this.accumulatedFinalPrice = accumulatedFinalPrice;
	}
}
