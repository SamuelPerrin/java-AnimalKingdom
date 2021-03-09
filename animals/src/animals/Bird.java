package animals;

public class Bird extends Animal {
  // constructor
  public Bird(String name, int year) {
    super(name, year);
  }
  
  @Override
  public String move() {
    return "fly";
  }

  @Override
  public String breathe() {
    return "lungs";
  }

  @Override
  public String reproduce() {
    return "eggs";
  }
}