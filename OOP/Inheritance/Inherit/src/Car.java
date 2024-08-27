public class Car {
    double speed;
    String color;
    int timeSeconds;
    double acceleration;

    public Car(double speed, String color,double acceleration,int timeSeconds) {
        this.speed = speed;
        this.color = color;
        this.acceleration = acceleration;
        this.timeSeconds = timeSeconds;
    }
    public void acc(){
        if((timeSeconds != 0) && acceleration > 0)
        {
            acceleration = speed * timeSeconds;
        }
        System.out.println(acceleration);
    }
}
