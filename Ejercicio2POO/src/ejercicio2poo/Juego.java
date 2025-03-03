package ejercicio2poo;

public class Juego {
    public Juego(){
        for(int i=1;i<=100;i++){
         if (i%3==0 && i%5==0){
             System.out.println("FIZZBUZ");
         }else if(i%5==0){
             FizzBuss.imprimirfizz();
         }else if(i%3==0){
             FizzBuss.imprimirBuzz();
         }else{
             System.out.println(i);
         }
    }
    }
}