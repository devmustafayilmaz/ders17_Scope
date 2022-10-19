package ders17_Scope;

public class C03_ObjectVariables {

    static String hastaneIsmi="Yildiz Hastanesi";
    static int hastaSayisi=23453;
    static String basHekimIsmi;
    String persIsmi="isim girilmedi";
    String persTelefonu;
    int persYasi;

    /*
    class level variableların scope u tüm class da geçerlidir. static kelimesi ile işaretelenen
    variablelara class içerisnden her yer den ulaşılabildiği için class variables denir.
    static kelimesi ile işaretlenmeyen variable lara ise instance variablelar denir.

    instance variabler objelere bağlı olduklarından bu variablealar object variablelar denir.
     */
    public static void main(String[] args) {


    }
}
