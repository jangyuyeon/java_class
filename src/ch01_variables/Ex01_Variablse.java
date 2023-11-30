package ch01_variables;

public class Ex01_Variablse {

	public static void main(String[] args) {
		// 본인의 이름(name), 나이(age), 키(height), 주소(address), 전화번호(mobile)
		// 를 입력할 수 있는 변수를 각각 선언해봅시다.
		//String; //X타입만 주면 안됨
		String name = "안젤라";
		int age = 15;
		double height = 165.0;
		String address = "인천광역시 연수구 송도동";
		String mobile = "010-8945-9866";
		
		//변수값을 출력
		System.out.println(name);
		System.out.println("name");
		System.out.println("저의 이름은 " + name + "입니다.");

	}

}
