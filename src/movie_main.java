import java.util.Scanner;

public class movie_main {
	public static void main(String[] args) {
		Movie movie = new Movie();

		int menuNum = 0;

		do {
			System.out.println("�޴� 1 : �ڸ�����");
			System.out.println("�޴� 2 : ���α׷� ���� !");
			System.out.println("�޴� 3 : �ڸ� Ȯ���ϱ�");
			menuNum = movie.sc.nextInt();
			movie.sc.nextLine();

			switch (menuNum) {
			case 1:
				movie.showseat();
				movie.select();
				break;
			case 2:
				System.out.println("���α׷� ����!");
				System.exit(0);
				break;
			case 3:
				movie.showseat();
				break;
			default:
				System.out.println("�߸��� ���� �Է�");
			}
		} while (menuNum != 2);

	}

}
