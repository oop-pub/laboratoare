package third;

import second.Container;

public final class ContainerFactory implements IFactory {
    public static final ContainerFactory INSTANCE = new ContainerFactory();

    private ContainerFactory() {
    }

    @Override
    public Container createContainer(final Strategy strategy) {
        return null;
    }
}
