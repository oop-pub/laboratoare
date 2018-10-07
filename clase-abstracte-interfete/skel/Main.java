import first.Task;
import second.Container;
import third.Strategy;
import fourth.AbstractTaskRunner;

public final class Main {

    private Main() { }

    private static final int TASK_NO = 6;

    private static final int FIRST_OUT_TASK_INDEX = 0;
    private static final int SECOND_OUT_TASK_INDEX = 3;
    private static final int FIRST_RANDOM_OUT_TASK_INDEX = 1;
    private static final int SECOND_RANDOM_OUT_TASK_INDEX = 5;
    private static final int FIRST_COUNTER_OUT_TASK_INDEX = 2;
    private static final int SECOND_COUNTER_OUT_TASK_INDEX = 4;

    private static Task[] taskList;

    private static void test1() {
        taskList = new Task[TASK_NO];

        taskList[FIRST_OUT_TASK_INDEX] = new OutTask("First message task");
        taskList[FIRST_RANDOM_OUT_TASK_INDEX] = new RandomOutTask();
        taskList[FIRST_COUNTER_OUT_TASK_INDEX] = new CounterOutTask();
        taskList[SECOND_OUT_TASK_INDEX] = new OutTask("Second message task");
        taskList[SECOND_COUNTER_OUT_TASK_INDEX] = new CounterOutTask();
        taskList[SECOND_RANDOM_OUT_TASK_INDEX] = new RandomOutTask();

        for (Task task : taskList) {
            task.execute();
        }
    }

    private static void testContainer(final Strategy strategy) {
        Container container = ContainerFactory.INSTANCE.createContainer(strategy);

        for (Task task : taskList) {
            container.push(task);
        }

        System.out.println("Testing order: " + strategy.toString());

        while (!container.isEmpty()) {
            container.pop().execute();
        }

        System.out.println();
    }

    private static void test23() {
        testContainer(Strategy.LIFO);
        testContainer(Strategy.FIFO);
    }

    private static void testTaskRunner(final AbstractTaskRunner taskRunner) {
        System.out.println("Testing: " + taskRunner);

        for (Task task : taskList) {
            taskRunner.addTask(task);
        }

        taskRunner.executeAll();

        System.out.println();
    }

    private static void test4() {
        testTaskRunner(new PrintTimeTaskRunner(Strategy.LIFO));

        CounterTaskRunner  counterTaskRunner = new CounterTaskRunner(Strategy.FIFO);

        testTaskRunner(counterTaskRunner);
        System.out.println("#Executed tasks: " + counterTaskRunner.getCounter());

        RedoBackTaskRunner  redoTaskRunner = new RedoBackTaskRunner(Strategy.LIFO);

        testTaskRunner(redoTaskRunner);
        System.out.println("Reexecuting: ");
        redoTaskRunner.redo();
    }

    public static void main(final String[] args) {
        test1();
        System.out.println("------\tTEST EX 1 FINISHED\t------");

        test23();
        System.out.println("------\tTEST EX 2 SI EX 3 FINISHED\t------");

        test4();
        System.out.println("------\tTEST EX 4 SI EX 5 FINISHED\t------");
    }
}
