package LotteWorldTicketBox0421;

public class StaticValue {
	
	// �̿�� ���� �̸�
	private final static String TICKET_TYPE_NAME_ALL_1DAY= "�����̿�� - ���ϱ�(1DAY)";
	private final static String TICKET_TYPE_NAME_ALL_AFTER4 = "�����̿�� - ���ı�(AFTER4)";
	private final static String TICKET_TYPE_NAME_PARK_1DAY = "��ũ�̿�� - ���ϱ�(1DAY)";
	private final static String TICKET_TYPE_NAME_PARK_AFTER4 = "��ũ�̿�� - ���ı�(AFTER4)";
	
	// ���� �׷�
	private final static String AGE_TYPE_NAME_ELDER = "����(���)"; 
	private final static String AGE_TYPE_NAME_ADULT = "����"; 
	private final static String AGE_TYPE_NAME_JUVENILE = "û�ҳ�"; 
	private final static String AGE_TYPE_NAME_CHILD = "���"; 
	private final static String AGE_TYPE_NAME_BABY_FREEPASS = "���̺�(�����̿��)";
	private final static String AGE_TYPE_NAME_BABY_ENTERANCE = "���̺�(��������)"; 
	private final static String AGE_TYPE_NAME_NEWBORN = "�Ż���(��������)";
	
	// ������ ���� 
	private final static String BENEFIT_TYPE_NAME_NON = "*������ ����"; 
	private final static String BENEFIT_TYPE_NAME_DISABLED = "*����� ���"; 
	private final static String BENEFIT_TYPE_NAME_NATIONAL_MERIT = "*���������� ���"; 
	private final static String BENEFIT_TYPE_NAME_PREGNANT = "*�ӻ�� ���"; 
	private final static String BENEFIT_TYPE_NAME_ARMY = "*�ް��庴 ���"; 
	private final static String BENEFIT_TYPE_NAME_MULTICHILD = "*�ٵ��� �ູī�� ���";
	
	// ��� ��� (1) �����̿�� - ����
	private final static int PRICE_ALL_1DAY_ADULT = 62000; 
	private final static int PRICE_ALL_1DAY_JUVENILE = 54000; 
	private final static int PRICE_ALL_1DAY_CHILD = 47000; 
	private final static int PRICE_ALL_1DAY_BABY_FREEPASS=15000; 
	private final static int PRICE_ALL_1DAY_BABY_ENTERANCE=0;
	private final static int PRICE_ALL_1DAY_NEWBORN = 0;
	
	// ��� ��� (2) �����̿�� - ����
	private final static int PRICE_ALL_AFTER4_ADULT = 50000; 
	private final static int PRICE_ALL_AFTER4_JUVENILE = 43000; 
	private final static int PRICE_ALL_AFTER4_CHILD = 36000; 
	private final static int PRICE_ALL_AFTER4_BABY_FREEPASS = 15000; 
	private final static int PRICE_ALL_AFTER4_BABY_ENTERANCE = 0;
	private final static int PRICE_ALL_AFTER4_NEWBORN = 0;  
	
	// ��� ��� (3) ��ũ�̿�� - ����
	private final static int PRICE_PARK_1DAY_ADULT = 59000; 
	private final static int PRICE_PARK_1DAY_JUVENILE = 52000; 
	private final static int PRICE_PARK_1DAY_CHILD = 46000; 
	private final static int PRICE_PARK_1DAY_BABY_FREEPASS = 15000; 
	private final static int PRICE_PARK_1DAY_BABY_ENTERANCE = 0;
	private final static int PRICE_PARK_1DAY_NEWBORN = 0;
	
	// ��� ��� (4) ��ũ�̿�� - ����
	private final static int PRICE_PARK_AFTER4_ADULT = 47000; 
	private final static int PRICE_PARK_AFTER4_JUVENILE = 41000; 
	private final static int PRICE_PARK_AFTER4_CHILD = 35000; 
	private final static int PRICE_PARK_AFTER4_BABY_FREEPASS = 15000; 
	private final static int PRICE_PARK_AFTER4_BABY_ENTERANCE = 0;
	private final static int PRICE_PARK_AFTER4_NEWBORN = 0;
	
	// ���� ��� (���� ����)
	private final static int ELDER_AGE_MIN = 65;
	private final static int ADULT_AGE_MAX = 64; 
	private final static int ADULT_AGE_MIN = 19;
	private final static int JUVENILE_AGE_MAX = 18; 
	private final static int JUVERNILE_AGE_MIN = 13;
	private final static int CHILD_AGE_MAX = 12; 
	private final static int CHILD_AGE_MIN = 3;
	private final static int BABY_AGE_MAX = 2; 
	private final static int BABY_AGE_MIN = 1; 
	private final static int NEWBORN_AGE = 0;
	private final static int INDEX_MALE_OLD = 1; 
	private final static int INDEX_FEMALE_OLD = 2; 
	private final static int INDEX_MALE_NEW = 3; 
	private final static int INDEX_FEMALE_NEW = 4; 
	private final static int BIRTH_YEAR_ADD_OLD = 1900; 
	private final static int BIRTH_YEAR_ADD_NEW = 2000;
	
	// ������ - ������ ������
	private final static float BENEFIT_NON = 0.0f; 
	private final static float BENEFIT_DISABLED = 0.5f; 
	private final static float BENEFIT_NATIONAL_MERIT = 0.5f; 
	private final static float BENEFIT_PREGNANT = 0.5f; 
	private final static float BENEFIT_ARMY = 0.49f; 
	private final static float BENEFIT_MULTICHILD = 0.3f;
	
	// ������ - ������ �ִ� ���� ����(���� or ���� or ����+����1��)
	private final static int BENEFIT_NON_MAX = 0; 
	private final static int BENEFIT_DISABLED_MAX = 2; 
	private final static int BENEFIT_NATIONAL_MERIT_MAX = 2; 
	private final static int BENEFIT_PREGNANT_MAX = 1; 
	private final static int BENEFIT_ARMY_MAX = 2; 
	private final static int BENEFIT_MULTICHILD_MAX = 1;
	
	
	public static String getTicketTypeNameAll1day() {
		return TICKET_TYPE_NAME_ALL_1DAY;
	}
	public static String getTicketTypeNameAllAfter4() {
		return TICKET_TYPE_NAME_ALL_AFTER4;
	}
	public static String getTicketTypeNamePark1day() {
		return TICKET_TYPE_NAME_PARK_1DAY;
	}
	public static String getTicketTypeNameParkAfter4() {
		return TICKET_TYPE_NAME_PARK_AFTER4;
	}
	public static String getAgeTypeNameElder() {
		return AGE_TYPE_NAME_ELDER;
	}
	public static String getAgeTypeNameAdult() {
		return AGE_TYPE_NAME_ADULT;
	}
	public static String getAgeTypeNameJuvenile() {
		return AGE_TYPE_NAME_JUVENILE;
	}
	public static String getAgeTypeNameChild() {
		return AGE_TYPE_NAME_CHILD;
	}
	public static String getAgeTypeNameBabyFreepass() {
		return AGE_TYPE_NAME_BABY_FREEPASS;
	}
	public static String getAgeTypeNameBabyEnterance() {
		return AGE_TYPE_NAME_BABY_ENTERANCE;
	}
	public static String getAgeTypeNameNewborn() {
		return AGE_TYPE_NAME_NEWBORN;
	}
	public static String getBenefitTypeNameNon() {
		return BENEFIT_TYPE_NAME_NON;
	}
	public static String getBenefitTypeNameDisabled() {
		return BENEFIT_TYPE_NAME_DISABLED;
	}
	public static String getBenefitTypeNameNationalMerit() {
		return BENEFIT_TYPE_NAME_NATIONAL_MERIT;
	}
	public static String getBenefitTypeNamePregnant() {
		return BENEFIT_TYPE_NAME_PREGNANT;
	}
	public static String getBenefitTypeNameArmy() {
		return BENEFIT_TYPE_NAME_ARMY;
	}
	public static String getBenefitTypeNameMultichild() {
		return BENEFIT_TYPE_NAME_MULTICHILD;
	}
	public static int getPriceAll1dayAdult() {
		return PRICE_ALL_1DAY_ADULT;
	}
	public static int getPriceAll1dayJuvenile() {
		return PRICE_ALL_1DAY_JUVENILE;
	}
	public static int getPriceAll1dayChild() {
		return PRICE_ALL_1DAY_CHILD;
	}
	public static int getPriceAll1dayBabyFreepass() {
		return PRICE_ALL_1DAY_BABY_FREEPASS;
	}
	public static int getPriceAll1dayBabyEnterance() {
		return PRICE_ALL_1DAY_BABY_ENTERANCE;
	}
	public static int getPriceAll1dayNewborn() {
		return PRICE_ALL_1DAY_NEWBORN;
	}
	public static int getPriceAllAfter4Adult() {
		return PRICE_ALL_AFTER4_ADULT;
	}
	public static int getPriceAllAfter4Juvenile() {
		return PRICE_ALL_AFTER4_JUVENILE;
	}
	public static int getPriceAllAfter4Child() {
		return PRICE_ALL_AFTER4_CHILD;
	}
	public static int getPriceAllAfter4BabyFreepass() {
		return PRICE_ALL_AFTER4_BABY_FREEPASS;
	}
	public static int getPriceAllAfter4BabyEnterance() {
		return PRICE_ALL_AFTER4_BABY_ENTERANCE;
	}
	public static int getPriceAllAfter4Newborn() {
		return PRICE_ALL_AFTER4_NEWBORN;
	}
	public static int getPricePark1dayAdult() {
		return PRICE_PARK_1DAY_ADULT;
	}
	public static int getPricePark1dayJuvenile() {
		return PRICE_PARK_1DAY_JUVENILE;
	}
	public static int getPricePark1dayChild() {
		return PRICE_PARK_1DAY_CHILD;
	}
	public static int getPricePark1dayBabyFreepass() {
		return PRICE_PARK_1DAY_BABY_FREEPASS;
	}
	public static int getPricePark1dayBabyEnterance() {
		return PRICE_PARK_1DAY_BABY_ENTERANCE;
	}
	public static int getPricePark1dayNewborn() {
		return PRICE_PARK_1DAY_NEWBORN;
	}
	public static int getPriceParkAfter4Adult() {
		return PRICE_PARK_AFTER4_ADULT;
	}
	public static int getPriceParkAfter4Juvenile() {
		return PRICE_PARK_AFTER4_JUVENILE;
	}
	public static int getPriceParkAfter4Child() {
		return PRICE_PARK_AFTER4_CHILD;
	}
	public static int getPriceParkAfter4BabyFreepass() {
		return PRICE_PARK_AFTER4_BABY_FREEPASS;
	}
	public static int getPriceParkAfter4BabyEnterance() {
		return PRICE_PARK_AFTER4_BABY_ENTERANCE;
	}
	public static int getPriceParkAfter4Newborn() {
		return PRICE_PARK_AFTER4_NEWBORN;
	}
	public static int getElderAgeMin() {
		return ELDER_AGE_MIN;
	}
	public static int getAdultAgeMax() {
		return ADULT_AGE_MAX;
	}
	public static int getAdultAgeMin() {
		return ADULT_AGE_MIN;
	}
	public static int getJuvenileAgeMax() {
		return JUVENILE_AGE_MAX;
	}
	public static int getJuvernileAgeMin() {
		return JUVERNILE_AGE_MIN;
	}
	public static int getChildAgeMax() {
		return CHILD_AGE_MAX;
	}
	public static int getChildAgeMin() {
		return CHILD_AGE_MIN;
	}
	public static int getBabyAgeMax() {
		return BABY_AGE_MAX;
	}
	public static int getBabyAgeMin() {
		return BABY_AGE_MIN;
	}
	public static int getNewbornAge() {
		return NEWBORN_AGE;
	}
	public static int getIndexMaleOld() {
		return INDEX_MALE_OLD;
	}
	public static int getIndexFemaleOld() {
		return INDEX_FEMALE_OLD;
	}
	public static int getIndexMaleNew() {
		return INDEX_MALE_NEW;
	}
	public static int getIndexFemaleNew() {
		return INDEX_FEMALE_NEW;
	}
	public static int getBirthYearAddOld() {
		return BIRTH_YEAR_ADD_OLD;
	}
	public static int getBirthYearAddNew() {
		return BIRTH_YEAR_ADD_NEW;
	}
	public static float getBenefitNon() {
		return BENEFIT_NON;
	}
	public static float getBenefitDisabled() {
		return BENEFIT_DISABLED;
	}
	public static float getBenefitNationalMerit() {
		return BENEFIT_NATIONAL_MERIT;
	}
	public static float getBenefitPregnant() {
		return BENEFIT_PREGNANT;
	}
	public static float getBenefitArmy() {
		return BENEFIT_ARMY;
	}
	public static float getBenefitMultichild() {
		return BENEFIT_MULTICHILD;
	}
	public static int getBenefitNonMax() {
		return BENEFIT_NON_MAX;
	}
	public static int getBenefitDisabledMax() {
		return BENEFIT_DISABLED_MAX;
	}
	public static int getBenefitNationalMeritMax() {
		return BENEFIT_NATIONAL_MERIT_MAX;
	}
	public static int getBenefitPregnantMax() {
		return BENEFIT_PREGNANT_MAX;
	}
	public static int getBenefitArmyMax() {
		return BENEFIT_ARMY_MAX;
	}
	public static int getBenefitMultichildMax() {
		return BENEFIT_MULTICHILD_MAX;
	}

}
