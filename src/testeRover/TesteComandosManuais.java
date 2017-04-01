package testeRover;

import org.junit.Test;

import controle.Rover;
import controle.Direcao;
import controle.Posicao;
import exception.OutOfBoundException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TesteComandosManuais {
    @Test
    public void deve_chegar_2_3_quando_comendo_for_MRMLM_posicao_inicial_1_1_north() throws OutOfBoundException {
        
        Rover rover = new Rover();
        Posicao posicaoInicial = new Posicao(1,1);
        rover.setPosicao(posicaoInicial);
        rover.setDirecao(Direcao.NORTH);
        
        rover.comandoInserido("MRMLdafaM");
        
        assertThat(rover.getPosicao().getPosicaoX(), is(2));
        assertThat(rover.getPosicao().getPosicaoY(), is(3));
        assertThat(rover.getDirecao(),is(Direcao.NORTH));
    }
    
    @Test(expected = OutOfBoundException.class)
    public void DeveRetornarExcecao() throws Exception, OutOfBoundException {
        
        Rover rover = new Rover();
        Posicao posicaoInicial = new Posicao(1,1);
        rover.setPosicao(posicaoInicial);
        rover.setDirecao(Direcao.NORTH);
        
        rover.comandoInserido("MMMMMM");
    }
    
    
}