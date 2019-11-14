package org.springframework.samples.petclinic.owner;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Pets {
    private List<Pet> pets;

    @XmlElement
    public List<Pet> getPetList() {
        if (pets == null) {
            pets = new ArrayList<>();
        }
        return pets;
    }
}
