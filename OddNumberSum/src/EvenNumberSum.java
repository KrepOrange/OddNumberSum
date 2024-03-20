import java.util.Scanner;

public class EvenNumberSum {
    public static void main(String[] args) {
        //variables
        int numbers, divisor = 2, divisor2 = 4, sum = 0;
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Sayı giriniz: ");
            numbers = input.nextInt();

            if(numbers < 0)
                break;

            if(numbers % divisor2 == 0)
                sum += numbers;

        }while(numbers % divisor == 0);

        System.out.println("Çift sayılarınızdan " + divisor2 + " sayısına bölünebilenlerinin toplamı = " + sum);
    }
}
