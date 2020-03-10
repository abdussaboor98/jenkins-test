import java.time.LocalDate;
import java.time.LocalTime;

class JenkinsTest{
    public static void main(String[] args){
        System.out.println("Today's Date:" + LocalDate.now());
        System.out.println("Current Time:" + LocalTime.now());
        int n = 50;
        System.out.println("Sum("+n+") = "+sumOfN(n));
        
    }
    public static int sumOfN(int n){
        if(n == 1)
            return 1;
        return n+sumOfN(n-1);
    }
}