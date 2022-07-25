import java.util.Scanner;

public class Test {
    public int maxNum(ArrayList<Integer> iList){
        int mNum = 0;

        for (Integer e : iList){
            if (e > mNum){
                mNum = e;
            }
        }
        return mNum;
    }
    
    public static void main(String[] args){
        Triangle t1 = new Triangle(1, 1.5, 1, "Yellow", true);
        t1.display();
        System.out.println();

        //Constructing Scanner, ArrayList, String objects/ int variable types
        Scanner uInput = new Scanner(System.in);
        ArrayList<Integer> s1 = new ArrayList<>();
        String repeat = "";
        int maxNum = 0;

        //Loop to add integers to arraylist
        do{
            System.out.print("Enter in a whole number to add to your list--- ");
            int value = uInput.nextInt();
            if (value > maxNum)
                maxNum = value;
            System.out.print("Would you like to enter another number in your list (Y/N)? ");
            repeat = uInput.next().toUpperCase();
        } while(repeat.equals("Y"));

        //Display users maximum value
        System.out.println("The maximum value is " + maxNum);

        //Q3 showing an example of Dynamic Polymorphism
        //Constructing objects and defining variables
        Enemies e1 = new Enemies();
        int choice = 0;

        //Using Dynamic Polymorphism
        System.out.println("There are enemies attacking! Quick, tell us are you going to escape or fight like a real man?!");
        System.out.println("Choose--- Choice 1: Forget y'all I gots to go --- Choice 2: I'm a man at heart!");
        choice = uInput.nextInt();
        if (choice == 1) {
            e1 = new FirstClassAgent();
            e1.attack();
            System.out.println("You: OUCH IDIOT THAT HURTS!!!");
        }
        else{
            e1.attack();
        System.out.println("You: IS THAT ALL YOU WEAKLINGS GOT!!!");
        }
    }
}
