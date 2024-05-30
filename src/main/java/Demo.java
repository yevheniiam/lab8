import pupbic_interfase.Participant;
import server.RegisteredParticipant;
import server.RegisteredParticipateSaveToXml;

import javax.xml.bind.JAXBException;

public class Demo {

    public static void main(String[] args) throws JAXBException {
        RegisteredParticipant participant = new RegisteredParticipant();
        participant.addDRegisteredParticipantChangeListener(e->{
            System.out.println("Change");
        });
        participant.add(new Participant("sdf","erdahfsgvds","dsfghb","gfd","fASDg@jsd.com"));
        participant.add(new Participant("sdf","adsfghg","dfgs","fgdsgs","sdafioj@gsd.com"));
        participant.add(new Participant("sgdfzf","gdesf","fdgsfdsg","gsafd","sgdF@svd.com"));

        RegisteredParticipateSaveToXml.marshalDataToXML("output.xml",participant);
        System.out.println(RegisteredParticipateSaveToXml.unmarshalOutXMLs("output.xml"));
    }
}