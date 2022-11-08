import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ManejoDeArchivos {

    public static void main(String[] args) {
        //Proceso de guardar y escribir en un archivo:
        List<Contact> contacts = new ArrayList<>();

        Contact contact1 = new Contact("Pedro", "Lopez", "pedro@lopez.com", 30025478);
        Contact contact2 = new Contact("Lina", "Perez", "lina@perez.com", 6987478);
        Contact contact3 = new Contact("Betty", "Alvez", "betty@alvez.com", 3698741);
        Contact contact4 = new Contact("Gustavo", "Velez", "gustavo@velez.com", 98745632);

        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);
        contacts.add(contact4);

        FileOutputStream fileOutputStream;

        try {
            fileOutputStream = new FileOutputStream("Contacts.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(contacts);

        } catch (Exception e) {
            e.printStackTrace();
        }

        //Proceso de leer y capturar el archivo:
        List<Contact> contacts2 = new ArrayList<>();

        FileInputStream fileInputStream;

        try{
            fileInputStream = new FileInputStream("Contacts.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            contacts2 = (List<Contact>) objectInputStream.readObject();

            for (Contact contact : contacts2) {
                System.out.println(contact.getName() + " | " + contact.getSurname() + " | " + contact.getMail() + " | " + contact.getPhone());
            }

        } catch (Exception e){
            e.printStackTrace();
        }

    }

}
