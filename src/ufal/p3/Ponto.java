package ufal.p3;

import java.util.Calendar;

/**
 * Created by myron on 07/08/2017.
 */
public class Ponto {
    private Calendar chegada;
    private Calendar saida;

    public Calendar getChegada() {
        return chegada;
    }

    public void setChegada(Calendar chegada) {
        this.chegada = chegada;
    }

    public Calendar getSaida() {
        return saida;
    }

    public void setSaida(Calendar saida) {
        this.saida = saida;
    }
}
