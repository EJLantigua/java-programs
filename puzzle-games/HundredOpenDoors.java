
public class HundredOpenDoors {
    public static void main(String[] args){
        boolean flip = false;
        boolean doorsLock [] = new boolean[101];
        int tracker = 1;

        while (tracker <= 100) {
            for (int doors = 1; (doors * tracker) <= 100; doors++) {
                doorsLock[doors * tracker] = Flipper(doorsLock[doors * tracker]);
            }
        tracker++;
        }

        PrintArray(doorsLock);
    }

    public static boolean Flipper(boolean flop) {
        if (flop == true){
            return false;
        }
        else {
            return true;
        }
    }

    public static void PrintArray (boolean [] arrayBoolean) {
        for (int i = 1; i < arrayBoolean.length; i++) {
            System.out.print(i);
            System.out.print(". ");
            if (arrayBoolean[i] == false) {
                System.out.println("Closed door");
            }
            else {
                System.out.println("Open door");
            }
        }
    }
}
