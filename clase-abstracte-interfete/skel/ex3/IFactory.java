package com.oop_pub.clase_abstracte_interfete.ex3;

import com.oop_pub.clase_abstracte_interfete.ex2.Container;

public interface IFactory {
	/**
	 * Creaza un container care implementeaza strategia primita ca parametru.
	 *
	 * @param strategy Strategia ceruta
	 * @return Un container care respecta strategia primita ca parametru.
	 */
	Container createContainer(Strategy strategy);
}
