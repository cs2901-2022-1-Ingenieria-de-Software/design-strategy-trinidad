import java.util.Scanner;
import java.io.File; 
import java.util.List;
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
  catch(Exception e){
  }
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
