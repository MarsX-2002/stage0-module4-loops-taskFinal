package school.mjc.stage0.loops.finalTask;

import javax.sound.midi.Soundbank;

public class Pyramid {
    public void printPyramid(int cathetusLength) { // 5
        for (int i = 1; i <= cathetusLength; i++) {
//            print spaces before
            for (int j = cathetusLength - i; j >= 1; j--) {
                System.out.print(" ");
            }

//            print first numbers
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }

//            print second numbers
            for (int l = 2; l<=i; l++){
                System.out.print(l);
            }

            System.out.println();
        }
    }


    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
