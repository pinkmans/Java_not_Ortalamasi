import java.util.Scanner;
public class notOrtalaması{
    public static void main(String [] args){
        // değişken tanımlama işlemi
        double mat, fiz , kim , tur , muz;
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan değer alma işlemleri

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fiz = input.nextInt();

        System.out.print("kimya notunuzu giriniz: ");
        kim = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        tur = input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muz = input.nextInt();

        double tp = mat+fiz+kim+tur+kim+ muz;
        double ort = tp / 6;
        
        // koşullu durum eğer ortalama 60 dan büyük ise ekranda sınıfı geçti yazsını görücez değil ise sınıfta kaldı görülecek
        System.out.println(" ortalamanız "+ort);
        
        Boolean kosul = ort>= 60;
        System.out.println("sınıf" + (kosul==true ? "'ı Geçiyorsunuz" : "'ta kalıyorsunuz"));

    }
}
