package com.javabasico;

import static java.lang.System.out;

/**
 * Enum
 * @author eduardo
 *
 */
public class Main {

	public static void main(String[] args) {
		double earthWeight = 100; //5kg
        double mass = earthWeight/Planet.EARTH.surfaceGravity();
        for (Planet p : Planet.values())
           out.printf("Seu peso na %s é %f%n",
                             p, p.surfaceWeight(mass));
	}

}
