package it.apuliadigitalmaker.studenti.filmmanagermongo.service;


import java.util.List;

import org.bson.types.ObjectId;

import it.apuliadigitalmaker.studenti.filmmanagermongo.requestDto.CategoryRequestDto;
import it.apuliadigitalmaker.studenti.filmmanagermongo.responseDto.CategoryResponseDto;

public interface CategoryService {
	
	public List<CategoryResponseDto> findCategories(String name) ;
	
	public CategoryResponseDto findCategoryById(ObjectId id);
	
	public CategoryResponseDto createCategory(CategoryRequestDto categoryRequest);
	
	public CategoryResponseDto updateCategory(CategoryRequestDto categoryRequest, ObjectId categoryId);
	
	public boolean deleteCategory(ObjectId id);

}
