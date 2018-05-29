package cl.vicentepc.shrinkquizz;

public class MatchAnswer{

    private int yourAge;
    private int yourLoverAge;

    public MatchAnswer() {
    }

    public MatchAnswer(int yourAge, int yourLoverAge) {
        this.yourAge = yourAge;
        this.yourLoverAge = yourLoverAge;
    }

    public int getYourAge() {
        return yourAge;
    }

    public int getYourLoverAge() {
        return yourLoverAge;
    }
}
