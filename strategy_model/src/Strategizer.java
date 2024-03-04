import strategies.ListConverter;

import java.util.List;

public class Strategizer {
    private final List<String> data;
    private ListConverter converterStrategy;

    public Strategizer(List<String> stringList, ListConverter strategy) {
        this.data = stringList;
        this.converterStrategy = strategy;
    }

    public void setConverterStrategy(ListConverter strategy) {
        this.converterStrategy = strategy;
    }

    public void callConversion() {
        System.out.println(converterStrategy.listToString(data));
    }
}
