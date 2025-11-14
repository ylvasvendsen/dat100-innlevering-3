package dat100.oppgave1;

public abstract class Innlegg {

    // a) Objektvariabler - skal ikke være synlige utenfor klassen (private/protected)
    private int id;
    private String bruker;
    private String dato;
    private int likes;

    // b) Konstruktør 1: Setter likes til 0
    public Innlegg(int id, String bruker, String dato) {
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.likes = 0; // Standardverdi
    }

    // b) Konstruktør 2: Setter likes fra parameter
    public Innlegg(int id, String bruker, String dato, int likes) {
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.likes = likes;
    }

    // c) Get-metoder
    public int getId() {
        return id;
    }

    public String getBruker() {
        return bruker;
    }

    public String getDato() {
        return dato;
    }

    public int getLikes() {
        return likes;
    }

    // c) Set-metoder (Likes har egen doLike, setLikes er valgfri, men inkluderes for fullstendighet)
    public void setId(int id) {
        this.id = id;
    }

    public void setBruker(String bruker) {
        this.bruker = bruker;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    // d) Øker antall likes med 1
    public void doLike() {
        this.likes++;
    }

    // e) Returnerer tekststreng-representasjon
    // Format: "ID\nBruker\nDato\nLikes\n"
    @Override
    public String toString() {
        return id + "\n"
                + bruker + "\n"
                + dato + "\n"
                + likes + "\n";
    }

    // f) Sjekker om to innlegg har samme ID
    public boolean erLik(Innlegg innlegg) {
        // Sjekker også for null for å unngå NullPointerException
        if (innlegg == null) {
            return false;
        }
        return this.id == innlegg.getId();
    }
}