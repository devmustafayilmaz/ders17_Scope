package ders17_Scope;

public class C02_ScopeClassLevelVariables {

    // class level variable'lar methodların dışında oluşturulur.
    //genel kullanım en üstte oluşturulmalıdır.

    static String hastaneIsmi="Yildiz Hastanesi";
    static int hastaSayisi=23453;
    static String basHekimIsmi;
    String persIsmi="isim girilmedi";
    String persTelefonu;
    int persYasi;



    public static void main(String[] args) {
        System.out.println(hastaneIsmi);//Yildiz Hastanesi
        System.out.println(basHekimIsmi);// null yazdirir ama bu çok uygun olmaz en azından
                                            //açiklayici cümleler yazin.
        //System.out.println(persIsmi);//static olmadığı için main methoddan kullanılmaz.

        /*
        Class level variable lar a deger atamasi yapılmamış olursa java bu variabler a
        data türüne göre default olarak tanimalanan degerleri atar.
        default degerler sayisal variabler icin ; 0
        default boolean : false;
        char : '';
        objeler:(String dahil) : null;

         */

    }

    public static void method1(){
        System.out.println(hastaSayisi);
        hastaSayisi++;
        //System.out.println(persIsmi);
    }
    public void method2() {
        System.out.println(hastaneIsmi);
        hastaSayisi++;
        System.out.println(persIsmi);//isim girilmedi
        System.out.println(persYasi);//0
    }
}
