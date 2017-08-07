package ufal.p3.banco;

import ufal.p3.Empregado;
import ufal.p3.Horista;

import java.util.ArrayList;

/**
 * Created by myron on 07/08/2017.
 */
public class HoristaBanco implements IBanco{
    private ArrayList<Horista> empregados = new ArrayList<Horista>();


    @Override
    public void add(Empregado e) {
        if(e != null){
            empregados.add((Horista) e);
        }
    }

    @Override
    public void remove(Empregado e) {
        if(e != null){
            empregados.remove(e);
        }
    }

    @Override
    public void update(Empregado e) {
        if (e != null){
            empregados.set(e.getId(), (Horista) e);
        }

    }
}

