package controle;

import java.util.Scanner;

import exception.OutOfBoundException;

import static java.lang.Thread.sleep;

public class Controle {

    Rover rover = new Rover();
    private static final Posicao LIMIT_POSITION = new Posicao(5,5);
    public void RoverGo() throws InterruptedException, OutOfBoundException {
        acceptInitialPosition();
        acceptInitialDirection();
        handleCommand();
        outShowRover();
    }

    private void outShowRover() {
        rover.showDetails();
    }

    private void handleCommand() throws InterruptedException, OutOfBoundException {
        System.out.print("Comandos : ");
        Scanner scanner = new Scanner(System.in);
        String commandString = scanner.nextLine().trim();
        movingInformation();
        rover.comandoInserido(commandString);
    }

    private void movingInformation() throws InterruptedException {

        System.out.println("   [Movendo]");
        int i=0;
        while(i<6){
            sleep(1000);
            System.out.print("        .");
            i++;
        }
        System.out.println("      [Chegou na posição]");
    }

    private void acceptInitialDirection() {
        System.out.print(" Direção Inicial: ");
        Scanner scanner = new Scanner(System.in);
        String directionString = scanner.nextLine().trim();
        Direcao initialDirection = Direcao.build(directionString);
        rover.setDirecao(initialDirection);
    }

    private void acceptInitialPosition() {
        System.out.print("Posição Inicial : ");
        Scanner scanner = new Scanner(System.in);
        String positionString = scanner.nextLine().trim();
        Posicao initialPosition = Posicao.montaPosicao(positionString);
        rover.setPosicao(initialPosition);
    }

    public static boolean isIllegal(Posicao roverPosition) {
        return roverPosition.localiza(LIMIT_POSITION);
    }
}