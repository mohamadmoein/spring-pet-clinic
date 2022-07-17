package ir.myplayground.petclinic.vet;

import ir.myplayground.petclinic.AbstractMapService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

}
