public class Player {

    int number = 0;

    public void guess() {

        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);

    }
}

class GameLauncher {
    public static void main(String[] args) {

        Guessgame game = new Guessgame();
        game.startGame();

    }
}
