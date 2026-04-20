public class UseCase11TrainConsistApp {
    private static boolean isValidTrainCode(String code) {
        return code != null && code.matches("TR-[0-9]{4}");
    }

    private static boolean isValidCargoCode(String code) {
        return code != null && code.matches("CG-[A-Z]{2}[0-9]{2}");
    }

    public static void main(String[] args) {
        String trainCode = "TR-1024";
        String cargoCode = "CG-FD31";

        System.out.println("UC11 - Validate Train/Cargo Codes");
        System.out.println("Train code " + trainCode + " valid: " + isValidTrainCode(trainCode));
        System.out.println("Cargo code " + cargoCode + " valid: " + isValidCargoCode(cargoCode));

        System.out.println("\nSample output complete for UC11.");
    }
}
