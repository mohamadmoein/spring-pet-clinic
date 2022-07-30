package ir.myplayground.petclinic.vet;

import ir.myplayground.petclinic.person.Person;

import java.util.Set;

public class Vet extends Person {
    private Set<Specialty> specialties;

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}
