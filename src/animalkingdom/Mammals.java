package animalkingdom;

public class Mammals extends AbstractAnimal
  {
  public Mammals(int yearDiscovered, String name) 
  {
    super(yearDiscovered, name);
  }
  @Override
	public String move() 
	{
		return "move - walk";
	}

	@Override
	public String breath() 
	{
		return "breath - lungs";
	}

	@Override
	public String reproduce() 
	{
		return "reproduce - live births";
	}
}
