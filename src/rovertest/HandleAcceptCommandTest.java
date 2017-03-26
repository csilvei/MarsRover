package rovertest;

import org.junit.Test;

import controle.Rover;
import controle.Direcao;
import controle.Posicao;
import exception.OutOfBoundException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HandleAcceptCommandTest {
    @Test
    public void should_arrive_2_3_when_accept_MRMLM_command_at_the_initialPosition_1_1_north() throws OutOfBoundException {
        //GIVEN
        Rover rover = new Rover();
        Posicao initialPosition = new Posicao(1,1);
        rover.setPosicao(initialPosition);
        rover.setDirecao(Direcao.NORTH);
        //WHEN
        rover.comandoInserido("MRMLdafaM");
        //THEN
        assertThat(rover.getPosicao().getPosicaoX(), is(2));
        assertThat(rover.getPosicao().getPosicaoY(), is(3));
        assertThat(rover.getDirecao(),is(Direcao.NORTH));
    }
    
    @Test(expected = OutOfBoundException.class)
    public void shouldCatchOutOfBoundException() throws Exception, OutOfBoundException {
        //GIVEN
        Rover rover = new Rover();
        Posicao initialPosition = new Posicao(1,1);
        rover.setPosicao(initialPosition);
        rover.setDirecao(Direcao.NORTH);
        //WHEN
        rover.comandoInserido("MMMMMM");
    }
    
    
}