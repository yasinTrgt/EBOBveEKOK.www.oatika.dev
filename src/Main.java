import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("n1 Sayısını Giriniz : ");
        int n1 = sc.nextInt();
        System.out.print("n2 Sayısını Giriniz : ");
        int n2 = sc.nextInt();
        int ebob=0,ekok,sayac=1;

        while(sayac<=n1 || sayac<=n2){
            if(n1%sayac==0 && n2%sayac==0){
                if(sayac>ebob){
                    ebob=sayac;
                }
            }
            sayac++;
        }
        ekok = (n1*n2)/ebob;
        System.out.println("ebob = "+ebob+"\nekok = "+ekok);

    }
}
