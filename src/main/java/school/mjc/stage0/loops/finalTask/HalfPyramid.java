package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i =1;i<=cathetusLength;i++){
//            space
            for (int j = cathetusLength-i; j>=1;j--){
                System.out.print(" ");
            }

//            *
            for (int k = i; k>=1; k--){
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
