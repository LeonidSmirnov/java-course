import java.util.Scanner;

/**
 * Created by Asus on 07.12.2016.
 */
public class RunnerCalculate {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Calculate calculate  = new Calculate();
            String exit = "no";
            while (!exit.equals("yes")){
                System.out.println("Enter first argument :");
                String first = scanner.next();
                System.out.println("Enter second argument : ");
                String second = scanner.next();
                calculate.sum(Integer.valueOf(first) , Integer.valueOf(second));
                System.out.println("Result " + calculate.getResult());
                calculate.cleanResult();
                System.out.println("yes/no");
                exit = scanner.next();
            }
        }
            finally{
            scanner.close();

            }
        }

    }

