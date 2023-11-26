/*
 * Sources :
 * https://fr.wikipedia.org/wiki/Falcon_9#Comparaison_des_versions_du_lanceur
 * https://www.lefigaro.fr/fig-data/falcon-9-la-fusee-d-elon-musk-qui-va-emmener-thomas-pesquet-vers-l-iss-20210421/
 */
public class Rocket {
    static public double ORBIT_ALTITUDE = 408000; // m
    // Space X Falcon 9
    static private double THRUST = 500000; // N
    static private double initialMass = 595000; // kg (Carburant compris)
    // Carburant
        // Les propulseurs de l'étage 1 s’éteignent à 158s.
    static private double ergol1 = 475000; // kg
    static private double floor1ConsumptionTime = 158;
    static private double consumption1 = ergol1 / floor1ConsumptionTime; // Consommation du carburant par seconde
        // Les propulseurs de l'étage 2 s'allume 8s après la séparation de l'étage 1 (166s) et s'éteignent à 397s.
    static private double floor2ConsumptionTime = (397 - 166);
    static private double ergol2 = 112000; // kg
    static private double consumption2 = ergol2 / floor2ConsumptionTime; // Consommation du carburant par seconde

    // Forces de frottements de l'air ignorées, gravité terrestre inchangée avec l'altitude et poussée constante (donc calculs non réalistes)


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

    public static void launch() {
        double mass = initialMass;
        double acceleration = 0; // m/s²
        double time = 0; // s
        double speed = 0; // m/s
        double altitude = 0; // m

        while (altitude < ORBIT_ALTITUDE) {
            if (time < floor1ConsumptionTime) {
                mass -= consumption1;
            }
            if (time >= 166 && time < 397) {
                mass -= consumption2;
            }
            acceleration = calculateAcceleration(THRUST, mass);
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
