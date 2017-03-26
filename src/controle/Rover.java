package controle;

import exception.OutOfBoundException;

public class Rover {
    private Posicao posicao;
    private Direcao direcao;

    public void setPosicao(Posicao pos) {
        this.posicao = pos;
    }

    public void setDirecao(Direcao dir) {
        this.direcao = dir;
    }

    public void movimento() throws OutOfBoundException {
            posicao.troca(direcao);
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public Direcao getDirecao() {
        return direcao;
    }

    public void viraDireita() {
        setDirecao(direcao.direita());
    }

    public void viraEsquerda() {
        setDirecao(direcao.esquerda());
    }

    public void comandoInserido(String comando) throws OutOfBoundException {
        String comandoAtual = comando.trim();
        for (int i=0;i<comandoAtual.length();i++){
          switch (comandoAtual.charAt(i)){
              case 'M':
              case 'm':
                  movimento();
                  break;
              case 'L':
              case 'l':
                  viraEsquerda();
                  break;
              case 'R':
              case 'r':
                  viraDireita();
                  break;
              default:
                  System.out.println("Comando Invalido: "+comandoAtual.charAt(i));
                  break;
          }
       }
    }

    public void showDetails() {
        System.out.println("Posicao : ("+posicao.getPosicaoX()+" , "+posicao.getPosicaoY()+")");
        System.out.println("Direcao : "+direcao.getDirectionValue());
    }
}
