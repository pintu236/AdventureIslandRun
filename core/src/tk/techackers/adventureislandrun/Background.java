package tk.techackers.adventureislandrun;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

public class Background {
    private Vector2 pos;
    private TextureRegion texture;

    public Background(float x, float y) {
        pos = new Vector2(x, y);
        texture = Assets.grassTile;
    }

    public void update(float delta) {


    }

    public void draw(SpriteBatch batch) {
        batch.draw(texture, pos.x, pos.y);
    }
}
