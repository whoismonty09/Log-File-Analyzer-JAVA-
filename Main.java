import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> lines = List.of(
                "INFO Application started",
                "WARNING Disk space low",
                "ERROR Database connection failed",
                "INFO User logged in",
                "ERROR File not found",
                "WARNING Memory usage high",
                "INFO Application stopped"
        );

        int errorCount = 0;
        int warningCount = 0;
        int infoCount = 0;

        for (String line : lines) {
            if (line.contains("ERROR")) errorCount++;
            else if (line.contains("WARNING")) warningCount++;
            else if (line.contains("INFO")) infoCount++;
        }

        System.out.println("Log Analysis Report developed by Monty");
        System.out.println("INFO Count: " + infoCount);
        System.out.println("WARNING Count: " + warningCount);
        System.out.println("ERROR Count: " + errorCount);
    }
}
