public class Falcon_9 {
    // Space X Falcon 9
    static public double THRUST = 8127000; // N
    static public double initialMass = 595000; // kg (Carburant compris)
    // Carburant
        // Les propulseurs de l'étage 1 s’éteignent à 158s.
    static private double ergol1 = 475000; // kg
    static public double floor1ConsumptionIgnitionTime = 0;
    static public double floor1ConsumptionExtinctionTime = 158;
    static private double floor1ConsumptionDuration = floor1ConsumptionExtinctionTime - floor1ConsumptionIgnitionTime;
    static public double consumption1 = ergol1 / floor1ConsumptionDuration; // Consommation du carburant par seconde

        // Les propulseurs de l'étage 2 s'allume 8s après la séparation de l'étage 1 (166s) et s'éteignent à 397s.
    static private double ergol2 = 112000; // kg
    static public double floor2ConsumptionTime1 = 166;
    static public double floor2ConsumptionTime2 = 397;
    static private double floor2ConsumptionDuration = floor2ConsumptionTime2 - floor2ConsumptionTime1;
    static public double consumption2 = ergol2 / floor2ConsumptionDuration; // Consommation du carburant par seconde
}

/*
 * Sources :
 * https://fr.wikipedia.org/wiki/Falcon_9#Comparaison_des_versions_du_lanceur
 * https://www.lefigaro.fr/fig-data/falcon-9-la-fusee-d-elon-musk-qui-va-emmener-thomas-pesquet-vers-l-iss-20210421/
 */