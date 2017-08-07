package ufal.p3;

import java.util.ArrayList;

/**
 * Created by myron on 07/08/2017.
 */
public class Horista extends Empregado {
    private double salarioHora;
    private ArrayList<Ponto> regPonto;

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public ArrayList<Ponto> getRegPonto() {
        return regPonto;
    }

    public void setRegPonto(ArrayList<Ponto> regPonto) {
        this.regPonto = regPonto;
    }
}
