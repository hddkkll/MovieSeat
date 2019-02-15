import java.util.Scanner;

public class movie_main {
	public static void main(String[] args) {
		Movie movie = new Movie();

		int menuNum = 0;

		do {
			System.out.println("메뉴 1 : 자리선택");
			System.out.println("메뉴 2 : 프로그램 종료 !");
			System.out.println("메뉴 3 : 자리 확인하기");
			menuNum = movie.sc.nextInt();
			movie.sc.nextLine();

			switch (menuNum) {
			case 1:
				movie.showseat();
				movie.select();
				break;
			case 2:
				System.out.println("프로그램 종료!");
				System.exit(0);
				break;
			case 3:
				movie.showseat();
				break;
			default:
				System.out.println("잘못된 숫자 입력");
			}
		} while (menuNum != 2);

	}

}
