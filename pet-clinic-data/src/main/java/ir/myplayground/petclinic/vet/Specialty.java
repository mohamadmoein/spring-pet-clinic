package ir.myplayground.petclinic.vet;

import ir.myplayground.petclinic.BaseEntity;

public class Specialty extends BaseEntity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
