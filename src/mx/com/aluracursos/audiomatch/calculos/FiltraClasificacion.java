package mx.com.aluracursos.audiomatch.calculos;

public class FiltraClasificacion {
    public String filtroClasificacion( Clasificacion clasificacion ) {
        int valorClasificacion = clasificacion.getClasificacion();
        if (valorClasificacion <= 1) {
            return "\uD83D\uDC9B";
        } else if (valorClasificacion == 2) {
            return "\uD83D\uDC9B\uD83E\uDDE1";
        } else if (valorClasificacion == 3) {
            return "\uD83D\uDC9B\uD83E\uDDE1\uD83D\uDC9A";
        } else if (valorClasificacion == 4) {
            return "\uD83D\uDC9B\uD83E\uDDE1\uD83D\uDC9A\uD83D\uDC99";
        } else if (valorClasificacion == 5) {
            return "\uD83D\uDC9B\uD83E\uDDE1\uD83D\uDC9A\uD83D\uDC99\uD83D\uDC9C";
        } else {
            return "";
        }
        //🟡🟠🟢🔵🟣💛🧡💚💙💜🔴❤️
    }
}
