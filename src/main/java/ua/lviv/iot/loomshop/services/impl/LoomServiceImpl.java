package ua.lviv.iot.loomshop.services.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ua.lviv.iot.loomshop.models.loom.Loom;
import ua.lviv.iot.loomshop.services.LoomService;

import java.util.HashMap;
import java.util.Map;

@Service
public class LoomServiceImpl implements LoomService {

    private Integer id = 0;
    private Map<Integer, Loom> looms = new HashMap<>();

    @Override
    public Loom createLoom(Loom loom) {
        looms.put(++id, loom);
        return loom;
    }

    @Override
    public Map<Integer, Loom> getAllLooms() {
        return looms;
    }

    @Override
    public Loom getLoom(Integer id) {
        return looms.get(id);
    }

    /**
     * Returns 200 status code and previous loom object if loom with this id exists
     * Returns 404 status code if loom with this id is missing
     */
    @Override
    public ResponseEntity<Loom> updateLoomById(Integer id, Loom newLoom) {

        Loom oldLoom = getLoom(id);
        return looms.replace(id, newLoom) != null ? new ResponseEntity<>(oldLoom, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @Override
    public void deleteAllLooms() {
        looms = new HashMap<>();
    }

    @Override
    public void deleteLoomById(Integer id) {
        looms.remove(id);
    }
}
