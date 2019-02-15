import java.util.Scanner;

public class Movie {
	private String[][] seat = new String[10][10];
	private int seatNum = 0;
	private int seatNum2 = 0;
	Scanner sc = new Scanner(System.in);

	public Movie() {
		for (int i = 0; i < seat.length; i++)
			for(int j=0; j<seat.length;j++)
				seat[i][j] = "ㅁ";
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
		System.out.print("자리 선택하세요 : ");
		// do~while -> 자리 입력받고 자리가 범위에 있는지 확인
		do {
			System.out.println("몇번째줄?");
			seatNum = sc.nextInt();
			sc.nextLine();
			System.out.println("몇번째열?");
			seatNum2 = sc.nextInt();
			sc.nextLine();

			if ((seatNum > seat.length || seatNum < 1)&&(seatNum > seat.length || seatNum < 1))
				System.out.printf("자리 오류 : 1부터 %d까지만 입력하세요 !\n", seat.length);

		} while ((seatNum > seat.length || seatNum < 1) && (seatNum > seat.length || seatNum < 1));
		
		//입력받은 자리가 매진인지 확인
		if(seat[seatNum-1][seatNum2-1]=="ㅁ") {
			seat[seatNum-1][seatNum2-1]="[매진]";
			System.out.println("자리 예매 완료 !");
		}
		else {
			System.out.println("오류 : 매진된 자리입니다 !");			
		}

		System.out.println();
	}
}
