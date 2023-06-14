package it.contrader.dao;

import it.contrader.model.Profilo;
import it.contrader.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ProfiloRepository extends CrudRepository<Profilo, Long> {

    Profilo findByUser(User userDTO);
    Profilo findByUserId(long userId);


}
