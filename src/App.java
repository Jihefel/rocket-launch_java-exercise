public class App {
    public static void main(String[] args) throws Exception {
        Rockets.launch(480000, Falcon_9.THRUST, Falcon_9.initialMass, Falcon_9.floor1ConsumptionExtinctionTime,
                Falcon_9.floor2ConsumptionTime1, Falcon_9.floor2ConsumptionTime2, Falcon_9.consumption1,
                Falcon_9.consumption2);
    }
}
