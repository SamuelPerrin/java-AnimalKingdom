package animals;

abstract class Animal {
  protected static int maxId;
  protected String name;
  protected int year;
  protected int id;

  // constructors
  public Animal(String name, int year) {
    maxId++;
    id = maxId;
    System.out.println("In Animal constructor with " + name + ", maxId: " + maxId + ", id: " + id);
    this.name = name;
    this.year = year;
  }

  public String eat() {
    return "Eating";
  }

  abstract String move();
  abstract String breathe();
  abstract String reproduce();
  
  // getters and setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  @Override
  public String toString() {
    return "Animal{id=" + id + ", name='" + name + "', yearNamed=" + year + "}\n";
  }
}