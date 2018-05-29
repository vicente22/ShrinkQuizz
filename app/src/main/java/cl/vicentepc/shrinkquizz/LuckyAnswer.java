package cl.vicentepc.shrinkquizz;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LuckyAnswer {

    private boolean userAnswer;
    private boolean luckyDay;

    public LuckyAnswer(){

    }

    public LuckyAnswer(boolean userAnswer) {

        this.userAnswer = userAnswer;

        luckyDay = new LuckyDate().luckyDateMethod();

    }

    public boolean isUserAnswer() {
        return userAnswer;
    }

    public boolean isLuckyDay() {
        return luckyDay;
    }

    private class LuckyDate{

        public boolean luckyDateMethod(){

            Date date = new Date();

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd");

            int day = Integer.parseInt(simpleDateFormat.format(date));

            if(day %2 == 0){

                return true;

            }else{

                return false;

            }

        }

    }
}
