package sitebuilders;

import model.Website;
import webcomponents.HtmlComponent;
import webcomponents.WebSearchBar;

public class GoogleBuilder extends AbstractSiteBuilder {
    public GoogleBuilder(Website googleSite) {
        super(googleSite);
    }

    public void build() {
        HtmlComponent searchBar = new WebSearchBar("Search");
        append(searchBar);
    }
}
