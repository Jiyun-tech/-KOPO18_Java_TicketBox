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
			variableValue.getPriceList().add(StaticValue.getPriceAll1dayChild()); // 0. ����_���
			variableValue.getPriceList().add(StaticValue.getPriceAll1dayAdult()); // 1. ����
			variableValue.getPriceList().add(StaticValue.getPriceAll1dayJuvenile()); // 2. û�ҳ�
			variableValue.getPriceList().add(StaticValue.getPriceAll1dayChild()); // 3. ���
			variableValue.getPriceList().add(StaticValue.getPriceAll1dayBabyFreepass()); // 4. ���̺� (�����̿��-����)
			variableValue.getPriceList().add(StaticValue.getPriceAll1dayBabyEnterance()); // 5. ���̺� (�����-����)
			variableValue.getPriceList().add(StaticValue.getPriceAll1dayNewborn()); // 6. ���� (����)
			variablePrint.setTicketTypeName(StaticValue.getTicketTypeNameAll1day()); // Ƽ���̸�(����Ʈ��)
		} if (variableValue.getInputTicketSelect_place() == 1 && variableValue.getInputTicketSelect_time() == 2) {
			// �����̿��(�Ե�����+�μӹڹ���) ���ı�(AFTER4)
			variableValue.getPriceList().add(StaticValue.getPriceAllAfter4Child()); // 0. ����_���
			variableValue.getPriceList().add(StaticValue.getPriceAllAfter4Adult()); // 1. ����
			variableValue.getPriceList().add(StaticValue.getPriceAllAfter4Juvenile()); // 2. û�ҳ�
			variableValue.getPriceList().add(StaticValue.getPriceAllAfter4Child()); // 3. ���
			variableValue.getPriceList().add(StaticValue.getPriceAllAfter4BabyFreepass()); // 4. ���̺� (�����̿��-����)
			variableValue.getPriceList().add(StaticValue.getPriceAllAfter4BabyEnterance()); // 5. ���̺� (�����-����)
			variableValue.getPriceList().add(StaticValue.getPriceAllAfter4Newborn()); // 6. ���� (����)
			variablePrint.setTicketTypeName(StaticValue.getTicketTypeNameAllAfter4()); // Ƽ���̸�(����Ʈ��)
		} if (variableValue.getInputTicketSelect_place() == 2 && variableValue.getInputTicketSelect_time() == 1) {
			// ��ũ�̿��(�Ե�����) ���ϱ�(1DAY)
			variableValue.getPriceList().add(StaticValue.getPricePark1dayChild()); // 0. ����_���
			variableValue.getPriceList().add(StaticValue.getPricePark1dayAdult()); // 1. ����
			variableValue.getPriceList().add(StaticValue.getPricePark1dayJuvenile()); // 2. û�ҳ�
			variableValue.getPriceList().add(StaticValue.getPricePark1dayChild()); // 3. ���
			variableValue.getPriceList().add(StaticValue.getPricePark1dayBabyFreepass()); // 4. ���̺� (�����̿��-����)
			variableValue.getPriceList().add(StaticValue.getPricePark1dayBabyEnterance()); // 5. ���̺� (�����-����)
			variableValue.getPriceList().add(StaticValue.getPricePark1dayNewborn()); // 6. ���� (����)
			variablePrint.setTicketTypeName(StaticValue.getTicketTypeNamePark1day()); // Ƽ���̸�(����Ʈ��)
		} if (variableValue.getInputTicketSelect_place() == 2 && variableValue.getInputTicketSelect_time() == 2) {
			// ��ũ�̿��(�Ե�����) ���ı�(AFTER4)
			variableValue.getPriceList().add(StaticValue.getPriceParkAfter4Child()); // 0. ����_���
			variableValue.getPriceList().add(StaticValue.getPriceParkAfter4Adult()); // 1. ����
			variableValue.getPriceList().add(StaticValue.getPriceParkAfter4Juvenile()); // 2. û�ҳ�
			variableValue.getPriceList().add(StaticValue.getPriceParkAfter4Child()); // 3. ���
			variableValue.getPriceList().add(StaticValue.getPriceParkAfter4BabyFreepass()); // 4. ���̺� (�����̿��-����)
			variableValue.getPriceList().add(StaticValue.getPriceParkAfter4BabyEnterance()); // 5. ���̺� (�����-����)
			variableValue.getPriceList().add(StaticValue.getPriceParkAfter4Newborn()); // 6. ���� (����)
			variablePrint.setTicketTypeName(StaticValue.getTicketTypeNameParkAfter4()); // Ƽ���̸�(����Ʈ��)
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