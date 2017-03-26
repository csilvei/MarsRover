package rovertest;

import org.junit.Before;
import org.junit.Test;

import controle.Rover;
import controle.Direcao;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RoverRotateTest {
    Rover rover;
    @Before
    public void setUp(){
        rover = new Rover();
    }

    @Test
    public void should_get_direction_WEST_while_turn_left_at_the_initial_direction_NORTH(){
        Direcao initialDirection = Direcao.NORTH;
        rover.setDirecao(initialDirection);
        rover.viraEsquerda();
        assertThat(rover.getDirecao(),is(Direcao.WEST));
    }

    @Test
    public void should_get_direction_EAST_while_turn_right_at_the_initial_direction_NORTH(){
        Direcao initialDirection = Direcao.NORTH;
        rover.setDirecao(initialDirection);
        rover.viraDireita();
        assertThat(rover.getDirecao(),is(Direcao.EAST));
    }

    @Test
    public void should_get_direction_NORTH_while_turn_left_at_the_initial_direction_EAST(){
        Direcao initialDirection = Direcao.EAST;
        rover.setDirecao(initialDirection);
        rover.viraEsquerda();
        assertThat(rover.getDirecao(),is(Direcao.NORTH));
    }
    @Test
    public void should_get_direction_SOUTH_while_turn_right_at_the_initial_direction_EAST(){
        Direcao initialDirection = Direcao.EAST;
        rover.setDirecao(initialDirection);
        rover.viraDireita();
        assertThat(rover.getDirecao(),is(Direcao.SOUTH));
    }

    @Test
    public void should_get_direction_EAST_while_turn_left_at_the_initial_direction_SOUTH(){
        Direcao initialDirection = Direcao.SOUTH;
        rover.setDirecao(initialDirection);
        rover.viraEsquerda();
        assertThat(rover.getDirecao(),is(Direcao.EAST));
    }
    @Test
    public void should_get_direction_WEST_while_turn_right_at_the_initial_direction_SOUTH(){
        Direcao initialDirection = Direcao.SOUTH;
        rover.setDirecao(initialDirection);
        rover.viraDireita();
        assertThat(rover.getDirecao(),is(Direcao.WEST));
    }
    @Test
    public void should_get_direction_SOUTH_while_turn_left_at_the_initial_direction_WEST(){
        Direcao initialDirection = Direcao.WEST;
        rover.setDirecao(initialDirection);
        rover.viraEsquerda();
        assertThat(rover.getDirecao(),is(Direcao.SOUTH));
    }
    @Test
    public void should_get_direction_NORTH_while_turn_right_at_the_initial_direction_WEST(){
        Direcao initialDirection = Direcao.WEST;
        rover.setDirecao(initialDirection);
        rover.viraDireita();
        assertThat(rover.getDirecao(),is(Direcao.NORTH));
    }
}