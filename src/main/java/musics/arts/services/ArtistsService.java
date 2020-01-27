package musics.arts.services;

import java.util.List;

import org.springframework.stereotype.Service;

import musics.arts.models.Artist;

@Service
public interface ArtistsService {

	public List<Artist> findAll();
	public Artist findById(Integer id);
	public Artist save(Artist artistModel);
	public List<Artist> findArtistByGenreId(Integer id);
	
}
