package it.contrader.dao;

import it.contrader.dto.ProfiloDTO;
import it.contrader.model.Profilo;
import it.contrader.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface ProfiloRepository extends CrudRepository<Profilo, Long> {

    Profilo findByUser(User userDTO);
    Profilo findByUserId(long userId);

    @Query(nativeQuery = true, value="SELECT * FROM profilo WHERE user_id IS NOT NULL;")
    List<Profilo> findByUseridNN();
}
