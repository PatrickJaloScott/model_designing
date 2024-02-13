import model.Internet;
import model.Website;
import sitebuilders.AbstractSiteBuilder;
import sitebuilders.GoogleBuilder;
import sitebuilders.YoutubeBuilder;

public class WebBrowser {
    public static void main(String[] args) {
        System.out.println("Using Google Chrome...");
        Internet web = Internet.getInstance();
        Website google = new Website("www.google.com"),
                youTube = new Website("www.youtube.com");
        AbstractSiteBuilder googleBuilder = new GoogleBuilder(google),
                youtubeBuilder = new YoutubeBuilder(youTube);

        googleBuilder.build();
        youtubeBuilder.build();

        web.addSite(google);
        web.addSite(youTube);

        browse("www.google.com");
        browse("www.youtube.com");
    }

    static void browse(String targetSite) {
        Website currentTab = Internet.getInstance().getSite(targetSite);
        System.out.println("Browsing at " + targetSite);
        currentTab.displayContent();
    }
}