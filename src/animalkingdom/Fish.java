package animalKingdom;

public class Fish extends AbstractAnimal 
{
  // constructor
  public Fish(int yearDiscovered, String name) 
  {
    super(yearDiscovered, name);
  }

  @Override
	public String move() 
	{
		return "move - swim";
	}

	@Override
	public String breath() 
	{
		return "breath - gills";
	}

	@Override
	public String reproduce() 
	{
		return "reproduce - eggs";
	}
}