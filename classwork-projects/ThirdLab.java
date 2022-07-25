public class Test {
    public static double Same(int a, int b){
        if (a%b == 0){
            System.out.print("Divisible ");
            return 0;
        }
        else
            return (a%b);
    }

    public static double Same(int a, int b, int c){

        return ((double) (a + b + c) / 3);
    }

    public static void swappingValues(int[] numArray){
        int sub = 0;
        System.out.print("The first 2 numbers in chronological order is: " + numArray[0] + " and " + numArray[1]);
        System.out.println();
        sub = numArray[1];
        numArray[1] = numArray[0];
        numArray[0] = sub;
        System.out.print("The first 2 numbers in chronological order is now: " + numArray[0] + " and " + numArray[1]);
        System.out.println();
    }

    public static void reverseArray(int[] numArray){
        int sub = 0;
        System.out.print("Numbers in my Array:" + '\t');
        for(int e = 0; e < numArray.length; e++){
            System.out.print(numArray[e] + " ");
        }
        System.out.println();

        for(int i = 0; i < (numArray.length) / 2; i++){
            sub = numArray[i];
            numArray[i] = numArray[(numArray.length-1) - i ];
            numArray[(numArray.length - 1) - i] = sub;
        }

        System.out.print("Numbers in my Array:" + '\t');
        for(int e = 0; e < numArray.length; e++){
            System.out.print(numArray[e] + " ");
        }
    }

    public static void main(String[] args) {
        int[] firstArray = {5, 7};
        int[] secondArray = {1, 2, 3, 4, 5};

        System.out.print(Same(8,8));
        System.out.println();
        System.out.print(Same(2, 3,8));
        System.out.println();

        swappingValues(firstArray);
        reverseArray(secondArray);
    }
}

