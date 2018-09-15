package edu.wctc.jsadi.Test;
import edu.wctc.jsadi.Person;
import org.junit.*;

public class PersonTest extends junit.framework.TestCase {
    public PersonTest() {}

    public Person jordan;

    @Before
    public void setUp() throws Exception {
        jordan = new Person("jordan", "sadi", 28, 180);
    }

    @After
    public void tearDown() throws Exception {}

    @Test
    public void testGetLiving() {
        assertTrue(jordan.getLiving());
    }

    @Test
    public void testGetWeight() {
        assertEquals(jordan.getWeight(), 180.0);
        assertNotSame(jordan.getWeight(), 80.0);
    }
}
