package LotteWorldTicketBox0421;

public class System00HereWeGo {
	
	System00HereWeGo (){
	}
	
	System01Input system01Input = new System01Input();
//	System00HereWeGo (System01Input system01Input) {
//		this.system01Input = system01Input;
//	}
	
	System02Calculate system02Calculate = new System02Calculate();
//	System00HereWeGo (System02Calculate system02Calculate) {
//		this.system02Calculate = system02Calculate;
//	}
	
	System03Input system03Input = new System03Input();
//	System00HereWeGo (System03Input system03Input) {
//		this.system03Input = system03Input;
//	}
	
	System04Calculate system04Calculate = new System04Calculate();
//	System00HereWeGo (System04Calculate system04Calculate) {
//		this.system04Calculate = system04Calculate;
//	}
	
	System05ArrayListInput system05ArrayListInput = new System05ArrayListInput();
//	System00HereWeGo (System05ArrayListInput system05ArrayListInput) {
//		this.system05ArrayListInput = system05ArrayListInput;
//	}
	
	System06Print system06Print = new System06Print();
//	System00HereWeGo (System06Print system06Print) {
//		this.system06Print = system06Print;
//	}
	
	System07Repeat system07Repeat = new System07Repeat();
//	System00HereWeGo (System07Repeat system07Repeat) {
//		this.system07Repeat = system07Repeat;
//	}
	
	void runTheSystem() {
		
		do {
			system01Input.run_System01Input();
			
			system02Calculate.priceListArray(system01Input.variableValue, system01Input.variablePrint);
			system02Calculate.ageCalculation(system01Input.variableValue);
			
			system03Input.inputTicketSelect_Baby(system01Input.variableValue);
			system03Input.inputBenefit(system01Input.variableValue);
			
			system04Calculate.ticketPrice(system01Input.variableValue, system01Input.variablePrint);
			system04Calculate.totalTicketPrice(system01Input.variablePrint);
			system04Calculate.benefitType(system01Input.variableValue, system01Input.variablePrint);
			system04Calculate.benefitAmountPerTicket(system01Input.variablePrint);
			system04Calculate.discountedTicketPrice(system01Input.variablePrint);
			system04Calculate.finalTicketPrice(system01Input.variablePrint);
			system04Calculate.accumulatedTicketNumber(system01Input, system01Input.variablePrint);
			system04Calculate.accumulatedFinalPrice(system01Input, system01Input.variablePrint);
			
			system05ArrayListInput.run_ArrayListInput(system01Input, system01Input.variablePrint);
			
			system06Print.run_printTicket(system01Input);
			system07Repeat.run_System07Repeat(system01Input.variableValue);
			
		} while (system01Input.variableValue.getContinueTicketPurchase() == 1 );
		
		system06Print.run_printTicketFinal();
		system06Print.run_printTicket(system01Input);
	}

}
