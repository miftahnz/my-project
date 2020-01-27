package musics.arts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import musics.arts.models.Song;
import musics.arts.services.SongService;

@RestController
@RequestMapping("/music")
public class SongController {

	@Autowired
	SongService songService;
	
	@GetMapping("/song")
	public List<Song> findAll(){
		return songService.findAll();
	}
	
	@GetMapping("/song/{id}")
	public Song findById(@PathVariable Integer id) {
		return songService.findById(id);
	}
	
	@PostMapping("/song")
	public Song save(@RequestBody Song song) {
		return songService.save(song);
	}
	
	@GetMapping("/song/artist/{id}")
	public List<Song> findSongByArtist(@PathVariable Integer id){
		return songService.findSongByArtistId(id);
	}
}
