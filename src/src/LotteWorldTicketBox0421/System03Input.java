package LotteWorldTicketBox0421;

import java.util.Scanner;

public class System03Input {
	
	Scanner scanner = new Scanner(System.in);
	
	System03Input() {
	}
	
	// 1. ���̺�(12���� �̻� ~ 36���� �̸�)�� ���, ��������� vs �����̿��(����) �� ����
	int inputTicketSelect_Baby(VariableValue variableValue) {
		if ( variableValue.getUserAge() >= StaticValue.getBabyAgeMin() && variableValue.getUserAge() <= StaticValue.getBabyAgeMax()) {
			System.out.printf("[���̺�(�� 12���� �̻� ~ �� 36���� �̸�) ������� �����Դϴ�. ���ƿ� ���̽ü� �̿��� ���� ���� �����̿���� �����Ͻðڽ��ϱ�?]\n\t1. �����̿�� ����\n\t2. ��������� �߱�\n\t=> ");
			variableValue.setInputTicketSelect_Baby(scanner.nextInt());
		}
		return variableValue.getInputTicketSelect_Baby();
	}
	
	// 2. ������ ���� (������ ���� �Ұ��� ���̺�&������ ��� ������ ������ ��µ��� ����)
	int inputBenefit(VariableValue variableValue, VariablePrint variablePrint) { 
		if ( variableValue.getUserAge() > StaticValue.getBabyAgeMax()) {
			do {
				System.out.print("[�������� �����ϼ���.]\n\t1. ���� (���� ���� �ڵ� ó��)\n\t2. �����\n\t3. ����������\n\t4. �ް��庴 (�����̿�Ǹ� �ش�)\n\t5. �ӻ�� (�����̿�Ǹ� �ش�)\n\t6. �ٵ��� �ູī�� (�����̿�Ǹ� �ش�)\n\t => ");
				variableValue.setInputBenefit(scanner.nextInt());
			} while ( variableValue.getInputBenefit() < 1 || variableValue.getInputBenefit() > 6 );
			if ( variableValue.getUserAge() >= StaticValue.getElderAgeMin() && variableValue.getInputBenefit() != 1) {
				do {
					System.out.print("[��� ���� ��� ��� �� �� ������ ���� �����մϴ�. ���Ͻô� ��� �׸��� �����Ͻʽÿ�.]\n\t1. ��� ���\n\t2. ��� ���\n\t => ");
					variableValue.setInputBenefit_Elder(scanner.nextInt());
				} while (! (variableValue.getInputBenefit_Elder()  == 1 || variableValue.getInputBenefit_Elder() == 2));
			}
		} else {
				variableValue.setInputBenefit(0); // ���̺�&���� -> ������ ����.
				variablePrint.setBenefitType(StaticValue.getBenefitTypeNameNon()); // ���� ��� �̸� : ����.
				variablePrint.setAppliedBenefit(StaticValue.getBenefitNon()); // ������ : 0.0
				variablePrint.setBenefitAppliedTicketNumber(StaticValue.getBenefitNonMax()); // ��� ���� ���� : 0
		}
		return variableValue.getInputBenefit();
	}
}
