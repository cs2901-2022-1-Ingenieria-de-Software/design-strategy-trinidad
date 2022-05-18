<<<<<<< HEAD
import java.util.Scanner;
import java.io.FileReader;
import java.io.File; 
import java.util.List;
import java.util.ArrayList; 
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

interface Strategy{
  
  public double execute();
  
}

class PromApertura implements Strategy{
  @Override
  public double execute(){
    try{
    File file = new File("gold.csv"); 
    List<String> lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8); 
    for (String line : lines) { 
       String[] array = line.split(";");
       System.out.println(array[0]+" "+array[array.length-1]);     
    }
  }
  catch(Exception e){}
    return 0.10;
  }
}

class PromCierre implements Strategy{
  @Override
  public double execute(){
    //hace algo
    System.out.println ("Prom cierre");  
    return 0.1;
  }
}

class MedMovil implements Strategy{
  @Override
  public double execute(){
    //eae
    System.out.println ("Media Movil");
    return 0.2;
  }
}

class Context{
  private Strategy strategy;
  
  public void setStrategy(Strategy newStrategy){
    this.strategy = newStrategy;
  }
  
  public double executeStrategy(){
    return strategy.execute();
  } 
}

public class Main{
    public static void main(String[] args){
    Context context = new Context();
    String action = "";
    Scanner input = new Scanner (System.in);
    action = input.nextLine();
    if(action.equals("PromApertura")){
        context.setStrategy(new PromApertura());
    }
    else if(action.equals("PromCierre")){
        context.setStrategy(new PromCierre());
    }  
    else if(action.equals("MediaMovil")){
        context.setStrategy(new MedMovil());
    }
    
    double result = context.executeStrategy();
    
    System.out.println ("Tu resultado es: \"" + result  +"\"");
    }
}
=======

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



>>>>>>> b74d0b9122ca5742f60d6ce211b5875a143734f9
