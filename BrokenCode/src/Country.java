/**
 * Chris Allulis
 */
public class Country 
{
    //Instance varibles
    // 1. Population
    // 2. Name
    // 3. Is in UN
    // 4. Square Area
    private int population;
    private String name;
    private boolean isInUN;
    private int squareArea;
    
    //Methods
    // 1. Change NAme
    // 2. Add to UN
    // 3. Accessor and mutator methods for each instance varibale
    public void changeName(String name)
    {
    	this.name = name;
    }

    public void addToUN()
    {
    	isInUN = true;
    }

    public int getPopulation()
    {
    	return population;
    }

    public String getName()
    {
    	return name;
    }
    
    public boolean isInUN()
    {
    	return isInUN;
    }

    public int getArea()
    {
    	return squareArea;
    }

    public void changePopulation(int pop)
    {
    	population = pop;
    }

    public void changeArea(int area)
    {
    	squareArea = area;
    }
}