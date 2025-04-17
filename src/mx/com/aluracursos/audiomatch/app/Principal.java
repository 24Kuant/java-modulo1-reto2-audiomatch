package mx.com.aluracursos.audiomatch.app;

import mx.com.aluracursos.audiomatch.calculos.MisFavoritos;
import mx.com.aluracursos.audiomatch.modelos.Canciones;
import mx.com.aluracursos.audiomatch.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        System.out.println("========");
        System.out.println("========");
        System.out.println("=====Bienvenido a la APP audio Match!!");
        System.out.println("========");
        System.out.println("========");

        System.out.println("========");
        System.out.println("========");
        System.out.println("=====Creando nueva pelicula...");
        System.out.println("========");
        System.out.println("========");

        Canciones estrellita = new Canciones();
        estrellita.setTitulo("estrellita");
        estrellita.setDuracionEnMinutos(110);
        estrellita.setIncluidoEnElPlan(true);
        estrellita.setCalificacion("Infantil");
        estrellita.setAnioLanzamiento(2015);
        estrellita.setGenero("pop");
        estrellita.setAlbum("Siempre niños");
        estrellita.setAutorDeLaCancion("Pablo Ponce");
        estrellita.setNombreDelInterprete("Lula Pamplin");

        estrellita.evalua(10);
        estrellita.evalua(9.5);
        estrellita.evalua(9.8);

        estrellita.meGusta();
        estrellita.meGusta();
        estrellita.meGusta();
        estrellita.meGusta();

        estrellita.reproducir();
        estrellita.reproducir();
        estrellita.reproducir();
        estrellita.meGusta();
        estrellita.reproducir();
        estrellita.reproducir();

        estrellita.muestraFichaTecnica();

        System.out.println("========");
        System.out.println("========");
        System.out.println("=====Creando nuevo podcast...");
        System.out.println("========");
        System.out.println("========");

        Podcast tengoUnPlan = new Podcast();
        tengoUnPlan.setNumero(1);
        tengoUnPlan.setTitulo("Tengo un Plan");
        tengoUnPlan.setDuracionEnMinutos(135);
        tengoUnPlan.setIncluidoEnElPlan(true);
        tengoUnPlan.setCalificacion("Familiar");
        tengoUnPlan.setAnioLanzamiento(2024);
        tengoUnPlan.setGenero("Superación Personal");
        tengoUnPlan.setSinopsis("¿Cómo liberar el poder del Yo externo?");
        tengoUnPlan.setNombreDelConductor("Alvaro y Adrian");
        tengoUnPlan.setInvitados("Pablo Gil");
        tengoUnPlan.setPeticionesDelInvitado("Vasos con agua mineral fría");

        tengoUnPlan.evalua(10);
        tengoUnPlan.evalua(9.5);
        tengoUnPlan.evalua(9.8);
        tengoUnPlan.evalua(9.9);
        tengoUnPlan.evalua(10.0);

        tengoUnPlan.meGusta();
        tengoUnPlan.meGusta();
        tengoUnPlan.reproducir();
        tengoUnPlan.reproducir();
        tengoUnPlan.meGusta();
        tengoUnPlan.meGusta();

        tengoUnPlan.reproducir();
        tengoUnPlan.reproducir();
        tengoUnPlan.reproducir();
        tengoUnPlan.meGusta();
        tengoUnPlan.meGusta();
        tengoUnPlan.meGusta();
        tengoUnPlan.reproducir();
        tengoUnPlan.reproducir();
        tengoUnPlan.reproducir();
        tengoUnPlan.reproducir();
        tengoUnPlan.reproducir();
        tengoUnPlan.meGusta();

        tengoUnPlan.muestraFichaTecnica();

        //obteniendo Mis Favoritos

        //intento 1
        for (int i = 0; i <300; i++) {
            //las peliculas Favoritas se clasifican por el Total de Reproducciones
            estrellita.reproducir();

            //los podcast Favoritos se clasifican por el Total de Me Gusta
            tengoUnPlan.meGusta();
        }
        estrellita.muestraFichaTecnicaCorta("1.cancion");
        tengoUnPlan.muestraFichaTecnicaCorta("1.podcast");

        MisFavoritos misFavoritos = new MisFavoritos();
        misFavoritos.agregaAMisFavoritos(estrellita);
        misFavoritos.agregaAMisFavoritos(tengoUnPlan);

        //intento 2
        for (int i = 0; i <250; i++) {
            //las peliculas Favoritas se clasifican por el Total de Reproducciones
            estrellita.reproducir();

            //los podcast Favoritos se clasifican por el Total de Me Gusta
            tengoUnPlan.meGusta();
        }
        estrellita.muestraFichaTecnicaCorta("2.cancion");
        tengoUnPlan.muestraFichaTecnicaCorta("2.podcast");

        misFavoritos.agregaAMisFavoritos(estrellita);
        misFavoritos.agregaAMisFavoritos(tengoUnPlan);

        //intento 3
        for (int i = 0; i <200; i++) {
            //las peliculas Favoritas se clasifican por el Total de Reproducciones
            estrellita.reproducir();

            //los podcast Favoritos se clasifican por el Total de Me Gusta
            tengoUnPlan.meGusta();
        }
        estrellita.muestraFichaTecnicaCorta("3.cancion");
        tengoUnPlan.muestraFichaTecnicaCorta("3.podcast");

        misFavoritos.agregaAMisFavoritos(estrellita);
        misFavoritos.agregaAMisFavoritos(tengoUnPlan);

        //intento 4
        for (int i = 0; i <180; i++) {
            //las peliculas Favoritas se clasifican por el Total de Reproducciones
            estrellita.reproducir();

            //los podcast Favoritos se clasifican por el Total de Me Gusta
            tengoUnPlan.meGusta();
        }
        estrellita.muestraFichaTecnicaCorta("4.cancion");
        tengoUnPlan.muestraFichaTecnicaCorta("4.podcast");

        misFavoritos.agregaAMisFavoritos(estrellita);
        misFavoritos.agregaAMisFavoritos(tengoUnPlan);

        //intento 5
        for (int i = 0; i <350; i++) {
            //las peliculas Favoritas se clasifican por el Total de Reproducciones
            estrellita.reproducir();

            //los podcast Favoritos se clasifican por el Total de Me Gusta
            if (i < 50) {
                tengoUnPlan.meGusta();
            }
        }
        estrellita.muestraFichaTecnicaCorta("5.cancion");
        tengoUnPlan.muestraFichaTecnicaCorta("5.podcast");

        misFavoritos.agregaAMisFavoritos(estrellita);
        misFavoritos.agregaAMisFavoritos(tengoUnPlan);

        //intento 6 y ultimo
        for (int i = 0; i <1350; i++) {
            //las peliculas Favoritas se clasifican por el Total de Reproducciones
            estrellita.reproducir();

            //los podcast Favoritos se clasifican por el Total de Me Gusta
            if (i < 1000) {
                tengoUnPlan.meGusta();
            }
        }
        estrellita.muestraFichaTecnicaCorta("6.cancion");
        tengoUnPlan.muestraFichaTecnicaCorta("6.podcast");

        misFavoritos.agregaAMisFavoritos(estrellita);
        misFavoritos.agregaAMisFavoritos(tengoUnPlan);

    }
}