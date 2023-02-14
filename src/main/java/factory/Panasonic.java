package factory;

import factory.processor.Amd;
import factory.processor.AmdPanasonic;
import factory.processor.Intel;
import factory.processor.IntelPanasonic;

public class Panasonic implements ComputerFactory {
    @Override
    public Amd createAmdProcessor() {
        return new AmdPanasonic();
    }

    @Override
    public Intel createIntelProcessor() {
        return new IntelPanasonic();
    }
}
