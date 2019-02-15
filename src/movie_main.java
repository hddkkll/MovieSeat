import java.util.Scanner;

public class movie_main {
	public static void main(String[] args) {
		Movie movie = new Movie();
		Scanner sc = new Scanner(System.in);
		
		// int [][] seat = new int[10][10];
		
		int menuNum = 0;
		

		do {
			System.out.println("메뉴 1 : 자리선택");
			System.out.println("메뉴 2 : 프로그램 종료 !");
			menuNum = sc.nextInt();
			sc.nextLine();

			switch (menuNum) {
			case 1:
				movie.showseat();
				break;
			case 2:
				System.out.println("프로그램 종료!");
				System.exit(0);
				break;
			default:
				System.out.println("잘못된 숫자 입력");
			}
		} while (menuNum != 2);

//		for (int i = 0; i < seat.length; i++) {
//			seat[i] = "ㅁ";
//			System.out.print(seat[i] + "\t");
//		}
//		System.out.println();

	}

}
