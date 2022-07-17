package ir.myplayground.petclinic.pet;

import ir.myplayground.petclinic.AbstractMapService;
import org.springframework.stereotype.Service;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

}
