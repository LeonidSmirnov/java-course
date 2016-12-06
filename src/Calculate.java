/**
 * Created by Asus on 05.12.2016.
 */
public class Calculate {
    private int result;

    public void sum(int ... params){
        for (Integer param: params
             ) {
            this.result += param;
            
        }

    }

    public int getResult(){
        return this.result;
    }

    public void cleanResult(){
        this.result =0;
    }



}
