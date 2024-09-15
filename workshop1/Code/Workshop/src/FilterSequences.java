import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FilterSequences {

    /*Leo linea por linea la base de datos y devuelvo una lista con todos los datos del archivo*/  
    public static List<String> readDatabase(String filename) throws IOException {
        List<String> database = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                database.add(line);
            }
        }
        return database;
    }

    /*Cuento la cantidad que una base aparece en una secuencia y calculo la entropia utilizando la formula de 
    Shannon para la entropia de una distribución de probabilidad*/

    public static double calculateEntropy(String sequence) {
        int[] freqs = new int[4];
        for (char base : sequence.toCharArray()) {
            switch (base) {
                case 'A' -> freqs[0]++;
                case 'C' -> freqs[1]++;
                case 'G' -> freqs[2]++;
                case 'T' -> freqs[3]++;
            }
        }

        double entropy = 0;
        for (int freq : freqs) {
            double p = (double) freq / sequence.length();
            entropy -= p * Math.log(p) / Math.log(2);
        }

        return entropy;
    }

    /*Le calculo la entropia a cada  secuencia, si la entropia de mi secuencia es mayor al umbral la agrego a  
    la lista de secuencias filtradas*/


    public static List<String> filterSequences(List<String> database, double threshold) {
        List<String> filteredDatabase = new ArrayList<>();

        for (String sequence : database) {
            double entropy = calculateEntropy(sequence);
            if (entropy > threshold) {
                filteredDatabase.add(sequence);
            }
        }

        return filteredDatabase;
    }
}