package sitebuilders;

import model.Website;
import webcomponents.*;

public class YoutubeBuilder extends AbstractSiteBuilder {
    public YoutubeBuilder(Website siteProduct) {
        super(siteProduct);
    }

    @Override
    public void build() {
        HtmlComponent searchBar = new WebSearchBar("Search");
        HtmlComponent subscriptionLink = new WebLink("Subscriptions");
        WebUnorderedList feed = new WebUnorderedList();
        feed.addToItems(new WebText("Musiikkivideo"));
        feed.addToItems(new WebText("Livestriimi"));
        append(searchBar);
        append(subscriptionLink);
        append(feed);
    }
}
