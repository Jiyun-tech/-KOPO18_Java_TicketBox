package LotteWorldTicketBox0421;
import java.util.Scanner;
public class System07Repeat {
	Scanner scanner = new Scanner(System.in);
	
	System07Repeat() {
	}

	int run_System07Repeat(VariableValue variableValue) {
		
		do {
		System.out.printf("Ƽ���� �߰� �����Ͻðڽ��ϱ�?\n\t1. �߰� ����\n\t2. ���� �� ����\n\t ==> ");
		variableValue.setContinueTicketPurchase(scanner.nextInt());
		} while ( ! ( variableValue.getContinueTicketPurchase() == 1 || variableValue.getContinueTicketPurchase() == 2));
		
		return variableValue.getContinueTicketPurchase();
	}
	
	

}
