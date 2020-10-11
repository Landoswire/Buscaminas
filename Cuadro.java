/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import javax.swing.JButton;

/**
 *
 * @author Issei
 */
public class Cuadro extends JButton{ //mi cuadro va a ser un boton
    private boolean mina; //mi cuadro va a tener la propiedad de ser una mina, true or false
    public Cuadro() //constructor
    {
        super(); //para que se ejecute el JButton normal
        double random = Math.random(); //vamos a elegir aleatoreamente si tiene mina o no
        if(random>0.7)//tengo un 30% de probababilidad de que los cuadros tengan una mina
            mina=true;
        else
            mina=false;
    }
    
    public boolean estaMinado()//metodo que regresa el valor de mina
    {
        return mina;
    }
    
}
