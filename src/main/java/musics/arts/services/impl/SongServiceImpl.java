package musics.arts.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import musics.arts.models.Song;
import musics.arts.repositories.SongRepository;
import musics.arts.services.SongService;

@Service
public class SongServiceImpl implements SongService{

	@Autowired
	SongRepository songRepository;
	
	public List<Song> findAll() {
		// TODO Auto-generated method stub
		System.out.println("jalan nih ");
		return songRepository.findAll();
	}

	public Song findById(Integer id) {
		// TODO Auto-generated method stub
		return songRepository.findById(id).get();
	}

	public Song save(Song song) {
		// TODO Auto-generated method stub
		return songRepository.save(song);
	}

	public List<Song> findSongByArtistId(Integer id) {
		// TODO Auto-generated method stub
		return songRepository.findSongByArtistsId(id);
	}

}
