package animalKingdom;

public abstract class AbstractAnimal 
{

  private static int maxId = 0;
  private int id;
  private int yearDiscovered;
  private String name;


  public AbstractAnimal(int yearDiscovered, String name) 
  {
    maxId++;
    id = maxId;

    this.yearDiscovered = yearDiscovered;
    this.name = name;
  }

  public abstract String move();
  public abstract String breath();
  public abstract String reproduce();
 
  public int getId() 
  {
    return id;
  }

  public int getYearDiscovered() 
  {
    return yearDiscovered;
  }

  public String getName() 
  {
    return name;
  }
 

  public void setYearDiscovered(int yearDiscovered) 
  {
    this.yearDiscovered = yearDiscovered;
  }

  public void setName(String name) 
  {
    this.name = name;
  }


  @Override
  public String toString() 
  {
    return "Name: " + name + "\t" + "Year Discovered: " + yearDiscovered;
  }
}
