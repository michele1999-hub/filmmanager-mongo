package it.apuliadigitalmaker.studenti.filmmanagermongo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.apuliadigitalmaker.studenti.filmmanagermongo.repository.FilmRepository;
import it.apuliadigitalmaker.studenti.filmmanagermongo.requestDto.FilmRequestDto;
import it.apuliadigitalmaker.studenti.filmmanagermongo.responseDto.FilmResponseDto;
import it.apuliadigitalmaker.studenti.filmmanagermongo.service.FilmService;

@Service
public class FilmServiceImpl implements FilmService {
	
	@Autowired
	FilmRepository filmRepository;

	@Override
	public List<FilmResponseDto> getFilms() {
		
		filmRepository.findAll();
		
		return null;
	}

	@Override
	public FilmResponseDto getFilm(Long filmId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FilmResponseDto createFilm(FilmRequestDto film) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FilmResponseDto updateFilm(Long filmId, FilmRequestDto film) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteFilm(Long filmId) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
