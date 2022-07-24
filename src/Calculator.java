import java.util.Scanner;

public class Calculator {
    public static float value1;
    public static float value2;

    public static void main(String arg[]) {
        value1 = 0;
        value2 = 0;
        Result.resultSave = false;
        Result.result = 0;
        Run();
    }

    public static void Run() {
        Scanner keyboard = new Scanner(System.in);
        if (Result.resultSave == false)
        {
            System.out.println("enter first float");
            float value1 = keyboard.nextInt();
            System.out.println("enter operation. Can -,/,*,^,= - repeat last operation with  second float,AC - Area a circle,AT90 - Area ot a right triangle,RN - root N degree");
            String operation = keyboard.next();
            System.out.println("enter second float");
            float value2 = keyboard.nextInt();
            Operation.chooseOperation(value1, operation, value2);
            Result.resultSave = true;
            Run();
        } else {
            value1 = Result.result;
            System.out.println("enter operation. Can -,/,*,^,= - repeat last operation with  second float,AC - Area a circle,AT90 - Area ot a right triangle,RN - root N degree");
            String operation = keyboard.next();
            System.out.println("enter second float");
            float value2 = keyboard.nextInt();
            Operation.chooseOperation(value1, operation, value2);
            Run();
        }


    }

}

