package com.kh.array;

public class C_DimensionalArray {

	// 이차원 배열: 일차원 배열 여러개를 하나로 묶은 형태
	public void method1() {
		
		//일차원 배열 선언;
//		int arr[];
//		int[] arr;
		
		//이차원 배열 할당
//		arr = new int[3];
		
		//일차원 배열 선언 및 할당 그리고 초기화
//		int[] arr = new int[3];
//		int arr[] = {1,2,3};
		
		/*
		 * 이차원 배열
		 * [표현법]
		 * 1. 자료형[] [] 배열명;
		 * 2. 자료형[] 배열명[];
		 * 자료형 배열명[][]'
		 * 
		 * 보편적으로는 1번 유행으로 작성한다.
		 * 
		 * 이차원 배열의 할당 - 배열크기 지정 - 행크기, 열크기
		 * [표현법]
		 * 배열 이름 = new 자료형[행] [열];
		 * 
		 * 이차원 배열의 선언 및 할당 그리고 초기화
		 * 자료혀[] [] = new 자료형[행크기][열크기];
		 * 자료형[] [] =  {{1,2,3},{1,2,3},{1,2,3}};
		 * 
		 */
		
		int arr1[][];
		int[] arr2[];
		int[][] arr3; // 자주사용하는 방법
		
		arr3 = new int[3][3]; //3행 3열 이차원배열 할당
		
		System.out.println(arr3);//주소값
		System.out.println(arr3[0]); //주소값
		System.out.println(arr3[0][0]); //그 안의 값
		
		//3행 5열 정수형 이차원 배열을만들어라.
		int[][] arr = new int[3][5];
		
		System.out.println("arr의 길이: " + arr.length); // 3
		System.out.println("arr[0]의 길이: " + arr[0].length); //5
		System.out.println("arr[0]의 길이: " + arr[1].length); //5
		System.out.println("arr[0]의 길이: " + arr[2].length); //5
		
		System.out.println("===========반복문의 활용===========");
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "].length의 길이: " + arr[i].length); //5
		}
		
		//바깥족 for문은 - 행의 대하여 길이지정 - 몇줄이 반복될 것인지.
		for(int i = 0; i < arr.length; i++) {
			
			//안쪽 for문은 - 열에 대하여 길이지정 - 몇칸 반복될 것인지.
			for(int j = 0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j]+ " ");
				
			}
			System.out.println();
		}
		
		//2차원 배열 arr에 각 인덱스에 접근하려면?
//		arr[0],arr[1],arr[2]
//				
//		arr[0][0],arr[0][1],arr[0][2],arr[0][3],arr[0][4]
//				
//		arr[1][0],arr[1][1],arr[1][2],arr[1][3],arr[1][4]
//				
//		arr[2][0],arr[2][1],arr[2][2],arr[2][3],arr[2][4]
		
		//2행 4열짜리 2차원 배열 선언 및 할당
		int[][] a = new int[2][4];
		
		for(int i = 0; i < a.length; i++) {
			
			System.out.print(a[i][0]);
			System.out.print(a[i][1]);
			System.out.print(a[i][2]);
			System.out.print(a[i][3]); //안의 for가 없음 이렇게 귀찮다.
			
			for(int j = 0; j < a[i].length; j++) {
				
				System.out.print(a[i][j] + " ");
				
			}
			
			System.out.println(); //줄바꿈용
			
		}
		
	}
	
	public void method2() {
		//반복문으로 이차원배열에 순서대로 값을 넣어보자
		//3행 5열짜리 2차원 배열을 생성하여
		//1~15까지의 수를 차례대로 넣고 출력해보세요.
		
		int[][] arr = new int[3][5];
		int value = 1;
		
		//값 대입
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				
				arr[i][j] = value++;
				
			}
			
		}
		
		//값출력 
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j] + " ");
				System.out.printf("%-5d", arr[i][j]);
				
			}
			
			System.out.println(); //줄바꿈용
			
		}
	}
	
	public void method3() {
		
		//2차원 배열 3행 3열 짜리를 선언과 동시에 초기화 하여 1~9까지 수를 넣고
		//반복문으로 출려고해보세요
		
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j]);
				
			}
			System.out.println();
		}
		
	}
	
	public void method4() {
		//다음 성적 정보를 저장하고 문제를 푸세요.
		//1반: [50, 75, 90, 40, 80]
		//2반: [66, 70, 55, 85, 70]
		//3반: [60, 75, 80, 90, 95]
		//반 학생들의 성적을 있는 그대로 화면에 출력
		//각 반 학생들의 성적 평균을 구하여 화면에 출력
		//72점인 학생의 전체 석차를 예상하여 출력 
		
		//배열 생성
		int[][] scor = {{50, 75, 90, 40, 80},{66, 70, 55, 85, 70},{60, 75, 80, 90, 95}};
		
		for(int i = 0; i < scor.length; i++) {
			for(int j = 0; j < scor[i].length; j++) {
				System.out.print(scor[i][j] + "\t");
			}
			System.out.println();
		}
		
//		//첫번째 반 평균점수
//		int sum = 0;
//		
//		//첫 번째반의 학생수만큼 반복하기 - 학생의 점수들을 전부 더하기 위해서.
//		for(int i = 0; i < scor[0].length; i++) {
//				sum += scor[0][i];
//		}
//		//합계를 구했으니 평균도 구해보기
//		double avg1= (double)sum / scor[0].length; //첫번째 반의 사람수
//		
//		System.out.println(avg1);
//		
//		//두번째 반 평균점수
//		int sum2 = 0;
//				
//		//두번째반의 학생수만큼 반복하기 - 학생의 점수들을 전부 더하기 위해서.
//		for(int i = 0; i < scor[1].length; i++) {
//			sum += scor[1][i];
//		}
//		//합계를 구했으니 평균도 구해보기
//		double avg2= (double)sum / scor[1].length; //첫번째 반의 사람수
//		System.out.println(avg2);
//				
//		//세번째 반 평균점수
//		int sum3 = 0;
//						
//		//세번째반의 학생수만큼 반복하기 - 학생의 점수들을 전부 더하기 위해서.
//		for(int i = 0; i < scor[2].length; i++) {
//			sum += scor[2][i];
//		}
//		//합계를 구했으니 평균도 구해보기
//		double avg3= (double)sum / scor[2].length; //첫번째 반의 사람수
//		System.out.println(avg3);
		
		//===========================================================//
		//중첩반복문을 이용하고 합계와 평균도 배열을 이용해보기
		//각 반의 합계를 담을 배열
		int[] total = new int[scor.length]; //length로 행 길이 넣기
		
		//각 반의 평균을 담을 배열
		double[] avg = new double[scor.length]; //행의 길이 == 반의 개수
		
		//계산
		for(int i = 0; i < scor.length; i++) { //0 1 2
			for(int j = 0; j < scor[i].length; j++) { //0 1 2 3 4 
//				total[i] = total[i] + scor[i][j];
				total[i] += scor[i][j]; // total 배열 i번째에 scor[i][j]를 다 더해 넣는 작업
			}
			avg[i] = (double)total[i] /*합계로 나온 total[i]*/ / scor[i].length; //사람 수
		}
		
		for(int i = 0; i < avg.length; i++) {
			System.out.print((i+1)+"반의 평균: "+avg[i]+"\t");
		}
		System.out.println();
		
		//각 반 점수 출력
		for(int i = 0; i < scor.length; i++) {
			for(int j=0; j<scor[i].length; j++) {
				System.out.print(scor[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		//===========================================================//
		int rank = 1;
		int myScore = 72;
		
		for(int i = 0; i < scor.length; i++) {
			for(int j = 0; j < scor[i].length; j++) {
				if(scor[i][j] > myScore) { //만약 나보다 점수가 높다면
					rank++;
				}
			}
		}
		System.out.print("나의 등수는: " + rank+ "등");
	}
	
	public void method5() {
		
		/*
		 * 가변배열
		 * 행의 크기를 정해놓고 각각의 행 별로 열의 크기를 정해놓지 않은 상태
		 * 이차원 == 일차원 배열을 묶은 형태
		 * 이때 묶여 있는 일차원 배열들이 꼭 같은 크기일 필요는 없다
		 * 행의 크기는 생략할 수 없음, 열의 크기는 생략가능
		 * 열의 크기만 변경이 가능하다
		 * 
		 * [표현법]
		 * int[][] arr = new int[행의 크기][];
		 * 
		 */
				
		
		
		String[] sArr = new String[3];
		
		System.out.println(sArr); //주소값 
		System.out.println(sArr[0]); //null
		
		int[] arr2 = new int[3];
		
		System.out.println(arr2); //주소값 
		System.out.println(arr2[0]); //0
		
		double[] dArr = new double[3];
		
		System.out.println(dArr); //주소값 
		System.out.println(dArr[0]); //0.0
		
		boolean[] bArr = new boolean[3];
		
		System.out.println(bArr); //주소값 
		System.out.println(bArr[0]); //false 
		
		int[][] arr = new int [3][]; //행의 크기를3으로
		
		System.out.println(arr); //주소값 
		System.out.println(arr[0]); //null - 참조자료형의 기본값: 아무것도 참조하고 있지 않은 상태를 의미하는 값
		System.out.println(arr.length); //3
		
		// 아직 행별로 열의 칸이 정해지지 않은 아무것도 참조하고 있지 않은 상태이기 때문에 length를 알 수 없다. 
		//System.out.println(arr[0].length); //오류  Null Pointer Exception - 참조할 값이 없다
		
		//각 행마다 열의 크기를 정해보자
		arr[0] = new int[5]; // 5칸짜리 배열
		arr[1] = new int[3]; // 3칸짜리 배열
		arr[2] = new int[2]; // 2칸짜리 배열 
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[0][3]);
		System.out.println(arr[0][4]);
		
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		
		System.out.println(arr[2][0]);
		System.out.println(arr[2][1]);
		
		//반복문을 이용해여 값 대입 
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++){
				arr[i][j] = 5;
			}
		}
		
		//반복문을 이용해여 값 출력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j]);
			}
		}
		
		System.out.println();
		
		//이차원 가변배열을 만들고 순차적으로 1부터 값을 넣어서 출력해보세요
		
		int[][] arr3 = new int[3][];
		
		arr3[0] = new int[2];
		arr3[1] = new int[5];
		arr3[2] = new int[4];
		
	    int count = 1;
	    
	    for(int i = 0; i < arr3.length; i++) {
	    	for(int j = 0; j < arr3[i].length; j++) {
	    		arr3[i][j] = count;
	    		count++;
	    	}
	    }
		
	    for(int i = 0; i < arr3.length; i++) {
	    	for(int j = 0; j < arr3[i].length; j++) {
	    		System.out.print(arr3[i][j]);
	    	}
	    }
		
	    //가변 배열을 사용하는 이유
	    //메모리 공간을 효율적으로 사용하기 위해 
	}
	
	//1차원 배열인 data를 2차원 배열에 넣기
	public void method6() {
		
		
		int size = 5;
		int[][] bingo = new int[size][size];
		int[] data = new int[bingo.length];
		int x = 0, y =0;
//		int y = 0;
		
		for(int i = 0; i < data.length; i++) {
			bingo[x][y] = data[i]; //2차원 배열 0, 0위치에 1차원 배열 0번째 있는 숫자를 넣어준다.
			y++; //y값 1증가시켜서 0, 1
			if(y==size) {
				y=0; //y값을 다시 0으로
				x++; //x값을 1증가
			}
		}
		
		for(int i = 0; i < bingo.length; i++) {
			for(int j = 0; j < bingo[i].length; j++) {
				System.out.printf("5%d", bingo[i][y]);
			}
			System.out.println();
		}
	}
}












