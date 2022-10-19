package ders17_Scope;

public class C05_ObjectVariables {
    public static void main(String[] args) {
        //C03 class ındaki instance variablelara nasıl ulaşılır.
        //instance variable larin diger adi obje variable laridir.
        //instance variable'lara obje uzerinden ulasabilriz.
        C03_ObjectVariables pers1= new C03_ObjectVariables();
        System.out.println(pers1.persIsmi);
        System.out.println(pers1.persYasi);
        pers1.persIsmi="Mustafa";
        pers1.persYasi=23;
        pers1.persTelefonu= "5301519879";
        System.out.println(pers1.persIsmi);
        System.out.println(pers1.persYasi);

        C03_ObjectVariables pers2 = new C03_ObjectVariables();

        pers2.persIsmi="hilmi";
        pers2.persYasi=43;
        System.out.println(pers2.persIsmi);
        System.out.println(pers1.persIsmi);
        System.out.println(pers2.persYasi);


    }
}
