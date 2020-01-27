package musics.arts.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import musics.arts.models.Artist;
import musics.arts.repositories.ArtistsRepository;
import musics.arts.services.ArtistsService;

@Service
public class ArtistServiceImpl implements ArtistsService{

	@Autowired
	ArtistsRepository artistRepository;
	
	public List<Artist> findAll() {
		// TODO Auto-generated method stub
		return artistRepository.findAll();
	}

	public Artist save(Artist artistModel) {
		// TODO Auto-generated method stub
		return artistRepository.save(artistModel);
	}

	public Artist findById(Integer id) {
		// TODO Auto-generated method stub
		return artistRepository.findById(id).get();
	}

	public List<Artist> findArtistByGenreId(Integer id) {
		// TODO Auto-generated method stub
		return artistRepository.findArtistByGenreId(id);
	}


}
