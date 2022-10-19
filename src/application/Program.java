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
        System.out.println(plays);

    }
}
