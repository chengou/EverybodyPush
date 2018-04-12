/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everybodypush;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author cfo5046
 */
public class EverybodyPush {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Date d = new Date();
        int question = 0;

        System.out.println("Nice to meet you! I'm Siri. Tell me your name. ");

        Scanner in = new Scanner(System.in);
        String namer = in.nextLine();

        System.out.println("Hi, " + namer + ". What do you want to know?");
        while (question != -1) {
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();

            if (input.contains("time")) {
                System.out.println("Current time：" + d.toString());
            } else if (input.contains("age")) {

                System.out.println("Let me guess...");

                String input2 = in.nextLine();
                if (input2.contains("no")) {
                    System.out.println("Tell me your age");
                }
                Scanner in2 = new Scanner(System.in);

                if (input2.contains("yes")) {
                    System.out.println("Bingo！");
                }

            }
        }
    }

}
