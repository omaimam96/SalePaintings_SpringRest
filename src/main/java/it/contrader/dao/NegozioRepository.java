package it.contrader.dao;

import it.contrader.model.Negozio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface NegozioRepository extends CrudRepository<Negozio, Long> {
    Negozio findByUserId(long userId);
}
