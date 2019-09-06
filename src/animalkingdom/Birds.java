package animalKingdom;

public class Birds extends AbstractAnimal 
{
  // constructor
  public Birds(int yearDiscovered, String name) 
  {
    super(yearDiscovered, name);
  }

  @Override
	public String move() 
	{
		return "move - fly";
	}

	@Override
	public String breath() 
	{
		return "breath - lungs";
	}

	@Override
	public String reproduce() 
	{
		return "reproduce - eggs";
	}
}