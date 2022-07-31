package ir.myplayground.petclinic.vet;

import ir.myplayground.petclinic.AbstractMapService;
import org.springframework.stereotype.Service;

@Service
public class SpecialtyServiceMap extends AbstractMapService<Specialty, Long> implements SpecialtyService {

}
