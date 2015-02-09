package lab2;

public class Atom 
{
	private int protons;
	
	private int neutrons;
	
	private int electrons;
	
	/** 
	* Constructs an atom with the given protons, neutrons, and electrons.
	* @param givenProtons, givenNeutrons, givenElectrons 
	*   the protons, neutrons, and electrons of this atom
	*/
	public Atom(int givenProtons, int givenNeutrons, int givenElectrons) 
	{
	 protons = givenProtons;
	 neutrons = givenNeutrons;
	 electrons = givenElectrons;
	}
		
		/**
		* Calculates the atomic mass based on the protons, neutrons, and electrons.
		* @return
		* 	atomic mass
		*/

		public int getAtomicMass()
		{
			  int atomicMass = (protons + neutrons);
			  return atomicMass;
		}
		
		/**
		* Calculates the atomic charge based on the protons and electrons.
		* @return
		* 	atomic charge
		*/
	  	public int getAtomicCharge()
	  	{
	  		int atomicCharge = (protons - electrons);
	  		return atomicCharge;
	  	}
		   
	  	/**
		* Decreses the amount of protons and neutrons by two.
		*/
	  	public void decay()
	  	{
	  		protons = protons - 2;
	  		neutrons = neutrons - 2;
	  	} 
}
