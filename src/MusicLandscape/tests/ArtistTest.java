package MusicLandscape.tests;

import java.lang.reflect.Field;

import org.mockito.internal.util.reflection.Whitebox;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import MusicLandscape.entities.*;

import static org.mockito.Mockito.mock;
import static org.testng.Assert.*;

/**
 * 
 * @author TeM
 * @version 234
<<<<<<< HEAD
 * @Stage ES02
=======
 * @Stage ES03
>>>>>>> 96996aa7bbeb65ac5ece7d6adc873b0605641d35
 *
 */
public class ArtistTest {
	@Test
	/**
	 * checks if initial value of name is "unknown"
	 */
	public void checkInit2() {
		Artist toTest = new Artist();
		// reflect private field name

		try {
			Field privateStringField = Artist.class.getDeclaredField("name");
			privateStringField.setAccessible(true);
			assertEquals(privateStringField.get(toTest), "unknown",
					"initial value should be \"unknown\"");
		} catch (Exception e) {
		}
	}
	


	
	/**************** ES 02 ***********************/

		@Test(dataProvider = "names2")
		public void getName2(String in, String out) {
			Artist toTest = new Artist();
			// reflect private field name

			try {
				Field privateStringField = Artist.class.getDeclaredField("name");
				privateStringField.setAccessible(true);
				privateStringField.set(toTest, in);
			} catch (Exception e) {
			}

			assertEquals(toTest.getName(), in);
		}


		@Test(dataProvider = "names2")
		public void setName2(String in, String out) {
			Artist toTest = new Artist();
			toTest.setName(in);
			try {
				Field privateStringField = Artist.class.getDeclaredField("name");
				privateStringField.setAccessible(true);

				assertEquals(privateStringField.get(toTest), out);
			} catch (Exception e) {
			}
		}

	
	@Test
	public void Artist() {
		Artist toTest = new Artist();
		assertEquals(toTest.getName(), "unknown");
	}

	/**
	 * 
	 * @param in
	 *            used for copy constructor
	 * @param out
	 *            ignored, reused for ease of use
	 */
	
	@Test(dataProvider = "names2")
	public void ArtistArtist(String in, String out) {
		// test copy of Artist
		Artist toCopy = mock(Artist.class);
		Whitebox.setInternalState(toCopy, "name", in);
		Artist toTest = new Artist(toCopy);

		try {
			Field privateStringField = Artist.class.getDeclaredField("name");
			privateStringField.setAccessible(true);
			assertEquals(privateStringField.get(toTest.hashCode()),
					in.hashCode());
			// (privateStringField.get(toTest),in);
		} catch (Exception e) {
		}
	}

	/**
	 * 
	 * @param in
	 *            used for copy constructor
	 * @param out
	 *            ignored, reused for ease of use
	 */
	
	 @Test(dataProvider = "names2")
	public void ArtistString(String in, String out) {
		// test copy of Artist

		Artist toTest = new Artist(in);

		try {
			Field privateStringField = Artist.class.getDeclaredField("name");
			privateStringField.setAccessible(true);
			assertEquals(privateStringField.get(toTest), in);
		} catch (Exception e) {
		}
	}

	
	@DataProvider(name = "names2")
	private static Object[][] names2() {
		return new Object[][] { { null, "unknown" }, { "kiss", "kiss" },
				{ "", "unknown" }, { "  ", "unknown" },
				{ "Jon Bon Jovi", "Jon Bon Jovi" } };
	}
		
	 

	/**************** ES 03 ***********************/
	@Test(dataProvider = "names2")
	public void testtoString(String in, String out) {
		
		boolean myTest=(new Artist(in).toString()==out)||
				(new Artist(in).toString()==in);
		assertEquals(myTest, true);
	}
}
