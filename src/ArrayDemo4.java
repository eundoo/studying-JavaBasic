
public class ArrayDemo4 {

	public static void main(String[] args) {
		//복습
		
		//### 배열 만들기
		String[] depts = new String[5];
		depts[0] = "컴퓨터공학과";
		depts[1] = "통계학과";
		depts[2] = "수학과";
		depts[3] = "전자공학과";
		depts[4] = "정보통신학과";
		
		//학과명을 저장하는 배열을 생성하기
		//학과명은 "컴퓨터 공학과", "통계학과", "수학과", "전자공학과" 다.
		//학과명 배열은 문자열 5개 저장하는 배열을 new 연산자를 사용해서 생성하고,
		//0번부터 4번까지 순서대로 학과명을 배열에 저장하기
		
		String[] names = {"이순신", "김유신", "강감찬", "유관순"};
		//학생들의 이름을 저장하는 배열을 생성하기
		//학생명은 "이순신", "김유신", "강감찬", "유관순"이다.
		//학생명 배열은 배열표현식을 {값, 값, 값}을 사용해서 배열을 생성
		
		double[] scores = {3.1, 3.0, 4.0, 4.3};
		
		//학생들의 학점을 저장하는 배열을 생성하기
		//학새들의 성적은 3.1, 3.0, 4.0, 4.3이다.
		//학생성적 배열은 배열표현식을 사용해서 배열을 생성하기
		
		//### 배열의 값 출력하기
		//학과명 배열의 모든 값을 for문을 사용해서 화면에 출력하기
		//학생이름 배열의 모든 값을 향상된 for문을 사용해서 화면에 출력하기
		//학생 성적 배열의모든값을 향상된 for문을 사용해서 화면에 출력하기
		//학생명 배열에서 0번째에 저장된 학생의 이름과, 학생성적 배열에서 0번째에 저장된 학생의 성적 출력하기
		System.out.println("### 학과명 출력하기");
		for (int i=0; i<depts.length; i++) {
			System.out.println("학과명: " + depts[i]);
		}
		
		System.out.println("###학생이름 출력하기");
		for (String name :names) {
			System.out.println("이름: " + name);
		}
		
		System.out.println("###학생성적 출력하기");
		for (double score : scores) {
			System.out.println("성적: " + score);
		}
		
		System.out.println("### 지정된 위치의 값 출력하기");
		System.out.println("0번째 학생이름: " + names[0]);
		System.out.println("0번재 학생성적: " + scores[0]);
		
		System.out.println("### 성적에 대한 총점과 평균 출력하기");
		double total = 0.0;
		double average = 0.0;
		
//		double[] scores = {3.1, 3.0, 4.0, 4.3};
		
		for (double score : scores) {
			total += score*10;
		}
		
		total /= 10;
		average = total/scores.length;
		System.out.println("총점: " + total);
		System.out.println("평균:"  + total);
		
	}

}
