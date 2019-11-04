public class Exercise10 {
    public static int sum(){
        int sum = 0;
        int i = 0;
        while(i <= 100){
            sum += i;
            i += 2;
        }
        return sum;
    }

    public static void main(String[] args) {
        int t= sum();
        System.out.println(t);
    }
}
