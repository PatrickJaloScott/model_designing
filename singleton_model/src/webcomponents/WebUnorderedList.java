package webcomponents;

import java.util.ArrayList;
import java.util.List;

public class WebUnorderedList implements HtmlComponent {
    private final List<HtmlComponent> listItems;

    public WebUnorderedList() {
        this.listItems = new ArrayList<>();
    }

    public void addToItems(HtmlComponent li) {
        listItems.add(li);
    }

    @Override
    public void render() {
        for (HtmlComponent li : listItems) {
            System.out.print("\t");
            li.render();
        }
    }
}
