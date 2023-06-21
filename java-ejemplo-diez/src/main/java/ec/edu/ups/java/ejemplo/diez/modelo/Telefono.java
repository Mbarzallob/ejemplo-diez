/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemplo.diez.modelo;

import java.util.Objects;

/**
 *
 * @author SOPORTETICS
 */
public class Telefono {

    private String numero;
    private String tipo;
    private Operadora operadora;
    private Persona persona;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Operadora getOperadora() {
        return operadora;
    }

    public Persona getPersona() {
        return persona;
    }

    public void agregarOperadora(Operadora operadora){
        this.operadora= operadora;
    }
    public void eliminarOperadora(){
        this.operadora=null;
   }
    public void agregarPersona(Persona persona){
        this.persona =persona;
    }
    public void eliminarPersona(){
        this.persona=null;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.numero);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Telefono other = (Telefono) obj;
        return Objects.equals(this.numero, other.numero);
    }

    @Override
    public String toString() {
        return "Telefono{" + "numero=" + numero + ", tipo=" + tipo + ", operadora=" + operadora + ", persona=" + persona + '}';
    }
    
}
