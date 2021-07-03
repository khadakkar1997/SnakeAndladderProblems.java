package snakeAndLadderProblems;

public class UC_4RepeatTillWinPosition {
	
	static final int noPlay = 0;
	static final int ladder = 1;
	static final int snake = 2;

	public static void main(String[] args) {
		int playerPosition = 0;
		int winPosition=100;

		for(playerPosition=0; playerPosition<winPosition; playerPosition++) {

			int option = (int) ((Math.random()*10)%3);
			int rollDie = (int) (Math.floor(Math.random()*(6)+1));
			if(playerPosition < 0) {
				switch(option) {
				case noPlay: 
					playerPosition = 0;
					//System.out.println("Player position is: "+playerPosition);
					break;
				case ladder:
					playerPosition += rollDie;
					//System.out.println("Player position is: "+playerPosition);
					break;
				case snake:
					playerPosition -= rollDie;
					break;
				}	
			}
		}
		System.out.println("Player position is: "+playerPosition);
	}
	
	

}
