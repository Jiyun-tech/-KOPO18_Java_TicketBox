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
	
	void run_System01Input() { // System01Input 클래스 종합
		variableValue = new VariableValue(); // 계산용 데이터 초기화!
		variablePrint = new VariablePrint(); // 출력용 데이터 초기화!
		inputTicketPlace();
		inputTicketTime();
		inputSocialID();
		inputNumberOfTicket();
	}
	
	// 1. 권종 선택 : 장소 (종합이용권 vs 파크이용권)
	int inputTicketPlace() {
		do {
			System.out.printf("[권종을 선택하세요.]\n\t1. 종합이용권(롯데월드+민속박물관)\n\t2. 파크이용권(롯데월드)\n\t=> ");
			variableValue.setInputTicketSelect_place(scanner.nextInt());
		} while (! (variableValue.getInputTicketSelect_place() == 1 || variableValue.getInputTicketSelect_place() == 2));

		return variableValue.getInputTicketSelect_place();
	}
	
	// 2. 권종 선택 : 시간 (종일권 vs 오후권)
	int inputTicketTime() { 
		do {
			System.out.printf("[사용 시간을 선택하세요.]\n\t1. 종일권(1DAY)\n\t2. 오후권(AFTER4)\n\t=> ");
			variableValue.setInputTicketSelect_time(scanner.nextInt());
		} while (! (variableValue.getInputTicketSelect_time() == 1 || variableValue.getInputTicketSelect_time() == 2));
		
		return variableValue.getInputTicketSelect_time();
	}
	
	// 3. 주민등록번호 앞 7자리 입력 (=> 나이 & 성별 판단용)
	void inputSocialID() { 
		String inputSocialID;
		do {
			System.out.printf("[주민등록번호 앞 7자리 숫자를 입력하세요.(앞6자리 숫자 + 뒷자리의 첫 숫자)]\n\t=> ");	
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
	
	// 4. 티켓 수량 입력 (MAX 10)
	int inputNumberOfTicket() { 
		do {
			System.out.print("[구매하실 티켓 수량을 입력하세요.(최대 10장)]\n\t => ");
			variablePrint.setInputNumberOfTicket(scanner.nextInt());
		} while ( variablePrint.getInputNumberOfTicket() < 1 || variablePrint.getInputNumberOfTicket() > 10 );
		
		return variablePrint.getInputNumberOfTicket();
	}
	
}
