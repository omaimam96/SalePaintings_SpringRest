package it.contrader.dao;

import it.contrader.model.Image;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ImageRepository  extends CrudRepository<Image,Long> {



}
