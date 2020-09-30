/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PD_Template;

/**
 *
 * @author nahuel
 */
public abstract class JugadorLolcito{
//atributos 
    private String nombre;
    private int vida;
    private int daño;
    private int mana;

    private String habilidad1;
    private String habilidad2;
    private String habilidad3;
    private String laUlti;

    private String item;
    private String linea;
    private String counter;


//Constructor
    public final void jugadorRandom(){
        setDatosJugador();
        setHabilidades();
        mandarALinea();
    }

    abstract void setDatosJugador();
    abstract void setHabilidades();
    abstract void mandarALinea();

    public void mostrarDatos(){
        System.out.println("Nombre del Campeon: " + this.nombre);
        System.out.println("Vida: " + this.vida);
        System.out.println("Mana: " + this.mana);
        System.out.println("Daño: " + this.daño);
        System.out.println("Habilidad 1: " + this.habilidad1);
        System.out.println("Habilidad 2: " + this.habilidad2);
        System.out.println("Habilidad 3: " + this.habilidad3);
        System.out.println("La Ulti: " + this.laUlti);
        System.out.println("Item: " + this.item);
        System.out.println("Linea: " + this.linea);
        System.out.println("Counter: " + this.counter);
    }
//Get y Set necesarios
    public void setNombre(String nom){
        this.nombre = nom;
    }
    public  String getNombre(){
	return this.nombre;
    }
    public void setVida(int v){
        this.vida = v;
    }
    public void setMana(int m){
        this.mana = m;
    }
    public void setDaño(int d){
        this.daño = d;
    }
    public void setHabilidad1(String h){
        this.habilidad1 = h;
    }
    public void setHabilidad2(String h){
        this.habilidad2 = h;
    }
    public void setHabilidad3(String h){
        this.habilidad3 = h;
    }
    public void setLaUlti(String h){
        this.laUlti = h;
    }
    public void setItem(String i){
        this.item = i;
    }
    public void setLinea(String l){
        this.linea = l;
    }
    public void setCounter(String c){
        this.counter = c;
    }
}
