package factory;

import factory.processor.Amd;
import factory.processor.AmdLenovo;
import factory.processor.Intel;
import factory.processor.IntelLenovo;

public class Lenovo implements ComputerFactory {
    @Override
    public Amd createAmdProcessor() {
        return new AmdLenovo();
    }

    @Override
    public Intel createIntelProcessor() {
        return new IntelLenovo();
    }
}
