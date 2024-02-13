package sitebuilders;

import model.Website;
import webcomponents.HtmlComponent;

public abstract class AbstractSiteBuilder {
    private final Website site;
    public AbstractSiteBuilder(Website siteProduct) {
        this.site = siteProduct;
    }

    void append(HtmlComponent newComponent) {
        site.appendToDocument(newComponent);
    }

    public abstract void build();
}
