package dat100.oppgave3;

import dat100.oppgave1.Innlegg;

public class Blogg {

    // a) Objektvariabler
    private Innlegg[] innleggtabell;
    private int nesteledig; // Antall innlegg og neste ledige posisjon

    // b) Standard konstruktør (startstørrelse 20)
    public Blogg() {
        this(20);
    }

    // b) Konstruktør med angitt lengde
    public Blogg(int lengde) {
        innleggtabell = new Innlegg[lengde];
        nesteledig = 0;
    }

    // c) Returnerer antall innlegg-objekt i tabellen
    public int getAntall() {
        return nesteledig;
    }

    // d) Returnerer en peker til tabellen av innlegg-objekt
    public Innlegg[] getSamling() {
        return innleggtabell;
    }

    // e) Finner indeks for et innlegg med samme ID, eller -1 ellers
    public int finnInnlegg(Innlegg innlegg) {
        // Vi sjekker kun opp til nesteledig (der de lagrede innleggene er)
        for (int i = 0; i < nesteledig; i++) {
            // Bruker erLik-metoden fra Innlegg
            if (innleggtabell[i].erLik(innlegg)) {
                return i;
            }
        }
        return -1;
    }

    // f) Returnerer true om det finnes et innlegg med samme ID
    public boolean finnes(Innlegg innlegg) {
        // Hvis finnInnlegg returnerer en indeks >= 0, betyr det at det finnes
        return finnInnlegg(innlegg) >= 0;
    }

    // g) Returnerer true om det er ledig plass i samlingen
    public boolean ledigPlass() {
        return nesteledig < innleggtabell.length;
    }

    // h) Legger til innlegg hvis det er ledig plass OG ID ikke finnes
    public boolean leggTil(Innlegg innlegg) {
        // Sjekker om det er ledig plass
        if (!ledigPlass()) {
            return false;
        }

        // Sjekker om innlegget (samme ID) allerede finnes
        if (finnes(innlegg)) {
            return false;
        }

        // Legger til på neste ledige plass og oppdaterer telleren
        innleggtabell[nesteledig] = innlegg;
        nesteledig++;
        return true;
    }

    // i) Returnerer data i tabellen som en streng (Antall\nInnlegg1.toString()Innlegg2.toString()...)
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // Første linje: Antall Innlegg
        sb.append(nesteledig).append("\n");

        // Legger til toString() for hvert lagret innlegg
        for (int i = 0; i < nesteledig; i++) {
            sb.append(innleggtabell[i].toString());
        }

        return sb.toString();
    }

    // De valgfrie metodene (j, k, l, m) er ikke implementert her.
}