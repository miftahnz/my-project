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
import musics.arts.models.Genre;
import musics.arts.services.GenreService;

@RestController
@RequestMapping("/music")
public class GenreController {

	@Autowired
	GenreService genreService;
	
	@GetMapping("/genre")
	public List<Genre> findAll(){
		return genreService.findAll();
	}
	
	@GetMapping("/genre/{id}")
	public Genre findById(@PathVariable Integer id) {
		return genreService.findById(id);
	}
	
	@PostMapping("/genre")
	public Genre save(@RequestBody Genre genre) {
		return genreService.save(genre);
	}
	
	@GetMapping("genre/artist/{id}")
	public List<Artist> findAllByGenre(@PathVariable Integer id){
		return genreService.findAllArtistByGenre(id);
	}
}
