package fr.iutvalence.rt.robot.alt;

public class TestRobot {
    public static void main(final String... args) {
        final RobotAvecBras robot = new RobotAvecBras(100, 10, 30);
        System.out.println(robot);

        for (int i = 0; i < 10; i++) { robot.avancer(); }
        System.out.println(robot);

        robot.tournerDroite();
        System.out.println(robot);

        for (int i = 0; i < 30; i++) { robot.avancer(); }
        System.out.println(robot);

        robot.tournerDroite();
        System.out.println(robot);

        for (int i = 0; i < 5; i++) { robot.avancer(); }
        System.out.println(robot);

        robot.leverBras();
        System.out.println(robot);

        robot.fermerPince();
        System.out.println(robot);
    }
}
