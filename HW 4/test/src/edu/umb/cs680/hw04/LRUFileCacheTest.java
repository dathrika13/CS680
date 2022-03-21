package edu.umb.cs680.hw04;
import java.io.IOException;
import java.nio.file.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw04.LRUFileCache;

class LRUFileCacheTest {
	private static LRUFileCache cache;
	private static Path x1;
	private static Path x2;
	private static Path x3;
	private static Path x4;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cache = new LRUFileCache(3);
		x1 = Paths.get("testfiles/file1.txt");
		x2 = Paths.get("testfiles/file2.txt");
		x3 = Paths.get("testfiles/file3.txt");
		x4 = Paths.get("testfiles/file4.txt");
		cache.fetch(x1);
		cache.fetch(x2);
		cache.fetch(x3);
	}

	@Test
	public void fetchwithx1() throws IOException {
		assertEquals(Files.readString(x1), cache.fetch(x1));
	}
	
	@Test
	public void fetchwithx2() throws IOException {
		assertEquals(Files.readString(x2), cache.fetch(x2));
	}
	
	@Test
	public void fetchwithx3() throws IOException {
		assertEquals(Files.readString(x3), cache.fetch(x3));
	}
	
	@Test
	public void fetchwithx4() throws IOException {
		assertEquals(Files.readString(x4), cache.fetch(x4));
		
	}

}