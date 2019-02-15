import java.util.Scanner;

public class Movie {
	private String[] seat = new String[10];
	private int seatNum = 0;
	Scanner sc = new Scanner(System.in);
	
	public Movie(){
		for (int i = 0; i < seat.length; i++)
			seat[i] 	= "ㅁ";
	}
	
	public void showseat() {
		System.out.println("= = = = = = = = = = = = = = = 자리 = = = = = = = = = = = = = =");

		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i] + "\t");
		}
		System.out.println();
		
		select();
	}
	
	private void select() {
		System.out.print("자리 어디로?");
		do {
		seatNum = sc.nextInt();
		sc.nextLine();
		if(seatNum>seat.length || seatNum<1)
			System.out.printf("자리 오류 : 1부터 %d까지만 입력하세요 !\n",seat.length);
		
		
		}while(seatNum>seat.length || seatNum<1);
		
		seat[seatNum - 1] = "*";
		for (String st : seat)
			System.out.print(st + "\t");
		System.out.println();
		System.out.println("자리 선택 완료 !");
	}
	
	private boolean check(String[] seat, int seatNum) {
		return true;
	}
}
