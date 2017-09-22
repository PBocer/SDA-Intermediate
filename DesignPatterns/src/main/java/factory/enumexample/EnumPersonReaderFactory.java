package factory.enumexample;

import factory.JsonPersonFileReader;
import factory.PersonFileReader;
import factory.TxtPersonFileReader;
import factory.XmlPersonFileReader;

public class EnumPersonReaderFactory {

    PersonFileReader create(PersonReaderFileType fileType) {
        switch (fileType) {
            case TXT:
                return new TxtPersonFileReader();
            case XML:
                return new XmlPersonFileReader();
            case JSON:
                return new JsonPersonFileReader();

        }
        return null;
    }
}
