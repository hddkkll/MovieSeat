import java.util.Scanner;

public class Movie {
	private String[] seat = new String[10];
	private int seatNum = 0;
	Scanner sc = new Scanner(System.in);
	
	public Movie(){
		for (int i = 0; i < seat.length; i++)
			seat[i] 	= "��";
	}
	
	public void showseat() {
		System.out.println("= = = = = = = = = = = = = = = �ڸ� = = = = = = = = = = = = = =");

		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i] + "\t");
		}
		System.out.println();
		
		select();
	}
	
	private void select() {
		System.out.print("�ڸ� ����?");
		do {
		seatNum = sc.nextInt();
		sc.nextLine();
		if(seatNum>seat.length || seatNum<1)
			System.out.printf("�ڸ� ���� : 1���� %d������ �Է��ϼ��� !\n",seat.length);
		
		
		}while(seatNum>seat.length || seatNum<1);
		
		seat[seatNum - 1] = "*";
		for (String st : seat)
			System.out.print(st + "\t");
		System.out.println();
		System.out.println("�ڸ� ���� �Ϸ� !");
	}
	
	private boolean check(String[] seat, int seatNum) {
		return true;
	}
}
