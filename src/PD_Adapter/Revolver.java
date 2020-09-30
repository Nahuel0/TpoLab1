package PD_Adapter;
//Esta clase esta de muestra ya que se construyo siguiendo la implementacion de la interfaz nueva
public class Revolver implements campoDeTiro{
    //Constante que indica la cantidad maxima de balas
    private final int TAMAÑOTAMBOR = 6;
    //Variable que indica la cantidad actual de balas
    private int cantBalas;
    //Variable que indica si el arma esta descargada o no
    private boolean armaCargada;
    
    //Constructor de la clase
    public Revolver(){
        this.armaCargada = true;
        this.cantBalas = this.TAMAÑOTAMBOR;
    }
    
    //Metodo disparar que respeta la nueva interfaz
    public void disparar(){
        //Verifica si el arma esta cargada
        if(this.armaCargada){
            //Si esta cargada simula disparar y descuenta una bala 
            System.out.println("Se dispara el arma");
            this.cantBalas--;
            System.out.println("BANG");
            if(this.cantBalas == 0){
                //Si la cantidad de balas llega a cero armaCargada pasa a ser falso
                this.armaCargada = false;
            }     
        }
        else{
            //Si no esta cargada indica que se debe recargar
            System.out.println("Debe Recargar el arma");
        }
    }
    
    
    //Metodo recargar que respeta la nueva interfaz
    public void recargar(){
        //Verifica si el arma esta descargada
        if(!this.armaCargada){
            //Si no lo esta actualiza el valor de cantBalas a la cantidad maxima del barril, y coloca armaCargada en verdadero
            this.armaCargada = true;
            this.cantBalas = this.TAMAÑOTAMBOR;
            System.out.println("El 38 esta cargado");
        }
        else{
            //Si ya estaba cargada solo lo indica
            System.out.println("El arma ya esta cargada");
        }
    }
}
