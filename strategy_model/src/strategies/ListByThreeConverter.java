package strategies;

import java.util.List;

public class ListByThreeConverter implements ListConverter {
    @Override
    public String listToString(List<String> arr) {
        System.out.println("listToString() done with 3 elements per row");
        StringBuilder retString = new StringBuilder();
        for (int i = 0; i < arr.size(); i++) {
            retString.append(arr.get(i));
            if(i % 3 == 2) {
                retString.append("\n");
            } else {
                if(i < arr.size()-1) {
                    retString.append(", ");
                }
            }
        }
        retString.append("\n");
        return retString.toString();
    }
}
