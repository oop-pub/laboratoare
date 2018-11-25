package fourth;

import first.Task;
import second.Container;
import third.ContainerFactory;
import third.Strategy;

public abstract class AbstractTaskRunner {
    private Container container;

    protected AbstractTaskRunner(final Strategy strategy) {
        container = ContainerFactory.INSTANCE.createContainer(strategy);
    }

    /**
     * Adds a task to the internal container in order to be run later.
     * @param task the task to be added to the container
     */
    public void addTask(final Task task) {
        container.push(task);
    }

    /**
     * Executes all tasks added in the internal container.
     */
    public void executeAll() {
        while (!container.isEmpty()) {
            Task task = container.pop();

            task.execute();

            afterExecution(task);
        }
    }

    /**
     * Action to be done after the execution of the given task.
     * @param task the last task executed
     */
    protected abstract void afterExecution(Task task);
}
