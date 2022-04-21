package LotteWorldTicketBox0421;

public class VariablePrint {
	// ������ ������ ���� (���)
	private String ticketTypeName;	// 1. Ƽ�� ���� �̸�
	private String ageTypeName;	// 2. ����
	private int ticketPrice;	// 3. Ƽ�� ����
	private int inputNumberOfTicket;	// 4. ����
	private int totalTicketPrice;	// 5. �� ���� (Ƽ�� ���� x ����)
	private String benefitType;	// 6. ������ ���� �׸� (�̸�)
	private float appliedBenefit;	// 7. ��� ������
	private int benefitAmountPerTicket;	// 8. ��� ���ξ� (��� ���� x Ƽ�� ����)
	private int benefitAppliedTicketNumber;	// 9. ��� ����
	private int discountedTicketPrice;	// 10. �� ���ݾ� (��� ���ξ� x ��� ����)
	private int finalTicketPrice;	// 11. ���� ���� (�� ���� - �� ���ݾ�)
	private int accumulatedTicketNumber = 0;	// 12. ���� Ƽ�� ���� (�� ���� �ʿ� ����)
	private int accumulatedFinalPrice = 0;	// 13. ���� �ݾ� (�� ���� �ʿ� �ݾ�)
	
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
