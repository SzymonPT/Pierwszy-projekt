public class Uczen extends Osoba {
    private static int liczba_uczniow;
    private static int numerUcznia;

    public Uczen(String imie, String nazwisko){
        super(imie, nazwisko);
        liczba_uczniow++;
        numerUcznia=liczba_uczniow;
    }

    public int getLiczba_uczniow() {
        return liczba_uczniow;
    }

    public void setLiczba_uczniow(int liczba_uczniow) {
        this.liczba_uczniow = liczba_uczniow;
    }

    public int getNumerUcznia() {
        return numerUcznia;
    }

    public void setNumerUcznia(int numerUcznia) {
        this.numerUcznia = numerUcznia;
    }
}