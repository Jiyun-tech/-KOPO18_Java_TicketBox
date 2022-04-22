package LotteWorldTicketBox0421;

public class System04Calculate {
	
	System04Calculate() {
	}
	
	// 1. Ƽ�� ����(�̸�) : System02Calculate���� ������ �Է� �Ϸ�
	
	// 2. ���� �׷�(�̸�) & 3. Ƽ�� ����
	int ticketPrice(VariableValue variableValue, VariablePrint variablePrint) {
		if (variableValue.getUserAge() >= StaticValue.getElderAgeMin() && variableValue.getInputBenefit_Elder() == 1) {
			// ��� ���� ��� -> Ƽ�� �⺻ ���� ��� ��� �������� �����ǰ�, ��� ������ NON���� �����.
			variablePrint.setAgeTypeName(StaticValue.getAgeTypeNameElder()); // ���� �׷�(�̸�) : ���
			variablePrint.setTicketPrice(variableValue.getPriceList().get(0)); // ���� : ���
		} if (variableValue.getUserAge() >= StaticValue.getElderAgeMin() && variableValue.getInputBenefit_Elder() == 2) { 
			// ��� ��� �����̳�, ��� ���� ������ ��� -> Ƽ�� �⺻ ������ ���� �������� ���� & ��� ��� �����.
				variablePrint.setAgeTypeName(StaticValue.getAgeTypeNameAdult()); // ���� �׷�(�̸�) : ����
				variablePrint.setTicketPrice(variableValue.getPriceList().get(1)); // ���� :����
		} if (variableValue.getUserAge() >= StaticValue.getAdultAgeMin() 
				&& variableValue.getUserAge() <= StaticValue.getAdultAgeMax()) {
			variablePrint.setAgeTypeName(StaticValue.getAgeTypeNameAdult()); // ���� �׷�(�̸�) : ����
			variablePrint.setTicketPrice(variableValue.getPriceList().get(1)); // ���� : ����
		} if (variableValue.getUserAge() >= StaticValue.getJuvernileAgeMin()
				&& variableValue.getUserAge() <= StaticValue.getJuvenileAgeMax()) {
			variablePrint.setAgeTypeName(StaticValue.getAgeTypeNameJuvenile()); // ���� �׷�(�̸�) : û�ҳ�
			variablePrint.setTicketPrice(variableValue.getPriceList().get(2)); // ���� : û�ҳ�
		} if (variableValue.getUserAge() >= StaticValue.getChildAgeMin()
				&& variableValue.getUserAge() <= StaticValue.getChildAgeMax()) {
			variablePrint.setAgeTypeName(StaticValue.getAgeTypeNameChild()); // ���� �׷�(�̸�) : ���
			variablePrint.setTicketPrice(variableValue.getPriceList().get(3)); // ���� : ���
		} if (variableValue.getUserAge() >= StaticValue.getBabyAgeMin()
				&& variableValue.getUserAge() <= StaticValue.getBabyAgeMax()
				&& variableValue.getInputTicketSelect_Baby() == 1) {
			variablePrint.setAgeTypeName(StaticValue.getAgeTypeNameBabyFreepass()); // ���� �׷�(�̸�) : ���̺�-�����̿��(����)
			variablePrint.setTicketPrice(variableValue.getPriceList().get(4)); // ���� : ���̺�-�����̿��(����)
		} if (variableValue.getUserAge() >= StaticValue.getBabyAgeMin()
				&& variableValue.getUserAge() <= StaticValue.getBabyAgeMax()
				&& variableValue.getInputTicketSelect_Baby() == 2) {
			variablePrint.setAgeTypeName(StaticValue.getAgeTypeNameBabyEnterance()); // ���� �׷�(�̸�) : ���̺�-�����(����)
			variablePrint.setTicketPrice(variableValue.getPriceList().get(5)); // ���� : ���̺�-�����(����)
		} if (variableValue.getUserAge() == StaticValue.getNewbornAge()) {
			variablePrint.setAgeTypeName(StaticValue.getAgeTypeNameNewborn()); // ���� �׷�(�̸�) : ����
			variablePrint.setTicketPrice(variableValue.getPriceList().get(6)); // ���� : ����(����)
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
		if (variableValue.getUserAge() >= StaticValue.getElderAgeMin()
			&& variableValue.getInputBenefit_Elder() == 1) { // ��� ��븦 ������ ���
			variablePrint.setBenefitType(StaticValue.getBenefitTypeNameNon()); // ���� ��� �̸� : ����.
			variablePrint.setAppliedBenefit(StaticValue.getBenefitNon()); // ������ : 0.0
			variablePrint.setBenefitAppliedTicketNumber(StaticValue.getBenefitNonMax()); // ��� ���� ���� : 0
		} else {
			if (variableValue.getInputTicketSelect_place() == 1) { // �����̿��
				// (1) ��� ����
				if (variableValue.getInputBenefit() == 1) {
					variablePrint.setBenefitType(StaticValue.getBenefitTypeNameNon()); // ���� ��� �̸� : ����.
					variablePrint.setAppliedBenefit(StaticValue.getBenefitNon()); // ������ : 0.0
					variablePrint.setBenefitAppliedTicketNumber(StaticValue.getBenefitNonMax()); // ��� ���� ���� : 0
				} 
				// (2) ����� ���
				if (variableValue.getInputBenefit() == 2) {
					variablePrint.setBenefitType(StaticValue.getBenefitTypeNameDisabled()); // ���� ��� �̸�
					variablePrint.setAppliedBenefit(StaticValue.getBenefitDisabled()); // ����� ��� : 0.5
					if (variablePrint.getInputNumberOfTicket() <= StaticValue.getBenefitDisabledMax()) { // ��� ���� ����
						variablePrint.setBenefitAppliedTicketNumber(variablePrint.getInputNumberOfTicket());
					} else {
						variablePrint.setBenefitAppliedTicketNumber(StaticValue.getBenefitDisabledMax()); 
					}
				} // (3) ���������� ��� 
				if (variableValue.getInputBenefit() == 3) {
					variablePrint.setBenefitType(StaticValue.getBenefitTypeNameNationalMerit()); // ���� ��� �̸�
					variablePrint.setAppliedBenefit(StaticValue.getBenefitNationalMerit()); // ���������� ��� : 0.5
					if (variablePrint.getInputNumberOfTicket() <= StaticValue.getBenefitNationalMeritMax()) { // ��� ���� ����
						variablePrint.setBenefitAppliedTicketNumber(variablePrint.getInputNumberOfTicket());
					} else {
						variablePrint.setBenefitAppliedTicketNumber(StaticValue.getBenefitNationalMeritMax()); 
					}
				} // (4) �ް��庴 ��� 
				if (variableValue.getInputBenefit() == 4) {
					variablePrint.setBenefitType(StaticValue.getBenefitTypeNameArmy()); // ���� ��� �̸�
					variablePrint.setAppliedBenefit(StaticValue.getBenefitArmy()); // �ް��庴 ��� : 0.49
					if (variablePrint.getInputNumberOfTicket() <= StaticValue.getBenefitArmyMax()) { // ��� ���� ����
						variablePrint.setBenefitAppliedTicketNumber(variablePrint.getInputNumberOfTicket());
					} else {
						variablePrint.setBenefitAppliedTicketNumber(StaticValue.getBenefitArmyMax()); 
					}
				} // (5) �ӻ�� ��� 
				if (variableValue.getInputBenefit() == 5 
						&& ( variableValue.getBirthYearIndex() == StaticValue.getIndexFemaleOld() 
							|| variableValue.getBirthYearIndex() == StaticValue.getIndexFemaleNew()) ) {
					variablePrint.setBenefitType(StaticValue.getBenefitTypeNamePregnant()); // ���� ��� �̸�
					variablePrint.setAppliedBenefit(StaticValue.getBenefitPregnant()); // �ӻ�� ��� : 0.49
					if (variablePrint.getInputNumberOfTicket() <= StaticValue.getBenefitPregnantMax()) { // ��� ���� ����
						variablePrint.setBenefitAppliedTicketNumber(variablePrint.getInputNumberOfTicket());
					} else {
						variablePrint.setBenefitAppliedTicketNumber(StaticValue.getBenefitPregnantMax()); 
					}
				} // (5) �ӻ�� ��� �����Ͽ�����, ����ڰ� ������ ��� 
				if (variableValue.getInputBenefit() == 5 
						&& ( variableValue.getBirthYearIndex() == StaticValue.getIndexMaleOld() 
						|| variableValue.getBirthYearIndex() == StaticValue.getIndexMaleNew()) ) {
					variablePrint.setBenefitType(StaticValue.getBenefitTypeNameNon()); // ���� ��� �̸� : ����.
					variablePrint.setAppliedBenefit(StaticValue.getBenefitNon()); // ������ : 0.0
					variablePrint.setBenefitAppliedTicketNumber(StaticValue.getBenefitNonMax()); // ��� ���� ���� : 0
				} // (6) ���ڳ� ��� 
				if (variableValue.getInputBenefit() == 6) {
					variablePrint.setBenefitType(StaticValue.getBenefitTypeNameMultichild()); // ���� ��� �̸�
					variablePrint.setAppliedBenefit(StaticValue.getBenefitMultichild()); // ���ڳ� ��� : 0.3
					if (variablePrint.getInputNumberOfTicket() <= StaticValue.getBenefitMultichildMax()) { // ��� ���� ����
						variablePrint.setBenefitAppliedTicketNumber(variablePrint.getInputNumberOfTicket());
					} else {
						variablePrint.setBenefitAppliedTicketNumber(StaticValue.getBenefitMultichildMax()); 
					}
				}
			} 
			else if (variableValue.getInputTicketSelect_place() == 2) { // ��ũ�̿��
				// (1) ��� ����
				if (variableValue.getInputBenefit() == 1) {
					variablePrint.setBenefitType(StaticValue.getBenefitTypeNameNon()); // ���� ��� �̸� : ����.
					variablePrint.setAppliedBenefit(StaticValue.getBenefitNon()); // ������ : 0.0
					variablePrint.setBenefitAppliedTicketNumber(StaticValue.getBenefitNonMax()); // ��� ���� ���� : 0
				} 
				// (2) ����� ���
				if (variableValue.getInputBenefit() == 2) {
					variablePrint.setBenefitType(StaticValue.getBenefitTypeNameDisabled()); // ���� ��� �̸�
					variablePrint.setAppliedBenefit(StaticValue.getBenefitDisabled()); // ����� ��� : 0.5
					if (variablePrint.getInputNumberOfTicket() <= StaticValue.getBenefitDisabledMax()) { // ��� ���� ����
						variablePrint.setBenefitAppliedTicketNumber(variablePrint.getInputNumberOfTicket());
					} else {
						variablePrint.setBenefitAppliedTicketNumber(StaticValue.getBenefitDisabledMax()); 
					}
				} // (3) ���������� ��� 
				if (variableValue.getInputBenefit() == 3) {
					variablePrint.setBenefitType(StaticValue.getBenefitTypeNameNationalMerit()); // ���� ��� �̸�
					variablePrint.setAppliedBenefit(StaticValue.getBenefitNationalMerit()); // ���������� ��� : 0.5
					if (variablePrint.getInputNumberOfTicket() <= StaticValue.getBenefitNationalMeritMax()) { // ��� ���� ����
						variablePrint.setBenefitAppliedTicketNumber(variablePrint.getInputNumberOfTicket());
					} else {
						variablePrint.setBenefitAppliedTicketNumber(StaticValue.getBenefitNationalMeritMax()); 
					}
				} // (4) �ް��庴 ��� 
				if (variableValue.getInputBenefit() == 4) {
					variablePrint.setBenefitType(StaticValue.getBenefitTypeNameNon()); // ���� ��� �̸� : ����.
					variablePrint.setAppliedBenefit(StaticValue.getBenefitNon()); // ������ : 0.0
					variablePrint.setBenefitAppliedTicketNumber(StaticValue.getBenefitNonMax()); // ��� ���� ���� : 0
				} // (5) �ӻ�� ��� 
				if (variableValue.getInputBenefit() == 5 
						&& ( variableValue.getBirthYearIndex() == StaticValue.getIndexFemaleOld() 
							|| variableValue.getBirthYearIndex() == StaticValue.getIndexFemaleNew()) ) {
					variablePrint.setBenefitType(StaticValue.getBenefitTypeNameNon()); // ���� ��� �̸� : ����.
					variablePrint.setAppliedBenefit(StaticValue.getBenefitNon()); // ������ : 0.0
					variablePrint.setBenefitAppliedTicketNumber(StaticValue.getBenefitNonMax()); // ��� ���� ���� : 0
				} // (5) �ӻ�� ��� �����Ͽ�����, ����ڰ� ������ ��� 
				if (variableValue.getInputBenefit() == 5 
						&& ( variableValue.getBirthYearIndex() == StaticValue.getIndexMaleOld() 
						|| variableValue.getBirthYearIndex() == StaticValue.getIndexMaleNew()) ) {
					variablePrint.setBenefitType(StaticValue.getBenefitTypeNameNon()); // ���� ��� �̸� : ����.
					variablePrint.setAppliedBenefit(StaticValue.getBenefitNon()); // ������ : 0.0
					variablePrint.setBenefitAppliedTicketNumber(StaticValue.getBenefitNonMax()); // ��� ���� ���� : 0
				} // (6) ���ڳ� ��� 
				if (variableValue.getInputBenefit() == 6) {
					variablePrint.setBenefitType(StaticValue.getBenefitTypeNameNon()); // ���� ��� �̸� : ����.
					variablePrint.setAppliedBenefit(StaticValue.getBenefitNon()); // ������ : 0.0
					variablePrint.setBenefitAppliedTicketNumber(StaticValue.getBenefitNonMax()); // ��� ���� ���� : 0
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
