package ControlStatement;

public class Java_99Dan {
    public static void main (String args []) {
        //짝수인 구구단 출력 2,4,6,8

        for(int i=1; i<=9; i++) {
            for(int j=1; j<=9; j++) {

                if(i%2==0) {
                    System.out.println(i + "*" + j + "=" + (i * j));
                }
            }
            if(i%2==0) {
                System.out.println();
            }
        }

    }
}
