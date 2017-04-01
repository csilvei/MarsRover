package testeRover;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import controle.Rover;
import controle.Direcao;
import controle.Posicao;
import exception.OutOfBoundException;

import static junit.framework.Assert.assertTrue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestedeMovimento {
    Rover rover = new Rover();

    @Before
    public void setUp() {
        Posicao posicaoInicial = new Posicao(2, 3);
        rover.setPosicao(posicaoInicial);
    }

    @Test
    public void deve_chegar_3_3_enquanto_se_move_de_east_para_2_3() throws OutOfBoundException {
        
        rover.setDirecao(Direcao.EAST);
        Posicao posicaoEsperada = new Posicao(3,3);
        
        rover.movimento();
        
        assertTrue(rover.getPosicao().equals(posicaoEsperada));
    }

    @Test
    public void deve_chegar_1_3_enquanto_se_move_de_west_para_2_3() throws OutOfBoundException {
        
        rover.setDirecao(Direcao.WEST);
        Posicao posicaoEsperada = new Posicao(1,3);
        
        rover.movimento();
        
        assertTrue(rover.getPosicao().equals(posicaoEsperada));
    }

    @Test
    public void deve_chegar_2_4_enquanto_se_move_de_north_para_2_3() throws OutOfBoundException {
        
        rover.setDirecao(Direcao.NORTH);
        Posicao posicaoEsperada = new Posicao(2,4);
        
        rover.movimento();
        
        assertTrue(rover.getPosicao().equals(posicaoEsperada));
    }

    @Test
    public void deve_chegar_2_2_enquanto_se_move_de_south_para_2_3() throws Exception, OutOfBoundException {
        
        rover.setDirecao(Direcao.SOUTH);
        Posicao posicaoEesperada = new Posicao(2,2);
        
        rover.movimento();
        
        assertTrue(rover.getPosicao().equals(posicaoEesperada));
    }
}