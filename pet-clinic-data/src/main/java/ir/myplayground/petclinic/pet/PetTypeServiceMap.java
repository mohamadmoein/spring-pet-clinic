package ir.myplayground.petclinic.pet;

import ir.myplayground.petclinic.AbstractMapService;
import org.springframework.stereotype.Service;

@Service
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService {
}
