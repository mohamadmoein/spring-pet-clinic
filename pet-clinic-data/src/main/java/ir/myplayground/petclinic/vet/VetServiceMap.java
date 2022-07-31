package ir.myplayground.petclinic.vet;

import ir.myplayground.petclinic.AbstractMapService;
import ir.myplayground.petclinic.pet.Pet;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    private final SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Vet saveWithSpecialties(Vet vet) {
        if (vet != null) {
            if (vet.getSpecialties() != null) {
                vet.getSpecialties().forEach(specialty -> {
                    if (specialty.getId() == null) {
                        Specialty finalSpecialty = specialtyService.save(specialty);
                        specialty.setId(finalSpecialty.getId());
                    }
                });
            }

            return super.save(vet);
        } else {
            return null;
        }
    }
}
