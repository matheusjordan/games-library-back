package unifacisa.si.pp.prova.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import unifacisa.si.pp.prova.models.Game;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RepositoryRestResource(collectionResourceRel = "games", path = "games")
public interface GameRepository extends PagingAndSortingRepository<Game, Long>{

}
