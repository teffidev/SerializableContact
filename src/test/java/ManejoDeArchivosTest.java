import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManejoDeArchivosTest {

    @Test
    public void checking_contacts(){
        Contact contact1 = new Contact("Pedro", "Lopez", "pedro@lopez.com", 30025478);

        Boolean isCorrectMail = contact1.getMail() != null;

        assertTrue(isCorrectMail);
        assertEquals("pedro@lopez.com", contact1.getMail());
        assertNotNull(contact1.getMail());
    }

}