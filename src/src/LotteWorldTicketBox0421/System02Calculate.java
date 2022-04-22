package LotteWorldTicketBox0421;

import java.util.Calendar;
import java.util.ArrayList;

public class System02Calculate {

	System02Calculate() {
	}
	
	
	//1. PriceList 확정 & system03Input.system02Calculate.system01Input.variablePrint.ticketTypeName
	void priceListArray(VariableValue variableValue, VariablePrint variablePrint) {
		if (variableValue.getInputTicketSelect_place() == 1 && variableValue.getInputTicketSelect_time() == 1) {
			// 종합이용권(롯데월드+민속박물관) 종일권(1DAY)
			variableValue.getPriceList().add(StaticValue.getPriceAll1dayChild()); // 0. 성인_경로
			variableValue.getPriceList().add(StaticValue.getPriceAll1dayAdult()); // 1. 성인
			variableValue.getPriceList().add(StaticValue.getPriceAll1dayJuvenile()); // 2. 청소년
			variableValue.getPriceList().add(StaticValue.getPriceAll1dayChild()); // 3. 어린이
			variableValue.getPriceList().add(StaticValue.getPriceAll1dayBabyFreepass()); // 4. 베이비 (자유이용권-유료)
			variableValue.getPriceList().add(StaticValue.getPriceAll1dayBabyEnterance()); // 5. 베이비 (입장권-무료)
			variableValue.getPriceList().add(StaticValue.getPriceAll1dayNewborn()); // 6. 뉴본 (무료)
			variablePrint.setTicketTypeName(StaticValue.getTicketTypeNameAll1day()); // 티켓이름(프린트용)
		} if (variableValue.getInputTicketSelect_place() == 1 && variableValue.getInputTicketSelect_time() == 2) {
			// 종합이용권(롯데월드+민속박물관) 오후권(AFTER4)
			variableValue.getPriceList().add(StaticValue.getPriceAllAfter4Child()); // 0. 성인_경로
			variableValue.getPriceList().add(StaticValue.getPriceAllAfter4Adult()); // 1. 성인
			variableValue.getPriceList().add(StaticValue.getPriceAllAfter4Juvenile()); // 2. 청소년
			variableValue.getPriceList().add(StaticValue.getPriceAllAfter4Child()); // 3. 어린이
			variableValue.getPriceList().add(StaticValue.getPriceAllAfter4BabyFreepass()); // 4. 베이비 (자유이용권-유료)
			variableValue.getPriceList().add(StaticValue.getPriceAllAfter4BabyEnterance()); // 5. 베이비 (입장권-무료)
			variableValue.getPriceList().add(StaticValue.getPriceAllAfter4Newborn()); // 6. 뉴본 (무료)
			variablePrint.setTicketTypeName(StaticValue.getTicketTypeNameAllAfter4()); // 티켓이름(프린트용)
		} if (variableValue.getInputTicketSelect_place() == 2 && variableValue.getInputTicketSelect_time() == 1) {
			// 파크이용권(롯데월드) 종일권(1DAY)
			variableValue.getPriceList().add(StaticValue.getPricePark1dayChild()); // 0. 성인_경로
			variableValue.getPriceList().add(StaticValue.getPricePark1dayAdult()); // 1. 성인
			variableValue.getPriceList().add(StaticValue.getPricePark1dayJuvenile()); // 2. 청소년
			variableValue.getPriceList().add(StaticValue.getPricePark1dayChild()); // 3. 어린이
			variableValue.getPriceList().add(StaticValue.getPricePark1dayBabyFreepass()); // 4. 베이비 (자유이용권-유료)
			variableValue.getPriceList().add(StaticValue.getPricePark1dayBabyEnterance()); // 5. 베이비 (입장권-무료)
			variableValue.getPriceList().add(StaticValue.getPricePark1dayNewborn()); // 6. 뉴본 (무료)
			variablePrint.setTicketTypeName(StaticValue.getTicketTypeNamePark1day()); // 티켓이름(프린트용)
		} if (variableValue.getInputTicketSelect_place() == 2 && variableValue.getInputTicketSelect_time() == 2) {
			// 파크이용권(롯데월드) 오후권(AFTER4)
			variableValue.getPriceList().add(StaticValue.getPriceParkAfter4Child()); // 0. 성인_경로
			variableValue.getPriceList().add(StaticValue.getPriceParkAfter4Adult()); // 1. 성인
			variableValue.getPriceList().add(StaticValue.getPriceParkAfter4Juvenile()); // 2. 청소년
			variableValue.getPriceList().add(StaticValue.getPriceParkAfter4Child()); // 3. 어린이
			variableValue.getPriceList().add(StaticValue.getPriceParkAfter4BabyFreepass()); // 4. 베이비 (자유이용권-유료)
			variableValue.getPriceList().add(StaticValue.getPriceParkAfter4BabyEnterance()); // 5. 베이비 (입장권-무료)
			variableValue.getPriceList().add(StaticValue.getPriceParkAfter4Newborn()); // 6. 뉴본 (무료)
			variablePrint.setTicketTypeName(StaticValue.getTicketTypeNameParkAfter4()); // 티켓이름(프린트용)
		}
		
	}
	
	//2. 나이 계산
	int ageCalculation(VariableValue variableValue) {
		Calendar calendar = Calendar.getInstance();
		variableValue.setTodayYear(calendar.get(Calendar.YEAR));
		variableValue.setTodayMonth(calendar.get(Calendar.MONTH)+1);
		variableValue.setTodayDay(calendar.get(Calendar.DAY_OF_MONTH));
		int userBirthMonth;
		int userBirthDay;
		
		variableValue.setBirthYearIndex(variableValue.getSocialID()[6]-48);
		if ( variableValue.getBirthYearIndex() == StaticValue.getIndexMaleOld() || variableValue.getBirthYearIndex() == StaticValue.getIndexFemaleOld() ) {
			variableValue.setUserBirthYear((variableValue.getSocialID()[0]-48)*10 + (variableValue.getSocialID()[1]-48) + StaticValue.getBirthYearAddOld());
		} else if ( variableValue.getBirthYearIndex() == StaticValue.getIndexMaleNew() || variableValue.getBirthYearIndex() == StaticValue.getIndexFemaleNew() ) {
			variableValue.setUserBirthYear((variableValue.getSocialID()[0]-48)*10 + (variableValue.getSocialID()[1]-48) + StaticValue.getBirthYearAddNew());
		}
		userBirthMonth = (variableValue.getSocialID()[2]-48)*10 + (variableValue.getSocialID()[3]-48);
		userBirthDay = (variableValue.getSocialID()[4]-48)*10 + (variableValue.getSocialID()[5]-48);
	
		if (userBirthMonth < variableValue.getTodayMonth() || (userBirthMonth == variableValue.getTodayMonth() && userBirthDay <= variableValue.getTodayDay())) {
			variableValue.setUserAge(variableValue.getTodayYear() - variableValue.getUserBirthYear());
		} else {
			variableValue.setUserAge(variableValue.getTodayYear() - variableValue.getUserBirthYear() - 1);
		}
		
		return variableValue.getUserAge();
	}
	
}