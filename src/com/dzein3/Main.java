package com.dzein3;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Samochod auto = FabrykaSamochodow.getSamochod(160);
        System.out.println(auto.getClass().toString());
        System.out.println(auto.MaxPredkosc());
        auto.getClass().toString();
    }
}
interface Samochod {
    public int MaxPredkosc();
}

class Mercedes implements Samochod{
    int cena = this.cena;
    int maxpredkosc = 160;
    String kolor = this.kolor;
    public int MaxPredkosc(){
        return this.maxpredkosc;
    }
}
class BMW implements Samochod{
    int cena = this.cena;
    int maxpredkosc = 180;
    String kolor = this.kolor;
    public int MaxPredkosc(){
        return this.maxpredkosc;
    }
}
class Audi implements Samochod{
    int cena = this.cena;
    int maxpredkosc = 175;
    String kolor = this.kolor;
    public int MaxPredkosc(){
        return this.maxpredkosc;
    }
}

class FabrykaSamochodow{

    public static Samochod getSamochod(int maxpredkosc){
        Samochod samochod = null;
        switch (maxpredkosc){
            case 160:
                samochod = new Mercedes();
                break;
                case 180:
                samochod = new BMW();
                break;
                            case 175:
                samochod = new Audi();
                break;

        }
        return samochod;
    }

}