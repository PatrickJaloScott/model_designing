import strategies.ListByThreeConverter;
import strategies.ListByTwoConverter;
import strategies.NormalListConverter;

import java.util.Arrays;
import java.util.List;

public class StrategyProgram {
    public static void main(String[] args) {
        List<String> sourceData = Arrays.asList("First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh");
        Strategizer converter = new Strategizer(sourceData, new NormalListConverter());
        converter.callConversion();
        converter.setConverterStrategy(new ListByTwoConverter());
        converter.callConversion();
        converter.setConverterStrategy(new ListByThreeConverter());
        converter.callConversion();
    }
}