package musics.arts.services;

import java.util.List;

import org.springframework.stereotype.Service;

import musics.arts.models.Song;

@Service
public interface SongService {

	public List<Song> findAll();
	public Song findById(Integer id);
	public Song save(Song song);
	public List<Song> findSongByArtistId(Integer id);
}
