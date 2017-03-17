package main.com.rcgd.fyp.domain.entities;

/**
 * http://www.java2s.com/Tutorials/Java/Swing_How_to/JComboBox/Fill_enum_to_JComboBox.htm
 * 
 * @author rcgd
 *
 */
public enum AlgorithmName {
	UCS("Uniform Cost Search"), ASTAR("A* Search"), SA("Simulated Annealing");
	
	private String name;
	
	private AlgorithmName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Name: " + name;
	}
}
