package snakeAndLadderProblems;

public class UC_3CheckOption {
	static int playerPosition = 0;
static final int noPlay = 0;
static final int ladder = 1;
static final int snake = 2;

public static void main(String[] args) {
	int rollDie = (int) (Math.floor(Math.random()*(6)+1));
	int option = (int) ((Math.random()*10)%3);

	switch(option) {
	case noPlay: 
		playerPosition = 0;
		System.out.println("Player position is: "+playerPosition);
		break;
	case ladder:
		playerPosition += rollDie;
		System.out.println("Player position is: "+playerPosition);
		break;
	case snake:
		playerPosition -= rollDie;
		System.out.println("Player position is: "+playerPosition);
		break;
	}

}

}
