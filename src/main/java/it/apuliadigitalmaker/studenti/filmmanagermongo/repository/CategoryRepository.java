package it.apuliadigitalmaker.studenti.filmmanagermongo.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import it.apuliadigitalmaker.studenti.filmmanagermongo.model.Category;

public interface CategoryRepository extends MongoRepository<Category, ObjectId> {
	
	public List<Category> findByName(String name);
	
	public List<Category> findByNameLikeIgnoreCase(String name);

}
