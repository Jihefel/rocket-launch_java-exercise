
public class Rockets {
    /* Formule de l'accélération a = F/m */
    private static double calculateAcceleration(double thrust, double mass) {
        double g = 9.81;
        double gravityForce = mass * g;
        if (thrust <= gravityForce) {
            System.out.println("Décollage impossible : la poussée est trop faible.");
            return 0;
        }
        return (thrust - gravityForce) / mass;
    }

    /* Formule du MRUA : △x = vi ⋅ △t + 1/2 ⋅ a ⋅ △t^2 */
    private static double calculateAltitude(double speed, double time, double acceleration) {
        return speed * time + (acceleration / 2) * Math.pow(time, 2);
    }

    // Forces de frottements de l'air ignorées, gravité terrestre inchangée avec l'altitude et poussée constante (donc calculs non réalistes)
    public static void launch(double maxAltitude, double thrust, double initialMass, double floor1ConsumptionTime2, double floor2ConsumptionTime1, double floor2ConsumptionTime2, double consumption1, double consumption2) {
        double mass = initialMass;
        double acceleration = 0; // m/s²
        double time = 0; // s
        double speed = 0; // m/s
        double altitude = 0; // m

        while (altitude < maxAltitude) {
            if (time < floor1ConsumptionTime2) {
                mass -= consumption1;
            }
            if (time >= floor2ConsumptionTime1 && time < floor2ConsumptionTime2) {
                mass -= consumption2;
            }
            acceleration = calculateAcceleration(thrust, mass);
            if (acceleration == 0) {
                break;
            }
            /* Formule de la vitesse : v = a*t */
            speed = acceleration * time;
            altitude = calculateAltitude(speed, time, acceleration);
            time++;

            System.out.println("Masse actuelle : " + mass + " kg");
            System.out.println("Acceleration actuelle : " + acceleration + " m/s²");
            System.out.println("Vitesse actuelle : " + speed + " m/s");
            System.out.println("Altitude actuelle : " + altitude + " m");
            System.out.println("Temps actuel : " + time + " s");
            System.out.println();
        }
    }
}
