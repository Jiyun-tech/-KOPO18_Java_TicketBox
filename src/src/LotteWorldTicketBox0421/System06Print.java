package LotteWorldTicketBox0421;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class System06Print {
	
	System06Print() {
	}
	
	void run_printTicket(System01Input system01Input) {
		System.out.printf("\n****************************************\n");
		System.out.printf("%20s%15s%10s%10s%10s%15s%10s%10s%10s%10s\n","Ƽ�� ����","����","Ƽ�� ����","Ƽ�� ����","�� ����","��� ����","��� ���ξ�","��� ����","��� �Ѿ�","���� ����");
		for (int index = 0; index < system01Input.OrderDataList.size(); index++) {
			// (1) Ƽ�� ���� ��� 
			System.out.printf("%20s",system01Input.OrderDataList.get(index).getTicketTypeName());
			// (2) ���� �׷� ���
			System.out.printf("%15s",system01Input.OrderDataList.get(index).getAgeTypeName());
			// (3) Ƽ�� ���� ��� 
			System.out.printf("%10d",system01Input.OrderDataList.get(index).getTicketPrice());
			// (4) Ƽ�� ���� ��� 
			System.out.printf("%10d",system01Input.OrderDataList.get(index).getInputNumberOfTicket());
			// (5) Ƽ�� ��Ż ���� (���� x ����) ��� 
			System.out.printf("%10d",system01Input.OrderDataList.get(index).getTotalTicketPrice());
			// (6) ������ ��� 
			System.out.printf("%15s",system01Input.OrderDataList.get(index).getBenefitType());	
			// (7) ��� �ݾ� ��� 
			System.out.printf("%15d",system01Input.OrderDataList.get(index).getBenefitAmountPerTicket());	
			// (8) ��� ���� ���� ���� ��� 
			System.out.printf("%10d",system01Input.OrderDataList.get(index).getBenefitAppliedTicketNumber());	
			// (9) �� ���� �ݾ� ��� (��� �ݾ� x ��� ���� ����)
			System.out.printf("%15d",system01Input.OrderDataList.get(index).getDiscountedTicketPrice());	
			// (10) ���� ���� ��� 
			System.out.printf("%10d\n",system01Input.OrderDataList.get(index).getFinalTicketPrice());	
		}
		System.out.printf("****************************************\n");
		// (11) ���� Ƽ�� ���� ��� (�� ���� ����)
		System.out.printf("�� ���� : %d ��\n", system01Input.OrderDataList.get(system01Input.OrderDataList.size()-1).getAccumulatedTicketNumber());
		// (12) ���� Ƽ�� �ݾ� ��� (�� ���� �ݾ�)
		System.out.printf("�� �ݾ� : %d ��\n", system01Input.OrderDataList.get(system01Input.OrderDataList.size()-1).getAccumulatedFinalPrice());
		System.out.printf("****************************************\n");
	}
	
	void run_printTicketFinal() {
		System.out.printf("\n****************************************\n");
		System.out.printf("%20s", "���� ���� ����");
	}
	
	
	// �Ǹ� ������ ��� (.csv file format) => ing....
	void run_writeCSVFile(System01Input system01Input, VariableValue variableValue) {
		
		BufferedWriter dataOut;
		try {
			dataOut = new BufferedWriter(new FileWriter("C:\\Users\\Jiyun Seo\\Desktop\\Git_upload\\KOPO18_Java_TicketBox\\src\\TicketSalesData\\DailyTicketSales.csv", true));
			
				dataOut.write(variableValue.getTodayYear()+ ",");
				dataOut.write(variableValue.getTodayMonth()+ ",");
				dataOut.write(variableValue.getTodayDay() + ",");
				dataOut.write(system01Input.OrderDataList.get(system01Input.OrderDataList.size()-1).getTicketTypeName()+ ",");
				dataOut.write(system01Input.OrderDataList.get(system01Input.OrderDataList.size()-1).getAgeTypeName()+ ",");
				dataOut.write(system01Input.OrderDataList.get(system01Input.OrderDataList.size()-1).getTicketPrice()+ ",");
				dataOut.write(system01Input.OrderDataList.get(system01Input.OrderDataList.size()-1).getInputNumberOfTicket()+ ",");
				dataOut.write(system01Input.OrderDataList.get(system01Input.OrderDataList.size()-1).getTotalTicketPrice()+ ",");
				dataOut.write(system01Input.OrderDataList.get(system01Input.OrderDataList.size()-1).getBenefitType()+ ",");
				dataOut.write(system01Input.OrderDataList.get(system01Input.OrderDataList.size()-1).getBenefitAmountPerTicket()+ ",");
				dataOut.write(system01Input.OrderDataList.get(system01Input.OrderDataList.size()-1).getBenefitAppliedTicketNumber()+ ",");
				dataOut.write(system01Input.OrderDataList.get(system01Input.OrderDataList.size()-1).getDiscountedTicketPrice()+ ",");
				dataOut.write(system01Input.OrderDataList.get(system01Input.OrderDataList.size()-1).getFinalTicketPrice()+ "\n");
				
				dataOut.flush();
				dataOut.close();
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}
}
