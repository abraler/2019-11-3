import java.util.Map;
import java.util.TreeMap;

public class Exercise11 {
    public static Map<Integer,Double> celsAndFahr(){
        Map<Integer,Double> map = new TreeMap<>();
        int cels = 0;
        int count = 1;
        do{
            double fahr = cels * 9 / 5.0 + 32;
            map.put(cels,fahr);
            count++;
            cels += 20;
        }while(count <= 10 && cels <= 250);
        return map;
    }

    public static void main(String[] args) {
        System.out.println(celsAndFahr());
    }
}
