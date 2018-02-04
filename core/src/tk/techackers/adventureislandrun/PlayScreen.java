package tk.techackers.adventureislandrun;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class PlayScreen extends AbstractScreen {
    private OrthographicCamera camera;
    private Background background;
    private TextureRegion bg;

    public PlayScreen(AdventureIslandRun game) {
        super(game);

    }

    @Override
    public void show() {
        camera = new OrthographicCamera(Constants.WORLD_WIDTH, Constants.WORLD_HEIGHT);
        camera.position.set(Constants.WORLD_WIDTH / 2, Constants.WORLD_HEIGHT / 2, 0);
        camera.update();
        //initialise objects
        background = new Background(120, 0);
        bg = Assets.bg;
    }

    @Override
    public void render(float delta) {
        camera.update();
        updateScene(delta);
        drawScene();
    }

    private void drawScene() {
        game.batch.setProjectionMatrix(camera.combined);
        game.batch.begin();
        //Drawing bg
        game.batch.disableBlending();
        game.batch.draw(bg, 0, 0);
        game.batch.enableBlending();
        //Drawing objects
        background.draw(game.batch);
        game.batch.end();
    }

    private void updateScene(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
