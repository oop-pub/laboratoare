package com.oop_pub.clase_abstracte_interfete.ex2;

import com.oop_pub.clase_abstracte_interfete.ex1.Task;

public interface Container {

    /**
     * Elimina un task din container.
     *
     * @return Task-ul eliminat daca containerul nu este gol sau null altfel.
     */
    Task pop();

    /**
     * Introduce un task in container
     *
     * @param task Taskul introdus
     */
    void push(Task task);

    /**
     * Intoarce numarul de elemente din container
     *
     * @return
     */
    int size();

    /**
     * Verifica daca containerul este gol sau nu.
     *
     * @return true daca containerul este gol si false altfel
     */
    boolean isEmpty();

    /**
     * Transfera toate elementele dintr-un container in acest container
     *
     * @param container Containerul din care se transfera. Dupa transfer container.size() == 0
     */
    void transferFrom(Container container);
}
