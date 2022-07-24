public class Operation {
    public static String lastOperation;


    public static void chooseOperation (float value1,String operation, float value2){

        if (operation.equals("=") ){
            operation = lastOperation;
        }

        if ( operation.equals("+")  )
            {
                sum(value1, value2);
            }
        else if (operation.equals("-") )
            {
                subtraction(value1, value2);
            }
        else if (operation.equals("/") )
        {
            division(value1, value2);
        }
        else if (operation.equals("*") || operation.equals("x") || operation.equals("X") )
        {
            multiplication(value1, value2);
        }
        else if (operation.equals("AT90") )
        {
            AreaRightTriangleCalculation(value1, value2);
        }
        else if (operation.equals("AC") )
        {
            AreaCircleCalculation(value1, value2);
        }
        else if (operation.equals("RN") )
        {
            RootNCalculation(value1, value2);
        }
        else if (operation.equals("^") )
        {
            DegreeCalculation1(value1, value2);
        }
        else
        {
            System.out.print("Wrote not try operator");
            return;
        }
        lastOperation = operation;
        Result.PrintResult();





    }

    public static void sum(float value1, float value2){
        Result.result = value1 + value2;
    }

    public static void subtraction(float value1,float value2){
        Result.result = value1 - value2;
    }

    public static void multiplication(float value1,float value2){
        Result.result = value1 * value2;
    }

    public static void division(float value1,float value2){

        if (value2 != 0) {
            Result.result = value1 / value2;
        }
        else {
            System.out.print("Divisor can't be 0");
            return;
        }
    }

    public static void AreaRightTriangleCalculation(float value1,float value2){
        Result.result = value1 * value2 / 2;
    }

    public static void AreaCircleCalculation(float value1,float value2){
        Result.result = value1 * value1 * MathConctant.Pi;
    }

    public static void RootNCalculation(float value1,float value2){
        if (value2 != 0) {
            float N = 1 / value2;
            Result.result = (float) Math.pow(value1, N);
        }
        else {
            System.out.println("Degree can't be 0");
            Calculator.Run();
        }
    }

    public static void DegreeCalculation1(float value1,float value2) {

        if (value2 <= 100) {
            Result.result = (float) Math.pow(value1, value2);
        }
        else
        {
            System.out.println("Degree too more");
            Calculator.Run();
        }

    }
}
