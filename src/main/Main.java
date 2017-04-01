package main;

import controle.Controle;
import exception.OutOfBoundException;

public class Main {
    public static void main(String[] args) throws InterruptedException, OutOfBoundException {
        Controle controleRover = new Controle();
        controleRover.RoverGo();
    }
}
