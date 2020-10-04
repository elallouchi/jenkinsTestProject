import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JenkinsTestyTest {

    @Test
    public void testSommeDeuxEntiers(){
        assertEquals(JenkinsTesty.somme(5,6), 11);
        assertEquals(JenkinsTesty.somme(4,-2), 2);
    }
}
