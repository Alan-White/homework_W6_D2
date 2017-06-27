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

//----------------------------------

  @Test
  public void hasName(){
    assertEquals("Alan", photographer.getName());
  }

  @Test
  public void camerasStartsEmpty(){
    assertEquals(0, photographer.camerasCount());
  }

  @Test
  public void canAddCamera(){
    photographer.addCamera(analogue);
    assertEquals(1, photographer.camerasCount());
  }

  // @Test
  // public void canRemoveCamera(){
  //   photographer.removeCamera(analogue);
  //   assertEquals()
  // }

}