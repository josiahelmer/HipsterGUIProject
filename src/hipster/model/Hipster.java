package hipster.model;

public class Hipster
{
	private String name;
	private String [] hipsterPhrases;
	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String[4];
		
	}
	private void setupArray()
	{
		
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String[] getHipsterPhrases()
	{
		return hipsterPhrases;
	}
	public void setHipsterPhrases(String[] hipsterPhrases)
	{
		this.hipsterPhrases = hipsterPhrases;
	}
	
}

