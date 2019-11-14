package org.springframework.samples.petclinic.medicine;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import java.util.Date;


@Table(name = "drugs")
public class Drug {
    @Column(name = "drug_name")
    @NotEmpty
    private String name;

    @Column(name = "animal_type")
    @NotEmpty
    private String animalType;

    @Column(name = "batch_nr")
    @NotEmpty
    @Digits(fraction = 0, integer = 10)
    private int batchNr;

    @Column(name = "date_last")
    @NotEmpty
    private Date dateLast;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getAnimalType(){return this.animalType;}

    public void setAnimalType(String animalType){
        this.animalType=animalType;
    }

    public int getBatchNr() {
        return batchNr;
    }

    public void setBatchNr(int batchNr) {
        this.batchNr = batchNr;
    }

    public Date getDateLast() {
        return dateLast;
    }

    public void setDateLast(Date dateLast) {
        this.dateLast = dateLast;
    }


}
