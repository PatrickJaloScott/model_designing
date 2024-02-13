package webcomponents;

public class WebText implements HtmlComponent {
    private final String textContent;

    public WebText(String p) {
        this.textContent = p;
    }

    @Override
    public void render() {
        System.out.println(this.textContent);
    }
}
