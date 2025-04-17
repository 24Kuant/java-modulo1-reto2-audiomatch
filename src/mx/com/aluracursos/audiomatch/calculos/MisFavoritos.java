package mx.com.aluracursos.audiomatch.calculos;

import mx.com.aluracursos.audiomatch.modelos.Audio;

public class MisFavoritos {
    public void agregaAMisFavoritos(Audio audio) {
        String tipo = audio.getClass().getName().replace("mx.com.aluracursos.audiomatch.modelos.","");
        if (tipo.toUpperCase().equals("CANCIONES")) {
            tipo = "favorita de todas las ".concat(tipo);
        } else {
            tipo = "favorito de los ".concat(tipo);
        }

        if (audio.getClasificaFavoritos() == 5) {
            System.out.println("\uD83D\uDFE1\uD83D\uDFE0\uD83D\uDFE2\uD83D\uDD35\uD83D\uDFE3 " + audio.getTitulo() + " Es mi hiper super " + tipo );
        } else if (audio.getClasificaFavoritos() == 4) {
            System.out.println("\uD83D\uDFE1\uD83D\uDFE0\uD83D\uDFE2\uD83D\uDD35 " + audio.getTitulo() + " Es mi super " + tipo );
        } else if (audio.getClasificaFavoritos() == 3) {
            System.out.println("\uD83D\uDFE1\uD83D\uDFE0\uD83D\uDFE2 " + audio.getTitulo() + " Es mi casi super " + tipo );
        } else if (audio.getClasificaFavoritos() == 2) {
            System.out.println("\uD83D\uDFE1\uD83D\uDFE0 " + audio.getTitulo() + " Es mi cuasi super " + tipo );
        } else if (audio.getClasificaFavoritos() == 1) {
            System.out.println("\uD83D\uDFE1 " + audio.getTitulo() + " Es mi poco super " + tipo );
        } else {
            System.out.println("\uD83D\uDD34 " + audio.getTitulo() + " Es mi muy poco super " + tipo );
        }
    }
}
