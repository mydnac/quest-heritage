public class Hangar{


    public static void main(String[] args) {
        Car mercedes = new Car("Mercedes");
        Car peugeot = new Car("Peugeot");

        Boat titanic = new Boat("Titanic");
        Boat costaConcordia = new Boat("Costa Concordia");

        System.out.println(mercedes.doStuff());
        System.out.println(peugeot.doStuff());
        System.out.println(titanic.doStuff());
        System.out.println(costaConcordia.doStuff());
}
}