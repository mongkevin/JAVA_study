package com.kh.chap02.loop;

import java.util.Random;
import java.util.Scanner;
//import java.util.*; // java.util 패키지 안에 있는 모든 클래스 사용하기.

public class D_Ex {

	public void method1() {
		//내가 하려고 하는 동작을 몇번을 반복시킬 것인가.
		//5번 인사를 하고싶다.
		//100번을 인사해야한다고 가정한다면?
		//내가 하고자하는 구문을 반복문으로 감싸 횟수를 지정하고 수행하게 한다.
		//만약 10번을 하고 싶다고 가정 
		
		for(int i =0; i < 10; i++) {
			System.out.print("안녕?");
		}
		
		//10번 반복을 하고싶다 기준점을 잡고 최대치를 잡고 기준점에서 최대치까지 어떠한 방식으로 도달시킬 것인지
		//기준점을 1로 잡고 최대치를 10까지로 1씩 증가하는 방식으로 1 2 3 4 5 6 7 8 9 10
		
		//for(초기식; 조건식; 증감식){
			//수행될 문장;
		//}
		
		//위와 똑같이 10번 반복하는 반복문을 만들고자 하는데 내맘대로 규칙을 정할래
		//나는 100을 기준으로 잡고 100씩 증가해서 총 10번 반복시킬래
		
		for(int i = 100; i <= 1000 ;i += 100) { //100 200 300 400 500 .....
			
		}
		
		//위와 똑같이 10번 반복하는 반복문을 만들고자 하는데 내맘대로 규칙2
		//나는 2를 기준으로 잡고 총 10번 반복하고 싶은 증가하는 것은 *2로 할래
		
		int count = 0;
		for(int i = 2; i <100000; i *= 2) {
			System.out.println(i);
			count++;
			
			if (count == 10) {
				break;
			}
		}
		
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		//위를 묶어 주는 것이 배열
		
		
		
		int[] arr = new int[4];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		
		System.out.println(arr[3]); //30
		System.out.println(arr); //주소값이 나온다.
		
	}
	
	public void method2() {
		//업다운 게임
		//컴퓨터가 1부터 1000사이의 무작위 숫자를 하나 생성한 뒤 사용자가 이것을 맞추는 게임입니다.
		//- 사용자가 입력한 값이 정답보다 크면 컴퓨터는 "up!"이라고 출력합니다.
		//- 사용자가 입력한 값이 접답보다 크면 컴퓨터는 "down!"이라고 출력합니다.
		//- 사용자가 입력한 값이 정답이라면 컴퓨터는 "정답!" 출력 후 프로그램을 종료 
		//프로그램이 종료되기전(정답을 맞춘 뒤) 총 입력 횟수를 출력
		//(사용자는 컴퓨터가 생성한 숫자를 확인할 수 없습니다.) 
		
		//ctrl + shift + o 자동완성 또는 마우스 올려서 import 클릭 또는 해당 생성클래스에 있는 메소드 사용하기
		Random r = new Random(); // 랜덤 클래스
		int random = r.nextInt(1000) + 1;
		Scanner sc = new Scanner(System.in);
		int i = 0;
		System.out.println(random);
		
		while(true) { //해당 조건이 맞을때까지 반복을 돌릴것이니 무한 반복사용 
			
			System.out.print("숫자를 맞춰봥. (1~1000)");
			int num = sc.nextInt();
			
			if(num == random) {
				System.out.println("정답!");
				System.out.print(i + "번 플레이 했습니다.");
				break;
			}else if(num > random) {
				System.out.println("down!");
			}else {
				System.out.println("up!");
			}
			i += 1; //i++; 입력한 횟수 올리기.
		}
		
		sc.close();
		//boolean (변수) = false; 로 가정하고 if(변수){  }로 설정하면 true일때 실행됨. 
	}
	
	public void method3() {
		//고대그리스에는 아주 현명한 노인이 있었습니다.
		//왕이 그 노인에게 "원하는걸 선물로 줄테니깐 말해봐라."라고 했습니다.
		//노인이 말하길.
		//"저는 별로 바라는 것이 없습니다. 첫 날엔 만원을 주시고 둘쨋날은 전날의 두배를 주시면 됩니다."
		//40일 동안 노인이 받은 돈의 액수를 계산하십시오.
		
		long money = 10000; //int 자료형으로 표현할수 있는 범위를 멋어나기 때문에 long 자료형으로 사용해야한다. 
		long sum = 0;
		
		for(int i = 0; i < 40; i++) {
			
			sum += money * (2^(i)); 
			System.out.println((i + 1) + "날 " + sum);
//			sum += money;//합계변수에 현재 돈 더해넣기
//			money *= 2; 
		}
//		Math.
		System.out.println(sum);
	}
	

		//문제 1)
		//주사위 5번 던진 결과를 화면에 출력하세요
	
	public void method4() {
		
		Random r = new Random();
		
		for(int i = 0; i < 5 ; i++) {
			int random = r.nextInt(6) + 1;
			System.out.println((i + 1) + "번째 숫자는 " + random);
		}
		
	}
	
		//문제 2)
		//1부터 1000까지 합계를 구하여 출력하세요
	public void method5() {
		
		int sum = 0;
		
		for( int i = 1; i <= 1000; i++) {
			
			sum += i;
			
		}
		
		System.out.println("1부터 1000의 합은:" + sum);
	}
	
		//문제 3)
		//30일동안 다이어트를 위해서 푸시업을 할 계획입니다.
		//첫날에는 너무 힘드니까 10개만 하고 다음날부터는 전날보다 3개씩 더 할 계획입니다.
		//(1) 일자별로 하게되는 푸시업 개수를 구해서 출력
		//(2) 30일동안 하게되는 푸시업 개수를 구해서 출력
	
	public void method6() {
		
		int sum = 0;
		int sum2 = 0;
		
		for(int i = 0; i < 30; i++) {
			
			sum = 10 + i * 3;
			System.out. println((i + 1) + "일 날에 하는 개수: " + sum);
			sum2 += sum;
			
		}
//		int pushUp = 10; //푸쉬업
//		int sum = 0; //합
//		
//		while(day<=30){
//			
//			System.out.println(day + "일차: " + pushUp + "개");
//			sum += pushUp; //오늘한 푸쉬업 개수 합계변수에 더해넣기
//			pushUp += 3; //오늘한 푸쉬업 개수에 +3을 하여 내일 할 개수 만들기
//			day++; //하루씩 증가시키기(반복문 멋어날 증감식) //나중에 프린트에서 31로 찍힘
//			
//		}
		System.out.println("30일동안 한 개수 " + sum2);
		
	}
		//문제 4)
		//이벤트에서 경품에 당첨될 확률이 2% 입니다.
		//(1) 30번 추첨했을 때 경품에 당첨된 횟수를 구하여 출력
		//  
		//(2) 사용자에게 원하는 추첨 횟수를 입력하도록 한 뒤 당첨된 횟수를 구하여 출력
		//4번문제 이벤트 당첨은 당첨인 수를 먼저 뽑아놓고 추첨하시면 됩니다.
	
	public void method7_1() {
		
		Random r = new Random(); //램덤 추첨할 클래스
		Scanner sc = new Scanner(System.in);
		System.out.print("1~50까지 아무수나 입력해주세요.");
		int num = sc.nextInt(); //사용자한테 입력받은 추첨횟수 담을 변수
		int count = 0;
		
//		for(int i = 1; i <= 30; i++) {
//			
//			int random = r.nextInt(50)+1;
//			System.out.println(random);
//			
//			if(random <= 2) { //위에서 추출한 랜덤수가 1~2인지 확인하여 추첨하기
//				count++;
//				System.out.println((i + 1) + "번째에 숫자를 맞췄습니다." + num + random);
//			}
//		}	
		
		for(int i = 1; i <= num; i++) { //사용자가 입력한 숫자만큼 반복문 돌리기 
			int random = r.nextInt(50)+1;
			System.out.println(i + "번째 추첨입니다.");
			if(random<=2) {
				count++;
			}
		}
		
		System.out.println("총 당첨된 횟수는: " + count);
		sc.close();
	}	
	
	public void method7_2() {
			
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("1~50까지 아무숫자를 입력하세요.");
		int num = sc.nextInt();
		System.out.println("원하는 게임 횟수를 입력하세요.");
		int num2 = sc.nextInt();
		int num3 = 0;
		
		for(int i = 0; i < num2; i++ ) {
			
			int random = r.nextInt(50) + 1;
			
			if(num == random) {
				
				num3 += 1;
				System.out.println((i + 1) + "번째에 숫자를 맞췄습니다. " + num + " " + random);
					
			}
		}
		
		if(num3 == 0) {
			System.out.println("불행히 당첨되지 못했습니다.");
		}else {
			System.out.println("축하합니다.");
		}
		
		sc.close();
	}
	
	//문제 5)
		//1부터 99 사이에 존재하는 5가 들어간 숫자의 개수를 세어서 출력
	
	public void method8(){
		
		int count = 0;
		
		for(int i = 1; i <= 99; i++) {
			
			System.out.println(i);
			//순차적으로 증가하여 우리가 판단해야하는 수는 변수 i에 담기게 되고
			//만약 일의 자리가 5이면 조건만족 또는 십의 자리가 5이면 조건만족을 하게된다.
			//조건을 만족하면 count를 +1씩 증가시켜 개수를 세어준다
			//이때 일의 자리를 알수있는 방법은 변수 i를 10으로 나누어 나머지가 몇인지를 알아내면 된다.
			//십의 자리를 알수 있는 방법은 변수 i를 10으로 나누어 몫이 몇인지 알아내면 된다. 
			if(i / 10 == 5 || i % 10 == 5) {
				count++;
				
			}
		}
		
		System.out.println("숫자 5가 들어간 수는 총: " + count + "개 입니다.");
	}	
	
	//문제 6)
		//어떤 게임에서 시작지점부터 종료지점까지 10칸이 있다고 가정합니다.
		//주사위를 던져서 종료지점에 가려면 주사위를 몇 번 던져야 하는지 구하여 출력
	
	public void method9() {
		
		Random r = new Random();
		int count = 0; //주사위의 합을 담을 변수
		int total = 0; //주사위 몇번 던졌는지 담을 변수
		
		while(true) {//몇번이나 던져야할지 모르기 때문에 무한반복 후 조건에 따라 벗어나기
			int num = r.nextInt(6) + 1; //1~6 주사위 랜덤수 발생시키기
			System.out.println("현재 뽑힌 주사위 수" + num);
			count++; //한번 던졌으니 카운트 1올리기
			total += num; //합계에 지금 던진 주사위 값 더해넣기
			//더해넣어진 total 즉 총합계가 한계범위인 종료지점 10이상이라면 반복문 벗어나기.
			
			if(total >= 10) {
				break;
			}
		}
		
		System.out.println("주사위는 총"+ count + "번 던졌습니다.");
	}
	
		
}





