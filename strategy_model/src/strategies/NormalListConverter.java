package strategies;

import java.util.*;
public class NormalListConverter implements ListConverter {
    @Override
    public String listToString(List<String> arr) {
        System.out.println("Normal conversion of listToString()");
        StringBuilder resultString = new StringBuilder();
        Iterator<String> stringIt = arr.iterator();
        while (stringIt.hasNext()) {
            resultString.append(stringIt.next()).append("\n");
        }
        return resultString.toString();
    }
}
