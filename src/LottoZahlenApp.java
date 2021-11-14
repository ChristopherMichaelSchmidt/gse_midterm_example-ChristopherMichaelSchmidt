import java.util.Arrays;

public class LottoZahlenApp {

    public static void main(String[] args) {


        System.out.println(Arrays.toString(generateRandomNumbers(6,45)));


    }



    public static int[] generateRandomNumbers(int size, int maxNumber){
        int[] lotto = new int[size];

        for(int i = 0; i<lotto.length; i++){
            lotto[i]=  (int) (Math.random() * maxNumber + 1);


        }
        return lotto;


    }







}




