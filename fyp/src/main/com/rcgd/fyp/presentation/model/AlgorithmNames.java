package main.com.rcgd.fyp.presentation.model;

/**
 * http://www.java2s.com/Tutorials/Java/Swing_How_to/JComboBox/Fill_enum_to_JComboBox.htm
 * 
 * @author rcgd
 *
 */
public enum AlgorithmNames {
	UCS("Uniform Cost Search"), ASTAR("A* Search"), SA("Simulated Annealing");
	
	private String name;
	
	private AlgorithmNames(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return name;
	}
}
