package snakeAndLadderProblems;

public class UC_7TwoPositionsofDie {
	
	static final int noPlay = 0;
	static final int ladder = 1;
	static final int snake = 2;
	static int player1_Position= 0;
	static int player2_Position= 0;
	int winPosition=100;
	int option;
	int rollDie_1=0;
	int rollDie_2=0;
	int count=0;

	public void dice() {
		while(player1_Position<100 && player2_Position<100) {
			option = (int) ((Math.random()*10)%3);
			System.out.println("chance : "+option);
			rollDie_1 = (int) (Math.floor(Math.random()*(6)+1));

			switch(option) {
			case noPlay: 
				System.out.println("pass the chance");
				break;
			case ladder:
				rollDie_1 = (int) (Math.floor(Math.random()*(6)+1));
				rollDie_2 = (int) (Math.floor(Math.random()*(6)+1));
				System.out.println("your dice shows : "+rollDie_1);
				System.out.println("your dice shows : "+rollDie_2);
				System.out.println("you got ladder");
				if(player1_Position+rollDie_1<=100) {
					player1_Position=player1_Position+rollDie_1;
					System.out.println("your dice postion is " +player1_Position);
				}else {
					System.out.println("your dice postion is " +player1_Position);
					break;
				}
				count=count+1;
				if(player1_Position+rollDie_2<=100) {
					player2_Position=player2_Position+rollDie_2;
					System.out.println("your dice postion is " +player2_Position);
				}else {
					System.out.println("your dice postion is " +player2_Position);
					break;
				}
				break;
			case snake:
				System.out.println("you got a snake");
				player1_Position=player1_Position-rollDie_1;
				player2_Position=player2_Position-rollDie_2;
				if(player1_Position<0 || player2_Position<0) {
					player1_Position=0;
					player2_Position=0;
					System.out.println("your dice postion is " +player1_Position);
					System.out.println("your dice postion is " +player2_Position);
				}
				else {
					System.out.println("your dice postion is " +player1_Position);
					System.out.println("your dice postion is " +player2_Position);
				}
				count=count+1;    
			}
		}
		if(player1_Position>player2_Position) {
			System.out.println("player 1 is winner");
		}else {
			System.out.println("player 2 is winner");
		}
		System.out.println("you have rolled the dice for :"+count+ " times");	

	}
	public static void main(String[] args) {
		UC_7TwoPositionsofDie s = new UC_7TwoPositionsofDie();
        s.dice();
	}

}
