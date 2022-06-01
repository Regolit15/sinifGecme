import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        float mat, turk, fiz, kim, muz, toplam = 0;
        float ortalama;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz :");
        mat = input.nextFloat();
        System.out.print("Turkce Notunuz : ");
        turk = input.nextFloat();
        System.out.print("Fizik Notunuz : ");
        fiz = input.nextFloat();
        System.out.print("Kimya Notunuz : ");
        kim = input.nextFloat();
        System.out.print("Muzik Notunuz : ");
        muz = input.nextFloat();

        if (mat >= 0 && mat <= 100) {
            toplam = toplam + mat;


        }
        if (turk >= 0 && turk <= 100) {
            toplam = toplam + turk;
        }
        if (fiz >= 0 && fiz <= 100) {
            toplam = toplam + fiz;
        }
        if (kim >= 0 && kim <= 100) {
            toplam = toplam + kim;

        }if (muz>=0 && muz<=100){
            toplam=toplam+muz;
        }
        ortalama=(mat+turk+fiz+kim+muz)/5;
        System.out.println("Ortalamaniz : "+ ortalama);
        if(ortalama>=55 && ortalama<=100){
            System.out.print("Gectiniz Tebrikler !! ");
        }if(ortalama<0 || ortalama>100){
            System.out.print("Yanlis Veri Girildi! Lutfen Tekrar Giriniz.");
        }else{
            System.out.print("Sinifta Kaldiniz!");
        }
    }
}
