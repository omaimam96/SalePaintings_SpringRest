package it.contrader.dao;

import it.contrader.model.Acquisto;
import it.contrader.model.Profilo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional

public interface AcquistoRepository extends CrudRepository<Acquisto, Long> {

    @Query(nativeQuery = true, value="SELECT * FROM acquisto WHERE profilo_id=?;")
    List<Acquisto> findByAcquisto(long userId);
}