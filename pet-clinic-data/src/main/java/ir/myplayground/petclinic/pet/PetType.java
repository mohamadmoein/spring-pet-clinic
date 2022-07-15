package ir.myplayground.petclinic.pet;

import ir.myplayground.petclinic.BaseEntity;

public class PetType extends BaseEntity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
