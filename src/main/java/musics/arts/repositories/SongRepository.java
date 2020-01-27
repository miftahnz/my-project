package musics.arts.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import musics.arts.models.Song;

public interface SongRepository extends JpaRepository<Song, Integer> {
	List<Song> findSongByArtistsId(Integer id);
}
