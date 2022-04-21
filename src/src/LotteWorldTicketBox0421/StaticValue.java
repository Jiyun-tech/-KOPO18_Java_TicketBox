package LotteWorldTicketBox0421;

public class StaticValue {
	
	// �̿�� ���� �̸�
	public final static String TICKET_TYPE_NAME_ALL_1DAY= "�����̿�� - ���ϱ�(1DAY)";
	public final static String TICKET_TYPE_NAME_ALL_AFTER4 = "�����̿�� - ���ı�(AFTER4)";
	public final static String TICKET_TYPE_NAME_PARK_1DAY = "��ũ�̿�� - ���ϱ�(1DAY)";
	public final static String TICKET_TYPE_NAME_PARK_AFTER4 = "��ũ�̿�� - ���ı�(AFTER4)";
	
	// ���� �׷�
	public final static String AGE_TYPE_NAME_ELDER = "����(���)"; 
	public final static String AGE_TYPE_NAME_ADULT = "����"; 
	public final static String AGE_TYPE_NAME_JUVENILE = "û�ҳ�"; 
	public final static String AGE_TYPE_NAME_CHILD = "���"; 
	public final static String AGE_TYPE_NAME_BABY_FREEPASS = "���̺�(�����̿��)";
	public final static String AGE_TYPE_NAME_BABY_ENTERANCE = "���̺�(��������)"; 
	public final static String AGE_TYPE_NAME_NEWBORN = "�Ż���(��������)";
	
	// ������ ���� 
	public final static String BENEFIT_TYPE_NAME_NON = "*������ ����"; 
	public final static String BENEFIT_TYPE_NAME_DISABLED = "*����� ���"; 
	public final static String BENEFIT_TYPE_NAME_NATIONAL_MERIT = "*���������� ���"; 
	public final static String BENEFIT_TYPE_NAME_PREGNANT = "*�ӻ�� ���"; 
	public final static String BENEFIT_TYPE_NAME_ARMY = "*�ް��庴 ���"; 
	public final static String BENEFIT_TYPE_NAME_MULTICHILD = "*�ٵ��� �ູī�� ���";
	
	// ��� ��� (1) �����̿�� - ����
	public final static int PRICE_ALL_1DAY_ADULT = 62000; 
	public final static int PRICE_ALL_1DAY_JUVENILE = 54000; 
	public final static int PRICE_ALL_1DAY_CHILD = 47000; 
	public final static int PRICE_ALL_1DAY_BABY_FREEPASS=15000; 
	public final static int PRICE_ALL_1DAY_BABY_ENTERANCE=0;
	public final static int PRICE_ALL_1DAY_NEWBORN = 0;
	
	// ��� ��� (2) �����̿�� - ����
	public final static int PRICE_ALL_AFTER4_ADULT = 50000; 
	public final static int PRICE_ALL_AFTER4_JUVENILE = 43000; 
	public final static int PRICE_ALL_AFTER4_CHILD = 36000; 
	public final static int PRICE_ALL_AFTER4_BABY_FREEPASS = 15000; 
	public final static int PRICE_ALL_AFTER4_BABY_ENTERANCE = 0;
	public final static int PRICE_ALL_AFTER4_NEWBORN = 0;  
	
	// ��� ��� (3) ��ũ�̿�� - ����
	public final static int PRICE_PARK_1DAY_ADULT = 59000; 
	public final static int PRICE_PARK_1DAY_JUVENILE = 52000; 
	public final static int PRICE_PARK_1DAY_CHILD = 46000; 
	public final static int PRICE_PARK_1DAY_BABY_FREEPASS = 15000; 
	public final static int PRICE_PARK_1DAY_BABY_ENTERANCE = 0;
	public final static int PRICE_PARK_1DAY_NEWBORN = 0;
	
	// ��� ��� (4) ��ũ�̿�� - ����
	public final static int PRICE_PARK_AFTER4_ADULT = 47000; 
	public final static int PRICE_PARK_AFTER4_JUVENILE = 41000; 
	public final static int PRICE_PARK_AFTER4_CHILD = 35000; 
	public final static int PRICE_PARK_AFTER4_BABY_FREEPASS = 15000; 
	public final static int PRICE_PARK_AFTER4_BABY_ENTERANCE = 0;
	public final static int PRICE_PARK_AFTER4_NEWBORN = 0;
	
	// ���� ��� (���� ����)
	public final static int ELDER_AGE_MIN = 65;
	public final static int ADULT_AGE_MAX = 64; 
	public final static int ADULT_AGE_MIN = 19;
	public final static int JUVENILE_AGE_MAX = 18; 
	public final static int JUVERNILE_AGE_MIN = 13;
	public final static int CHILD_AGE_MAX = 12; 
	public final static int CHILD_AGE_MIN = 3;
	public final static int BABY_AGE_MAX = 2; 
	public final static int BABY_AGE_MIN = 1; 
	public final static int NEWBORN_AGE = 0;
	public final static int INDEX_MALE_OLD = 1; 
	public final static int INDEX_FEMALE_OLD = 2; 
	public final static int INDEX_MALE_NEW = 3; 
	public final static int INDEX_FEMALE_NEW = 4; 
	public final static int BIRTH_YEAR_ADD_OLD = 1900; 
	public final static int BIRTH_YEAR_ADD_NEW = 2000;
	
	// ������ - ������ ������
	public final static float BENEFIT_NON = 0.0f; 
	public final static float BENEFIT_DISABLED = 0.5f; 
	public final static float BENEFIT_NATIONAL_MERIT = 0.5f; 
	public final static float BENEFIT_PREGNANT = 0.5f; 
	public final static float BENEFIT_ARMY = 0.49f; 
	public final static float BENEFIT_MULTICHILD = 0.3f;
	
	// ������ - ������ �ִ� ���� ����(���� or ���� or ����+����1��)
	public final static int BENEFIT_NON_MAX = 0; 
	public final static int BENEFIT_DISABLED_MAX = 2; 
	public final static int BENEFIT_NATIONAL_MERIT_MAX = 2; 
	public final static int BENEFIT_PREGNANT_MAX = 1; 
	public final static int BENEFIT_ARMY_MAX = 2; 
	public final static int BENEFIT_MULTICHILD_MAX = 1;

}
