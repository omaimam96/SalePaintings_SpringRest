package it.contrader.dao;

import javax.transaction.Transactional;

import it.contrader.model.Quadro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;




@Repository
@Transactional
public interface QuadroRepository extends CrudRepository<Quadro, Long>{

}
