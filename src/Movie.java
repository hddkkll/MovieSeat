import java.util.Scanner;

public class Movie {
	private String[][] seat = new String[10][10];
	private int seatNum = 0;
	private int seatNum2 = 0;
	Scanner sc = new Scanner(System.in);

	public Movie() {
		for (int i = 0; i < seat.length; i++)
			for(int j=0; j<seat.length;j++)
				seat[i][j] = "��";
	}

	public void showseat() {
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		for (int i = 0; i < seat.length; i++) {
			for(int j=0; j<seat.length;j++)
				System.out.print(seat[i][j] + "\t");
			System.out.println();
		}
		System.out.println();
	}

	
	public void select() {
		System.out.print("�ڸ� �����ϼ��� : ");
		// do~while -> �ڸ� �Է¹ް� �ڸ��� ������ �ִ��� Ȯ��
		do {
			System.out.println("���°��?");
			seatNum = sc.nextInt();
			sc.nextLine();
			System.out.println("���°��?");
			seatNum2 = sc.nextInt();
			sc.nextLine();

			if ((seatNum > seat.length || seatNum < 1)&&(seatNum > seat.length || seatNum < 1))
				System.out.printf("�ڸ� ���� : 1���� %d������ �Է��ϼ��� !\n", seat.length);

		} while ((seatNum > seat.length || seatNum < 1) && (seatNum > seat.length || seatNum < 1));
		
		//�Է¹��� �ڸ��� �������� Ȯ��
		if(seat[seatNum-1][seatNum2-1]=="��") {
			seat[seatNum-1][seatNum2-1]="[����]";
			System.out.println("�ڸ� ���� �Ϸ� !");
		}
		else {
			System.out.println("���� : ������ �ڸ��Դϴ� !");			
		}

		System.out.println();
	}
}
