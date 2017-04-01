package testeRover;

import org.junit.Before;
import org.junit.Test;

import controle.Rover;
import controle.Direcao;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestedeRotacao {
    Rover rover;
    @Before
    public void setUp(){
        rover = new Rover();
    }

    @Test
    public void deve_receber_WEST_quando_virar_para_esquerda_e_iniciou_no__NORTH(){
        Direcao posicaoInicial = Direcao.NORTH;
        rover.setDirecao(posicaoInicial);
        rover.viraEsquerda();
        assertThat(rover.getDirecao(),is(Direcao.WEST));
    }

    @Test
    public void deve_receber_EAST_quando_virar_para_direita_e_iniciou_no_NORTH(){
        Direcao posicaoInicial = Direcao.NORTH;
        rover.setDirecao(posicaoInicial);
        rover.viraDireita();
        assertThat(rover.getDirecao(),is(Direcao.EAST));
    }

    @Test
    public void deve_receber_NORTH_quando_virar_para_esquerda_e_iniciou_no_EAST(){
        Direcao posicaoInicial = Direcao.EAST;
        rover.setDirecao(posicaoInicial);
        rover.viraEsquerda();
        assertThat(rover.getDirecao(),is(Direcao.NORTH));
    }
    @Test
    public void deve_receber_SOUTH_quando_virar_direita_e_iniciou_no_EAST(){
        Direcao initialDirection = Direcao.EAST;
        rover.setDirecao(initialDirection);
        rover.viraDireita();
        assertThat(rover.getDirecao(),is(Direcao.SOUTH));
    }

    @Test
    public void deve_receber_EAST_quando_virar_esquerda_e_iniciou_no_SOUTH(){
        Direcao posicaoInicial = Direcao.SOUTH;
        rover.setDirecao(posicaoInicial);
        rover.viraEsquerda();
        assertThat(rover.getDirecao(),is(Direcao.EAST));
    }
    @Test
    public void deve_receber_WEST_quando_virar_direita_e_iniciou_no_SOUTH(){
        Direcao posicao_Inicial = Direcao.SOUTH;
        rover.setDirecao(posicao_Inicial);
        rover.viraDireita();
        assertThat(rover.getDirecao(),is(Direcao.WEST));
    }
    @Test
    public void Deve_receber_SOUTH_quando_vira_para_esquerda_e_iniciou_no_WEST(){
        Direcao posicaoInicial = Direcao.WEST;
        rover.setDirecao(posicaoInicial);
        rover.viraEsquerda();
        assertThat(rover.getDirecao(),is(Direcao.SOUTH));
    }
    @Test
    public void deve_receber_NORTH_quando_vira_para_direita_e_inicioi_no_WEST(){
        Direcao posicao_Inicial = Direcao.WEST;
        rover.setDirecao(posicao_Inicial);
        rover.viraDireita();
        assertThat(rover.getDirecao(),is(Direcao.NORTH));
    }
}