package LotteWorldTicketBox0421;

public class System04Calculate {
	
	System04Calculate() {
	}
	
	// 1. 티켓 종류(이름) : System02Calculate에서 데이터 입력 완료
	
	// 2. 나이 그룹(이름) & 3. 티켓 가격
	int ticketPrice(VariableValue variableValue, VariablePrint variablePrint) {
		if (variableValue.getUserAge() >= StaticValue.getElderAgeMin() && variableValue.getInputBenefit_Elder() == 1) {
			// 경로 할인 대상 -> 티켓 기본 가격 경로 우대 가격으로 지정되고, 상시 할인은 NON으로 적용됨.
			variablePrint.setAgeTypeName(StaticValue.getAgeTypeNameElder()); // 나이 그룹(이름) : 경로
			variablePrint.setTicketPrice(variableValue.getPriceList().get(0)); // 가격 : 경로
		} if (variableValue.getUserAge() >= StaticValue.getElderAgeMin() && variableValue.getInputBenefit_Elder() == 2) { 
			// 경로 대상 나이이나, 상시 할인 선택한 경우 -> 티켓 기본 가격은 성인 가격으로 적용 & 상시 우대 적용됨.
				variablePrint.setAgeTypeName(StaticValue.getAgeTypeNameAdult()); // 나이 그룹(이름) : 성인
				variablePrint.setTicketPrice(variableValue.getPriceList().get(1)); // 가격 :성인
		} if (variableValue.getUserAge() >= StaticValue.getAdultAgeMin() 
				&& variableValue.getUserAge() <= StaticValue.getAdultAgeMax()) {
			variablePrint.setAgeTypeName(StaticValue.getAgeTypeNameAdult()); // 나이 그룹(이름) : 성인
			variablePrint.setTicketPrice(variableValue.getPriceList().get(1)); // 가격 : 성인
		} if (variableValue.getUserAge() >= StaticValue.getJuvernileAgeMin()
				&& variableValue.getUserAge() <= StaticValue.getJuvenileAgeMax()) {
			variablePrint.setAgeTypeName(StaticValue.getAgeTypeNameJuvenile()); // 나이 그룹(이름) : 청소년
			variablePrint.setTicketPrice(variableValue.getPriceList().get(2)); // 가격 : 청소년
		} if (variableValue.getUserAge() >= StaticValue.getChildAgeMin()
				&& variableValue.getUserAge() <= StaticValue.getChildAgeMax()) {
			variablePrint.setAgeTypeName(StaticValue.getAgeTypeNameChild()); // 나이 그룹(이름) : 어린이
			variablePrint.setTicketPrice(variableValue.getPriceList().get(3)); // 가격 : 어린이
		} if (variableValue.getUserAge() >= StaticValue.getBabyAgeMin()
				&& variableValue.getUserAge() <= StaticValue.getBabyAgeMax()
				&& variableValue.getInputTicketSelect_Baby() == 1) {
			variablePrint.setAgeTypeName(StaticValue.getAgeTypeNameBabyFreepass()); // 나이 그룹(이름) : 베이비-자유이용권(유료)
			variablePrint.setTicketPrice(variableValue.getPriceList().get(4)); // 가격 : 베이비-자유이용권(유료)
		} if (variableValue.getUserAge() >= StaticValue.getBabyAgeMin()
				&& variableValue.getUserAge() <= StaticValue.getBabyAgeMax()
				&& variableValue.getInputTicketSelect_Baby() == 2) {
			variablePrint.setAgeTypeName(StaticValue.getAgeTypeNameBabyEnterance()); // 나이 그룹(이름) : 베이비-입장권(무료)
			variablePrint.setTicketPrice(variableValue.getPriceList().get(5)); // 가격 : 베이비-입장권(무료)
		} if (variableValue.getUserAge() == StaticValue.getNewbornAge()) {
			variablePrint.setAgeTypeName(StaticValue.getAgeTypeNameNewborn()); // 나이 그룹(이름) : 뉴본
			variablePrint.setTicketPrice(variableValue.getPriceList().get(6)); // 가격 : 뉴본(무료)
		}
		
		return variablePrint.getTicketPrice();
	}
	
	// 4. 티켓 수량 => System01Input 에서 데이터 입력 완료
	
	// 5. 총 가격(티켓 가격 x 수량)
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
	
	// 6. 우대사항 적용 항목 (이름) & 7. 우대 할인율 & 9. 우대 적용 수량
	String benefitType(VariableValue variableValue, VariablePrint variablePrint) {
		if (variableValue.getUserAge() >= StaticValue.getElderAgeMin()
			&& variableValue.getInputBenefit_Elder() == 1) { // 경로 우대를 선택한 경우
			variablePrint.setBenefitType(StaticValue.getBenefitTypeNameNon()); // 적용 우대 이름 : 없음.
			variablePrint.setAppliedBenefit(StaticValue.getBenefitNon()); // 우대없음 : 0.0
			variablePrint.setBenefitAppliedTicketNumber(StaticValue.getBenefitNonMax()); // 우대 적용 수량 : 0
		} else {
			if (variableValue.getInputTicketSelect_place() == 1) { // 종합이용권
				// (1) 우대 없음
				if (variableValue.getInputBenefit() == 1) {
					variablePrint.setBenefitType(StaticValue.getBenefitTypeNameNon()); // 적용 우대 이름 : 없음.
					variablePrint.setAppliedBenefit(StaticValue.getBenefitNon()); // 우대없음 : 0.0
					variablePrint.setBenefitAppliedTicketNumber(StaticValue.getBenefitNonMax()); // 우대 적용 수량 : 0
				} 
				// (2) 장애인 우대
				if (variableValue.getInputBenefit() == 2) {
					variablePrint.setBenefitType(StaticValue.getBenefitTypeNameDisabled()); // 적용 우대 이름
					variablePrint.setAppliedBenefit(StaticValue.getBenefitDisabled()); // 장애인 우대 : 0.5
					if (variablePrint.getInputNumberOfTicket() <= StaticValue.getBenefitDisabledMax()) { // 우대 적용 수량
						variablePrint.setBenefitAppliedTicketNumber(variablePrint.getInputNumberOfTicket());
					} else {
						variablePrint.setBenefitAppliedTicketNumber(StaticValue.getBenefitDisabledMax()); 
					}
				} // (3) 국가유공자 우대 
				if (variableValue.getInputBenefit() == 3) {
					variablePrint.setBenefitType(StaticValue.getBenefitTypeNameNationalMerit()); // 적용 우대 이름
					variablePrint.setAppliedBenefit(StaticValue.getBenefitNationalMerit()); // 국가유공자 우대 : 0.5
					if (variablePrint.getInputNumberOfTicket() <= StaticValue.getBenefitNationalMeritMax()) { // 우대 적용 수량
						variablePrint.setBenefitAppliedTicketNumber(variablePrint.getInputNumberOfTicket());
					} else {
						variablePrint.setBenefitAppliedTicketNumber(StaticValue.getBenefitNationalMeritMax()); 
					}
				} // (4) 휴가장병 우대 
				if (variableValue.getInputBenefit() == 4) {
					variablePrint.setBenefitType(StaticValue.getBenefitTypeNameArmy()); // 적용 우대 이름
					variablePrint.setAppliedBenefit(StaticValue.getBenefitArmy()); // 휴가장병 우대 : 0.49
					if (variablePrint.getInputNumberOfTicket() <= StaticValue.getBenefitArmyMax()) { // 우대 적용 수량
						variablePrint.setBenefitAppliedTicketNumber(variablePrint.getInputNumberOfTicket());
					} else {
						variablePrint.setBenefitAppliedTicketNumber(StaticValue.getBenefitArmyMax()); 
					}
				} // (5) 임산부 우대 
				if (variableValue.getInputBenefit() == 5 
						&& ( variableValue.getBirthYearIndex() == StaticValue.getIndexFemaleOld() 
							|| variableValue.getBirthYearIndex() == StaticValue.getIndexFemaleNew()) ) {
					variablePrint.setBenefitType(StaticValue.getBenefitTypeNamePregnant()); // 적용 우대 이름
					variablePrint.setAppliedBenefit(StaticValue.getBenefitPregnant()); // 임산부 우대 : 0.49
					if (variablePrint.getInputNumberOfTicket() <= StaticValue.getBenefitPregnantMax()) { // 우대 적용 수량
						variablePrint.setBenefitAppliedTicketNumber(variablePrint.getInputNumberOfTicket());
					} else {
						variablePrint.setBenefitAppliedTicketNumber(StaticValue.getBenefitPregnantMax()); 
					}
				} // (5) 임산부 우대 선택하였으나, 사용자가 남자인 경우 
				if (variableValue.getInputBenefit() == 5 
						&& ( variableValue.getBirthYearIndex() == StaticValue.getIndexMaleOld() 
						|| variableValue.getBirthYearIndex() == StaticValue.getIndexMaleNew()) ) {
					variablePrint.setBenefitType(StaticValue.getBenefitTypeNameNon()); // 적용 우대 이름 : 없음.
					variablePrint.setAppliedBenefit(StaticValue.getBenefitNon()); // 우대없음 : 0.0
					variablePrint.setBenefitAppliedTicketNumber(StaticValue.getBenefitNonMax()); // 우대 적용 수량 : 0
				} // (6) 다자녀 우대 
				if (variableValue.getInputBenefit() == 6) {
					variablePrint.setBenefitType(StaticValue.getBenefitTypeNameMultichild()); // 적용 우대 이름
					variablePrint.setAppliedBenefit(StaticValue.getBenefitMultichild()); // 다자녀 우대 : 0.3
					if (variablePrint.getInputNumberOfTicket() <= StaticValue.getBenefitMultichildMax()) { // 우대 적용 수량
						variablePrint.setBenefitAppliedTicketNumber(variablePrint.getInputNumberOfTicket());
					} else {
						variablePrint.setBenefitAppliedTicketNumber(StaticValue.getBenefitMultichildMax()); 
					}
				}
			} 
			else if (variableValue.getInputTicketSelect_place() == 2) { // 파크이용권
				// (1) 우대 없음
				if (variableValue.getInputBenefit() == 1) {
					variablePrint.setBenefitType(StaticValue.getBenefitTypeNameNon()); // 적용 우대 이름 : 없음.
					variablePrint.setAppliedBenefit(StaticValue.getBenefitNon()); // 우대없음 : 0.0
					variablePrint.setBenefitAppliedTicketNumber(StaticValue.getBenefitNonMax()); // 우대 적용 수량 : 0
				} 
				// (2) 장애인 우대
				if (variableValue.getInputBenefit() == 2) {
					variablePrint.setBenefitType(StaticValue.getBenefitTypeNameDisabled()); // 적용 우대 이름
					variablePrint.setAppliedBenefit(StaticValue.getBenefitDisabled()); // 장애인 우대 : 0.5
					if (variablePrint.getInputNumberOfTicket() <= StaticValue.getBenefitDisabledMax()) { // 우대 적용 수량
						variablePrint.setBenefitAppliedTicketNumber(variablePrint.getInputNumberOfTicket());
					} else {
						variablePrint.setBenefitAppliedTicketNumber(StaticValue.getBenefitDisabledMax()); 
					}
				} // (3) 국가유공자 우대 
				if (variableValue.getInputBenefit() == 3) {
					variablePrint.setBenefitType(StaticValue.getBenefitTypeNameNationalMerit()); // 적용 우대 이름
					variablePrint.setAppliedBenefit(StaticValue.getBenefitNationalMerit()); // 국가유공자 우대 : 0.5
					if (variablePrint.getInputNumberOfTicket() <= StaticValue.getBenefitNationalMeritMax()) { // 우대 적용 수량
						variablePrint.setBenefitAppliedTicketNumber(variablePrint.getInputNumberOfTicket());
					} else {
						variablePrint.setBenefitAppliedTicketNumber(StaticValue.getBenefitNationalMeritMax()); 
					}
				} // (4) 휴가장병 우대 
				if (variableValue.getInputBenefit() == 4) {
					variablePrint.setBenefitType(StaticValue.getBenefitTypeNameNon()); // 적용 우대 이름 : 없음.
					variablePrint.setAppliedBenefit(StaticValue.getBenefitNon()); // 우대없음 : 0.0
					variablePrint.setBenefitAppliedTicketNumber(StaticValue.getBenefitNonMax()); // 우대 적용 수량 : 0
				} // (5) 임산부 우대 
				if (variableValue.getInputBenefit() == 5 
						&& ( variableValue.getBirthYearIndex() == StaticValue.getIndexFemaleOld() 
							|| variableValue.getBirthYearIndex() == StaticValue.getIndexFemaleNew()) ) {
					variablePrint.setBenefitType(StaticValue.getBenefitTypeNameNon()); // 적용 우대 이름 : 없음.
					variablePrint.setAppliedBenefit(StaticValue.getBenefitNon()); // 우대없음 : 0.0
					variablePrint.setBenefitAppliedTicketNumber(StaticValue.getBenefitNonMax()); // 우대 적용 수량 : 0
				} // (5) 임산부 우대 선택하였으나, 사용자가 남자인 경우 
				if (variableValue.getInputBenefit() == 5 
						&& ( variableValue.getBirthYearIndex() == StaticValue.getIndexMaleOld() 
						|| variableValue.getBirthYearIndex() == StaticValue.getIndexMaleNew()) ) {
					variablePrint.setBenefitType(StaticValue.getBenefitTypeNameNon()); // 적용 우대 이름 : 없음.
					variablePrint.setAppliedBenefit(StaticValue.getBenefitNon()); // 우대없음 : 0.0
					variablePrint.setBenefitAppliedTicketNumber(StaticValue.getBenefitNonMax()); // 우대 적용 수량 : 0
				} // (6) 다자녀 우대 
				if (variableValue.getInputBenefit() == 6) {
					variablePrint.setBenefitType(StaticValue.getBenefitTypeNameNon()); // 적용 우대 이름 : 없음.
					variablePrint.setAppliedBenefit(StaticValue.getBenefitNon()); // 우대없음 : 0.0
					variablePrint.setBenefitAppliedTicketNumber(StaticValue.getBenefitNonMax()); // 우대 적용 수량 : 0
					}
				}	
			}
		
		return variablePrint.getBenefitType();
	}
	
	// 8. 우대 할인액 (우대 요율 x 티켓 가격)
	int benefitAmountPerTicket(VariablePrint variablePrint) {
		
		variablePrint.setBenefitAmountPerTicket((int)(variablePrint.getAppliedBenefit()
			* variablePrint.getTicketPrice()));
		
		return variablePrint.getBenefitAmountPerTicket();
	}

	// 10. 총 우대금액 (우대 할인액 x 우대 수량)
	int discountedTicketPrice(VariablePrint variablePrint) {
		variablePrint.setDiscountedTicketPrice(variablePrint.getBenefitAmountPerTicket()
			* variablePrint.getBenefitAppliedTicketNumber());
		
		return variablePrint.getDiscountedTicketPrice();
	}
	
	// 11. 최종 가격 (총 가격 - 총 우대금액)
	int finalTicketPrice(VariablePrint variablePrint) {
		variablePrint.setFinalTicketPrice(variablePrint.getTotalTicketPrice() 
			- variablePrint.getDiscountedTicketPrice());
		
		return variablePrint.getFinalTicketPrice();
	}

	// 12. 누적 티켓 수량 (총 결제 필요 수량)
	int accumulatedTicketNumber(System01Input system01Input, VariablePrint variablePrint) {
		for (int index = 0; index < system01Input.OrderDataList.size(); index++) {
			variablePrint.setAccumulatedTicketNumber(variablePrint.getAccumulatedTicketNumber() + system01Input.OrderDataList.get(index).getInputNumberOfTicket());
		}
		
		variablePrint.setAccumulatedTicketNumber(variablePrint.getAccumulatedTicketNumber() + variablePrint.getInputNumberOfTicket());
		
		return variablePrint.getAccumulatedTicketNumber();
	}
	
	// 13. 누적 금액 (총 결제 필요 금액)
	int accumulatedFinalPrice(System01Input system01Input, VariablePrint variablePrint) {
		for (int index = 0; index < system01Input.OrderDataList.size(); index++) {
			variablePrint.setAccumulatedFinalPrice(variablePrint.getAccumulatedFinalPrice() + system01Input.OrderDataList.get(index).getFinalTicketPrice());
		}
		
		variablePrint.setAccumulatedFinalPrice(variablePrint.getAccumulatedFinalPrice() + variablePrint.getFinalTicketPrice());
		
		return variablePrint.getAccumulatedFinalPrice();
	}
	
}
