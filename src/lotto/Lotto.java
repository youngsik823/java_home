package lotto;

import java.util.Arrays;

public class Lotto {
    private static int[] lotto = new int[6];

    private static void lottoNum() {
        int i = 0;
            while (i < lotto.length){
            int rdNum = (int) (Math.floor(Math.random()*45)+1);
            if(compare(lotto, rdNum)){
                continue;
            }
            lotto[i] = rdNum;
            i++;
            }
    }
    protected static boolean compare(int[] lotto, int rdNum) {
        for (int j : lotto) {
            if (j==rdNum){
                return true;
            }
        }
        return false;
    }
    protected static int[] getLotto(){
        lottoNum();
//        System.out.println(Arrays.toString(lotto));
        return lotto;
    }

}
