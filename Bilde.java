package dat100.oppgave2;

// Bilde er subklasse av Tekst, som igjen er subklasse av Innlegg
public class Bilde extends Tekst {

    // Objektvariabel for URL. Bruker protected/private
    private String url;

    // Konstruktør 1 (uten likes)
    public Bilde(int id, String bruker, String dato, String tekst, String url) {
        super(id, bruker, dato, tekst); // Kaller konstruktør i Tekst
        this.url = url;
    }

    // Konstruktør 2 (med likes)
    public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
        super(id, bruker, dato, likes, tekst); // Kaller konstruktør i Tekst
        this.url = url;
    }

    // Get-metode
    public String getUrl() {
        return url;
    }

    // Set-metode
    public void setUrl(String url) {
        this.url = url;
    }

    // toString() for Bilde: BILDE\nID\nBruker\nDato\nLikes\nTekst\nURL\n
    @Override
    public String toString() {
        // Kaller superklassens (Tekst) toString() for å få med alle Innlegg- og Tekst-felt
        // Tekst-klassen returnerer allerede "TEKST\n...Tekst\n"
        // Vi må erstatte "TEKST\n" med "BILDE\n"

        // Henter strengen fra superklassen (Tekst)
        String superString = super.toString();

        // Fjerner "TEKST\n" fra starten
        if (superString.startsWith("TEKST\n")) {
            superString = superString.substring("TEKST\n".length());
        }

        // Bygger den korrekte BILDE-strengen
        return "BILDE\n" + superString + url + "\n";
    }
}