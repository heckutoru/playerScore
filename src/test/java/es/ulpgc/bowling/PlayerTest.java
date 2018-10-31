package es.ulpgc.bowling;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class PlayerTest {

    private Player jhon;
    private Player jen;
    private Player bob;

    @Before
    public void setUp() throws Exception {
        jhon = Player("Jhon");
        jen = Player("Jen");
        bob = Player("Bob");
    }

    @Test
    public void name() {
        assertThat(jhon.getPlayerName().equals("Jhon"));
        assertThat(jen.getPlayerName().equals("Jen"));
        assertThat(bob.getPlayerName().equals("Bob"));
    }

}
