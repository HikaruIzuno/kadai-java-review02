
public class Review02 {

    public static void main(String[] args) {
        //1~100までの繰り返し操作
        for (int i = 1; i <= 100; i++) {
            //3,5いづれでも割り切れるとき
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0 ) { //3で割り切れる時
                System.out.println("Fizz");
            }else if(i % 5 == 0 ) { //5で割り切れる時
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }

    }

}
