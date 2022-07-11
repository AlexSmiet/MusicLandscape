// **************************************************
// 
//       git.rev = 234
//  git.revision = fdd4980be270473bdd7e8206afeda65ab6e4c3a4
<<<<<<< HEAD
//         stage = ES02
=======
//         stage = ES03
>>>>>>> 96996aa7bbeb65ac5ece7d6adc873b0605641d35
//
// ***************************************************



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

	
	
	
	
<<<<<<< HEAD
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
=======
>>>>>>> 96996aa7bbeb65ac5ece7d6adc873b0605641d35
	
	
	
	
<<<<<<< HEAD
	

	
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

	
=======
>>>>>>> 96996aa7bbeb65ac5ece7d6adc873b0605641d35

	
	@DataProvider(name = "names2")
	private static Object[][] names2() {
		return new Object[][] { { null, "unknown" }, { "kiss", "kiss" },
				{ "", "unknown" }, { "  ", "unknown" },
				{ "Jon Bon Jovi", "Jon Bon Jovi" } };
	}
		
	 
	
<<<<<<< HEAD
=======
	/**************** ES 03 ***********************/
	@Test(dataProvider = "names2")
	public void testtoString(String in, String out) {
		
		boolean myTest=(new Artist(in).toString()==out)||
				(new Artist(in).toString()==in);
		assertEquals(myTest, true);
	}
	


	
>>>>>>> 96996aa7bbeb65ac5ece7d6adc873b0605641d35

	
}
