package dat100.oppgave4;

import dat100.oppgave3.Blogg;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;

public class SkrivBlogg {

    public static boolean skriv(Blogg samling, String mappe, String filnavn) {

        // Bruker Path for å konstruere full filsti uavhengig av operativsystem
        Path fullPath = Path.of(mappe, filnavn);

        // Bruker try-with-resources for automatisk lukking av filressursene
        try (
                // Oppretter PrintWriter for enkel skriving av strenger til fil
                FileWriter fileWriter = new FileWriter(fullPath.toFile());
                PrintWriter printWriter = new PrintWriter(fileWriter)
        ) {
            // Henter hele innholdet fra Blogg-objektet via toString()
            String bloggInnhold = samling.toString();

            // Skriver innholdet til fil
            printWriter.print(bloggInnhold);

            return true;

        } catch (IOException e) {
            // Logger eller skriver ut feilen for feilsøking
            System.err.println("Feil under skriving til fil: " + e.getMessage());
            e.printStackTrace();
            return false; // Returnerer false ved feil
        }
    }
}