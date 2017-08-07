package ufal.p3.banco;

import ufal.p3.Assalariado;
import ufal.p3.Comissionado;
import ufal.p3.Empregado;
import ufal.p3.Horista;

import java.util.ArrayList;

/**
 * Created by myron on 07/08/2017.
 */
public interface IBanco {
    public void add(Empregado e);
    public void remove(Empregado e);
    public void update(Empregado e);
}
