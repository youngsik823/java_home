package lotto;

import java.util.Arrays;
import java.util.Scanner;

public class BuyLotto {
    private static int[] choose = new int[6];
    static Scanner sc = new Scanner(System.in);
    
    private static int[] chooseLotto() {
        int i = 0;
        while (i< choose.length){
            System.out.print(i+1+"번째 숫자 >>");
            int input = Integer.parseInt(sc.nextLine());
            if(Lotto.compare(choose, input)){
                System.out.println("중복된 숫자입니다.");
                continue;
            }
            choose[i] = input;
            i++;
        }
        return choose;
    }
    private static int compareLotto(int [] lotto, int [] choose){
        int num = 0;
        for (int a : lotto) {
            for (int b : choose) {
                if(a==b){
                    num++;
                }
            }
        }
        return num;
    }
    protected static void correct(){
        int count = 1;
        int[] cs = chooseLotto();
        //System.out.println(Arrays.toString(choose));
        while (true){
            int[] lt = Lotto.getLotto();
            int num =  compareLotto(lt, cs);
            // System.out.println(num);
            if(num==6){
//                System.out.println(Arrays.toString(cs));
//                System.out.println(Arrays.toString(lt));
                System.out.println(count+"번째 로또 당첨되셨습니다!!");
                break;
            }else {
//                System.out.println(Arrays.toString(cs));
//                System.out.println(Arrays.toString(lt));
                System.out.println(count+"번째 로또 도전");
            }
            count++;
        }
    }

}
