import static java.lang.Math.random;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import animals.Horses;

public class App {
    public static void main(String[] args) throws InterruptedException {

        Horses[] myHorses = new Horses[13];
        Random rand = new Random();

        clearScreen();
        int i = 2;

        while (i < 13) {
            myHorses[i] = new Horses("Number " + i);
            // System.out.println("h" + i + "= " + h$i.getName());
            i++;

        }

        boolean throwDice = true;

        while (throwDice) {

            int d1 = rand.nextInt(99);

            /*
             * int d1 = (int) (random() * 6);
             * if (d1 == 0)
             * d1 = 1;
             * int d2 = (int) (random() * 6);
             * if (d2 == 0)
             * d2 = 1;
             */
            int suma = d1 / 9 + 2;

            int horseposition = myHorses[suma].getPosition();
            myHorses[suma].setPosition(++horseposition);

            clearScreen();
            imprimirPantalla(myHorses);
            TimeUnit.MILLISECONDS.sleep(100);

            if (myHorses[suma].getPosition() == 26) {
                throwDice = false;
                System.out.println("El caballo ganador es el numero: " + myHorses[suma].getName());
            }

        }

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void imprimirPantalla(Horses[] horses) {

        int i = 2;

        System.out.println();
        while (i < 13) {

            int place = horses[i].getPosition();
            System.out.print("Caballo " + i + ": \t");
            for (int j = 0; j < place; j++) {
                System.out.print("-");
            }
            System.out.println(i);
            i++;
        }
        System.out.println("\t\t\t\t    Meta |");
    }

}
