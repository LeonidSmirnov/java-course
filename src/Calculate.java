/**
 * Created by Asus on 05.12.2016.
 */
public class Calculate {
    private double result;

    public void sum(int ... params){
        for (Integer param: params
             ) {
            this.result += param;
            
        }

    }

    public void minus(int ... params){
       for (int i = 0; i<params.length-1 ; i++){
           this.result = params[i] - params[i+1];
       }

    }

    public void umnozh(int ... params){
        this.result = 1;
        for (Integer param: params
                ) {

            this.result *=param ;

        }

    }

    public void delenie(double ... params){
        this.result= 1;
        for (Double param: params
             ) {result /=param;

        }
    }

    public double getResult(){
        return this.result;
    }

    public void cleanResult(){
        this.result =0;
    }



}
