package gr.aueb.cf.cf9.ch13;

public class OnlyOneCodingFactory {
    private final static OnlyOneCodingFactory instance = new OnlyOneCodingFactory();

    private OnlyOneCodingFactory() {}

    public static OnlyOneCodingFactory getInstance() {
        return instance;
    }
}
