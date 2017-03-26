package controle;

public enum Direcao {
    WEST("W"),NORTH("N"),EAST("E"),SOUTH("S");
    private String directionValue;

    private Direcao(String directionValue) {
        this.directionValue = directionValue;
    }

    public String getDirectionValue() {
        return directionValue;
    }

    public Direcao direita() {
        int index = indexOf(this);
        return Direcao.values()[right(index)];
    }

    private int indexOf(Direcao roverDirection) {
        for (Direcao direction:Direcao.values()){
            if (direction.equals(roverDirection)){
                return direction.ordinal();
            }
        }
        return 0;
    }

    private static int right(int index) {
        return ++index>3? 0:index;
    }

    public Direcao esquerda() {
        int index = indexOf(this);
        return Direcao.values()[left(index)];
    }

    private int left(int index) {
        return --index<0? 3:index;
    }

    public static Direcao build(String directionValue){
        for(Direcao roverDirection:Direcao.values()){
            if (roverDirection.equals(directionValue)){
                return roverDirection;
            }
        }
        return null;
    }
}