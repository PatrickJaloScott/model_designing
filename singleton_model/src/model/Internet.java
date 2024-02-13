package model;

import java.util.HashMap;

public class Internet {
    private static Internet www;
    private final HashMap<String, Website> siteList = new HashMap<>();
    private Internet() {}

    public static Internet getInstance() {
        if (www == null) {
            www = new Internet();
        }
        return www;
    }

    public void addSite(Website site) {
        siteList.put(site.getUrl(), site);
    }

    public Website getSite(String url) {
        return siteList.get(url);
    }
}
