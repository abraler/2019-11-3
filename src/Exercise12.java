import java.util.ArrayList;
import java.util.List;

public class Exercise12 {
    public static List<Integer> multipleOfSeven(){
        List<Integer> list = new ArrayList<>();
        int num = 0;
        while(num <= 100 && list.size() < 5){
            if(num % 7 == 0){
                list.add(num);
            }
            num++;
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(multipleOfSeven());
    }
}
