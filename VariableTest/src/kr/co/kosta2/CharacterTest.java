package kr.co.kosta2;

public class CharacterTest {
	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1);			// 문자 출력
		System.out.println((int)ch1);		// 문자에 해당하는 정수 값(아스키 코드 값) 출력 
		
		char ch2 = 66;						// 정수 값 대입 
		System.out.println(ch2);			// 정수 값에 해당하는 문자 출력 
		
		int ch3 = 67;
		System.out.println(ch3); 			// 정수 값 출력
		System.out.println((char)ch3); 		// 정수 값에 해당하는 문자 출력 
		
		char ch4 = '한';
		char ch5 = '\uD55C';
		System.out.println(ch4);
		System.out.println(ch5);
		
	}
}
