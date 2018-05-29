package cl.vicentepc.shrinkquizz;

public class LuckyResult extends LuckyAnswer{

    public LuckyResult(boolean userAnswer) {
        super(userAnswer);
    }

    public String userAnswerResult(){

        boolean userAnswerResult = isUserAnswer();

        if(userAnswerResult == true){

            return "Esa es la actitud!" + luckyDateResult();

        }else{

            return "Anímate!" + luckyDateResult();

        }

    }

    private String luckyDateResult(){

        boolean luckyDateResult = isLuckyDay();

        if(luckyDateResult == true){

            return "y es tu día de suerte!";

        }else{

            return "vendrán mejores tiempos :)";

        }

    }

}
