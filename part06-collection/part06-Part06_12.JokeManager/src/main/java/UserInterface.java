
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raymo
 */
public class UserInterface {
    private Scanner scanner;
    private JokeManager jokeManager;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.scanner = scanner;
        this.jokeManager = jokeManager;
    }

    public void start() {
        while (true) {
            System.out.println("Command:\n 1 - add a joke\n 2 - draw a joke\n 3 - list jokes\n X - stop");
            String command = scanner.nextLine();

            if (command.equals("X")) {
                break;
            }

            if (command.equals("1")) {
                System.out.println("Write the joke to be added: ");
                String word = scanner.nextLine();
                this.jokeManager.addJoke(word);
                continue;
            }

            if (command.equals("2")) {
                System.out.println(this.jokeManager.drawJoke());
                continue;
            }
            
            if(command.equals("3")){
                System.out.println("Printing the jokes.");
                this.jokeManager.printJokes();
                continue;
            }
        }
    }
}
