package LotteWorldTicketBox0421;

import java.util.ArrayList;
import java.util.Scanner;

public class System01Input {
	
	Scanner scanner = new Scanner(System.in);
	
	System01Input (){
	}
	
	VariableValue variableValue = null;
	System01Input(VariableValue variableValue) {
		this.variableValue = variableValue;
	}
	VariablePrint variablePrint = null;
	System01Input(VariablePrint variablePrint){
		this.variablePrint = variablePrint;
	}

	ArrayList<VariablePrint> OrderDataList = new ArrayList<VariablePrint>();
	
	void run_System01Input() { // System01Input Ŭ���� ����
		variableValue = new VariableValue(); // ���� ������ �ʱ�ȭ!
		variablePrint = new VariablePrint(); // ��¿� ������ �ʱ�ȭ!
		inputTicketPlace();
		inputTicketTime();
		inputSocialID();
		inputNumberOfTicket();
	}
	
	// 1. ���� ���� : ��� (�����̿�� vs ��ũ�̿��)
	int inputTicketPlace() {
		do {
			System.out.printf("[������ �����ϼ���.]\n\t1. �����̿��(�Ե�����+�μӹڹ���)\n\t2. ��ũ�̿��(�Ե�����)\n\t=> ");
			variableValue.setInputTicketSelect_place(scanner.nextInt());
		} while (! (variableValue.getInputTicketSelect_place() == 1 || variableValue.getInputTicketSelect_place() == 2));

		return variableValue.getInputTicketSelect_place();
	}
	
	// 2. ���� ���� : �ð� (���ϱ� vs ���ı�)
	int inputTicketTime() { 
		do {
			System.out.printf("[��� �ð��� �����ϼ���.]\n\t1. ���ϱ�(1DAY)\n\t2. ���ı�(AFTER4)\n\t=> ");
			variableValue.setInputTicketSelect_time(scanner.nextInt());
		} while (! (variableValue.getInputTicketSelect_time() == 1 || variableValue.getInputTicketSelect_time() == 2));
		
		return variableValue.getInputTicketSelect_time();
	}
	
	// 3. �ֹε�Ϲ�ȣ �� 7�ڸ� �Է� (=> ���� & ���� �Ǵܿ�)
	void inputSocialID() { 
		String inputSocialID;
		do {
			System.out.printf("[�ֹε�Ϲ�ȣ �� 7�ڸ� ���ڸ� �Է��ϼ���.(��6�ڸ� ���� + ���ڸ��� ù ����)]\n\t=> ");	
			inputSocialID = scanner.next();
			variableValue.setSocialID(new char[inputSocialID.length()]);
			for (int index = 0; index < variableValue.getSocialID().length; index++) {
				variableValue.getSocialID()[index] = inputSocialID.charAt(index);
			}	
		} while(! ( (inputSocialID.length() == 7) 
				&& ((variableValue.getSocialID()[inputSocialID.length()-5]-48)*10 + (variableValue.getSocialID()[inputSocialID.length()-4]-48)) >= 1 
				&& ((variableValue.getSocialID()[inputSocialID.length()-5]-48)*10 + (variableValue.getSocialID()[inputSocialID.length()-4]-48)) <= 12 
				&& ((variableValue.getSocialID()[inputSocialID.length()-3]-48)*10 + (variableValue.getSocialID()[inputSocialID.length()-2]-48)) >= 1 
				&& ((variableValue.getSocialID()[inputSocialID.length()-3]-48)*10 + (variableValue.getSocialID()[inputSocialID.length()-2]-48)) <= 31 
				&& variableValue.getSocialID()[inputSocialID.length()-1]-48 >= 1 && variableValue.getSocialID()[inputSocialID.length()-1]-48 <= 4 ));		
	}
	
	// 4. Ƽ�� ���� �Է� (MAX 10)
	int inputNumberOfTicket() { 
		do {
			System.out.print("[�����Ͻ� Ƽ�� ������ �Է��ϼ���.(�ִ� 10��)]\n\t => ");
			variablePrint.setInputNumberOfTicket(scanner.nextInt());
		} while ( variablePrint.getInputNumberOfTicket() < 1 || variablePrint.getInputNumberOfTicket() > 10 );
		
		return variablePrint.getInputNumberOfTicket();
	}
	
}
