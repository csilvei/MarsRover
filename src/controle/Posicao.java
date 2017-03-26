package controle;

import exception.OutOfBoundException;

public class Posicao {
    private int posicaox;
    private int posicaoy;

    public Posicao(int posx, int posy) {
        this.posicaox = posx;
        this.posicaoy = posy;
    }

    public int getPosicaoX() {
        return posicaox;
    }

    public int getPosicaoY() {
        return posicaoy;
    }

    public void troca(Direcao dir) throws OutOfBoundException {
        int temp_posx = posicaox;
        int temp_posy = posicaoy;
        switch (dir) {
            case EAST:
                temp_posx++;
                break;
            case WEST:
                temp_posx--;
                break;
            case SOUTH:
                temp_posy--;
                break;
            case NORTH:
                temp_posy++;
                break;
            default:
                break;
        }
        Posicao posicaotemporaria = new Posicao(temp_posx, temp_posy);
        if (Controle.isIllegal(posicaotemporaria)){
            posicaox = temp_posx;
            posicaoy = temp_posy;
        }
        else{
            throw new OutOfBoundException("outOfBound");
        }
    }

    public static Posicao montaPosicao(String pos) {
        String[] result = pos.split(" ");
        int posicaox = Integer.parseInt(result[0]);
        int posicaoy = Integer.parseInt(result[1]);
        return new Posicao(posicaox,posicaoy);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Posicao that = (Posicao) o;
        return posicaox == that.posicaox && posicaoy == that.posicaoy;
    }

    @Override
    public int hashCode() {
        int result = posicaox;
        result = 31 * result + posicaoy;
        return result;
    }

    public boolean localiza(Posicao posicaolimite) {
        return posicaox<=posicaolimite.getPosicaoX()&&posicaoy<=posicaolimite.getPosicaoY()&&posicaox>=0&&posicaoy>=0;
    }
}