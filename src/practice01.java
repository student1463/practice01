import java.util.Scanner;
public class practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이름, 나이, 생년월일(8자리), 키, 사는곳 여부를 빈칸으로 분리하여 입력하세요");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next(); // 문자열 읽기
		System.out.print("이름은 " + name + ", ");
		
		int age = scanner.nextInt(); // 정수 읽기
		System.out.print("나이는 " + age + "살, ");

		int birth = scanner.nextInt(); // 정수 읽기
		System.out.print("생일은 " + birth + ", ");
		
		double height = scanner.nextDouble(); // 실수 읽기
		System.out.print("키는 " + height + "cm, ");
		
		String city = scanner.next(); //문자열 일기
		System.out.print ("사는곳은" + city );



	


		


		


	}

}
