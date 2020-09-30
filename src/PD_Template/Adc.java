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
public class Adc extends JugadorLolcito{
    private String[] nombres = {"Ashe", "Jinx", "Jhin", "Miss Fortune", "Tristana"};
    private String[] items = {"Cañon de Fuego Rapido", "Bailarin Espectral", "Segador de Esencia", "Hoja del Rey Arruinado", "Huracan de Runaan", "Filo Infinito"};
    
    public void setDatosJugador(){
        this.setNombre(nombres[(int)(Math.random()*5)]);
        this.setVida((int)(Math.random()*(1250-750)+(750)));
        this.setDaño((int)(Math.random()*(750-500)+(500)));
        this.setMana((int)(Math.random()*(1000-750)+(750)));
    }
    public void setHabilidades(){
        switch(this.getNombre()){
            case "Ashe":
                this.setHabilidad1("Concentracion de la Guardabosques");
                this.setHabilidad2("Descarga");
                this.setHabilidad3("Tiro de Halcon");
                this.setLaUlti("Flecha de Cristal Encantada");
                break;
            case "Jinx":
                this.setHabilidad1("Cambio de Armas");
                this.setHabilidad2("Chispas");
                this.setHabilidad3("Mascafuegos");
                this.setLaUlti("SuperMegaCohete RequeteMortal");
                break;
            case "Jhin":
                this.setHabilidad1("Granada Bailarina");
                this.setHabilidad2("Brote Mortal");
                this.setHabilidad3("Audiencia Cautiva");
                this.setLaUlti("Llamado a Escena");
                break;
            case "Miss Fortune":
                this.setHabilidad1("Redoble");
                this.setHabilidad2("Alarde");
                this.setHabilidad3("Que Llueva");
                this.setLaUlti("Lluvia de Balas");
                break;
            case "Tristana":
                this.setHabilidad1("Tiro Rapido");
                this.setHabilidad2("Salto Misil");
                this.setHabilidad3("Carga Explosiva");
                this.setLaUlti("Tiro Destructor");
                break;
        }
    }
    public void mandarALinea(){
        this.setItem(items[(int)(Math.random()*6)]);
        this.setLinea("Adc");
        switch(this.getNombre()){
            case "Ashe":
                this.setCounter("Ezreal");
                break;
            case "Jinx":
                this.setCounter("Ezreal");
                break;
            case "Jhin":
                this.setCounter("Lucian");
                break;
            case "Miss Fortune":
                this.setCounter("Tristana");
                break;
            case "Tristana":
                this.setCounter("Corki");
                break;
        }
    }
}





