package tk.techackers.adventureislandrun;

import com.badlogic.gdx.Screen;

public class AbstractScreen implements Screen{
    protected AdventureIslandRun game;
    public AbstractScreen(AdventureIslandRun game){
        this.game = game;
    }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

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
