package PD_Adapter;
//Esta clase sera la que adapte la clase Arco a la nueva interfaz que se desea implementar
public class ArmaConFlecha implements campoDeTiro{
    //Se crea un objeto de la clase Arco para utilizar los metodos de su clase
    private Arco arco1;
    
    //Constructor de la clase Adaptadora
    public ArmaConFlecha(){
        this.arco1 = new Arco();
    }
    
    //Este metodo implementa el metodo disparar de la interfaz nueva, pero internamente invoca al metodo dispararFlecha de la clase a adaptar
    public void disparar(){
        this.arco1.dispararFlecha();
    }
    
    //Este metodo implementa el metodo recargar de la interfaz nueva, pero internamente invoca al metodo colocarFlecha de la clase a adaptar
    public void recargar(){
        this.arco1.colocarFlecha();
    }
}
