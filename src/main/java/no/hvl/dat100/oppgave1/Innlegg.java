package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {


    protected int id = 1997;
    protected String bruker = "Ylva";
    protected String dato = "23.11.2026";
    protected int likes = 6;

    public Innlegg(int id, String bruker, String dato, int likes) {
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.likes = 0;

    }


    public String getBruker() {
        return bruker;

    }

    public void setBruker(String bruker) {
        this.bruker = bruker;

    }

    public String getDato() {
        return dato;

    }

    public void setDato(String dato) {
        this.dato = dato;

    }

    public int getId() {
        return id;

    }

    public int getLikes() {
        return likes;

    }

    public void doLike() {

        likes++:
    }



	
	public boolean erLik(Innlegg innlegg) {

        if (id == 1997) {
            System.out.println("True");

        } else {

        }
		throw new UnsupportedOperationException(TODO.method());

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
