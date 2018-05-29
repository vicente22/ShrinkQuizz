package cl.vicentepc.shrinkquizz;

public class MatchResult extends MatchAnswer{

    public String matchResult(int yourAge, int yourLoverAge){

        yourAge = getYourAge();
        yourLoverAge = getYourLoverAge();

        if(yourAge <= 18 && yourLoverAge <= 18){

            return "Ustedes son menores de edad";

        }else if(yourAge >= 18 && yourLoverAge >= 18){

            return "Ustedes son mayores de edad";

        }else{

            return "Ustedes no son la pareja ideal";

        }

    }

}
