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

public class Mid extends JugadorLolcito{
    private String[] nombres = {"Annie", "Lux", "Zed", "Ahri", "Yasuo"};
    private String[] items = {"Eco de Luden", "Morellonomicon", "Sombrero Mortal de Rabadon", "Reloj de Arena de Zhonya", "Filo Fantasmal de Youmuu", "Filo Oscuro de Draktharr"};
    
    public void setDatosJugador(){
        this.setNombre(nombres[(int)(Math.random()*5)]);
        this.setVida((int)(Math.random()*(1750-1000)+(1000)));
        this.setDaño((int)(Math.random()*(600-400)+(400)));
        this.setMana((int)(Math.random()*(1500-1100)+(1100)));
    }
    
    public void setHabilidades(){
        switch(this.getNombre()){
            case "Annie":
                this.setHabilidad1("Desintegrar");
                this.setHabilidad2("Incinerar");
                this.setHabilidad3("Escudo Fundido");
                this.setLaUlti("Invocar: Tibbers");
                break;
            case "Lux":
                this.setHabilidad1("Hechizo Luminoso");
                this.setHabilidad2("Barrera Prismatica");
                this.setHabilidad3("Singularidad Brillante");
                this.setLaUlti("Chispa Final");
                break;
            case "Zed":
                this.setHabilidad1("Navaja Shuriken");
                this.setHabilidad2("Sombra Viviente");
                this.setHabilidad3("Cuchillada Sombria");
                this.setLaUlti("Marca de la Muerte");
                break;
            case "Ahri":
                this.setHabilidad1("Orbe del Engaño");
                this.setHabilidad2("Fuego Zorruno");
                this.setHabilidad3("Encanto");
                this.setLaUlti("Impulso Espiritual");
                break;
            case "Yasuo":
                this.setHabilidad1("Tempestad de Acero");
                this.setHabilidad2("Muro de Viento");
                this.setHabilidad3("Hoja de Viento");
                this.setLaUlti("Ultimo Aliento");
                break;
        }
    }
    public void mandarALinea(){
        this.setItem(items[(int)(Math.random()*6)]);
        this.setLinea("Mid");
        switch(this.getNombre()){
            case "Annie":
                this.setCounter("Brand");
                break;
            case "Lux":
                this.setCounter("Talon");
                break;
            case "Zed":
                this.setCounter("Kayle");
                break;
            case "Ahri":
                this.setCounter("LeBlanc");
                break;
            case "Yasuo":
                this.setCounter("Jax");
                break;
        }
    }
}