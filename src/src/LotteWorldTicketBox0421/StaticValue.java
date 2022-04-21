package LotteWorldTicketBox0421;

public class StaticValue {
	
	// 이용권 종류 이름
	public final static String TICKET_TYPE_NAME_ALL_1DAY= "종합이용권 - 종일권(1DAY)";
	public final static String TICKET_TYPE_NAME_ALL_AFTER4 = "종합이용권 - 오후권(AFTER4)";
	public final static String TICKET_TYPE_NAME_PARK_1DAY = "파크이용권 - 종일권(1DAY)";
	public final static String TICKET_TYPE_NAME_PARK_AFTER4 = "파크이용권 - 오후권(AFTER4)";
	
	// 나이 그룹
	public final static String AGE_TYPE_NAME_ELDER = "성인(경로)"; 
	public final static String AGE_TYPE_NAME_ADULT = "성인"; 
	public final static String AGE_TYPE_NAME_JUVENILE = "청소년"; 
	public final static String AGE_TYPE_NAME_CHILD = "어린이"; 
	public final static String AGE_TYPE_NAME_BABY_FREEPASS = "베이비(자유이용권)";
	public final static String AGE_TYPE_NAME_BABY_ENTERANCE = "베이비(무료입장)"; 
	public final static String AGE_TYPE_NAME_NEWBORN = "신생아(무료입장)";
	
	// 베네핏 종류 
	public final static String BENEFIT_TYPE_NAME_NON = "*우대사항 없음"; 
	public final static String BENEFIT_TYPE_NAME_DISABLED = "*장애인 우대"; 
	public final static String BENEFIT_TYPE_NAME_NATIONAL_MERIT = "*국가유공자 우대"; 
	public final static String BENEFIT_TYPE_NAME_PREGNANT = "*임산부 우대"; 
	public final static String BENEFIT_TYPE_NAME_ARMY = "*휴가장병 우대"; 
	public final static String BENEFIT_TYPE_NAME_MULTICHILD = "*다둥이 행복카드 우대";
	
	// 요금 상수 (1) 종합이용권 - 종일
	public final static int PRICE_ALL_1DAY_ADULT = 62000; 
	public final static int PRICE_ALL_1DAY_JUVENILE = 54000; 
	public final static int PRICE_ALL_1DAY_CHILD = 47000; 
	public final static int PRICE_ALL_1DAY_BABY_FREEPASS=15000; 
	public final static int PRICE_ALL_1DAY_BABY_ENTERANCE=0;
	public final static int PRICE_ALL_1DAY_NEWBORN = 0;
	
	// 요금 상수 (2) 종합이용권 - 오후
	public final static int PRICE_ALL_AFTER4_ADULT = 50000; 
	public final static int PRICE_ALL_AFTER4_JUVENILE = 43000; 
	public final static int PRICE_ALL_AFTER4_CHILD = 36000; 
	public final static int PRICE_ALL_AFTER4_BABY_FREEPASS = 15000; 
	public final static int PRICE_ALL_AFTER4_BABY_ENTERANCE = 0;
	public final static int PRICE_ALL_AFTER4_NEWBORN = 0;  
	
	// 요금 상수 (3) 파크이용권 - 종일
	public final static int PRICE_PARK_1DAY_ADULT = 59000; 
	public final static int PRICE_PARK_1DAY_JUVENILE = 52000; 
	public final static int PRICE_PARK_1DAY_CHILD = 46000; 
	public final static int PRICE_PARK_1DAY_BABY_FREEPASS = 15000; 
	public final static int PRICE_PARK_1DAY_BABY_ENTERANCE = 0;
	public final static int PRICE_PARK_1DAY_NEWBORN = 0;
	
	// 요금 상수 (4) 파크이용권 - 오후
	public final static int PRICE_PARK_AFTER4_ADULT = 47000; 
	public final static int PRICE_PARK_AFTER4_JUVENILE = 41000; 
	public final static int PRICE_PARK_AFTER4_CHILD = 35000; 
	public final static int PRICE_PARK_AFTER4_BABY_FREEPASS = 15000; 
	public final static int PRICE_PARK_AFTER4_BABY_ENTERANCE = 0;
	public final static int PRICE_PARK_AFTER4_NEWBORN = 0;
	
	// 나이 상수 (나이 범위)
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
	
	// 우대사항 - 종류별 할인율
	public final static float BENEFIT_NON = 0.0f; 
	public final static float BENEFIT_DISABLED = 0.5f; 
	public final static float BENEFIT_NATIONAL_MERIT = 0.5f; 
	public final static float BENEFIT_PREGNANT = 0.5f; 
	public final static float BENEFIT_ARMY = 0.49f; 
	public final static float BENEFIT_MULTICHILD = 0.3f;
	
	// 우대사항 - 종류별 최대 할인 수량(없음 or 본인 or 본인+동반1인)
	public final static int BENEFIT_NON_MAX = 0; 
	public final static int BENEFIT_DISABLED_MAX = 2; 
	public final static int BENEFIT_NATIONAL_MERIT_MAX = 2; 
	public final static int BENEFIT_PREGNANT_MAX = 1; 
	public final static int BENEFIT_ARMY_MAX = 2; 
	public final static int BENEFIT_MULTICHILD_MAX = 1;

}
