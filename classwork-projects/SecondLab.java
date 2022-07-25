public class Lab02 {
    static void firstLoop(){
        int num1 = 0;
        int num2 = 10;
        for(int i = 0; i < num2; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void secondLoop(){
        int num = 10;
        for (int i = 0; i < 10; i++) {
            for (int j = num; j > 0; j--) {
                System.out.print("*");
            }
            num--;
            System.out.println();
        }
    }

    static void thirdLoop(){
        int num1 = 10;
        int num2 = 0;
        for (int i = num2; i <= num1; i++) {
            for (int j = num2; j <= num1; j++) {
                if (j < i) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
        System.out.println();
        }
    }

    static void forthLoop(){
        int num1 = 10;
        int num2 = 0;
        for (int i = num1; i > num2; i--) {
            for (int j = num2; j <= num1; j++) {
                if(j < i) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static int factorial(int num){
        int factor;
        for(factor = 1; num > 1; num--){
            factor *= num;
        }
        return factor;
    }

    static void PascalsTriangle(int rows){
        int i, j;

        for(i = 0; i <= rows; ++i){
            for(int k=1; k<=(rows-i);++k){
                System.out.print(" ");
            }
            for(j = 0; j <= rows; ++j){
                if (j<=i) {
                    System.out.print(" " + (factorial(i) / (factorial(i-j) * factorial(j))));
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        firstLoop();
        secondLoop();
        thirdLoop();
        forthLoop();
        PascalsTriangle(8);
    }
}

