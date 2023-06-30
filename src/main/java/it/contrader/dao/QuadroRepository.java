package it.contrader.dao;

import javax.transaction.Transactional;

import it.contrader.model.Profilo;
import it.contrader.model.Quadro;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Transactional
public interface QuadroRepository extends CrudRepository<Quadro, Long>{

    @Query(nativeQuery = true, value="SELECT * FROM quadro WHERE venduto=0;")
    List<Quadro> readByDisp();
    @Query(nativeQuery = true, value="SELECT * FROM quadro WHERE venduto=0 AND tipologia=? AND orientamento=? AND nome_quadro=? ORDER BY costo ?;")
    List<Quadro> getAllByFilter(String tipologia, String orientamento,String ricerca, String costo);
}
