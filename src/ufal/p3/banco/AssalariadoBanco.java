package ufal.p3.banco;


import ufal.p3.Assalariado;
import ufal.p3.Empregado;

import java.util.ArrayList;

/**
 * Created by myron on 07/08/2017.
 */
public class AssalariadoBanco implements IBanco {

    private ArrayList<Assalariado> empregados = new ArrayList<Assalariado>();
    @Override
    public void add(Empregado e) {
        if(e != null){
            empregados.add((Assalariado) e);
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
            empregados.set(e.getId(), (Assalariado) e);
        }
    }
}

