package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;

public class Bilde extends Tekst {

	private String url = "https://www.google.com/search?sca_esv=9b814d1abdbebad8&sxsrf=AKL5yDihUpDHiSXu9rfa8vxkAaXZA8oEuw:1795444160074&udm=2&fbs=ACAhTvx0CAPB6TRWsNnItqaR7Zg8lBSAN6uWGqSsyW6Z7Mi3halxMxtyARGHOdaDEs7AZaw-X8qfSppGiwApce1k92Z7GChd9V37fEM7hDUjVrc2DCwdrUddNfd2VXEw6EKJziKil_f985NgDz80PWtV1Nq9NNgGCVrfi6P7-nmDtgx3F_fD7gVP8ra5CmMwC4tOW7OimgQv&q=roten+av+2&sa=X&ved=2ahUKEwjX3f_app6YAxU2OBAIHaGjJLoQtKgLegQIGBAB&biw=638&bih=584&dpr=1.5#sv=CAMSURoyKhBlLTFyMm1qM3ZxWEIxV3hNMg4xcjJtajN2cVhCMVd4TToOaWtjWXYzZU9tRjk4S00gBCoXCgFzEhBlLTFyMm1qM3ZxWEIxV3hNGAEwARgHILnigL4BSggQAhgBIAIoAQ";
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
        this.id = id;
        this.url = url;
    }


	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {

	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
        this.url = url;
    }

	@Override
	public String toString() {
		return tekst.toString() + tekst + "TEKST\\n1\\nOle Olsen\\n23-10\\n0\\nen tekst\\n";
        return url.toString() + url + "BILDE\\n1\\nOle Olsen\\n23-10\\n0\\net bilde\\nhttp://www.picture.com/oo.jpg\\n";
	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
