package tk.techackers.adventureislandrun;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Assets {
    private static AssetManager assetManager;
    public static TextureRegion grassTile;
    public static TextureRegion bg;

    public static void init() {
        if (assetManager == null) {
            assetManager = new AssetManager();
        }
        assetManager.load("tile1.png", Texture.class);
        assetManager.load("bg.png", Texture.class);
        assetManager.finishLoading();
        load();
    }

    private static void load() {
        grassTile = new TextureRegion(assetManager.get("tile1.png", Texture.class));
        bg = new TextureRegion(assetManager.get("bg.png", Texture.class));
    }
}
