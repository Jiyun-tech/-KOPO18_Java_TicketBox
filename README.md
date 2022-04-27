Updated : Apr. 21, 2022 <br/><br/>
🎢 롯데월드 티켓 발권 프로그램 <br/> 
=====================================
+ 사용 언어<br/>
Java<br/>
-------------------------------------
+ 기능<br/>
> (1) 입력한 항목에 따라 티켓 가격 자동 계산하여 출력<br/>
> (2) 오류 값 입력 시, 입력창 재출력<br/>
> (3) 적용 불가한 우대사항 선택 시, 선택 무시하고 정상 가격으로 계산<br/>
-------------------------------------
+ 사용 방법 <br/>
> (1) 출력되는 안내 사항에 따라 사용자가 정보 입력 (권종, 나이/성별, 수량, 우대사항) <br/>
> (2) 입력 정보에 따라 티켓 가격 산정 <br/>
> (3) 선택 완료 후, 추가 선택 여부 확인 요청 <br/>
> (4) 사용자 선택에 따라 추가 선택 or 발권 프로세스 종료 <br/>
-------------------------------------
+ 프로그램 구조
>+ 변수
<pre><code>StaticValue : 상수 저장 
VariablePrint : 주문 데이터 저장 (사용자에게 출력하여 보여줄 데이터)
VariableValue : 주문 데이터 저장 (입력,계산용. 사용자에게 보여줄 필요 없는 데이터)
</code></pre>
>+ 입력
<pre><code>System01Input : 주문 정보 입력 (1)권종 선택 (2)주민등록번호 앞 7자리 입력(나이,성별 판단용) (3)티켓 수량
System03Input : 추가 주문 정보 입력 (1) 베이비인 경우, 권종 추가 선택 (2) 해당하는 우대사항 선택
</code></pre>
>+ 계산
<pre><code>System02Calculate : (1)권종에 따른 Price List 확정 (2)사용자 만나이 계산
System04Calculate : 최종 가격 계산(우대율 및 우대 적용 수량 등) 및 출력 정보 확정  
</code></pre>
>+ 출력 
<pre><code>System05ArrayListInput : 출력 데이터 클래스(VariablePrint)를 ArrayList에 추가하여 출력 준비
System06Print : 출력 양식 및 항목 지정하여 출력
</code></pre>
>+ 반복
<pre><code>System07Repeat : 반복 여부 결정 (티켓 추가 선택 or 프로그램 종료)
</code></pre>
>+ 메소드 종합    
<pre><code>System00HereWeGo : 모든 method 실행 순서 지정
</code></pre>
>+ 실행
<pre><code>Main : 실행 (System00HereWeGo)
</code></pre>
-------------------------------------
+ 항목 상세
>+ 입력<br/>
>>`(1) 티켓 종류 : 종합이용권 or 파크이용권 / 종일권 or 오후권`<br/>
>>`(2) 주민등록번호 앞 7자리 : 나이 & 성별 식별용`<br/>
>>`(3) 발권 수량`<br/>
>>`(4) 우대 사항`<br/>
</code></pre>
>+ 출력<br/>
>>`(1) 티켓 종류`<br/>
>>`(2) 나이 그룹`<br/>
>>`(3) 티켓 가격`<br/>
>>`(4) 발권 수량`<br/>
>>`(5) 티켓 총 가격 (티켓 가격 * 발권 수량)` <br/>
>>`(6) 우대 사항 적용 항목`<br/>
>>`(7) 우대 할인 금액`<br/>
>>`(8) 우대 할인 적용 수량`<br/>
>>`(9) 우대 할인 총 금액 (우대 할인 금액 * 적용 수량)`<br/>
>>`(10) 최종 가격 (티켓 총 가격 * 우대 할인 총 금액)`<br/>
-------------------------------------
프로그램 구조 <br/> 
![LotteWorldTicketBox03_구조 (2022 04 22)](https://user-images.githubusercontent.com/100850714/164425116-1737741f-edef-4fbd-85cb-693b37371a54.jpg)
-------------------------------------
클래스 리스트 <br/> 
![LotteWorldTicketBox03_클래스 리스트 (2022 04 22)](https://user-images.githubusercontent.com/100850714/164425148-b9ec59a1-0a7f-46b3-8ecc-6fbc0bc56a47.jpg)
-------------------------------------
구동 화면<br/>
![image](https://user-images.githubusercontent.com/100850714/164576934-fb9976a1-b452-49ed-bf11-4094e0f81222.png)
![image](https://user-images.githubusercontent.com/100850714/164576964-71db4098-0e90-48f9-9f1b-734054d9cad8.png)
-------------------------------------
CSV 파일<br/>
> + 특이사항 : 항목 이름 출력을 구현하지 못하여 데이터만 저장 가능한 상태.
![image](https://user-images.githubusercontent.com/100850714/164616697-234bed3a-de03-47cf-846b-a80a92e5ffb9.png)
-------------------------------------
