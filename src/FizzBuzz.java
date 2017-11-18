/**
 * Created by wangyaofeng on 4/6/17.
 */
public class FizzBuzz {
    int number;
    public FizzBuzz(int n){
        this.number = n;
    }
    public String answer(){
        String answer =  new String();
        if(number % 3 == 0){
            answer = "fizz";
        }
        if(number % 5 == 0){
            answer += "buzz";
        }
        if(!(number % 3 == 0) && !(number % 5 == 0)){
            answer = ((Integer) number).toString();
        }
        return answer;
    }
}
