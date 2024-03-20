import java.util.Scanner;

public class OddNumberSum {
    public static void main(String[] args) {
        //variables
        int stopNumber = 0, divisor = 2, numbers, sum = 0;
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Sayı giriniz: ");
            numbers = input.nextInt();
            if(numbers > 0 && numbers % 2 != 0)
                sum += numbers;

        }while(numbers > stopNumber);

        System.out.println("Sayılarınızdan tek sayı olanların toplamı = " + sum);
    }
}
