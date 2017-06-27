import java.util.ArrayList;

public class Photographer{

  private String name;

  private ArrayList<Printable> cameras;

  public Photographer(String name){
    this.name = name;
    this.cameras = new ArrayList<Printable>();
  }

  public String getName(){
    return this.name;
  }

  public int camerasCount(){
  return this.cameras.size();
  }

  public void addCamera(Printable camera){
    this.cameras.add(camera);
  }

  public void removeCamera(Printable camera){
    this.cameras.remove(camera);
  }


}