package it.apuliadigitalmaker.studenti.filmmanagermongo.responseDto;

import org.bson.types.ObjectId;

public class CategoryResponseDto {
	
	private String name;
	
	private ObjectId id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public CategoryResponseDto() {
		super();
	}

	public CategoryResponseDto(String name, ObjectId id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "CategoryResponseDto [name=" + name + ", id=" + id + "]";
	}


	
	

}
