package lab16;

public class CountryGetsandSets extends CountriesTextFile{
	private String name;
	private int polulation;

	public CountryGetsandSets(String name, int jersey) {
		super();
		this.name = name;
		int population = 0;
		this.polulation = population;
	}

	public CountryGetsandSets() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJersey() {
		return polulation;
	}

	public void setJersey(int jersey) {
		this.polulation = jersey;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", poplulation =" + polulation + "]";
	}

}
