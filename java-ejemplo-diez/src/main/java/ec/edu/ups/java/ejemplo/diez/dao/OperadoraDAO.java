/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemplo.diez.dao;

import ec.edu.ups.java.ejemplo.diez.idao.IOperadoraDAO;
import ec.edu.ups.java.ejemplo.diez.modelo.Operadora;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SOPORTETICS
 */
public class OperadoraDAO implements IOperadoraDAO {

    private List<Operadora> listaOperadoras;

    public OperadoraDAO() {
        listaOperadoras = new ArrayList<>();
    }

    @Override
    public void create(Operadora operadora) {
        listaOperadoras.add(operadora);
    }

    @Override
    public Operadora read(int codigo) {
        for (Operadora operadora : listaOperadoras) {
            if (operadora.getCodigo() == codigo) {
                return operadora;

            }
        }
        return null;
    }

    @Override
    public void update(Operadora operadora) {
        for (int i = 0; i < listaOperadoras.size(); i++) {
            Operadora operadoraGuardada = listaOperadoras.get(i);
            if (operadora.getCodigo() == operadoraGuardada.getCodigo()) {
                listaOperadoras.set(i, operadora);
            }
        }
    }

    @Override
    public void delete(int codigo) {
        for (int i = 0; i < listaOperadoras.size(); i++) {
            Operadora operadoraGuardada = listaOperadoras.get(i);
            if (codigo == operadoraGuardada.getCodigo()) {
                listaOperadoras.remove(i);
            }
        }
    }

    @Override
    public List<Operadora> list() {
        return listaOperadoras;
    }

}
