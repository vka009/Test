import java.io.Serializable;
import java.util.*;

class Stn implements Serializable {
    public static Stn instance=null;
    private Stn(){
    }
    public static Stn getInstance(){
        if(instance==null){
            instance= new Stn();
        }
        return instance;
    }


}
public class JavaTester {
    public static void main(String args[]) {
        Stn stn=Stn.getInstance();
        //System.out.println(stn.hashCode());

        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        //By using lambda
        int sum = primes.stream().mapToInt(a->a).sum();
        System.out.println(sum);
        int min = primes.stream().mapToInt(a->a).min().orElse(0);
        System.out.println(min);
        int max = primes.stream().mapToInt(a->a).max().orElse(0);
        System.out.println(max);
        double average = primes.stream().mapToInt(a->a).average().orElse(0);
        System.out.println(average);

        //By using Collections
        System.out.println(Collections.min(primes));
        System.out.println(Collections.max(primes));

    }
}