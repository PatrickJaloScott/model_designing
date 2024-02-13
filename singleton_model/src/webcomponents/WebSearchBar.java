package webcomponents;

public class WebSearchBar implements HtmlComponent {

    private final String searchPretext;

    public WebSearchBar(String prompt) {
        this.searchPretext = prompt;
    }

    @Override
    public void render() {
        System.out.printf("(%s:\t\t)\n", searchPretext);
    }
}
