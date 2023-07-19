# JAVA_Study
Study JAVA basic elements
자바를 시작하며 공부한 내용들이다. 기초를 14개 프로젝트로 정리하였다.


---
## 01_My_First_Project

### Method : 쉽게 이해하기 위해 기능을 의미한다.  
하나의 클래스에 여러개의 메소드가 존재 가능하다.  
메소드의 이름은 중복이 가능하지만 특정 조건을 만족하여야한다.

메소드는 main 메소드와 일반 메소드로 나눤다.  
메소드는 실행하는 것을 호출한다.   
일반 메소드 같은 경우에는 스스로 실행될 수 없다.  
다른 메소드에서 호출을 해줘야만 실행될 수 있다.  

---
## 02_Variable  

### 형변환: 값의 종류라는 뜻, 캐스트한다라는 것은 자료형을 바꾸는 개념이다

### 컴퓨터에서 값을 처리하는 규칙   
1. = (대입연산자)를 기준으로 양쪽이 같은 자료형이여야 한다.  
자료형이 다를경우 오른쪽 대입할 자료형을 변경시켜야한다.  
2. 같은 자료형끼리만 연산이 가능하다.  
-다른 자료형끼리 연산을 하고자 한다면 둘중 하나는 형변환을 통해 동일한 자료형으로 변환해야한다.  
3. 연산의 결과물도 같은 자료형이여야 한다.  

[표현법](바꿀자료형)값
형변환연산자,cast 연산자

### 형변환의 종류  
1. 자동형변환 : 자동으로 형변환된다. 직접 형변환 해줄 필요 없다.  
작은 크기의 자료형 -> 큰 크기의 자료형  
2. 강제형변환 : 자동으로 형변환이 진행되지 않는 경우.  
직접 형변환을 해야한다->형변환 연산자를 통해 
큰 크기의 자료형 -> 작은 크기의 자료형  
때문에 값의 손상이 있을 수 있다.  

### 구문 출력방법
System.out.printf("출력하고자 하는 형식", 출력하고자하는 값);  
여기서 f는 format(형식)을 의미한다.  
단, 문자열안에 원하는 값이 들어갈 공간을 형식화 하여야한다.  

형식  
* %d : 정수  
* %f : 실수  
* %c : 문자  
* %s : 문자  

```java
System.out.printf("Hello World");
//printf로 출력 - 줄바꿈 기능이 없기 때문에 개행문자 \ n으로 줄 바꿈 해준다.
System.out.println("Hello World");
```

etc)
키보드로 사용자로부터 값을 입력받으려면?  
자바에서 제공하고 있는 java.util.Scanner 라고하는 클래스를 활용하면 된다.  

```java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
```

---
## 03_Operator

### 산술 연산자: 이항연산자로서 연산방법, 우순위가 일반 수학산과 동일하다.
* 덧셈: +, 뺄셈: -, 곱셈: *, 나눗셈: /, 나머지(Modular): % (나눗셈에서 나머지를 구한다.)  

### 증감연산자: 당항 연산자로서 한 번에 1씩 증가 하거ㅓ나 1씩 감소하는 연산을 말한다.  
* -먼저 증감을 할 것인지 나중에 증감을 할것인지 연산자의 위치에 따라 달라진다.  
* [표현법]  
* ++ : 값을 1씩 증가시키는 연산자  
* -- : 값을 1씩 감소시키는 연산자  

### 연산자의 위치
* 전위연산: ++값, --값 (먼저 1을 증감처리한 후 그 값을 처리한다)
* 후위연산: 값++, 값-- (값을 먼저 처리한 후에 증감을 수행한다)

### 복합대입연산자: 다른 산술 연산자랑 대입연산자가 결합한 것. 이항연산자
* -자기 자신과 해당 산술연산 후에 그 결과를 다시 자신에게 대입하는 연산자. 
* +=  
* -=  
* *=  
* \       /=  
* %=    
예시) a += 3; 은 a = a + 3; 기존에 a라는 값에 +3을 한 뒤에 다시 a에 대입해라.

### 논리 부정 연산자 : 논리값(true/false)를 반대로 바꿔주는 연산자  
[표현법]!논리값
```java
if(!flase){
  System.out.print("Hello World");
}
```

### 비교연산자 (관계연산자)
* 두개의 값을 가지고 비교, 이항 연산자
* 비교연산을 한 결과 -> 참일 경우 ture / 거짓일 경우 false
* 특정 조건을 제시할 수 있는 조건문에서 쓰인

종류  
1. 크고 작음을 비교
* a < b : a가 b보다 작습니까?
* a > b : a가 b보다 큽니까?
* a <= b : a가 b보다 작거나 같습니까?
* a >= b : a가 b보다 크거나 같습니까?
2. 일치함을 비교 - 동등비교
* a == b : a와 b가 같습니까?
* a != b : a와 b가 같지 않습니까?
* 피연산자는 숫자, 결과값은 논리값

### 논리 연산자 : 이항연산자, 두개의 논리값을 연산하는 연산자.
* [표현법] 논리값 논리연산자 논리값 -> 결과값도 논리값  

종류
1. AND 연산자: 논리값 && 논리값 [왼쪽, 오른쪽 둘다 	true여야 결과값도 true]  
2. or 연산자: 논리값 || 논리값 [왼쪽, 오른쪽 둘 중 하나라도 true면 결과값이 true]

### 삼항 연산자 : 피연산자가 3개 -> 값 3개와 연산자 1개로 이루어짐.
조건식 형태로 쓰인다.  

 #조건식 :  결과값에 따라서 연산을 처리하는 방식
* 결과값이 참일 경우 식1을 처리하고.
* 결과값이 거짓일 경우 식2를 처리한다.
[표현법]
조건이 ? 조건이 true일 경우 결과값: 조건이 false일 경우 결과값;
```java
Scanner sc = new Scanner(System.in);
System.out.println("정수 입력 : ");
int num = sc.nextInt();
//중첩삼항연산자를 이용하여.		
String result = (num != 0) ? ((num >0)? "양수입니다." : "음수입니다.") : "0입니다.";
System.out.println("입력 받은 " + num + "은 " + result);
```
  
---
## 04_Control

### 단독 if
[표현법]
```java
if(조건식){
  //수행하고자 하는 구문
}
```
* -조건식의 결과값이 true일 경우: 중괄호 안에 있는 코드를 실행
* -조건식의 결과값이 false일 경우: 중괄호 안에 있는 코드를 건너 뜀

### if-else 문 
[표현법]
```java
if(조건식){
  // 조건식이 만족할때(true) 실행하고자 하는 구문 - 1번 
}else{
  // 조건식이 만족하지 않을때 (false) 실행하고자하는 구문 - 2번 
}
```
* -조건식의 결과가 true일 경우엔 1번 코드만 실행
* -조건식의 결과가 false일 경우엔 2번 코드만 실행

### switch 문
[표현법]
```java
switch(아래에 기술할 값들과 동등비교를 할 대상){
  case 값1 : 실행할 코드; // - 대상자 == 값1이 true일 경우 실행할 코드
  break; - switch // 영역을 벗어난다.
case 값2 : 실행할 코드; // - 대상자 == 값2이 true일 경우 실행할 코드
  break; // - switch 영역을 벗어난다.
   //...
case 값n :실행할 코드; // - 대상자 == 값n이 true일 경우 실행할 코드
  break; // - switch 영역을 벗어난다.

default : 실행할 코드; // -if-else문에서 else와 같은 역할을 수행한다.
  //위에 case들을 모두 만족하지 않으면 실행할 코드를 작성한다.
  //break를 적지 않는다(마지막에 실행되고 switch문을 벗어나기 때문)
  //또한 생략이 가능하다.
}
```
**반복문 안에서 쓰이는 구문**   
1. break; :break문을 만나는 순간 "가장 가까운 반복문"을 벗어난다.
* 해당 break; 문을 포함한 가장 가까운 반복문 한겹만 벗어난다.  
* 주의할 점: switch문 안에 있는 break와는 다른 역할.  
* switch문 안에 있는 break는 해당 switch문을 벗어하는 용도로 사용된다. (반복문에 영향 X)
```java
Scanner sc = new Scanner(System.in);
		
while(true){ //무한반복		
  System.out.println("숫자를 입력해주세요.");
  int num = sc.nextInt();
  if(num >= 0) {
    System.out.println(num);
  }else { //입력 받은 수가 음수라면 -- 무한반복을 벗어날 조건
    System.out.println("프로그램을 종료합니다.");
    break;
  }
}
```
2. continue; 구문을 만나면 뒤에 있는 코드를 실행하지 않고 다시 반복문을 실해하게 된다.  
* 이때 for문의 경우는 증감식으로 이동.  
* while문의 경우는 조건식으로 흐름이 이동된다.  
```java
Random r = new Random();
for(int i = 1; i <= 10; i = i+1) {
  int random = r.nextInt(10) + 1;//1부터 10개까지 
  //홀수인 경우니깐 작수인 경우를 제외시키면 된다.
  if(random % 2 == 0) { //random 값을 나누기 2한 나머지 값이 0이라면 짝수라고 볼 수 있다.
  	continue;
	}
  System.out.println(random + "홀수가 나왔넹.");
}
```

*-switch문과 if문의 차이점*   
*-if(조건식) -> 조건식에 범위 설정이 가능하다.*  
*-switch(대상자) -> 범위설정 불가 식이 있더라도 값이 정해지는 식이여야한다.(동등비교)*  

### for문
괄호 안의 반복을 지정하고 부분이 있고, 초기식, 조건식, 증감식 세가지로 이루어진다.  
각각 세미콜론으로 구분되며 증감식에는 세미콜론을 붙이지 않는다.  
[표현법]
```java
for(최기식; 조건식; 증감식){
  // 반복시키고자 하는 내용
}
```
-초기식: 반복문이 시작될때 "최기에 단 한번만 실행" 될 구문  
* 		즉, 반복문에서 사용할 변수를 선언하고 초기화하는 구문이다. ex) int i = 0;
-조건식: "반복문이 실행될 조건"을 작성하는 구문  
* 		조건식이 true일 경우 반복문 실행 false일 경우 반복문을 멈추고 빠져나온다
* 		보통 초기식에서 선언된 변수를 가지고 조건식을 작성한다. ex) i<10;
-증감식: 반복문을 제어하는 변수 값을 증감시키는 구문  
* 		보통 초기식에서 선언된 변수를 가지고 증감식을 작성한다.
* 		이때 증감연산자가 주로 사용된다. ex) i++

*for문을 만나는 순간*  
초기식 ->조건식(조건검사) ->true일 경우 실행 ->증감식  
 		->조건식 (조건검사) ->true일 경우 실행 ->증감식  
 		->......    
 		->조건식(조건검사 ->false일 경우 코드를 실행하지 않고 반복문을 벗어난다.  
**조건식이 true일 경우에만 코드를 실행한다.**  

### While문
괄호 안에 조건이 true인 경우 해당 구문을 반복적으로 실행
조건식에 true를 작성하면 무한반복
[표현법]
```java
// 초기식; --생략가능
while(조건식){
  // 반복시키고자 하는 구문
  // 증감식; --생략가능
}
```
**조건식이 true이면 내부 코드를 실행 false라면 실행하지 않음**

### do - while
별도의 조건검사 없이 무조건 최초 1회는 실행하는 구문.
조건이 맞지 않아도 1번은 실행된다.
[표현법]
```java
// 초기식--생략가능
do{
  // 실행할 코드	
  // 증감식 --생략가능
}while(조건식);
```
**while문과 do-while문의 차이점** 
* while문은 조건식이 거짓일 경우 실행되지 않지만 do-while문은 조건식이 거짓이여도 최초 1번은 실행된다.

---
## 05_Array

1. 변수: 하나의 공간에 하나의 값만 담을 수 있다.  
2. 배열: 하나의 공간에 여러개의 값을 담을 수 있다.  
  **단," 같은 자료형일때만"**
![image.png](./image/image.png)  

* 배열의 각각 인덱스자리에 실제 값이 담기는 형태 / 만약 참조형 배열이면 실제값이 아닌 주소값이 담긴다.  
* 변수를 이어붙여 하나의 이름으로 다루는 방식  

*배열의 선언* 
[표현법] - 두가지 방식  
1) 자료형[ ] 배열명;  (가장 흔하게 쓰이는 방식이기도 하다)  
2) 자료형 배열명[ ];  
```java
int a; //int자료형 변수 선언
int[] arr; //int[]자료형 배열 선언(int형 배열)
int arr2[]; //배열 선언 2번째 방식
```
*배열의 할당*  
* 해당 배열에 몇개의 값이 들어갈지 배열의 크기를 지정하는 과정.  
* 지정한 크기만큼의 공간이 생성된다.  
[표현법]
```java
  int[] arr = new int[5];
  //arr이라고하는 배열변수에 int자료형 배열 5칸짜리를 만들어서 주소값을 넣어준다.
```
**배열의 큰 단점: 크기를 변경할 수 없다.**   
그렇게 때문에 새로운 배열을 생성하여 할당 받아야한다.  
이때 기존의 배열 변수를 활용하고자 한다면 재할당을 받아주면 된다.   
ex) int[] arr = new int[3]; -> arr = new int[5];  
배열은 항상 고유한 주소값이 부여된다. 기존에 생성된 배열과 겹치지 않음(중복x)  
그래서 새로운 배열의 크기를 할당받고자 한다면 새 주소를 받아 할당받는 것.  
이렇게 새롭게 할당받은 주소를 갖게된 배열변수로 변경된 크기의 배열을 다루게 된다.  
기존에 다뤄졌던 배열은 더 이상 참조당하는 곳이 없기 때문에  
GC (garbage collector)가 처리해준다. (자동 메모리 관리)  

**배열의 복사**  
* 얕은 복사 - 주소값 복사
* 깊은 복사 - 실제 데이터 복사  
~~더 자세한 이야기는 내 블로그에서: [말만 하는 개발자](https://mongkevin.tistory.com/)~~


1. System.arraycopy 메소드
몇번 인덱스부터 몇개를 어느 위치에 복사할 것인지 지정가능하다.
```java
System.arraycopy(원본배열이름, 원본배열에서 복사시작할 인덱스, 
      						복사본배열이름, 복사본배열에서 복사될 시작인덱스, 복사할 개수)
```
2. Arrays.copyOf() 메소드 (Arrays 클래스에서 제공하는 copyOf() 메소드)
원본배열의 0번인덱스부터 시작하여 복사가 진행되고 내가 제시한 개수 만큼 복사된다.  
만약 내가 제시한 개수가 원본배열의 크기보다 크다면 나머지 공간은 0으로 초기화된채로 생성된다.(크기지정)
```java
// 복사본 배열=Arrays.copyOf(원본배열이름, 복사할 개수);
int[] copy = Arrays.copyOf(origin, 10);
```
3. 원본배열.clone(); 메소드
원본배열과 동일하게 복사한다.(크기, 인덱스지정하지 않음)
```java
// 복사본배열 이름= 원본배열이름.clone();
// 원본배열.clone(); - 시작인덱스, 개수 지정하지 않음 -> 원본이랑 똑같이 만들기
int[] copy = origin.clone();
```

### 이차원 배열
[표현법]
1. 자료형[] [] 배열명; (보편적으로는 1번 유행으로 작성한다.)  
2. 자료형[] 배열명[];  
3. 자료형 배열명[][]  
**이차원 배열의 할당 - 배열크기 지정 - 행크기, 열크기**  
[표현법]
배열 이름 = new 자료형[행] [열];  
이차원 배열의 선언 및 할당 그리고 초기화  
자료형[] [] = new 자료형[행크기][열크기];  
자료형[] [] =  {{1,2,3},{1,2,3},{1,2,3}};
```java
int[][] arr3; // 자주사용하는 방법
int[] arr2[];
int arr1[][];
```
**2차원 배열 arr에 각 인덱스에 접근하려면?**  
```java
arr[0],arr[1],arr[2]		
arr[0][0],arr[0][1],arr[0][2],arr[0][3],arr[0][4]		
arr[1][0],arr[1][1],arr[1][2],arr[1][3],arr[1][4]
arr[2][0],arr[2][1],arr[2][2],arr[2][3],arr[2][4]
```

---
## 06_Object

1. 객체지향언어: "객체"를 "지향"하는 언어로 "객체중심"으로 돌아간다.  
2. 객체: 사전적 의미로는 현실세계에 존재하는 독립적인 대상 (목적,의미) 모든것들을 의미한다.(무형,유형,사물,개념,...)  
3. 객체지향 프로그래밍: 현실세계에 존재하는 독립적인 대상간의 상호작용을 프로그래밍 코드로 구현하는 과정  
4. 구현하고자 하는 프로그램 상의 객체(변수)를 만들기 위해 클래스라고하는 틀을 이용한다.  
-클래스란? 각 객체들의 속성(정보,행위)들을 담아낸 그릇 또는 틀과 같은 존재.  
클래스는 추상화와 캡술과 과정을 통해 만들어진다.  
5. 추상화 과정  
* 내가 구현하고자 하는 프로그램에서 필요한 객체들을 생각해보고  
	ex)학생관리 프로그램 -> "학생"객체: 홍길동, 박보검, 송혜교... 등등  
* 그 객체들이 가지고 있는 공통적인 속성, 기능들을 모두 생각해보자.   
	ex)나이, 이름, 키, 성적, 발사이즈, 몸무게, 취미, 특기, 주소 등등....  
* 추출한 속송들 중에 내가 구현할 프로그램의 "질실적인 목적"에 맞춰서 불필요한 속성, 기능들을 제거하는 과정.  
* 최종적으로 내가 필요한 기능 및 속성들을 담아놓을 변수 및 탑입 및 기능(메소드)를 생각해야한다.  
	ex)String name; int age; int grade, double height 등등....  

**변수와 배열로 다룬다면 자료형의 한계가 명확하기 때문에  
한번에 여러 자료형을 다루기 위한 개념이 "구조체" 개념이다.  
자바에서는 "구조체" + 기능(메소드) 를 합쳐서 하나의 클래스 타입으로 다루게 된다.** 

*객체로 프로그래밍을 하고자 한다면?  
클래스를 먼저 정의하여야한다.  
정의된 클래스로 객체를 생성하여 사용한다.*
*클래스
```java
//[필드부]
	//접근제한자 자료형 필드명;
	//-접근제한자: 이 필드에 접근할 수 있는 범위를 제한할 수 있다.
	//public > protected > default(같은 패키지만 접근가능) > private
	//모든곳  > 상속과 같은 패키지> 같은 패키지> 내 클래스만 
	//클래스 내에서 필드를 선언할때 반드시 접근 제한자를 작성해야한다.
	//접근제한자를 작성하지 않으면 default가 들어간다.
	//(+)public -> 어디서든(같은 패키지, 다른 패키지 다 접근가능)
	//(#)protected -> 같은 패키지 접근가능, 만약 다른 패키지라면 상속관계에서 접근가능.
	//(~)default -> 같은 패키지 내에서는 접근가능(기본값이기 때문에 생략되어 있음)
	//(-)private -> 해당 클래스에서만 접근 가능 
	//%위에서부터 아래로 내려올수록 접근 범위가 좁아진다.%
//[생성자부]
	//기본생성자
	//매개변수 생성자
//[메소드부]
	//기능을 구현하는 부분

	//[표현법]
	//접근제한자 반환형 메소드이름(매개변수){
		//수행하고자 하는 코드
	//}

	//-접근제한자: 호출할 수 있는 접근 범위 설정
	//-반환형: 메소드의 결과값이 어떠한 자료혀인지를 지정하는 부분, 이때 void로 작성하면 반환할 값이 없다는 뜻
	//-매개변수: 메소드를 호출할때 전달하는 값- 이때 메소드에서는 전달받을 값을 담아 놓을 변수를 준비한다. -매개변수
		//매개변수는 메소드가 실행되는 시점에 생성되었다가 메소드호출이 끝이나면 사라지는 변수(생략 가능)
	//데이터를 기록 및 수정하는 기능의 메소드: setter 메소드
	
	//규칙
	//1.setter메소드는 접근이 가능하여야 하기때문에 public 접근제한자를 사용한다.
	//2.메소드명은 set + 필드명으로 작성하되, 낙타봉 표기법을 지켜서 작성해준다.
		//ex) setName, setAge, setGender
	//3.모든 필드에 대해서 전부 작성하여야한다.
```
```java
Student hong = new Student();
		//Student 클래스로 생성한 객체 hong안에 있는 필드변수에 직접 접근하여 값 대입하기.
		//이때 접근은 참조연산자인 . 을 이용한다.
hong.name = "홍길동";
hong.age = 20;
hong.gender = '남';
```
*직접적으로 접근해서 값을 조회하면  
보안에 문제가 생길 여지가 있다.  
그래서 객체지향 설계 원칙 중 하나가 정보 은닉이고  
이 정보은닉 기술 중 하나가 캡슐화*

캡슐화 과정을 통해 클래스 형태를 갖추자.

캡슐화를 하지 않는다면 외부로부터 직접접근이 가능하기 때문에  
값의 변질 또는 조회를 막지 못하는 상황이 생긴다.  
-캡슐화 잡업: 데이터의 접근 제한을 원직으로 하여 외부로부터 직접 접근을 막는다.  
단, 간접적으로 접근하여 데이터의 조회 및 대입을 할 수 있도록 작업한다. (메소드 이용)  

-캡슐화 작업 2단계: 1단계 값 숨기기, 2단계 간접적으로 값에 접근할 수 있는 메소드 만들기.  
 1.값 숨기기 - 접근제한자를 private으로 작성한다  
 2.값 처리 메소드 만들기 - setter / getter 메소드를 만든다.  
* setter - 필드에 값을 대입해주는 메소드.  
* getter - 필드에 담긴 값을 꺼내오는 메소드.  
-주의할 점: 메소드부에 작성하여 모든 필드에 대해 작성하고 작명시엔 낙타봉표기법을 지켜준다.  

### 필드: 클래스를 구성하는 요소 중 하나. 클래스 내부이지만 메소드 밖의 영역에 정의가 되는 전역변수 개념  
어떠한 데이터를 저장하기 위한 역할로 쓰인다(변수)  
변수 구분:
* 전역변수: 클래스 영역에 바로 선언하는 변수-> 클래스 내에서면 어디서든 사용가능
* 지역변수: 클래스 영역 내의 어떤 특정한 구역(){}에 선언된 변수 -> ex) 메소드, for문 등등
1. 전역변수
-멤버변수(인스턴스 변수, 필드)  
생성시점: new 연산자를 통해 해당 객체를 생성하는 순간 메모리 영역에 활당된다. heap영역.  
멸시점: 객체가 소멸될때 같이 소멸된다 -> 가비지 컬렉터가 지워주는 시점  

-클래스 변수(Static) : static이라는 예약어가 붙는 변수  
생성시점: 프로그램이 실행되모가 동시에 static 영역에 할당된다.  
해당 객체가 생성이 되지 않아도 프로그램 시작과 동시에 할당된다.  
소멸시점: 프로그램이 종료될때  

2. 지역변수  
생성시점: 특정한 구역(){} 실행시 메모리 영역에 할당 - stack영역에 할당  
소멸시점: 해당 구역 종료시 소멸(작업이 끝나면 소멸)  

```java
private int global; //전역변수
//변수 선언 위치에 따른 구분 (전역변수, 지역변수, 매개변수)
public void test1(int num /*매개변수*/) { //메소드
		
	int local = 0; //지역 변수, 무조건 초기화를 해서 사용해야 한다. 
			
	System.out.println(global); //전역변수 
	System.out.println(local); //지역변수 
	ystem.out.println(num); //매개변수
		
}
```
**상수필드**  
[표현법]
public static final 자료형 상수필드이름 = 값;  
-한번 지정된 값을 변경할 수 없기 때문에 처음 선언할때 초기화를 해두어야한다  
예약어의 순서는 상관없음 public final static으로 해도 된다.  
static : 공유의 개념   
final : 한번 지정된 값을 변경할 수 없다.(상수)  

값이 변경되어서는 안되는 고정적인 값을 메모리영역에 올려두고 공유하면서 사용할 목적으로 다룬다.  
주의) 상수필드 이름도 상수와 마찬가지로 모두 대문자로 작성한다.  

### 생성자부 
생성자: 메소드 이름이 클래스 이름과 동일하고 리턴 자료형이 없는 메소드(반환형이 없는 메소드)
객체가 생성될때 (new구문을 사용할때) 호출이 되는 메소드
this() : 내부 생성자 호출 구문  
주의사항 - 가장 위에 작성해야한다.  
만약 매개변수 생성자가 있다면   
더 작은 범위에 생성자에서 this()로 호출하여 필요한 값은 전달값으로  
초기화하고 나머지 값은 기본값으로 초기화 해준다.   

[표현법]
```java
public 클래스명(매개변수(생략가능)){
	//해당 생성자에서 초기화 시키고자 하는 필드 또는
	//실해하고자 하는 코드
	this.필드변수 = 매개변수;
}
```
[메소드]
```java
접근제한자 반환형 메소드명(매개변수(생략가능)){
코드
}
```
생성자를 작성하는 목적
1. 매개변수가 없는 생성자 -> 기본생성자
2. 매개변수가 있는 생성자
-두개의 차이: 필드에 전달한 값을 초기화 할 수 있는가 없는가의 차이

생성자 작성시 주의사항
1. 생성자의 이름은 반드시 클래스명과 동일해야한다 (대소문자 구분)
2. 반환형이 존재하지 않는다. (메소드와 혼동하지 않기)
3. 생성자가 여러개 생성이 가능하지만 매개변수가 중복되면 안된다(메소드 오버로딩 규칙)
4. 매개변수 생성자를 명시적으로 작성하게 되면 JVM이 기본으로 생성해주던 기본 생성자가 없어진다(직접 작성해야함)
	- 때문에 기본생성자는 필수적으로 작성할것.
### 기본생성자 (매개변수가 없는 생성자)

단지 객체를 생성할 목적으로 사용한다. 메모리 공간을 확보하기 위함.  
기본생성자를 생략하는 경우 오류가 나지 않는다 why? JVM이 기본생성자를 작성해주기 때문.  
단, 매개변수 생성자를 작성한다면 JVM이 기본생성자를 작성해주지 않기 때문에 기본생성자를 명시적으로 작성해 주어야 한다.  
즉 1개이상의 생성자가 있다면 JVM은 생성자를 만들어 주지 않음.  

### 메소드
입력을 가지고 어떤한 일을 수행한 다음에 결과물을 만들는것.
일반 메소드와 메인 메소드로 구분한다.

[표현법]
```java
접근제한자 예약어 반환형 메소드이름(매개변수자료형 매개변수명){
	//수행할 코드
	//만약 반환형이 있다면 return 반환값;
}
```
-생략 가능한 것: 예약어, 매개변수, return  
-반환형: 반환할 값의 자료형  
-호출할때의 전달값: 매개변수 자료형과 개수 및 자료형이 일치해야한다. 


**메소드 오버로딩**  
-한 클래스 안에 같은 이름의 메소드들을 만든느 (정의하는) 방법  
-매개변수의 자료형 또는 개수를 다르게 작성하여 구분짓는다.  
-단, 매개변수명, 접근제한자, 반환형은 메소드 오버로딩에 영향을 자지 않는다. 

---
## 07_ObjectArray

---
## 08_Inheritance

---
## 09_Polymorphism

---
## 10_API

---
## 11_Exception

---
## 12_IO

---
## 13_Collection

---
## 14_Network


<hr>
**14_Network
