package game;

import city.cs.engine.BodyImage;
import city.cs.engine.CircleShape;
import city.cs.engine.DynamicBody;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

public class Star3 extends DynamicBody {

    private int health;
    private static final Shape circleShape = new CircleShape(3);
    private static final BodyImage starImage = new BodyImage("data/stars/star_red01.png", 9);

    public Star3(GameWorld world, int health, int x, int y) {
        super(world, circleShape);
        this.addImage(starImage);
        this.health = health;
        this.setPosition(new Vec2(x,y));
    }

    public void decreaseStarHealth() {
        health--;
    }

    public void star3Death() {
        if (health == 0) {
            this.destroy();
        }

    }
}