import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        double pi=3.14;
        Scanner scanner=new Scanner(System.in);
        System.out.println("dairenini yarıçapını giriniz");
        r= scanner.nextInt();

        double daireCevre= 2*pi*r;
        double daireAlan=pi*r*r;
        System.out.println("dairenin çevresi"+ daireCevre);
        System.out.println("daireninin alanı"+ daireAlan);
    }
}