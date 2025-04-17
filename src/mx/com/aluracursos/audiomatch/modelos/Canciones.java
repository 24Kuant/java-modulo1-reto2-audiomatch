package mx.com.aluracursos.audiomatch.modelos;

import mx.com.aluracursos.audiomatch.calculos.Clasificacion;
import mx.com.aluracursos.audiomatch.calculos.FiltraClasificacion;

public class Canciones extends Audio implements Clasificacion {
    private String album;
    private String autorDeLaCancion;
    private String nombreDelInterprete;

    @Override
    public void muestraFichaTecnica() {
        pintaLinea();
        System.out.println("El álbum se llama : " + album);
        System.out.println("El autor de la canción es : " + autorDeLaCancion);
        System.out.println("El nombre del interprete es : " + nombreDelInterprete);
        System.out.println("La clasificación de la canción fue : " + getClasificacion());
        super.muestraFichaTecnica();
        pintaLinea();
    }

    @Override
    public int getClasificacion() {
        //la clasificacion va de 0-1, 2, 3, 4, 5 estrellas
        //calculaMedia va entre 0 a 10
        return (int) (calculaMedia() / 2);
    }

    @Override
    public String obtenEvaluacion() {
        FiltraClasificacion filtro = new FiltraClasificacion();
        return filtro.filtroClasificacion(this);
    }

    @Override
    public int getClasificaFavoritos() {  //las peliculas Favoritas se clasifican por el Total de Reproducciones
        int totalReproducciones = getTotalReproducciones();

        if (totalReproducciones >= 1000) {
            return 5;
        }  else if (totalReproducciones >= 800 && totalReproducciones < 1000) {
            return 4;
        } else if (totalReproducciones >= 600 && totalReproducciones < 800) {
            return 3;
        } else if (totalReproducciones >= 400 && totalReproducciones < 600) {
            return 2;
        } else if (totalReproducciones >= 200 && totalReproducciones < 400) {
            return 1;
        } else {
            return 0;
        }
    }

    //setters

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setAutorDeLaCancion(String autorDeLaCancion) {
        this.autorDeLaCancion = autorDeLaCancion;
    }

    public void setNombreDelInterprete(String nombreDelInterprete) {
        this.nombreDelInterprete = nombreDelInterprete;
    }

}
