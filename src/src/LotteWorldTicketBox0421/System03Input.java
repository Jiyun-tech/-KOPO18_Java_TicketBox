package LotteWorldTicketBox0421;

import java.util.Scanner;

public class System03Input {
	
	Scanner scanner = new Scanner(System.in);
	
	System03Input() {
	}
	
	// 1. 베이비(12개월 이상 ~ 36개월 미만)의 경우, 무료입장권 vs 자유이용권(유료) 중 선택
	int inputTicketSelect_Baby(VariableValue variableValue) {
		if ( variableValue.getUserAge() >= StaticValue.getBabyAgeMin() && variableValue.getUserAge() <= StaticValue.getBabyAgeMax()) {
			System.out.printf("[베이비(만 12개월 이상 ~ 만 36개월 미만) 입장권은 무료입니다. 유아용 놀이시설 이용을 위한 유료 자유이용권을 구매하시겠습니까?]\n\t1. 자유이용권 구매\n\t2. 무료입장권 발권\n\t=> ");
			variableValue.setInputTicketSelect_Baby(scanner.nextInt());
		}
		return variableValue.getInputTicketSelect_Baby();
	}
	
	// 2. 우대사항 선택 (우대사항 적용 불가한 베이비&뉴본의 경우 우대사항 선택지 출력되지 않음)
	int inputBenefit(VariableValue variableValue, VariablePrint variablePrint) { 
		if ( variableValue.getUserAge() > StaticValue.getBabyAgeMax()) {
			do {
				System.out.print("[우대사항을 선택하세요.]\n\t1. 없음 (나이 우대는 자동 처리)\n\t2. 장애인\n\t3. 국가유공자\n\t4. 휴가장병 (종합이용권만 해당)\n\t5. 임산부 (종합이용권만 해당)\n\t6. 다둥이 행복카드 (종합이용권만 해당)\n\t => ");
				variableValue.setInputBenefit(scanner.nextInt());
			} while ( variableValue.getInputBenefit() < 1 || variableValue.getInputBenefit() > 6 );
			if ( variableValue.getUserAge() >= StaticValue.getElderAgeMin() && variableValue.getInputBenefit() != 1) {
				do {
					System.out.print("[경로 우대와 상시 우대 중 한 가지만 적용 가능합니다. 원하시는 우대 항목을 선택하십시오.]\n\t1. 경로 우대\n\t2. 상시 우대\n\t => ");
					variableValue.setInputBenefit_Elder(scanner.nextInt());
				} while (! (variableValue.getInputBenefit_Elder()  == 1 || variableValue.getInputBenefit_Elder() == 2));
			}
		} else {
				variableValue.setInputBenefit(0); // 베이비&뉴본 -> 우대사항 없음.
				variablePrint.setBenefitType(StaticValue.getBenefitTypeNameNon()); // 적용 우대 이름 : 없음.
				variablePrint.setAppliedBenefit(StaticValue.getBenefitNon()); // 우대없음 : 0.0
				variablePrint.setBenefitAppliedTicketNumber(StaticValue.getBenefitNonMax()); // 우대 적용 수량 : 0
		}
		return variableValue.getInputBenefit();
	}
}
