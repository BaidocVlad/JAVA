package Cald;

public class Divide implements Operation {

	@Override
	public Double calc(Double a, Double b) {
		try {
			return a/b;
		} catch (Exception e) {
			System.out.println("Divide by zero");
		}
		return a/b;
	}
}
