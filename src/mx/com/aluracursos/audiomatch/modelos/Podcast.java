package mx.com.aluracursos.audiomatch.modelos;

import mx.com.aluracursos.audiomatch.calculos.Clasificacion;
import mx.com.aluracursos.audiomatch.calculos.FiltraClasificacion;

public class Podcast extends Audio implements Clasificacion {
    private int numero;
    private String sinopsis;
    private String nombreDelConductor;
    private String invitados;
    private String peticionesDelInvitado;

    @Override
    public void muestraFichaTecnica() {
        pintaLinea();
        System.out.println("El podcast número : " + numero);
        System.out.println("La sinopsis del podcast es: " + sinopsis);
        System.out.println("El conductor del podcast es : " + nombreDelConductor);
        System.out.println("El o los invitado(s) son : " + invitados);
        System.out.println("Los invitados solicitaron la siguiente petición especial : " + peticionesDelInvitado);
        System.out.println("La clasificación del podcast fue : " + getClasificacion());
        super.muestraFichaTecnica();
        pintaLinea();
    }

    @Override
    public int getClasificacion() {
        //la clasificacion va de 0-1, 2, 3, 4, 5 estrellas
        // se saca con la formula ( meGusta / reproducciones ) * 10 / 2 = ( meGusta / reproducciones ) * 5  ==>
        int valor =  (int) (calculaFactorRmg() * 5);
        //System.out.println("calculaFactorRmg="+calculaFactorRmg());
        return valor;
    }

    @Override
    public String obtenEvaluacion() {
        FiltraClasificacion filtro = new FiltraClasificacion();
        return filtro.filtroClasificacion(this);
    }

    @Override
    public int getClasificaFavoritos() {  //los podcast Favoritos se clasifican por el Total de Me Gusta
        int totalMeGusta = getTotalMeGusta();

        if (totalMeGusta >= 1000) {
            return 5;
        }  else if (totalMeGusta >= 800 && totalMeGusta < 1000) {
            return 4;
        } else if (totalMeGusta >= 600 && totalMeGusta < 800) {
            return 3;
        } else if (totalMeGusta >= 400 && totalMeGusta < 600) {
            return 2;
        } else if (totalMeGusta >= 200 && totalMeGusta < 400) {
            return 1;
        } else {
            return 0;
        }
    }

    //setters

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public void setNombreDelConductor(String nombreDelConductor) {
        this.nombreDelConductor = nombreDelConductor;
    }

    public void setInvitados(String invitados) {
        this.invitados = invitados;
    }

    public void setPeticionesDelInvitado(String peticionesDelInvitado) {
        this.peticionesDelInvitado = peticionesDelInvitado;
    }
}
