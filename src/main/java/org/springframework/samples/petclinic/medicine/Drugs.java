package org.springframework.samples.petclinic.medicine;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class Drugs {
    private List<Drug> drugs;

    @XmlElement
    public List<Drug> getDrugList() {
        if (drugs == null) {
            drugs = new ArrayList<>();
        }
        return drugs;
    }
}
