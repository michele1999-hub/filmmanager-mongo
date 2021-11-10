package it.apuliadigitalmaker.studenti.filmmanagermongo.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import it.apuliadigitalmaker.studenti.filmmanagermongo.model.Film;

public interface FilmRepository extends MongoRepository<Film, Long>{

}
