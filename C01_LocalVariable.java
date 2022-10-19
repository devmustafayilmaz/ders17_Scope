package ders17_Scope;

public class C01_LocalVariable {
    public static void main(String[] args) {

        //bir variable ın içerisinde oluşturulan variablerın scope u
        //içinde oluşturdukları method'dur.
        //o method un dışından ulaşılamazlar

        String isim="ramazan";
        int sayi=10;
        System.out.println();

        for (int i = 0; i < 10; i++) {
            String adres ="ANkara";
        }
        //System.out.println(adres);
        //double pi;
        //System.out.println(pi);
        //local variable'lar deger atamadan ulusturulabilir.ancak deger ataması olmadan çalışmazlar uyarı verirler.

    }
    public static void method(){
        boolean dogruMu=true;



    }
}
