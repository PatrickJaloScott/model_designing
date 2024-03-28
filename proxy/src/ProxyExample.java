import java.util.ArrayList;
import java.util.List;

public class ProxyExample {
    public static void main(String[] args) {
        /*Image image1 = new ProxyImage("HiRes_10MB_Photo1"),
                image2 = new ProxyImage("HiRes_10MB_Photo2");

        image1.displayImage();
        image1.displayImage();
        image2.displayImage();
        image2.displayImage();
        image1.displayImage();*/
        List<Image> imageAlbum = new ArrayList<>();
        imageAlbum.add(new ProxyImage("Photo_of_Dogs.png"));
        imageAlbum.add(new ProxyImage("Photo_of_Cats.png"));
        imageAlbum.add(new ProxyImage("Photo_of_Houses.png"));

        System.out.printf("printing album info (%d images)\n", imageAlbum.size());
        for (int i = 0; i < imageAlbum.size(); i++) {
            System.out.println(imageAlbum.get(i).showData());
        }

        System.out.println("\nloading album...");
        for (int i = 0; i < imageAlbum.size(); i++) {
            imageAlbum.get(i).displayImage();
        }
    }
}
