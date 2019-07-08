package bit2atomNoise4p5;

import processing.core.*;

/**
 * This is a template class and can be used to start a new processing Library.
 * Make sure you rename this class as well as the name of the example package 'template' 
 * to your own Library naming convention.
 * 
 * (the tag example followed by the name of an example included in folder 'examples' will
 * automatically include the example in the javadoc.)
 *
 * @example Hello 
 */

public class Bit2atomNoise {
	
	// myParent is a reference to the parent sketch
	PApplet myParent;
	NoiseKS noiseGenerator;

	int myVariable = 0;
	
	public final static String VERSION = "##library.prettyVersion##";
	
	/**
	 * a Constructor, usually called in the setup() method in your sketch to
	 * initialize and start the Library.
	 * 
	 * @example Hello
	 * @param theParent the parent PApplet
	 */
	public Bit2atomNoise(PApplet theParent) {
		this(theParent, System.currentTimeMillis());
	}
	
	public Bit2atomNoise(PApplet theParent, long seed) {
		myParent = theParent;
		welcome();
		noiseGenerator = new NoiseKS(seed);
	}

	private void welcome() {
		System.out.println("##library.name## ##library.prettyVersion## by ##author##");
	}
	
	private double remap(double val) {
		return (val + 1) * 0.5;
	}

	public float noise (float xoff) {
		return this.noise(xoff, 0);
	}

	public float noise (float xoff, float yoff) {
		return (float) remap(noiseGenerator.eval(xoff, yoff));
	}
	
	public float noise (float xoff, float yoff, float zoff) {
		return (float) remap(noiseGenerator.eval(xoff, yoff, zoff));
	}
	
	public float noise (float xoff, float yoff, float zoff, float uoff) {
		return (float) remap(noiseGenerator.eval(xoff, yoff, zoff, uoff));
	}
	
	/**
	 * return the version of the Library.
	 * 
	 * @return String
	 */
	public static String version() {
		return VERSION;
	}

}