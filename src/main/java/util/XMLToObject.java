package util;

import model.Filters;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XMLToObject {
    public Filters convert() {
        try {
            File file = new File("src/main/resources/filter.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Filters.class);

            Unmarshaller jaxUnmarshaller = jaxbContext.createUnmarshaller();
            Filters filters = (Filters) jaxUnmarshaller.unmarshal(file);


            return filters;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
