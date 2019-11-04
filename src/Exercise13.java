public class Exercise13 {
    public static int count(){
        int water = 15;
        int count = 0;
        while(water < 50){
            water += 5;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count());
    }
}
