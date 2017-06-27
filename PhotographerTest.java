import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class PhotographerTest{
  Photographer photographer;
  Analogue analogue;
  Digital digital;

  @Before
  public void before(){
    photographer = new Photographer("Alan");
    analogue = new Analogue("Hasselblad");
    digital = new Digital("Nikon");
  }

  @Test
  public void hasName(){
    assertEquals("Alan", photographer.getName());
  }

}