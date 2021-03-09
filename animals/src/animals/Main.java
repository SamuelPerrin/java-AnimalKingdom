package animals;

import java.util.List;
import java.util.ArrayList;

public class Main {

  private static void filterAnimals(List<Animal> list, CheckAnimal tester) { 
    for (Animal a : list) {
      if (tester.test(a)) {
        System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breathe() + " " + a.getYear());
      }
    }
  }

  public static void main(String[] args) {
    System.out.println("*** MVP ***");

    Mammal panda = new Mammal("Panda", 1869);
    Mammal zebra = new Mammal("Zebra", 1778);
    Mammal koala = new Mammal("Koala", 1816);
    Mammal sloth = new Mammal("Sloth", 1804);
    Mammal armadillo = new Mammal("Armadillo", 1758);
    Mammal raccoon = new Mammal("Raccoon", 1758);
    Mammal bigfoot = new Mammal("Bigfoot", 2021);

    Bird pigeon = new Bird("Pigeon", 1837);
    Bird peacock = new Bird("Peacock", 1821);
    Bird toucan = new Bird("Toucan", 1758);
    Bird parrot = new Bird ("Parrot", 1824);
    Bird swan = new Bird("Swan", 1758);

    Fish salmon = new Fish("Salmon", 1758);
    Fish catfish = new Fish("Catfish", 1817);
    Fish perch = new Fish("Perch", 1758);

    List<Animal> animals = new ArrayList<>();
    animals.add(panda);
    animals.add(zebra);
    animals.add(koala);
    animals.add(sloth);
    animals.add(armadillo);
    animals.add(raccoon);
    animals.add(bigfoot);
    animals.add(pigeon);
    animals.add(peacock);
    animals.add(toucan);
    animals.add(parrot);
    animals.add(swan);
    animals.add(salmon);
    animals.add(catfish);
    animals.add(perch);

    System.out.println("\n*** List all the animals in descending order by year named ***");
    animals.sort((a1, a2) -> a2.getYear() - a1.getYear());
    System.out.println(animals);
   
    System.out.println("\n*** List all the animals alphabetically ***");
    animals.sort((a1,a2) -> a1.getName().compareTo(a2.getName()));
    System.out.println(animals);
    
    System.out.println("\n*** List all the animals ordered by how they move ***");
    animals.sort((a1,a2) -> a1.move().compareTo(a2.move()));
    System.out.println(animals);
    
    System.out.println("\n*** List only those animals that breathe with lungs ***");
    filterAnimals(animals, a -> a.breathe().equals("lungs"));
    
    System.out.println("\n*** List only those animals that breath with lungs and were named in 1758 ***");
    filterAnimals(animals, a -> a.breathe().equals("lungs") && a.getYear() == 1758);
    
    System.out.println("\n*** List only those animals that lay eggs and breath with lungs ***");
    filterAnimals(animals, a -> a.reproduce().equals("eggs") && a.breathe().equals("lungs"));
   
    System.out.println("\n*** List alphabetically only those animals that were named in 1758 ***");

    List<Animal> newList = new ArrayList<>();

    for (Animal a : animals) {
      if (a.getYear() == 1758) {
        newList.add(a);
      }
    }
    newList.sort((a1,a2) -> a1.getName().compareTo(a2.getName()));
    for (Animal a : newList) {
      System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breathe() + " " + a.getYear());
    }

    System.out.println("\n*** Stretch Goal ***\n\n*** For the list of animals, list alphabetically those animals that are mammals ***");
    List<Animal> lastList = new ArrayList<>();
    for (Animal a : animals) {
      if (a instanceof Mammal) {
        lastList.add(a);
      }
    }
    lastList.sort((a1,a2) -> a1.getName().compareTo(a2.getName()));
    filterAnimals(lastList, a -> true);
  }
}