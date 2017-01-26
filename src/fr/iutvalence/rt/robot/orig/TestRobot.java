package fr.iutvalence.rt.robot.orig;

/**
 * Created by tony on 26/01/2017.
 */
public class TestRobot {
    public static void main(final String... args) {
        RobotAvecBras robot = new RobotAvecBras(100, 10, 30);
        System.out.println(robot);

        for (int i = 0; i < 10; i++)
            robot.avancer();
        System.out.println(robot);

        robot.tournerDroite();
        System.out.println(robot);

        for (int i = 0; i < 30; i++)
            robot.avancer();
        System.out.println(robot);

        robot.tournerDroite();
        System.out.println(robot);

        for (int i = 0; i < 5; i++)
            robot.avancer();
        System.out.println(robot);

        robot.leverBras();
        System.out.println(robot);

        robot.fermerPince();
        System.out.println(robot);
    }
}
