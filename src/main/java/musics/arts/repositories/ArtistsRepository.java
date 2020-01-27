package musics.arts.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import musics.arts.models.Artist;
import musics.arts.models.Song;

public interface ArtistsRepository extends JpaRepository<Artist, Integer> {
	List<Artist> findArtistByGenreId(Integer id);
}
