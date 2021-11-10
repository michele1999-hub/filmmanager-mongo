package it.apuliadigitalmaker.studenti.filmmanagermongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import it.apuliadigitalmaker.studenti.filmmanagermongo.model.Language;

public interface LanguageRepository extends MongoRepository<Language, Long>{

}
