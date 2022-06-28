import java.util.Random;
import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);

        int right = 0;
        int selected;
        int[] wrong = new int[5];

        while(right <5){
            System.out.println("Lütfen tahmininizi giriniz :");
            selected = input.nextInt();

            if (selected < 0 || selected > 99){
                System.out.println("Lütfen 0-100 arasında bir değer giriniz :");
                continue;

            }
            if(selected == number){
                System.out.println("Tebrikler, doğru tahmin! Tahmin ettiğiniz sayı :" + number);
                break;
            } else{
                wrong[right++] = selected;
                
                System.out.println("Hatalı bir sayı girdiniz :");
                if(selected > number){
                    System.out.println(selected + "  sayısı, gizli sayıdan büyüktür");
                }else{
                    System.out.println(selected + "  sayısı, gizli sayıdan küçüktür");
                }
                System.out.println("Kalan hakkı : " + (5 - right));

            }

            right++;
        }
        System.out.println(number);
    }

    
}
