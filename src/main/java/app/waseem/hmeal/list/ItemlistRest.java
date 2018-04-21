package app.waseem.hmeal.list;

/**
 * Created by hp pro 4540s on 4/20/2018.
 */

public class ItemlistRest {
    public int image;
    public String name;

    public ItemlistRest(int image, String name) {
        this.image = image;
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
