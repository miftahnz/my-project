package musics.arts.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import musics.arts.models.Artist;
import musics.arts.models.Genre;
import musics.arts.repositories.GenreRepository;
import musics.arts.services.GenreService;

@Service
public class GenreServiceImpl implements GenreService{

	@Autowired
	GenreRepository genreRepository;
	
	public List<Genre> findAll() {
		// TODO Auto-generated method stub
		return genreRepository.findAll();
	}

	public Genre findById(Integer id) {
		// TODO Auto-generated method stub
		return genreRepository.findById(id).get();
	}

	public Genre save(Genre genre) {
		// TODO Auto-generated method stub
		return genreRepository.save(genre);
	}

	public List<Artist> findAllArtistByGenre(Integer id) {
		// TODO Auto-generated method stub
		return genreRepository.findAllByIdContains(id);
	}

}
