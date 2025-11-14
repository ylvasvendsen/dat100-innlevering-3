package dat100.oppgave2;

import dat100.oppgave1.Innlegg;

public class Tekst extends Innlegg {

    // Objektvariabel for tekst. Bruker protected/private
    private String tekst;

    // Konstruktør 1 (uten likes)
    public Tekst(int id, String bruker, String dato, String tekst) {
        super(id, bruker, dato); // Kaller konstruktør i Innlegg
        this.tekst = tekst;
    }

    // Konstruktør 2 (med likes)
    public Tekst(int id, String bruker, String dato, int likes, String tekst) {
        super(id, bruker, dato, likes); // Kaller konstruktør i Innlegg
        this.tekst = tekst;
    }

    // Get-metode
    public String getTekst() {
        return tekst;
    }

    // Set-metode
    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    // toString() for Tekst: TEKST\nID\nBruker\nDato\nLikes\nTekst\n
    @Override
    public String toString() {
        // Kaller superklassens toString for felles felter
        return "TEKST\n" + super.toString() + tekst + "\n";
    }
}