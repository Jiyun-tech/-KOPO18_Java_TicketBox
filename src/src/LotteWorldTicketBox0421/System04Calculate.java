package LotteWorldTicketBox0421;

public class System04Calculate {
	
	System04Calculate() {
	}
	
	// 1. Ƽ�� ����(�̸�) : System02Calculate���� ������ �Է� �Ϸ�
	
	// 2. ���� �׷�(�̸�) & 3. Ƽ�� ����
	int ticketPrice(VariableValue variableValue, VariablePrint variablePrint) {
		if (variableValue.getUserAge() >= StaticValue.ELDER_AGE_MIN && variableValue.getInputBenefit_Elder() == 1) {
			// ��� ���� ��� -> Ƽ�� �⺻ ���� ��� ��� �������� �����ǰ�, ��� ������ NON���� �����.
			variablePrint.setAgeTypeName(StaticValue.AGE_TYPE_NAME_ELDER); // ���� �׷�(�̸�) : ���
			variablePrint.setTicketPrice(variableValue.priceList.get(0)); // ���� : ���
		} if (variableValue.getUserAge() >= StaticValue.ELDER_AGE_MIN && variableValue.getInputBenefit_Elder() == 2) { 
			// ��� ��� �����̳�, ��� ���� ������ ��� -> Ƽ�� �⺻ ������ ���� �������� ���� & ��� ��� �����.
				variablePrint.setAgeTypeName(StaticValue.AGE_TYPE_NAME_ADULT); // ���� �׷�(�̸�) : ����
				variablePrint.setTicketPrice(variableValue.priceList.get(1)); // ���� :����
		} if (variableValue.getUserAge() >= StaticValue.ADULT_AGE_MIN 
				&& variableValue.getUserAge() <= StaticValue.ADULT_AGE_MAX) {
			variablePrint.setAgeTypeName(StaticValue.AGE_TYPE_NAME_ADULT); // ���� �׷�(�̸�) : ����
			variablePrint.setTicketPrice(variableValue.priceList.get(1)); // ���� : ����
		} if (variableValue.getUserAge() >= StaticValue.JUVERNILE_AGE_MIN
				&& variableValue.getUserAge() <= StaticValue.JUVENILE_AGE_MAX) {
			variablePrint.setAgeTypeName(StaticValue.AGE_TYPE_NAME_JUVENILE); // ���� �׷�(�̸�) : û�ҳ�
			variablePrint.setTicketPrice(variableValue.priceList.get(2)); // ���� : û�ҳ�
		} if (variableValue.getUserAge() >= StaticValue.CHILD_AGE_MIN
				&& variableValue.getUserAge() <= StaticValue.CHILD_AGE_MAX) {
			variablePrint.setAgeTypeName(StaticValue.AGE_TYPE_NAME_CHILD); // ���� �׷�(�̸�) : ���
			variablePrint.setTicketPrice(variableValue.priceList.get(3)); // ���� : ���
		} if (variableValue.getUserAge() >= StaticValue.BABY_AGE_MIN
				&& variableValue.getUserAge() <= StaticValue.BABY_AGE_MAX
				&& variableValue.getInputTicketSelect_Baby() == 1) {
			variablePrint.setAgeTypeName(StaticValue.AGE_TYPE_NAME_BABY_FREEPASS); // ���� �׷�(�̸�) : ���̺�-�����̿��(����)
			variablePrint.setTicketPrice(variableValue.priceList.get(4)); // ���� : ���̺�-�����̿��(����)
		} if (variableValue.getUserAge() >= StaticValue.BABY_AGE_MIN
				&& variableValue.getUserAge() <= StaticValue.BABY_AGE_MAX
				&& variableValue.getInputTicketSelect_Baby() == 2) {
			variablePrint.setAgeTypeName(StaticValue.AGE_TYPE_NAME_BABY_ENTERANCE); // ���� �׷�(�̸�) : ���̺�-�����(����)
			variablePrint.setTicketPrice(variableValue.priceList.get(5)); // ���� : ���̺�-�����(����)
		} if (variableValue.getUserAge() == StaticValue.NEWBORN_AGE) {
			variablePrint.setAgeTypeName(StaticValue.AGE_TYPE_NAME_NEWBORN); // ���� �׷�(�̸�) : ����
			variablePrint.setTicketPrice(variableValue.priceList.get(6)); // ���� : ����(����)
		}
		
		return variablePrint.getTicketPrice();
	}
	
	// 4. Ƽ�� ���� => System01Input ���� ������ �Է� �Ϸ�
	
	// 5. �� ����(Ƽ�� ���� x ����)
	int totalTicketPrice(VariablePrint variablePrint) {
		variablePrint.setTotalTicketPrice(variablePrint.getTicketPrice() 
			* variablePrint.getInputNumberOfTicket());
		
		return variablePrint.getTotalTicketPrice();
	}
	
	/*
	 					if (orderData.inputNumberOfTicket <= StaticValue.BENEFIT_DISABLED_MAX) {
						orderData.discountedTicketNumber = orderData.inputNumberOfTicket;
					} else {
						orderData.discountedTicketNumber = StaticValue.BENEFIT_DISABLED_MAX;
					}
	 */
	
	// 6. ������ ���� �׸� (�̸�) & 7. ��� ������ & 9. ��� ���� ����
	String benefitType(VariableValue variableValue, VariablePrint variablePrint) {
		if (variableValue.getUserAge() >= StaticValue.ELDER_AGE_MIN
			&& variableValue.getInputBenefit_Elder() == 1) { // ��� ��븦 ������ ���
			variablePrint.setBenefitType(StaticValue.BENEFIT_TYPE_NAME_NON); // ���� ��� �̸� : ����.
			variablePrint.setAppliedBenefit(StaticValue.BENEFIT_NON); // ������ : 0.0
			variablePrint.setBenefitAppliedTicketNumber(StaticValue.BENEFIT_NON_MAX); // ��� ���� ���� : 0
		} else {
			if (variableValue.getInputTicketSelect_place() == 1) { // �����̿��
				// (1) ��� ����
				if (variableValue.getInputBenefit() == 1) {
					variablePrint.setBenefitType(StaticValue.BENEFIT_TYPE_NAME_NON); // ���� ��� �̸� : ����.
					variablePrint.setAppliedBenefit(StaticValue.BENEFIT_NON); // ������ : 0.0
					variablePrint.setBenefitAppliedTicketNumber(StaticValue.BENEFIT_NON_MAX); // ��� ���� ���� : 0
				} 
				// (2) ����� ���
				if (variableValue.getInputBenefit() == 2) {
					variablePrint.setBenefitType(StaticValue.BENEFIT_TYPE_NAME_DISABLED); // ���� ��� �̸�
					variablePrint.setAppliedBenefit(StaticValue.BENEFIT_DISABLED); // ����� ��� : 0.5
					if (variablePrint.getInputNumberOfTicket() <= StaticValue.BENEFIT_DISABLED_MAX) { // ��� ���� ����
						variablePrint.setBenefitAppliedTicketNumber(variablePrint.getInputNumberOfTicket());
					} else {
						variablePrint.setBenefitAppliedTicketNumber(StaticValue.BENEFIT_DISABLED_MAX); 
					}
				} // (3) ���������� ��� 
				if (variableValue.getInputBenefit() == 3) {
					variablePrint.setBenefitType(StaticValue.BENEFIT_TYPE_NAME_NATIONAL_MERIT); // ���� ��� �̸�
					variablePrint.setAppliedBenefit(StaticValue.BENEFIT_NATIONAL_MERIT); // ���������� ��� : 0.5
					if (variablePrint.getInputNumberOfTicket() <= StaticValue.BENEFIT_NATIONAL_MERIT_MAX) { // ��� ���� ����
						variablePrint.setBenefitAppliedTicketNumber(variablePrint.getInputNumberOfTicket());
					} else {
						variablePrint.setBenefitAppliedTicketNumber(StaticValue.BENEFIT_NATIONAL_MERIT_MAX); 
					}
				} // (4) �ް��庴 ��� 
				if (variableValue.getInputBenefit() == 4) {
					variablePrint.setBenefitType(StaticValue.BENEFIT_TYPE_NAME_ARMY); // ���� ��� �̸�
					variablePrint.setAppliedBenefit(StaticValue.BENEFIT_ARMY); // �ް��庴 ��� : 0.49
					if (variablePrint.getInputNumberOfTicket() <= StaticValue.BENEFIT_ARMY_MAX) { // ��� ���� ����
						variablePrint.setBenefitAppliedTicketNumber(variablePrint.getInputNumberOfTicket());
					} else {
						variablePrint.setBenefitAppliedTicketNumber(StaticValue.BENEFIT_ARMY_MAX); 
					}
				} // (5) �ӻ�� ��� 
				if (variableValue.getInputBenefit() == 5 
						&& ( variableValue.getBirthYearIndex() == StaticValue.INDEX_FEMALE_OLD 
							|| variableValue.getBirthYearIndex() == StaticValue.INDEX_FEMALE_NEW) ) {
					variablePrint.setBenefitType(StaticValue.BENEFIT_TYPE_NAME_PREGNANT); // ���� ��� �̸�
					variablePrint.setAppliedBenefit(StaticValue.BENEFIT_PREGNANT); // �ӻ�� ��� : 0.49
					if (variablePrint.getInputNumberOfTicket() <= StaticValue.BENEFIT_PREGNANT_MAX) { // ��� ���� ����
						variablePrint.setBenefitAppliedTicketNumber(variablePrint.getInputNumberOfTicket());
					} else {
						variablePrint.setBenefitAppliedTicketNumber(StaticValue.BENEFIT_PREGNANT_MAX); 
					}
				} // (5) �ӻ�� ��� �����Ͽ�����, ����ڰ� ������ ��� 
				if (variableValue.getInputBenefit() == 5 
						&& ( variableValue.getBirthYearIndex() == StaticValue.INDEX_MALE_OLD 
						|| variableValue.getBirthYearIndex() == StaticValue.INDEX_MALE_NEW) ) {
					variablePrint.setBenefitType(StaticValue.BENEFIT_TYPE_NAME_NON); // ���� ��� �̸� : ����.
					variablePrint.setAppliedBenefit(StaticValue.BENEFIT_NON); // ������ : 0.0
					variablePrint.setBenefitAppliedTicketNumber(StaticValue.BENEFIT_NON_MAX); // ��� ���� ���� : 0
				} // (6) ���ڳ� ��� 
				if (variableValue.getInputBenefit() == 6) {
					variablePrint.setBenefitType(StaticValue.BENEFIT_TYPE_NAME_MULTICHILD); // ���� ��� �̸�
					variablePrint.setAppliedBenefit(StaticValue.BENEFIT_MULTICHILD); // ���ڳ� ��� : 0.3
					if (variablePrint.getInputNumberOfTicket() <= StaticValue.BENEFIT_MULTICHILD_MAX) { // ��� ���� ����
						variablePrint.setBenefitAppliedTicketNumber(variablePrint.getInputNumberOfTicket());
					} else {
						variablePrint.setBenefitAppliedTicketNumber(StaticValue.BENEFIT_MULTICHILD_MAX); 
					}
				}
			} 
			else if (variableValue.getInputTicketSelect_place() == 2) { // ��ũ�̿��
				// (1) ��� ����
				if (variableValue.getInputBenefit() == 1) {
					variablePrint.setBenefitType(StaticValue.BENEFIT_TYPE_NAME_NON); // ���� ��� �̸� : ����.
					variablePrint.setAppliedBenefit(StaticValue.BENEFIT_NON); // ������ : 0.0
					variablePrint.setBenefitAppliedTicketNumber(StaticValue.BENEFIT_NON_MAX); // ��� ���� ���� : 0
				} 
				// (2) ����� ���
				if (variableValue.getInputBenefit() == 2) {
					variablePrint.setBenefitType(StaticValue.BENEFIT_TYPE_NAME_DISABLED); // ���� ��� �̸�
					variablePrint.setAppliedBenefit(StaticValue.BENEFIT_DISABLED); // ����� ��� : 0.5
					if (variablePrint.getInputNumberOfTicket() <= StaticValue.BENEFIT_DISABLED_MAX) { // ��� ���� ����
						variablePrint.setBenefitAppliedTicketNumber(variablePrint.getInputNumberOfTicket());
					} else {
						variablePrint.setBenefitAppliedTicketNumber(StaticValue.BENEFIT_DISABLED_MAX); 
					}
				} // (3) ���������� ��� 
				if (variableValue.getInputBenefit() == 3) {
					variablePrint.setBenefitType(StaticValue.BENEFIT_TYPE_NAME_NATIONAL_MERIT); // ���� ��� �̸�
					variablePrint.setAppliedBenefit(StaticValue.BENEFIT_NATIONAL_MERIT); // ���������� ��� : 0.5
					if (variablePrint.getInputNumberOfTicket() <= StaticValue.BENEFIT_NATIONAL_MERIT_MAX) { // ��� ���� ����
						variablePrint.setBenefitAppliedTicketNumber(variablePrint.getInputNumberOfTicket());
					} else {
						variablePrint.setBenefitAppliedTicketNumber(StaticValue.BENEFIT_NATIONAL_MERIT_MAX); 
					}
				} // (4) �ް��庴 ��� 
				if (variableValue.getInputBenefit() == 4) {
					variablePrint.setBenefitType(StaticValue.BENEFIT_TYPE_NAME_NON); // ���� ��� �̸� : ����.
					variablePrint.setAppliedBenefit(StaticValue.BENEFIT_NON); // ������ : 0.0
					variablePrint.setBenefitAppliedTicketNumber(StaticValue.BENEFIT_NON_MAX); // ��� ���� ���� : 0
				} // (5) �ӻ�� ��� 
				if (variableValue.getInputBenefit() == 5 
						&& ( variableValue.getBirthYearIndex() == StaticValue.INDEX_FEMALE_OLD 
							|| variableValue.getBirthYearIndex() == StaticValue.INDEX_FEMALE_NEW) ) {
					variablePrint.setBenefitType(StaticValue.BENEFIT_TYPE_NAME_NON); // ���� ��� �̸� : ����.
					variablePrint.setAppliedBenefit(StaticValue.BENEFIT_NON); // ������ : 0.0
					variablePrint.setBenefitAppliedTicketNumber(StaticValue.BENEFIT_NON_MAX); // ��� ���� ���� : 0
				} // (5) �ӻ�� ��� �����Ͽ�����, ����ڰ� ������ ��� 
				if (variableValue.getInputBenefit() == 5 
						&& ( variableValue.getBirthYearIndex() == StaticValue.INDEX_MALE_OLD 
						|| variableValue.getBirthYearIndex() == StaticValue.INDEX_MALE_NEW) ) {
					variablePrint.setBenefitType(StaticValue.BENEFIT_TYPE_NAME_NON); // ���� ��� �̸� : ����.
					variablePrint.setAppliedBenefit(StaticValue.BENEFIT_NON); // ������ : 0.0
					variablePrint.setBenefitAppliedTicketNumber(StaticValue.BENEFIT_NON_MAX); // ��� ���� ���� : 0
				} // (6) ���ڳ� ��� 
				if (variableValue.getInputBenefit() == 6) {
					variablePrint.setBenefitType(StaticValue.BENEFIT_TYPE_NAME_NON); // ���� ��� �̸� : ����.
					variablePrint.setAppliedBenefit(StaticValue.BENEFIT_NON); // ������ : 0.0
					variablePrint.setBenefitAppliedTicketNumber(StaticValue.BENEFIT_NON_MAX); // ��� ���� ���� : 0
					}
				}	
			}
		
		return variablePrint.getBenefitType();
	}
	
	// 8. ��� ���ξ� (��� ���� x Ƽ�� ����)
	int benefitAmountPerTicket(VariablePrint variablePrint) {
		
		variablePrint.setBenefitAmountPerTicket((int)(variablePrint.getAppliedBenefit()
			* variablePrint.getTicketPrice()));
		
		return variablePrint.getBenefitAmountPerTicket();
	}

	// 10. �� ���ݾ� (��� ���ξ� x ��� ����)
	int discountedTicketPrice(VariablePrint variablePrint) {
		variablePrint.setDiscountedTicketPrice(variablePrint.getBenefitAmountPerTicket()
			* variablePrint.getBenefitAppliedTicketNumber());
		
		return variablePrint.getDiscountedTicketPrice();
	}
	
	// 11. ���� ���� (�� ���� - �� ���ݾ�)
	int finalTicketPrice(VariablePrint variablePrint) {
		variablePrint.setFinalTicketPrice(variablePrint.getTotalTicketPrice() 
			- variablePrint.getDiscountedTicketPrice());
		
		return variablePrint.getFinalTicketPrice();
	}

	// 12. ���� Ƽ�� ���� (�� ���� �ʿ� ����)
	int accumulatedTicketNumber(System01Input system01Input, VariablePrint variablePrint) {
		for (int index = 0; index < system01Input.OrderDataList.size(); index++) {
			variablePrint.setAccumulatedTicketNumber(variablePrint.getAccumulatedTicketNumber() + system01Input.OrderDataList.get(index).getInputNumberOfTicket());
		}
		
		variablePrint.setAccumulatedTicketNumber(variablePrint.getAccumulatedTicketNumber() + variablePrint.getInputNumberOfTicket());
		
		return variablePrint.getAccumulatedTicketNumber();
	}
	
	// 13. ���� �ݾ� (�� ���� �ʿ� �ݾ�)
	int accumulatedFinalPrice(System01Input system01Input, VariablePrint variablePrint) {
		for (int index = 0; index < system01Input.OrderDataList.size(); index++) {
			variablePrint.setAccumulatedFinalPrice(variablePrint.getAccumulatedFinalPrice() + system01Input.OrderDataList.get(index).getFinalTicketPrice());
		}
		
		variablePrint.setAccumulatedFinalPrice(variablePrint.getAccumulatedFinalPrice() + variablePrint.getFinalTicketPrice());
		
		return variablePrint.getAccumulatedFinalPrice();
	}
	
}
