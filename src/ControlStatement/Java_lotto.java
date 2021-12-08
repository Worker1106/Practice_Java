package ControlStatement;

public class Java_lotto {
    public static void main (String args []) {
        int[] lotto = new int[6];
        // 배열, list = (type) 변수 : 배열변수로 표현해서 코드간소화 가능
        for(int i=0; i<lotto.length; i++) {
           lotto[i] = (int)((Math.random()*45) + 1);

           if (i!=0) {
               System.out.print(",");
           }

            System.out.print(lotto[i]);

        }

    }
}
