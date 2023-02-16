package factory;

import factory.processor.Amd;
import factory.processor.Intel;

public interface ComputerFactory {
    Amd createAmdProcessor();

    Intel createIntelProcessor();
}
