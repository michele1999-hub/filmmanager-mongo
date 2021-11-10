package it.apuliadigitalmaker.studenti.filmmanagermongo.repository;



import org.springframework.data.mongodb.repository.MongoRepository;

import it.apuliadigitalmaker.studenti.filmmanagermongo.model.Actor;

public interface ActorRepository extends MongoRepository<Actor, Long>{

}
