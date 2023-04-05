package school.mjc.stage0.loops.finalTask;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        printTable(num);
    }
    public static void printTable(int numberTableToPrint) {
            for (int j = 0; j <= 10; j++) {
                System.out.println(j + " x " + numberTableToPrint + " = " + numberTableToPrint * j);
            }

    }
}
