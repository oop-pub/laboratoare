package third;

import second.Container;

public class ContainerFactory implements IFactory {
    public static final ContainerFactory INSTANCE = new ContainerFactory();

    private ContainerFactory() {
    }

    public Container createContainer(Strategy strategy) {
        return null;
    }
}