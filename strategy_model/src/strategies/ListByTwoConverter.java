package strategies;

import java.util.List;

public class ListByTwoConverter implements ListConverter {
    @Override
    public String listToString(List<String> arr) {
        System.out.println("listToString() done with 2 elements per row");
        StringBuilder retString = new StringBuilder();
        String[] strings = arr.toArray(new String[0]);
        for (int i = 0; i < strings.length; i++) {
            retString.append(strings[i]);
            if(i % 2 == 1) {
                retString.append("\n");
            } else {
                if(i < strings.length-1) {
                    retString.append(", ");
                }
            }
        }
        retString.append("\n");
        return retString.toString();
    }
}
