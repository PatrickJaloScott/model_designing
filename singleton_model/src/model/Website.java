package model;

import webcomponents.HtmlComponent;

import java.util.ArrayList;
import java.util.List;

public class Website {
    private final String url;
    private final List<HtmlComponent> document = new ArrayList<>();

    public Website(String url) {
        this.url = url;
    }

    public void appendToDocument(HtmlComponent component) {
        document.add(component);
    }

    public String getUrl() {
        return this.url;
    }

    public void displayContent() {
        for (HtmlComponent component : document) {
            component.render();
            System.out.println();
        }
    }
}
