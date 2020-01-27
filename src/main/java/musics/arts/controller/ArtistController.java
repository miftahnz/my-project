package musics.arts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import musics.arts.models.Artist;
import musics.arts.services.ArtistsService;

@RestController
@RequestMapping("/music")
public class ArtistController {

	@Autowired
	ArtistsService artistsService;
	
	@GetMapping("/artist/")
	public List<Artist> findAll(){
		return artistsService.findAll();
	}
	
	@GetMapping("/artist/{id}")
	public Artist findById(@PathVariable Integer id) {
		return artistsService.findById(id);
	}
	
	@PostMapping("/artist/")
	public Artist save(@RequestBody Artist artistModel) {
		return artistsService.save(artistModel);
	}
	
	@GetMapping("/artist/genre/{id}")
	public List<Artist> findArtistByGenreId(@PathVariable Integer id) {
		return artistsService.findArtistByGenreId(id);
	}
	
}
