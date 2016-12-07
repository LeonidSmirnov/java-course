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
            String operation = "sum";



            while (!exit.equals("yes")){
                System.out.println("Vibirete deystvie : delenie , umnozh , minus ,sum");
                operation = scanner.next();
                System.out.println("Enter first argument :");
                String first = scanner.next();
                System.out.println("Enter second argument : ");
                String second = scanner.next();
                switch (operation){
                    case "sum": calculate.sum(Integer.valueOf(first) , Integer.valueOf(second));
                        System.out.println("Result " + calculate.getResult());
                        calculate.cleanResult();
                        break;
                    case "minus":calculate.minus(Integer.valueOf(first) , Integer.valueOf(second));
                        System.out.println("Result " + calculate.getResult());
                        calculate.cleanResult();
                        break;
                    case "umnozh":calculate.umnozh(Integer.valueOf(first) , Integer.valueOf(second));
                        System.out.println("Result " + calculate.getResult());
                        calculate.cleanResult();
                        break;
                    case "delenie":calculate.delenie(Double.valueOf(first) , Double.valueOf(second));
                        System.out.println("Result " + calculate.getResult());
                        calculate.cleanResult();
                        break;

                }

                System.out.println("yes/no");
                exit = scanner.next();

            }
        }
            catch (Exception e){
            scanner.close();

            }
        }

    }

