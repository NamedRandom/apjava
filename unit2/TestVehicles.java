class TestVehicles{
    public static void main(String[] args){
        Car slowCar = new Car();
        Car fastCar = new Car("red",100.0);

        System.out.println("slowCar's speed: "+slowCar.getSpeed()+" slowCar's color: "+slowCar.getColor());
        slowCar.setSpeed(45);
        slowCar.setColor("green");
        System.out.println("slowCar's speed: "+slowCar.getSpeed()+" slowCar's color: "+slowCar.getColor());
        System.out.println(slowCar);
        slowCar.go();
        slowCar.go(50);
        slowCar.stop();


        System.out.println("fastCar's speed: "+fastCar.getSpeed()+" fastCar's color: "+fastCar.getColor());
        fastCar.setSpeed(0);
        fastCar.setColor("yellow");
        System.out.println("fastCar's speed: "+fastCar.getSpeed()+" fastCar's color: "+fastCar.getColor());
        System.out.println(fastCar);
        fastCar.go();
        fastCar.go(120);
        fastCar.stop();
    }
}
