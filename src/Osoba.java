public abstract class Osoba {
    //abstract nie można utworzyć obiektu z tej klasy
    private String imie;
    private String nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {

        return imie;
    }

    public void setImie(String imie) {

        this.imie = imie;
    }

    public String getNazwisko() {

        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {

        this.nazwisko = nazwisko;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
