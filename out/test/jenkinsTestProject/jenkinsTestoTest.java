package test;

import main.JenkinsTesto;
import org.junit.Test;
import static org.junit.Assert.*;

public class jenkinsTestoTest {

    @Test
    public void sommeDeuxEntiersTest(){
        assertEquals(JenkinsTesto.somme(5,6), 11);
    }
}
