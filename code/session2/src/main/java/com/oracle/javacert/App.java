package com.oracle.javacert;

import com.oracle.javacert.associate.A;
import com.oracle.javacert.associate.B;

public class App {

    public static void main(String... args) {
         /*static1();

        MarkSheet markSheet = new MarkSheet();
        markSheet.nonStatic();

        MarkSheet.static2();*/
         System.out.println(A.result(3,3));
        System.out.println(B.result(3,3));

    }
}
