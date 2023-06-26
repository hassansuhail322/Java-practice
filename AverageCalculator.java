import java.util.Scanner;
class Average{

    int temp = 2;
    
    double avg(int [] arr){
        double ans = 0;
        int sum = 0;
        for(int i = 0 ;i<arr.length ;i++){
            sum = sum + arr[i]; 
        }
        return sum/arr.length;

    }


}

public class AverageCalculator {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of array elements");
        int n = scanner.nextInt();

        int [] arr = new int[n];

        for(int i = 0 ;i<n;i++){
            System.out.println("enter the elements");
            arr[i] = scanner.nextInt();
        }

        Average avg = new Average();
        double ans = avg.avg(arr);
        System.out.println(ans);
    }
}
