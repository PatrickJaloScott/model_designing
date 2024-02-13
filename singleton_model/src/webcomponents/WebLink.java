package webcomponents;

public class WebLink implements HtmlComponent {
    private final String targetSite;

    public WebLink(String target) {
        this.targetSite = target;
    }

    @Override
    public void render() {
        System.out.println("-> /"+this.targetSite);
    }
}
