package mx.com.aluracursos.audiomatch.modelos;

import mx.com.aluracursos.audiomatch.calculos.Clasificacion;
import mx.com.aluracursos.audiomatch.calculos.FiltraClasificacion;

public class Audio {
    private String titulo;
    private int AnioLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private String calificacion;  //Adultos, jovenes, infantil
    private String genero;  //canciones: ranchero, rock, pop,  podcast: finanzas, superación personal, comida
    private int totalReproducciones;
    private int totalMeGusta;

    private int totalDeEvaluaciones;
    private double sumaaDeLasEvaluaciones;   //private: es modificador de acceso
    private int clasificaFavoritos;

    public void meGusta() {
        this.totalMeGusta++;
    }

    public void reproducir() {
        this.totalReproducciones++;
        //System.out.println("Reproduciendo: " + this.titulo);
    }

    public void evalua(double nota) {
        if (nota < 0) {
            nota = 0;
        } else  if (nota > 10) {
            nota = 10;
        }
        this.sumaaDeLasEvaluaciones += nota;
        this.totalDeEvaluaciones++;
    }

    public double calculaMedia() {
        //System.out.println("dentro de calculaMedia. sumaaDeLasEvaluaciones=" + sumaaDeLasEvaluaciones + "; totalDeEvaluaciones=" + totalDeEvaluaciones);
        return (double) this.sumaaDeLasEvaluaciones / this.totalDeEvaluaciones;  //aqui no se hace cast, ya que la variable sumaaDeLasEvaluaciones es double
    }

    public double calculaFactorRmg() {
        //System.out.println("dentro de calculaFactorRmg. totalMeGusta=" + totalMeGusta + "; totalReproducciones=" + totalReproducciones);
        //System.out.println("division="+this.totalMeGusta / this.totalReproducciones);
        return (double) this.totalMeGusta / this.totalReproducciones;  //si ambos quedan como int, el resultado es cero, porque los trata como enteros y por ejemplo 8/10 dara cero.. ojo.importante
    }

    public String obtenEvaluacion() {
        return "❤\uFE0F";  // 🔴❤️
    }

    public void pintaLinea() {
        System.out.println("=======================================================");
    }
    public void muestraFichaTecnica() {
        System.out.println("El titulo es: " + titulo);
        System.out.println("El año de lanzamiento fue: " + AnioLanzamiento);
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());  //como usa polimorfismo, y aqui usa el valor de este campo, por eso siempre saldra cero.. se cambia de duracionEnMinutos  a getDuracionEnMinutos()  la misma clase detecta automaticamente si llama al metodo de la clase Titulo o al de la clase Serie
        System.out.println("Incluido en el Plan : " + (incluidoEnElPlan ? "Si": "No"));
        System.out.println("Calificación : " + calificacion);
        System.out.println("Genero : " + genero);
        System.out.println("Total de reproducciones : " + totalReproducciones);
        System.out.println("Total de me Gusta : " + totalMeGusta);

        System.out.println("Total de evaluaciones : " + totalDeEvaluaciones);
        System.out.println("Evaluación : " + obtenEvaluacion());
    }

    public void muestraFichaTecnicaCorta(String tipo) {
        System.out.println(".........  " + tipo + "  .......");
        System.out.println("Total de reproducciones : " + totalReproducciones);
        System.out.println("Total de me Gusta : " + totalMeGusta);
        System.out.println("................");
    }

    //setters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        AnioLanzamiento = anioLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    // getters

    public int getTotalMeGusta() {
        return totalMeGusta;
    }

    public int getTotalReproducciones() {
        return totalReproducciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getClasificaFavoritos() {
        return clasificaFavoritos;
    }
}
