package com.example.songr;

import com.example.songr.models.Album;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SongrApplicationTests {

	@Test
	void contextLoads() {

	}
	@Test
	void AlbumsConstructorTest(){
		Album album = new Album("Happier Than Ever"," Billie Eilish", 3,300 ,"https://upload.wikimedia.org/wikipedia/zh/thumb/4/45/Billie_Eilish_-_Happier_Than_Ever.png/220px-Billie_Eilish_-_Happier_Than_Ever.png");
		String expected = "Album{title='Happier Than Ever', artist=' Billie Eilish', songCount=3, length=300, imageUrl='https://upload.wikimedia.org/wikipedia/zh/thumb/4/45/Billie_Eilish_-_Happier_Than_Ever.png/220px-Billie_Eilish_-_Happier_Than_Ever.png'}";
		assertEquals(expected,album.toString());
	}
	@Test
	void  AlbumsConstuctorGetterAndSitterTest(){
		Album album = new Album("Happier Than Ever"," Billie Eilish", 3,300 ,"https://upload.wikimedia.org/wikipedia/zh/thumb/4/45/Billie_Eilish_-_Happier_Than_Ever.png/220px-Billie_Eilish_-_Happier_Than_Ever.png");
		album.setTitle("Future Nostalgia");
		album.setArtist("Dua Lipa");
		album.setImageUrl("https://www.icon-icon.com/wp-content/uploads/2021/07/dua-lipa.jpeg");
		String expected = "Future Nostalgia";
		String expected2 = "Dua Lipa";
		String expected3 = "https://www.icon-icon.com/wp-content/uploads/2021/07/dua-lipa.jpeg";
		assertEquals(expected,album.getTitle());
		assertEquals(expected2,album.getArtist());
		assertEquals(expected3,album.getImageUrl());
	}

	@Test
	void AlbumsConstuctorGetterAndSitter(){
		Album album = new Album("Happier Than Ever"," Billie Eilish", 3,300 ,"https://upload.wikimedia.org/wikipedia/zh/thumb/4/45/Billie_Eilish_-_Happier_Than_Ever.png/220px-Billie_Eilish_-_Happier_Than_Ever.png");
		album.setTitle("Future Nostalgia");
		album.setArtist(" Dua Lipa");
		album.setImageUrl("https://www.icon-icon.com/wp-content/uploads/2021/07/dua-lipa.jpeg");
		int expected = 300;
		assertEquals(expected,album.getLength());
	}
}
