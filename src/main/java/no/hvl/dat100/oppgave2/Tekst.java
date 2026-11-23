package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Tekst extends Innlegg {

    String tekst = "Roten av 2 er irrasjonalt.";

	public Tekst () {
        System.out.println()
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.tekst = tekst;
    }


	
	public String getTekst() {
		return tekst;

	}




	public void setTekst(String tekst) {
        this.tekst = tekst;
    }

	@Override
	public String toString() {
		throw new UnsupportedOperationException(TODO.method());

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
