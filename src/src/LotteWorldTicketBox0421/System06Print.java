package LotteWorldTicketBox0421;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class System06Print {
	
	System06Print() {
	}
	
	void run_printTicket(System01Input system01Input) {
		System.out.printf("\n****************************************\n");
		System.out.printf("%20s%15s%10s%10s%10s%15s%10s%10s%10s%10s\n","티켓 종류","나이","티켓 가격","티켓 수량","총 가격","우대 사항","우대 할인액","우대 수량","우대 총액","최종 가격");
		for (int index = 0; index < system01Input.OrderDataList.size(); index++) {
			// (1) 티켓 종류 출력 
			System.out.printf("%20s",system01Input.OrderDataList.get(index).getTicketTypeName());
			// (2) 나이 그룹 출력
			System.out.printf("%15s",system01Input.OrderDataList.get(index).getAgeTypeName());
			// (3) 티켓 가격 출력 
			System.out.printf("%10d",system01Input.OrderDataList.get(index).getTicketPrice());
			// (4) 티켓 수량 출력 
			System.out.printf("%10d",system01Input.OrderDataList.get(index).getInputNumberOfTicket());
			// (5) 티켓 토탈 가격 (가격 x 수량) 출력 
			System.out.printf("%10d",system01Input.OrderDataList.get(index).getTotalTicketPrice());
			// (6) 우대사항 출력 
			System.out.printf("%15s",system01Input.OrderDataList.get(index).getBenefitType());	
			// (7) 우대 금액 출력 
			System.out.printf("%15d",system01Input.OrderDataList.get(index).getBenefitAmountPerTicket());	
			// (8) 우대 가격 적용 수량 출력 
			System.out.printf("%10d",system01Input.OrderDataList.get(index).getBenefitAppliedTicketNumber());	
			// (9) 총 할인 금액 출력 (우대 금액 x 우대 적용 수량)
			System.out.printf("%15d",system01Input.OrderDataList.get(index).getDiscountedTicketPrice());	
			// (10) 최종 가격 출력 
			System.out.printf("%10d\n",system01Input.OrderDataList.get(index).getFinalTicketPrice());	
		}
		System.out.printf("****************************************\n");
		// (11) 누적 티켓 수량 출력 (총 결제 수량)
		System.out.printf("총 수량 : %d 개\n", system01Input.OrderDataList.get(system01Input.OrderDataList.size()-1).getAccumulatedTicketNumber());
		// (12) 누적 티켓 금액 출력 (총 결제 금액)
		System.out.printf("총 금액 : %d 원\n", system01Input.OrderDataList.get(system01Input.OrderDataList.size()-1).getAccumulatedFinalPrice());
		System.out.printf("****************************************\n");
	}
	
	void run_printTicketFinal() {
		System.out.printf("\n****************************************\n");
		System.out.printf("%20s", "최종 선택 내역");
	}
	
	
	// 판매 데이터 출력 (.csv file format) => ing....
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
