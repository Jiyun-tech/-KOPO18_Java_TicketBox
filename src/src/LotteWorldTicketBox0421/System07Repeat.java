package LotteWorldTicketBox0421;
import java.util.Scanner;
public class System07Repeat {
	Scanner scanner = new Scanner(System.in);
	
	System07Repeat() {
	}

	int run_System07Repeat(VariableValue variableValue) {
		
		do {
		System.out.printf("티켓을 추가 선택하시겠습니까?\n\t1. 추가 선택\n\t2. 종료 및 결제\n\t ==> ");
		variableValue.setContinueTicketPurchase(scanner.nextInt());
		} while ( ! ( variableValue.getContinueTicketPurchase() == 1 || variableValue.getContinueTicketPurchase() == 2));
		
		return variableValue.getContinueTicketPurchase();
	}
	
	

}
