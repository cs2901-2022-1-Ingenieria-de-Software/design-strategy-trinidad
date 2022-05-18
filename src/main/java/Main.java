
//String archCSV = "gold.csv";
//CSVReader csvReader = new CSVReader(new FileReader(archCSV));
import java.util.Scanner;
        interface Strategy{

    public void execute();

}

class PromApertura implements Strategy{



    @Override
    public void execute(){
        /*File file = new File("gold.csv");
        List<String> lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
        for (String line : lines) {
            String[] array = line.split(";");

        }*/
    }


}

class PromCierre implements Strategy{



    @Override
    public void execute(){
        //hace algo
    }


}

class MedMovil implements Strategy{



    @Override
    public void execute(){
        //eae
    }


}

class Context{
    private Strategy strategy;

    public void setStrategy(Strategy newStrategy){
        this.strategy = newStrategy;
    }

    public void executeStrategy(){
        strategy.execute();
    }



}

public class Main{
    public static void main(){
        Context context = new Context();
        String action = "";
        Scanner input = new Scanner (System.in);
       /* entradaTeclado = input.nextLine ();

        if(action == "PromApertura"){
            context.setStrategy(new PromApertura());
        }
        else if(action == "PromCierre"){
            context.setStrategy(new PromCierre());
        }
        else if(action == "MediaMovil"){
            context.setStratgy(new MedMovil());
        }

        float result = context.executeStrategy();*/

    }

}



