
public class ForDemo5 {

	public static void main(String[] args) {
		
		//다음 반복차례로 넘어가기
		// continue문을 사용하면 다음 반복차례로 넘어갈 수 있다.
		// continue는 반복문 내에서만 사용할 수 있다.
		
		for (int i=1; i<=10; i++) {
			
			//continue가 들어있는 if문은 실행되지 않는다고 보면된다.
			if (i==5) {
				continue; 	// continue가 실행되면, 반복문 내의 나머지 수행문을 실행하지 않고,
							// 다음번 반복을 이어가기 위해서 증감식으로 이동한다.
			}
			System.out.println("i의 값: " + i);
		}

	}

}
