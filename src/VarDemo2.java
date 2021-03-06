
public class VarDemo2 {

	public static void main(String[] args) {
		// 정수 리74512321210.0
		int a = 1000000;
		int b = 1_000_000; // _를 이용해서 자릿수를 표시할 수 있다.
		int c = 010; //0으로 시작하면 8진수 10이다. 010은 8이다.
		int d = 0x10; //0x로 시작하면 16진수 10이다. 0x10은 16이다.
		long e = 100000000L; // int타입은 값의 범위는 -21억 ~21억이다. int범위를 넘어가는 
		//값은 long 타입으 변수에 담는다. 접미사 L을 붙인다.
		
		// 문자 리터럴
		char ch1 ='A';
		char ch2 ='가';
		char ch3 = '恩';
		char ch4 = '0'; //문자 리터럴은 반드시 한 글자를 가지고 있어야 한다.
		char ch5 = ' '; //공백도 한 글자이다.
		char ch6 = '\t'; //탭 문자
		char ch7 = '\n'; //줄 바꿈 문자
		char ch8 = '\''; // '
		char ch9 = '\"'; // "
		char ch10 = '\\'; // \
		// 유니코드로 문자를 표현하기
		char ch11 = '\u0076';
		System.out.println('\uac00');
		System.out.println('\uac01');
		System.out.println('\uac02');
		
		String st1 = "";
		String st2 = "가나다라";
		String st3 = "서울시 종로구 율곡로 10길 105 디아망 빌딩 402호";
		String st4 = "김유신\n강감찬\n이순신\n\uac00\uac00\uac00";
		System.out.println(st4);

		//실수 리터럴
		double d1 = 3.14;
		double d2 = 3.;
		double d3 = 3.0e4;
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		float f1 = 3.14f; // 실수를 float타입의 변수에 저장할 때는 f를 접미사로 붙인다.
		float f2 = 3.f;
		float f3 = 5.0e4f;
		
		//불린형 리터럴
		boolean b1 = true; // boolean타입의 값은 오직 true, false 두 가지 뿐이다.
		boolean b2 = false;
		
	}

}