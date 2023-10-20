package projeto_ap3_marcosaAntonio.unidade3.EX1.ex2;

public class TestaContadorComThreads {
    public static void main(String[] args) {
        ContadorComThreads contador1 = new ContadorComThreads();
        ContadorComThreads contador2 = new ContadorComThreads();

        Thread thread1 = new Thread(contador1);
        Thread thread2 = new Thread(contador2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Execução das threads concluída.");
    }
}
