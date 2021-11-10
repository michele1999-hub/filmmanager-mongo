package it.apuliadigitalmaker.studenti.filmmanagermongo.service;

import java.util.List;

import it.apuliadigitalmaker.studenti.filmmanagermongo.requestDto.FilmRequestDto;
import it.apuliadigitalmaker.studenti.filmmanagermongo.responseDto.FilmResponseDto;

public interface FilmService {

	public List<FilmResponseDto> getFilms();
	
	public FilmResponseDto getFilm(Long filmId);
	
	public FilmResponseDto createFilm(FilmRequestDto film);
	
	public FilmResponseDto updateFilm(Long filmId, FilmRequestDto film);
	
	public boolean deleteFilm(Long filmId);
	
}
