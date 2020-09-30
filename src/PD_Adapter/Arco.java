package PD_Adapter;
//Esta clase se pretende utilizar junto con la nueva interfaz pero sus metodos son incompatibles para implementarla
public class Arco {
    //Atributo que indica si hay una flecha para disparar o no
    private boolean flechaPuesta;
    
    //Constructor de la clase a Adaptar
    public Arco(){
        this.flechaPuesta = true;
    }
    
    //Metodo que simula disparar el arco pero su encabezado no es compatible con la nueva interfaz a implementar
    public void dispararFlecha(){
        //Verifica si el arco tiene una flecha, en cuyo caso dispara y setea flechaPuesta en falso, caso contrario indica que se debe recargar el arco
        if(this.flechaPuesta){
            this.flechaPuesta = false;
            System.out.println("Se disparada una flecha");
            System.out.println("FIUM");
        }
        else{
            System.out.println("Debe colocar una flecha en el arco");
        }
    }
    
    //Metodo que simula recargar el arco pero su encabezado no es compatible con la nueva interfaz a implementar
    public void colocarFlecha(){
        //Verifica si no hay una flecha ya disponible, si es asi setea flechaPuesta en verdadero, caso contrario indica que ya hay una flecha para disparar
        if(!this.flechaPuesta){
            this.flechaPuesta = true;
            System.out.println("Se ha colocado una flecha en el arco");
        }
        else{
            System.out.println("Ya hay una flecha en el arco");
        }
    }
}
