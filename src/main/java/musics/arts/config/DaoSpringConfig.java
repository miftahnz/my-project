package musics.arts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import musics.arts.services.ArtistsService;
import musics.arts.services.SongService;
import musics.arts.services.impl.ArtistServiceImpl;
import musics.arts.services.impl.SongServiceImpl;

@Configuration
public class DaoSpringConfig {

	@Bean
	public ArtistsService artistsService() {
		return new ArtistServiceImpl();
	}
	
	@Bean
	public SongService songService() {
		return new SongServiceImpl();
	}
}
