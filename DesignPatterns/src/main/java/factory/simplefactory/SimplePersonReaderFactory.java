package factory.simplefactory;

import factory.JsonPersonFileReader;
import factory.PersonFileReader;
import factory.TxtPersonFileReader;
import factory.XmlPersonFileReader;

/**
 * Klasa fabryki, ktora tworzy odpowiedni czytnik Osob z pliku w zaleznosci od rozszerzenia
 */
public class SimplePersonReaderFactory {

    /**
     * Metoda wytworcza, ktora tworzy odpowiedni czytnik w zaleznosci od rozszerzenia pliku
     *
     * @param path
     * @return
     */
    public PersonFileReader createReader(String path) {


        if (path.endsWith(".txt")) {
            return new TxtPersonFileReader();
        } else if (path.endsWith(".json")) {
            return new JsonPersonFileReader();
        } else if (path.endsWith(".xml")) {
            return new XmlPersonFileReader();
        } else {
            return null;
        }
    }


}
