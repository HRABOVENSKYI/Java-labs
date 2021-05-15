package ua.lviv.iot.loomshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.loomshop.models.loom.Loom;

import java.util.Optional;

@Repository
public interface LoomDAO extends JpaRepository<Loom, Long> {

    Loom findLoomById(Long id);

    Optional<Loom> findLoomsById(Long id);

//    @Query(
//            value = "SELECT * FROM Loom loom",
//            nativeQuery = true
//    )
//    Optional<Loom> findAllLooms();
}
