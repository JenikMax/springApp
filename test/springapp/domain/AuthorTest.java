package springapp.domain;

import junit.framework.TestCase;


public class AuthorTest  extends TestCase {

    private Author author;

    protected void setUp() throws Exception {
        author = new Author();
    }

    /*public void testSetAndGetSurname() {
        String testSurname = "aSurname";
        assertNull(author.getSurname());
        author.setSurname(testSurname);
        assertEquals(testSurname, author.getSurname());
    }

    public void testSetAndGetName() {
        String testName = "aName";
        assertNull(author.getName());
        author.setName(testName);
        assertEquals(testName, author.getName());
    }

    public void testSetAndGetPrice() {
        double testPrice = 100.00;
        assertEquals(0, 0, 0);
        author.setPrice(testPrice);
        assertEquals(testPrice, author.getPrice(), 0);
    } */
}