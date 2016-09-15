/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author jquevedo3
 */
public class Mixto {
    private int denominador;
    private int numerador;

    public Mixto(int denominador, int numerador)throws DenominadorCeroException {
        this.denominador = denominador;
        this.numerador = numerador;
    
    
    if (denominador == 0) {
            throw new DenominadorCeroException();
        }
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }
    public Mixto Suma(Mixto f2) throws DenominadorCeroException {
        Mixto aux;
        int num, dem;

        num = (this.numerador * f2.denominador) + (this.denominador * f2.numerador);
        dem = this.denominador * f2.denominador;

        aux = new Mixto(num, dem);
        return aux;
    }
    public Mixto Resta(Mixto f2) throws DenominadorCeroException {
        Mixto aux;
        int num, dem;

        num=(this.numerador*f2.denominador) - (this.denominador*f2.numerador);
        dem=this.denominador*f2.denominador;

        aux= new Mixto(num, dem);
        return aux;
    }
    public Mixto Multiplicacion(Mixto f2) throws DenominadorCeroException {
        Mixto aux;
        
        int num,dem;
        num=this.numerador * f2.numerador;
        dem=this.denominador * f2.denominador;
        aux=new Mixto(num,dem);
        return aux;
    }
    public Mixto Division(Mixto f2) throws DenominadorCeroException {
        Mixto aux;
        int num,dem;
        num=this.numerador*f2.denominador;
        dem=this.denominador*f2.numerador;
        aux=new Mixto(num,dem);
        return aux;
    }
    
}
