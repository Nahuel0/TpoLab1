package ScheduledExecutorService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(2);
        TareaPronostico t1 = new TareaPronostico();
        TareaRadio r = new TareaRadio();
        int delay;

        System.out.println("\u001B[32mBienvenido al Consultor de Clima 3000");
        System.out.println("\u001B[33m (Ahora con musiquita de fondo!!!)");

        ScheduledFuture<?> s1 = ses.scheduleWithFixedDelay(t1, 2, 15, TimeUnit.SECONDS);
        ScheduledFuture<?> s2 = ses.scheduleWithFixedDelay(r, 1, 4, TimeUnit.SECONDS);

        while (true) {
            Thread.sleep(2500);
            if (t1.getApagado()) {
                s1.cancel(true);
                s2.cancel(true);
                ses.shutdownNow();
                System.exit(0);
                break;
            } else {
                delay = (int) s1.getDelay(TimeUnit.SECONDS);
                if (delay > 0) {
                    System.out.println("\u001B[35mFaltan " + "\u001B[33m" + delay + "\u001B[35m segundos para la proxima impresion.");
                }
            }

        }
    }
}
