import java.util.Scanner;

public class movie_main {
	public static void main(String[] args) {
		Movie movie = new Movie();
		Scanner sc = new Scanner(System.in);
		
		// int [][] seat = new int[10][10];
		
		int menuNum = 0;
		

		do {
			System.out.println("�޴� 1 : �ڸ�����");
			System.out.println("�޴� 2 : ���α׷� ���� !");
			menuNum = sc.nextInt();
			sc.nextLine();

			switch (menuNum) {
			case 1:
				movie.showseat();
				break;
			case 2:
				System.out.println("���α׷� ����!");
				System.exit(0);
				break;
			default:
				System.out.println("�߸��� ���� �Է�");
			}
		} while (menuNum != 2);

//		for (int i = 0; i < seat.length; i++) {
//			seat[i] = "��";
//			System.out.print(seat[i] + "\t");
//		}
//		System.out.println();

	}

}
