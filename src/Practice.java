import java.util.Scanner;

public class Practice {

		public void example() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("정수 입력 : ");
			int input = sc.nextInt();
			
			
			for(int row = 1; row <= input; row++) {
				for(int col = 1; col <= input; col++) {
					
					if(col <= input - row) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}
		
		public void example2() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 입력 : ");
			int input = sc.nextInt();
			
			for(int row = 1; row <= input; row++) {
				for(int col = 1; col <= input * 2 - 1; col++) {
					// 마지막 줄의 별 갯수: input에 2를 곱한값의 -1
					//          row    col ||         row    col
					// 1) 4   -  1  >=  1  ||   4   +  1  <=  1  true
					// 1) 4   -  1  >=  2  ||   4   +  1  <=  2  true
					// 1) 4   -  1  >=  3  ||   4   +  1  <=  3  true
					// 1) 4   -  1  >=  4  ||   4   +  1  <=  4  false
					if( input - row >= col || input + row <= col) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}
		
		public void example3() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 입력 : ");
			int input = sc.nextInt();
			
			for(int row = 1; row <= input; row++) {
				for(int col = 1; col <= input; col++) {
					
					// 첫번째 / 마지막줄, 칸일때만 * 출력
					// 입력한 인풋의 길이만큼 행열 길이 지정
					if(row == 1 || row == input || col == 1 || col == input) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			
			
			
			
		}
		
		public void example4 () {
			// 2의 배수 또는 3의 배수인 경우 출력
			// => 2나 3으로 나누었을때 나머지 값이 0인 경우
			// 조건2) 2와 3의 공배수?
			// => 2로도 나누어 떨어지고, 3으로도 나누어 떨어진다.
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("자연수 입력 : ");
			int input = sc.nextInt();
			int count = 0;

			for(int i = 1; i <= input; i++) {
				if(i % 2 == 0 || i % 3 == 0) {
					System.out.print(i + " ");
					
					if(i % 2 == 0 && i % 3 == 0) {
						count++;
					}
				}
			}
			
			System.out.println("\n count:" + count);
		}
		
}
