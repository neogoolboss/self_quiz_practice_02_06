package com.ohgiraffers.practice.quiz.level0;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        /* [PCCE 기출문제 1번 / 출력]
        *   주어진 초기 코드는 변수에 데이터를 저장하고 출력하는 코드입니다.
        *   아래와 같이 출력되도록 빈 칸을 채워 코드를 완성해 주세요.
        *   - 출력 예시 -
        *   Spring is beginning
        *   13
        *   310*/

//        System.out.println("--------- 1번 ---------");
//
//        String msg;
//        int val1;
//        String val2;
//
//        msg = "Spring is beginning";;   // 입력 코드
//        val1 = 3;   // 입력 코드
//        val2 = "3"; // 입력코드
//
//        System.out.println(msg);
//        System.out.println(val1 + 10);
//        System.out.println(val2 + 10);

        /* [PCCE 기출문제] 2번 / 피타고라스의 정리
        *   직각삼각형이 주어졌을때 빗변의 제곱은 다른 두 변을 각각 제곱한 것의 합과 같습니다.
        *   직각삼각형의 한 변의 길이를 나타내는 정수 a와 빗변의 길이를 나타내는 정수 c가 주어질 때,
        *   다른 한 변의 길이의 제곱, b_square을 출력하도록 한 줄을 수정해 코드를 완성해 주세요.
        *   */

//        System.out.println("--------- 2번 ---------");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("a의 값 입력 : ");
//        int a = sc.nextInt();
//        System.out.print("c의 값 입력 : ");
//        int c = sc.nextInt();
//
//        int b_square = (c * c) - (a * a); // 수정코드
//
//        System.out.println(b_square);

        /* [PCCE 기출문제] 3번 / 나이 계산
        *   나이를 세는 방법은 여러가지가 있습니다. 그 중 한국식 나이는 태어난 순간 1살이 되며 해가 바뀔 때마다 1살씩 더 먹게 됩니다.
        *   연 나이는 태어난 순간 0살이며, 해가 바뀔떄마다 1살씩 더 먹게 됩니다. 각각 나이의 계산법은 다음과 같습니다.
        *   한국식 나이 : 현재 연도 - 출생 연도 + 1
        *   연 나이 : 현재 연도 - 출생 연도
        *   출생연도를 나타내는 정수 year와 구하려는 나이의 종류를 나타내는 문자열 age_type이 주어질 때 2030년에 몇 살인지
        *   출력하도록 빈칸을 채워 코드를 완성해 주세요. age_type이 "Korea"라면 한국식 나이를, "Year"라면 연 나이를 출력합니다.
        * */

//        System.out.println("--------- 3번 ---------");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("연도 입력 : ");
//        int year = sc.nextInt();
//        System.out.print("나이의 종류 : ");
//        String ageType = sc.next();
//        int answer = 0;
//
//        if (ageType.equals("Korea")) {          // 코드 입력
//           answer = (2030 - year) + 1;          // 코드 입력
//        } else if (ageType.equals("Year")) {
//            answer = 2030 - year;               // 코드 입력
//        }
//        System.out.println(answer);

        /* [PCCE 기출문제] 4번 / 저축
        *   진우는 돈을 모으기 위해 저축을 하려고 합니다. 목표로 하는 금액은 100만원이며,
        *   첫 달에 일정 금액을 넣은 뒤 70만원 까지는 매월 조금씩 저축하다가 70만원 이후부터는 월 저축량을 늘려
        *   빠르게 목표 금액을 달성하고자 합니다.
        *   첫 달에 저축하는 금액을 나타내는 정수 start, 두 번째 달 부터 70만원 이상 모일 때까지 매월 저축하는 금액을
        *   나타내는 정수 before, 100만원 이상 모일 때 까지 매월 저축하는 금액을 나타내는 정수 after가 주어질 때,
        *   100만원 이상을 모을 때까지 걸리는 개월 수를 출력하도록 코드를 완성해 주세요. */

//        System.out.println("--------- 4번 ---------");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("첫 달에 저축하는 금액 : ");
//        int start = sc.nextInt();
//        System.out.print("두 번째 달 부터 70만원 이상 모일 때까지 저축하는 금액 : ");
//        int before = sc.nextInt();
//        System.out.print("100만원 이상 모일 때 까지 매월 저축하는 금액 : ");
//        int after = sc.nextInt();
//
//        int money = start;
//        int month = 1;
//
//        while (money < 70) {            // 코드 입력
//            money += before;            // 코드 입력
//            month++;
//        } while (money < 100) {         // 코드 입력
//            money += after;             // 코드 입력
//            month++;
//        }
//        System.out.println(month);

        /* [PCCE 기출문제] 7번 / 가습기
        *   상우가 사용하는 가습기에는 "auto", "target", "minimum"의 세 가지 모드가 있습니다.
        *   가습기의 가습량은 0~5단계로 구분되며 각 모드 별 동작 방식은 다음과 같습니다.
        *
        *   "auto" 모드
        *       - 습도가 0 이상 10 미만인 경우 : 5단계
        *       - 습도가 10 이상 20 미만인 경우 : 4단계
        *       - 습도가 20 이상 30 미만인 경우 : 3단계
        *       - 습도가 30 이상 40 미만인 경우 : 2단계
        *       - 습도가 40 이상 50 미만인 경우 : 1단계
        *       - 습도가 50 이상인 경우 : 0단계
        *    "target" 모드
        *       - 습도가 설정값 미만일 경우 : 3단계
        *       - 습도가 설정값 이상일 경우 : 1단계
        *    "minimum" 모드
        *       - 습도가 설정값 미만일 경우 : 1단계
        *       - 습도가 설정값 이상일 경우 : 0단계
        *
        *   상우가 설정한 가습기의 모드를 나타낸 문자열 mode_type,
        *   현재 공기중 습도를 나타낸 정수 humidity,
        *   설정값을 나타낸 정수 val_set 이 주어질 때 현재 가습기가 몇 단계로 작동 중인지
        *   return 하도록 Solution 함수를 완성해 주세요.
        *   */

//        System.out.println("--------- 5번 ---------");
//
//        Solution solution = new Solution();
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("모드를 입력해 주세요. : ");
//        String mode_type = sc.nextLine();
//        System.out.print("현재 습도를 입력해 주세요. : ");
//        int humidity = sc.nextInt();
//        System.out.print("설정값을 입력해 주세요 : ");
//        int val_set = sc.nextInt();
//
//        int result = solution.solution(mode_type, humidity, val_set);
//
//        System.out.println("result = " + result);

        /* 퀴즈 : 버스 도착 정보를 출력하는 프로그램을 작성하시오
        * 정보
        *   - 버스 번호는 "1234, "상암08" 과 같은 형태
        *   - 남은 시간은 분 단위 (예 : 3분, 5분)
        *   - 남은 거리는 km 단위 (예 : 1.5km, 0.8km)
        *  */

//        System.out.println("--------- 6번 ---------");
//        String busName = "상암08";
//        int busTime = 3;
//        double distance = 1.5;
//
//        System.out.println("버스 번호는 " + busName + "번 입니다.");
//        System.out.println("남은 시간은 " + busTime + "분 입니다.");
//        System.out.println("남은 거리는 " + distance + "km 입니다.");

        /* 퀴즈 : 어린이 키에 따른 놀이 기구 탑승 가능 여부를 호가인하는 프로그램을 작성하시오.
        *  조건 : 키가 120cm 이상인 경우에만 탑승 가능
        *         - 삼항 연산자 이용
        *   실행결과 : 키가 115cm 이므로 탑승 불가능합니다.
        *           : 키가 121cm 이므로 탑승 가능합니다.
        * */

//        System.out.println("--------- 7번 ---------");
//        int height115 = 115;
//        int height121 = 121;
//
//        String result115 = (height115 < 120) ? "키가 " + height115 + "cm 이므로 탑승 불가능합니다." : "키가 " + height115 + "cm 이므로 탑승 가능합니다.";
//        String result121 = (height121 < 120) ? "키가 " + height121 + "cm 이므로 탑승 불가능합니다." : "키가 " + height121 + "cm 이므로 탑승 가능합니다.";
//
//        System.out.println(result115);
//        System.out.println(result121);

        /* 퀴즈 : 주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램을 작성하시오.
        *   참고
        *   - 주민등록번호는 13자리의 숫자로 구성
        *   - 앞 6자리는 생년월일 정보, 뒷 7자리 중 첫 번째 숫자는 성별 정보
        *   - 입력 데이터는 -을 포함한 14자리의 문자열 형태
        *   예시
        *   "901231-1234567" 인 경우 901231-1 까지 출력
        *   "030708-4567890" 인 경우 030708-4 까지 출력
        * */

//        System.out.println("--------- 8번 ---------");
//        String num1 = "901231-1234567";
//        String num2 = "030708-4567890";
//
//        System.out.println("num1 = " + num1.substring(0,8));
//        System.out.println("num1 = " + num1.substring(0,num1.indexOf('-')+2));
//        System.out.println("num2 = " + num2.substring(0,8));

        /* 퀴즈 : 조건문을 활용하여 주차 요금 정산 프로그램을 작성하시오.
        *   조건
        *   - 주차요금은 시간당 4000원(일일 최대 요금은 30000원)
        *   - 경차 또는 장애인 차량은 최종 요금에서 50% 할인
        *   주차요금 예시
        *   - 일반 차량 5시간 주차 시 20000원
        *   - 경차 5시간 주차 시 10000원
        *   - 장애인 차량 10시간 주차 시 15000원
        *   실행결과
        *   - 일반 차량 5시간 주차 시 20000원
        *       - 주차 요금은 20000 원 입니다.
        *   - 경차 5시간 주차 시 10000원
        *       - 주차 요금은 10000 원 입니다.
        *   - 장애인 차량 10시간 주차 시 15000원
        *       - 주차 요금은 15000원 입니다.
        * */
        Scanner sc = new Scanner(System.in);

        int hour = 10;
        boolean isSmallCar = true; // 경차 여부
        boolean withDisabledPerson = false; // 장애인 차량 여부
        int fee = hour * 4000; // 시간당 4000원

        // 30000원 초과 시 일일 최대요금으로 수정
        if(fee > 30000) {
            fee = 30000;
        }

        // 경차 또는 장애인 차량인 경우 50% 할인
        if (isSmallCar || withDisabledPerson) {
            fee /= 2 ;
        }

        // 실행결과 출력
        System.out.println("주차요금은 " + fee + " 원 입니다.");







    }

}
