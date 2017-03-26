package rovertest;

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

public class RoverMoveTest {
    Rover rover = new Rover();

    @Before
    public void setUp() {
        Posicao initialPosition = new Posicao(2, 3);
        rover.setPosicao(initialPosition);
    }

    @Test
    public void shouldArrive_3_3_while_move_east_from_2_3() throws OutOfBoundException {
        //GIVEN
        rover.setDirecao(Direcao.EAST);
        Posicao expectedPosition = new Posicao(3,3);
        //WHEN
        rover.movimento();
        //THEN
        assertTrue(rover.getPosicao().equals(expectedPosition));
    }

    @Test
    public void shouldArrive_1_3_while_move_west_from_2_3() throws OutOfBoundException {
        //GIVEN
        rover.setDirecao(Direcao.WEST);
        Posicao expectedPosition = new Posicao(1,3);
        //WHEN
        rover.movimento();
        //THEN
        assertTrue(rover.getPosicao().equals(expectedPosition));
    }

    @Test
    public void shouldArrive_2_4_while_move_north_from_2_3() throws OutOfBoundException {
        //GIVEN
        rover.setDirecao(Direcao.NORTH);
        Posicao expectedPosition = new Posicao(2,4);
        //WHEN
        rover.movimento();
        //THEN
        assertTrue(rover.getPosicao().equals(expectedPosition));
    }

    @Test
    public void shouldArrive_2_2_while_move_south_from_2_3() throws Exception, OutOfBoundException {
        //GIVEN
        rover.setDirecao(Direcao.SOUTH);
        Posicao expectedPosition = new Posicao(2,2);
        //WHEN
        rover.movimento();
        //THEN
        assertTrue(rover.getPosicao().equals(expectedPosition));
    }
}