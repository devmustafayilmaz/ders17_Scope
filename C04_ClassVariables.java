package ders17_Scope;

public class C04_ClassVariables {
    public static void main(String[] args) {
        //C03 deki hastane ismini yazdiemak istersek
        System.out.println(C03_ObjectVariables.hastaneIsmi);
        System.out.println(C03_ObjectVariables.hastaSayisi);

        C03_ObjectVariables.hastaSayisi++;
        C03_ObjectVariables.hastaSayisi++;
        method1();
        System.out.println(C03_ObjectVariables.hastaSayisi);//23456
    }   //kod takibi main methoddan baslar
        //main methodun sonuna gelindiğinde hersey biter
        //tum degisimler resetlenir.
        //variable lar degerleri bastaki hallerine doner



    public static void method1(){
        C03_ObjectVariables.hastaSayisi++;
    }

    /*
    java runtime programdir.
    çalismaya basladığında variable'lara atanan degerleri
    isler
    calistigi muddetce
     */
}
