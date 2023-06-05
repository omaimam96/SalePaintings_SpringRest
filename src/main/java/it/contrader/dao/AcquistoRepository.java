package it.contrader.dao;

import it.contrader.model.Acquisto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional

public interface AcquistoRepository extends CrudRepository<Acquisto, Long> {
}