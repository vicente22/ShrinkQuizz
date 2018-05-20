package cl.vicentepc.shrinkquizz;

public class PartyResult extends PartyAnswer {

    public PartyResult(String answer) {
        super(answer);
    }

    public String score(){

        return processing();

    }

    private String processing() {
        String answer = getAnswer();

        if(answer.contains("5")){

            return "Eres un niño";

        }else if(answer.contains("10")){

            return "Bien, dale campeón";

        }else{

            return "Eres un borracho, consigue ayuda";

        }
    }

}
