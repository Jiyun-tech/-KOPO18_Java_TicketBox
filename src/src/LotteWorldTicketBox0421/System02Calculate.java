package LotteWorldTicketBox0421;

import java.util.Calendar;
import java.util.ArrayList;

public class System02Calculate {

	System02Calculate() {
	}
	
	
	//1. PriceList Ȯ�� & system03Input.system02Calculate.system01Input.variablePrint.ticketTypeName
	void priceListArray(VariableValue variableValue, VariablePrint variablePrint) {
		if (variableValue.getInputTicketSelect_place() == 1 && variableValue.getInputTicketSelect_time() == 1) {
			// �����̿��(�Ե�����+�μӹڹ���) ���ϱ�(1DAY)
			variableValue.getPriceList().add(StaticValue.PRICE_ALL_1DAY_CHILD); // 0. ����_���
			variableValue.getPriceList().add(StaticValue.PRICE_ALL_1DAY_ADULT); // 1. ����
			variableValue.getPriceList().add(StaticValue.PRICE_ALL_1DAY_JUVENILE); // 2. û�ҳ�
			variableValue.getPriceList().add(StaticValue.PRICE_ALL_1DAY_CHILD); // 3. ���
			variableValue.getPriceList().add(StaticValue.PRICE_ALL_1DAY_BABY_FREEPASS); // 4. ���̺� (�����̿��-����)
			variableValue.getPriceList().add(StaticValue.PRICE_ALL_1DAY_BABY_ENTERANCE); // 5. ���̺� (�����-����)
			variableValue.getPriceList().add(StaticValue.PRICE_ALL_1DAY_NEWBORN); // 6. ���� (����)
			variablePrint.setTicketTypeName(StaticValue.TICKET_TYPE_NAME_ALL_1DAY); // Ƽ���̸�(����Ʈ��)
		} if (variableValue.getInputTicketSelect_place() == 1 && variableValue.getInputTicketSelect_time() == 2) {
			// �����̿��(�Ե�����+�μӹڹ���) ���ı�(AFTER4)
			variableValue.getPriceList().add(StaticValue.PRICE_ALL_AFTER4_CHILD); // 0. ����_���
			variableValue.getPriceList().add(StaticValue.PRICE_ALL_AFTER4_ADULT); // 1. ����
			variableValue.getPriceList().add(StaticValue.PRICE_ALL_AFTER4_JUVENILE); // 2. û�ҳ�
			variableValue.getPriceList().add(StaticValue.PRICE_ALL_AFTER4_CHILD); // 3. ���
			variableValue.getPriceList().add(StaticValue.PRICE_ALL_AFTER4_BABY_FREEPASS); // 4. ���̺� (�����̿��-����)
			variableValue.getPriceList().add(StaticValue.PRICE_ALL_AFTER4_BABY_ENTERANCE); // 5. ���̺� (�����-����)
			variableValue.getPriceList().add(StaticValue.PRICE_ALL_AFTER4_NEWBORN); // 6. ���� (����)
			variablePrint.setTicketTypeName(StaticValue.TICKET_TYPE_NAME_ALL_AFTER4); // Ƽ���̸�(����Ʈ��)
		} if (variableValue.getInputTicketSelect_place() == 2 && variableValue.getInputTicketSelect_time() == 1) {
			// ��ũ�̿��(�Ե�����) ���ϱ�(1DAY)
			variableValue.getPriceList().add(StaticValue.PRICE_PARK_1DAY_CHILD); // 0. ����_���
			variableValue.getPriceList().add(StaticValue.PRICE_PARK_1DAY_ADULT); // 1. ����
			variableValue.getPriceList().add(StaticValue.PRICE_PARK_1DAY_JUVENILE); // 2. û�ҳ�
			variableValue.getPriceList().add(StaticValue.PRICE_PARK_1DAY_CHILD); // 3. ���
			variableValue.getPriceList().add(StaticValue.PRICE_PARK_1DAY_BABY_FREEPASS); // 4. ���̺� (�����̿��-����)
			variableValue.priceList.add(StaticValue.PRICE_PARK_1DAY_BABY_ENTERANCE); // 5. ���̺� (�����-����)
			variableValue.priceList.add(StaticValue.PRICE_PARK_1DAY_NEWBORN); // 6. ���� (����)
			variablePrint.setTicketTypeName(StaticValue.TICKET_TYPE_NAME_PARK_1DAY); // Ƽ���̸�(����Ʈ��)
		} if (variableValue.getInputTicketSelect_place() == 2 && variableValue.getInputTicketSelect_time() == 2) {
			// ��ũ�̿��(�Ե�����) ���ı�(AFTER4)
			variableValue.priceList.add(StaticValue.PRICE_PARK_AFTER4_CHILD); // 0. ����_���
			variableValue.priceList.add(StaticValue.PRICE_PARK_AFTER4_ADULT); // 1. ����
			variableValue.priceList.add(StaticValue.PRICE_PARK_AFTER4_JUVENILE); // 2. û�ҳ�
			variableValue.priceList.add(StaticValue.PRICE_PARK_AFTER4_CHILD); // 3. ���
			variableValue.priceList.add(StaticValue.PRICE_PARK_AFTER4_BABY_FREEPASS); // 4. ���̺� (�����̿��-����)
			variableValue.priceList.add(StaticValue.PRICE_PARK_AFTER4_BABY_ENTERANCE); // 5. ���̺� (�����-����)
			variableValue.priceList.add(StaticValue.PRICE_PARK_AFTER4_NEWBORN); // 6. ���� (����)
			variablePrint.setTicketTypeName(StaticValue.TICKET_TYPE_NAME_PARK_AFTER4); // Ƽ���̸�(����Ʈ��)
		}
		
	}
	
	//2. ���� ���
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