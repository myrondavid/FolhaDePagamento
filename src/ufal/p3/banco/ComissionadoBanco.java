package ufal.p3.banco;
import java.util.ArrayList;
import ufal.p3.Comissionado;
import ufal.p3.Empregado;

/**
 * Created by myron on 07/08/2017.
 */
public class ComissionadoBanco implements IBanco {
    private ArrayList<Comissionado> empregados = new ArrayList<Comissionado>();

    @Override
    public void add(Empregado e) {
        if(e != null){
            empregados.add((Comissionado) e);
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
            empregados.set(e.getId(), (Comissionado) e);
        }
    }
}
