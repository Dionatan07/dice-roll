package application;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        int numberMoves = 100;

        List<Integer> values = new ArrayList<>();

        Random makerPlays = new Random();
        for (int i = 0; i < numberMoves; i++) {
            int number = makerPlays.nextInt(6) + 1;
            values.add(number);
        }

        Map<Integer, Integer> plays = new HashMap<>();
        for (Integer result : values){
            if(plays.containsKey(result)){
                plays.put(result, (plays.get(result)+1));
            }else plays.put(result, 1);
        }
        System.out.print("Playing");

        //Criando um timer antes de mostrar o resultado final
        for(int i=0; i < 3; i++){
            try{
                Thread.sleep(1250);
                System.out.print(".");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        //Entry utilizado para manipular a Key e o Value separadamente
        System.out.println("\nValue " + " number of times");
        for (Map.Entry<Integer, Integer> entry : plays.entrySet()){
            //%3d e %10d Estão sendo usados para criar um espaçamento ao mostrar os valores
            System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
        }

    }
}
