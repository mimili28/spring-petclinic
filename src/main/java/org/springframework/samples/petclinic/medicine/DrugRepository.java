package org.springframework.samples.petclinic.medicine;


import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;


public interface DrugRepository extends Repository<Drug, Integer> {

//    @Query("SELECT DISTINCT drug FROM Drug drug WHERE drug.name LIKE :name%")
//    @Transactional(readOnly = true)
//    Collection<Drug> findByName(@Param("name") String name);

//    @Query("SELECT drug FROM Drug drug WHERE drug.id =:id")
//    @Transactional(readOnly = true)
//    Drug findById(@Param("id") Integer id);
//    void save(Drug drug);

    @Transactional(readOnly = true)
   // @Cacheable("drugs")
    Collection<Drug> findAll() throws DataAccessException;



}
