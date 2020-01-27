package musics.arts.services;

import java.util.List;

import org.springframework.stereotype.Service;

import musics.arts.models.Artist;
import musics.arts.models.Genre;

@Service
public interface GenreService {

	public List<Genre> findAll();
	public Genre findById(Integer id);
	public Genre save(Genre genre);
	public List<Artist> findAllArtistByGenre(Integer id);
}
