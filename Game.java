class Game{
    static String game(int n){
        if(n%15==0){
            return "FizzBuzz";
        }
        else if(n%3==0){
            return "Fizz";
        }
        else if(n%5==0){
            return "Buzz";
        }
        else{
           String str = String.valueOf(n);
            return str;
        }
    }
}
