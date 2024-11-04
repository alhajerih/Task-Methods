import java.util.ArrayList;

public class SummationPractice {
    public static int calculateSum(ArrayList<Integer>num){
        int sum=0;
        for(int i:num)
            sum+=i;

        return sum;
    }
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(20);
        numbers.add(14);
        numbers.add(90);
        numbers.add(46);
        numbers.add(37);

        System.out.println(calculateSum(numbers));

    }
}