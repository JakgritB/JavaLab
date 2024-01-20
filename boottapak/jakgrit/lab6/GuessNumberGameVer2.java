package boottapak.jakgrit.lab6;

public class GuessNumberGameVer2 extends GuessNumberGameVer1 implements HasRule {

    public GuessNumberGameVer2() {
        super();
    }

    public GuessNumberGameVer2(int minNum, int maxNum, int maxTries) {
        super(minNum, maxNum, maxTries);
    }

    public void gameRule() {
        System.out.println("Guess Number Game Rules : ...");
    }

    @Override
    public void playGame() {
        System.out.println("Playing Guess Number Game Version 2");
    }

    @Override
    public String toString() {
        System.out.print("Guess Number Game Version 2 : ");
        return super.toString();
    }
}
