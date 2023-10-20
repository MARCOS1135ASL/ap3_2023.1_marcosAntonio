package projeto_ap3_marcosaAntonio.unidade3.EX1.ex2;

import java.util.Random;

public class ContadorComThreads implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 30; i++) {
            System.out.println("Contador " + Thread.currentThread().getId() + ": " + i);

            try {
                // Introduza um atraso aleatório entre 1 e 1000 milissegundos.
                int random = new Random().nextInt(1000) + 1;
                Thread.sleep(random);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

