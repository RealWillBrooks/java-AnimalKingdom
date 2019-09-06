package animalKingdom;

import java.util.*;

public class Main 
{

  public static void printAnimals(ArrayList<AbstractAnimal> animalArrayList, CheckAnimal tester) {
    
    for (AbstractAnimal a : animalArrayList) 
    {
      
      if (tester.test(a)) {
        System.out.println(a);
      }
    }
  }

  public static void main(String[] args) 
  {

    Mammals panda = new Mammals(1869, "Panda");
    Mammals zebra = new Mammals(1778, "Zebra");
    Mammals koala = new Mammals(1816, "Koala");
    Mammals sloth = new Mammals(1804, "Sloth");
    Mammals armadillo = new Mammals(1758, "Armadillo");
    Mammals raccoon = new Mammals(1758, "Raccoon");
    Mammals bigfoot = new Mammals(2021, "Bigfoot");

  
    Birds pigeon = new Birds(1837, "Pigeon");
    Birds peacock = new Birds(1821, "Peacock");
    Birds toucan = new Birds(1758, "Toucan");
    Birds parrot = new Birds(1824, "Parrot");
    Birds swan = new Birds(1758, "Swan");
    
    Fish salmon = new Fish(1758, "Salmon");
    Fish catfish = new Fish(1817, "Catfish");
    Fish perch = new Fish(1758, "Perch");
 
	ArrayList<AbstractAnimal> animalArrayList = new ArrayList<AbstractAnimal>();
		animalArrayList.add(panda);
		animalArrayList.add(zebra);
		animalArrayList.add(koala);
		animalArrayList.add(sloth);
		animalArrayList.add(armadillo);
		animalArrayList.add(raccoon);
		animalArrayList.add(bigfoot);
		animalArrayList.add(pigeon);
		animalArrayList.add(peacock);
		animalArrayList.add(toucan);
		animalArrayList.add(parrot);
		animalArrayList.add(swan);
		animalArrayList.add(salmon);
		animalArrayList.add(catfish);
		animalArrayList.add(perch);

    System.out.println("*** All Animals ***");
    animalArrayList.forEach(v -> System.out.println(v));
    
    System.out.println();
    System.out.println("*** Descending Order by Year ***");
    
    animalArrayList.sort((object1, object2) -> object2.getYearDiscovered() - object1.getYearDiscovered());
    animalArrayList.forEach(animal -> System.out.println(animal));
    

    
    System.out.println();
    System.out.println("*** All Animals Alphabetically ***");

    animalArrayList.sort((object1, object2) -> object1.getName().compareToIgnoreCase(object2.getName()));
    animalArrayList.forEach(animal -> System.out.println(animal));

    System.out.println();
    System.out.println("*** How They Move ***");
    animalArrayList.sort((object1, object2) -> object2.move().compareToIgnoreCase(object1.move()));
    animalArrayList.forEach(animal -> System.out.println(animal + "\t" + animal.move()));
		System.out.println();
    
    System.out.println();
    System.out.println("*** How They Move ***");
    animalArrayList.sort((object1, object2) -> object2.move().compareToIgnoreCase(object1.move()));
    animalArrayList.forEach(animal -> System.out.println(animal + "\t" + animal.move()));
		System.out.println();
    
    System.out.println();
    System.out.println("*** Lungs Only ***");

    printAnimals(animalArrayList, animal -> animal.breath() == "breath - lungs");

    System.out.println();
    System.out.println("*** Lungs Only & Year 1758 ***");

    printAnimals(animalArrayList, animal -> (animal.breath() == "breath - lungs") && (animal.getYearDiscovered() == 1758));
    
    System.out.println();
    System.out.println("*** Lungs Only & Eggs Only");

    printAnimals(animalArrayList, animal -> (animal.breath() == "breath - lungs") && (animal.reproduce() == "reproduce - eggs"));
    
    System.out.println();
    System.out.println("*** ABC & 1758");

    
    animalArrayList.sort((object1, object2) -> object1.getName().compareToIgnoreCase(object2.getName()));

    printAnimals(animalArrayList, animal -> animal.getYearDiscovered() == 1758);
    
    System.out.println();
    System.out.println("*** ABC & Mammal");

    animalArrayList.sort((object1, object2) -> object1.getName().compareToIgnoreCase(object2.getName()));

    printAnimals(animalArrayList, animal -> animal instanceof Mammals);
    
 }
}