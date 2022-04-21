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
			variableValue.getPriceList().add(StaticValue.PRICE_ALL_1DAY_CHILD); // 0. 성인_경로
			variableValue.getPriceList().add(StaticValue.PRICE_ALL_1DAY_ADULT); // 1. 성인
			variableValue.getPriceList().add(StaticValue.PRICE_ALL_1DAY_JUVENILE); // 2. 청소년
			variableValue.getPriceList().add(StaticValue.PRICE_ALL_1DAY_CHILD); // 3. 어린이
			variableValue.getPriceList().add(StaticValue.PRICE_ALL_1DAY_BABY_FREEPASS); // 4. 베이비 (자유이용권-유료)
			variableValue.getPriceList().add(StaticValue.PRICE_ALL_1DAY_BABY_ENTERANCE); // 5. 베이비 (입장권-무료)
			variableValue.getPriceList().add(StaticValue.PRICE_ALL_1DAY_NEWBORN); // 6. 뉴본 (무료)
			variablePrint.setTicketTypeName(StaticValue.TICKET_TYPE_NAME_ALL_1DAY); // 티켓이름(프린트용)
		} if (variableValue.getInputTicketSelect_place() == 1 && variableValue.getInputTicketSelect_time() == 2) {
			// 종합이용권(롯데월드+민속박물관) 오후권(AFTER4)
			variableValue.getPriceList().add(StaticValue.PRICE_ALL_AFTER4_CHILD); // 0. 성인_경로
			variableValue.getPriceList().add(StaticValue.PRICE_ALL_AFTER4_ADULT); // 1. 성인
			variableValue.getPriceList().add(StaticValue.PRICE_ALL_AFTER4_JUVENILE); // 2. 청소년
			variableValue.getPriceList().add(StaticValue.PRICE_ALL_AFTER4_CHILD); // 3. 어린이
			variableValue.getPriceList().add(StaticValue.PRICE_ALL_AFTER4_BABY_FREEPASS); // 4. 베이비 (자유이용권-유료)
			variableValue.getPriceList().add(StaticValue.PRICE_ALL_AFTER4_BABY_ENTERANCE); // 5. 베이비 (입장권-무료)
			variableValue.getPriceList().add(StaticValue.PRICE_ALL_AFTER4_NEWBORN); // 6. 뉴본 (무료)
			variablePrint.setTicketTypeName(StaticValue.TICKET_TYPE_NAME_ALL_AFTER4); // 티켓이름(프린트용)
		} if (variableValue.getInputTicketSelect_place() == 2 && variableValue.getInputTicketSelect_time() == 1) {
			// 파크이용권(롯데월드) 종일권(1DAY)
			variableValue.getPriceList().add(StaticValue.PRICE_PARK_1DAY_CHILD); // 0. 성인_경로
			variableValue.getPriceList().add(StaticValue.PRICE_PARK_1DAY_ADULT); // 1. 성인
			variableValue.getPriceList().add(StaticValue.PRICE_PARK_1DAY_JUVENILE); // 2. 청소년
			variableValue.getPriceList().add(StaticValue.PRICE_PARK_1DAY_CHILD); // 3. 어린이
			variableValue.getPriceList().add(StaticValue.PRICE_PARK_1DAY_BABY_FREEPASS); // 4. 베이비 (자유이용권-유료)
			variableValue.priceList.add(StaticValue.PRICE_PARK_1DAY_BABY_ENTERANCE); // 5. 베이비 (입장권-무료)
			variableValue.priceList.add(StaticValue.PRICE_PARK_1DAY_NEWBORN); // 6. 뉴본 (무료)
			variablePrint.setTicketTypeName(StaticValue.TICKET_TYPE_NAME_PARK_1DAY); // 티켓이름(프린트용)
		} if (variableValue.getInputTicketSelect_place() == 2 && variableValue.getInputTicketSelect_time() == 2) {
			// 파크이용권(롯데월드) 오후권(AFTER4)
			variableValue.priceList.add(StaticValue.PRICE_PARK_AFTER4_CHILD); // 0. 성인_경로
			variableValue.priceList.add(StaticValue.PRICE_PARK_AFTER4_ADULT); // 1. 성인
			variableValue.priceList.add(StaticValue.PRICE_PARK_AFTER4_JUVENILE); // 2. 청소년
			variableValue.priceList.add(StaticValue.PRICE_PARK_AFTER4_CHILD); // 3. 어린이
			variableValue.priceList.add(StaticValue.PRICE_PARK_AFTER4_BABY_FREEPASS); // 4. 베이비 (자유이용권-유료)
			variableValue.priceList.add(StaticValue.PRICE_PARK_AFTER4_BABY_ENTERANCE); // 5. 베이비 (입장권-무료)
			variableValue.priceList.add(StaticValue.PRICE_PARK_AFTER4_NEWBORN); // 6. 뉴본 (무료)
			variablePrint.setTicketTypeName(StaticValue.TICKET_TYPE_NAME_PARK_AFTER4); // 티켓이름(프린트용)
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
		if ( variableValue.getBirthYearIndex() == StaticValue.INDEX_MALE_OLD || variableValue.getBirthYearIndex() == StaticValue.INDEX_FEMALE_OLD ) {
			variableValue.setUserBirthYear((variableValue.getSocialID()[0]-48)*10 + (variableValue.getSocialID()[1]-48) + StaticValue.BIRTH_YEAR_ADD_OLD);
		} else if ( variableValue.getBirthYearIndex() == StaticValue.INDEX_MALE_NEW || variableValue.getBirthYearIndex() == StaticValue.INDEX_FEMALE_NEW ) {
			variableValue.setUserBirthYear((variableValue.getSocialID()[0]-48)*10 + (variableValue.getSocialID()[1]-48) + StaticValue.BIRTH_YEAR_ADD_NEW);
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