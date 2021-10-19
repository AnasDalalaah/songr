package com.songr.songr;

import com.songr.songr.model.Album;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SongrApplicationTests {

	@Test
	public void constructorAlbum(){


		Album checkAlbum = new Album("Ich bin verloren " , "unknown",10,2500,"https://yt3.ggpht.com/ytc/AKedOLRrV9CI8szqvgFReKH9CegGPmlgFboOSWAF_20u=s900-c-k-c0x00ffffff-no-rj");
		assertTrue(checkAlbum instanceof Album);


		checkAlbum.setTitle("Gut");
		assertEquals("Gut" , checkAlbum.getTitle());


		checkAlbum.setArtist("ANAS");
		assertEquals("ANAS" , checkAlbum.getArtist());


		checkAlbum.setSongCount(15);
		assertEquals(15, checkAlbum.getSongCount());



		checkAlbum.setLength(10000);
		assertEquals(10000, checkAlbum.getLength());

		checkAlbum.setImageUrl("unknown");
		assertEquals("unknown", checkAlbum.getImageUrl());
	}

}
