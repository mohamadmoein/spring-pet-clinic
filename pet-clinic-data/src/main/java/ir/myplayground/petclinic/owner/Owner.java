package ir.myplayground.petclinic.owner;

import ir.myplayground.petclinic.person.Person;
import ir.myplayground.petclinic.pet.Pet;

import java.util.Set;

public class Owner extends Person {
    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
