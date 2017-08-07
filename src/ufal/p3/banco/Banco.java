package ufal.p3.banco;

import com.sun.org.apache.xpath.internal.SourceTree;
import ufal.p3.Assalariado;
import ufal.p3.Comissionado;
import ufal.p3.Horista;

/**
 * Created by myron on 07/08/2017.
 */
public class Banco {
    private HoristaBanco horistaBanco;
    private ComissionadoBanco comissionadoBanco;
    private AssalariadoBanco assalariadoBanco;

    public void addHorista(Horista h){
        if(h != null){
            horistaBanco.add(h);
        }
    }
    public void removeHorista(Horista h){
        if(h != null){
            horistaBanco.remove(h);
        }
    }
    public void updateHorista(Horista h){
        if(h != null){
            horistaBanco.update(h);
        }
    }

    public void addComissionado(Comissionado c){
        if(c != null){
            comissionadoBanco.add(c);
        }
    }
    public void removeComissionado(Comissionado c){
        if(c != null){
            comissionadoBanco.remove(c);
        }
    }
    public void updateComissionado(Comissionado c){
        if(c != null){
            comissionadoBanco.update(c);
        }
    }

    public void addAssalariado(Assalariado a){
        if(a != null){
            assalariadoBanco.add(a);
        }
    }
    public void removeHorista(Assalariado a){
        if(a != null){
            assalariadoBanco.remove(a);
        }
    }
    public void updateHorista(Assalariado a){
        if(a != null){
            assalariadoBanco.update(a);
        }
    }
}
