import processing.core.PApplet;
public class FourBallsOop extends PApplet {
    public static class Ball {
        private int x;
        private int y;
        private int diameter;
        private int speed;
        PApplet FourBallsOop;

        public Ball(int x, int y, int diameter, int speed, PApplet FourBallsOop) {
            this.x = x;
            this.y = y;
            this.diameter = diameter;
            this.speed = speed;
            this.FourBallsOop = FourBallsOop;
        }
        public void handleSpeed(){
            this.x=this.x + this.speed;
        }
        public void drawBall() {
            FourBallsOop.ellipse(this.x, this.y, this.diameter, this.diameter);
        }
    }
    public static final int WIDTH = 680;
    public static final int HEIGHT = 480;
    Ball ball1;
    Ball ball2;
    Ball ball3;
    Ball ball4;

    public static void main(String[] args) {
        PApplet.main("FourBallsOop",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        ball1= new Ball(0,HEIGHT/5 ,15,1,this);
        ball2= new Ball(0,(HEIGHT*2)/5 ,15,2,this);
        ball3= new Ball(0,(HEIGHT*3)/5 ,15,3,this);
        ball4= new Ball(0,(HEIGHT*4)/5,15,4,this);
    }

    @Override
    public void draw() {
        ball1.drawBall();
        ball1.handleSpeed();
        ball2.drawBall();
        ball2.handleSpeed();
        ball3.drawBall();
        ball3.handleSpeed();
        ball4.drawBall();
        ball4.handleSpeed();
    }
}
