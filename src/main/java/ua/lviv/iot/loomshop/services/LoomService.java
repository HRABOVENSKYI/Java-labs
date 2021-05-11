package ua.lviv.iot.loomshop.services;

import org.springframework.http.ResponseEntity;
import ua.lviv.iot.loomshop.models.loom.Loom;

import java.util.Map;

public interface LoomService {

    Loom createLoom(Loom loom);

    Map<Integer, Loom> getAllLooms();

    Loom getLoom(Integer id);

    ResponseEntity<Loom> updateLoomById(Integer id, Loom newLoom);

    void deleteAllLooms();

    void deleteLoomById(Integer id);
}
