package ScheduledExecutorService;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class TareaRadio implements Runnable{

    public void run(){

      Player apl;
        try {
              apl = new Player(new FileInputStream("C:/Users/Administrador/Downloads/Garota de Ipanema.mp3"));
              apl.play();
        }catch (FileNotFoundException|JavaLayerException ex){}
    }
}