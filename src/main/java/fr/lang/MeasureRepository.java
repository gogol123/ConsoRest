package fr.lang;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/**
 * Created by philippe on 30/10/2016.
 */


@RepositoryRestResource(collectionResourceRel = "measure", path = "measure")
public interface MeasureRepository extends PagingAndSortingRepository<Measure, Long> {
       List<Measure> findByCmdId(@Param("cmdId")Long cmdId);
}

