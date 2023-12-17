package lesson2.abstarct_factory;

public class CarsFactory implements CarsFactoryInt{
    @Override
    public Bugatti showBugatti() {
        return new Bugatti();
    }

    @Override
    public Lamborghini showLamborghini() {
        return new Lamborghini();
    }

    @Override
    public Ferrari showFerrari() {
        return new Ferrari();
    }
}
