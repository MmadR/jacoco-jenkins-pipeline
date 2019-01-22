package mmadr.m2;

import lombok.Data;
import org.iata.txm.TXM2009A0.envelope.TXMEnvelopeDocument;
import org.iata.txm.TXM2009A0.envelope.impl.TXMEnvelopeDocumentImpl;

@Data
public class M2 {
    private String name;

    public void hello(){
        System.out.print("hello");

        TXMEnvelopeDocument doc = TXMEnvelopeDocument.Factory.newInstance();
    }
}
