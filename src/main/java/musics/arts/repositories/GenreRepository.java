package musics.arts.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import musics.arts.models.Artist;
import musics.arts.models.Genre;

public interface GenreRepository extends JpaRepository<Genre, Integer>{
	public List<Artist> findAllByIdContains(Integer id);
}
