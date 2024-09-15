import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DetectMotif {

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

    /*Genero todas las posibles combinaciones de las bases con  un tamaño de s y las devuelvo todas en una lista*/

    public static List<String> generateMotifs(int s) {
        List<String> motifs = new ArrayList<>();
        char[] bases = {'A', 'C', 'G', 'T'};

        for (int i = 0; i < Math.pow(4, s); i++) {
            StringBuilder motif = new StringBuilder();
            for (int j = 0; j < s; j++) {
                motif.append(bases[(i >> (2 * j)) & 3]);
            }
            motifs.add(motif.toString());
        }

        return motifs;
    }
    /* Con un for each recorro la lista que mando como parametro y 
    si el motif esta en la base de datos lo agrego a la lista de resultados*/    

    public static int countMotifOccurrences(List<String> database, String motif) {
        int occurrences = 0;
        for (String sequence : database) {
            if (sequence.contains(motif)) {
                occurrences++;
            }
        }
        return occurrences;
    }

    /*Cuenta la cantidad  de veces que aparece cada motif en la base de datos y
     devuelve el numero mayor entre las apariciones  de cada motif*/    

    public static int countConsecutiveRepeats(String motif) {
        int maxRepeats = 0;
        int currentRepeats = 1;

        for (int i = 1; i < motif.length(); i++) {
            if (motif.charAt(i) == motif.charAt(i - 1)) {
                currentRepeats++;
            } else {
                maxRepeats = Math.max(maxRepeats, currentRepeats);
                currentRepeats = 1;
            }
        }

        return Math.max(maxRepeats, currentRepeats);
    }

    /*Genera los motifs de tamaño s y se recorren contando la cantidad de apariciones de cada uno en la base y al final se devuelve el
     motif que mas se repite*/
    public static String detectMotif(List<String> database, int s) {
        List<String> motifs = generateMotifs(s);
        int maxOccurrences = 0;
        String bestMotif = "";
        int occurrences = 0;
        for (String motif : motifs) {
            occurrences = countMotifOccurrences(database, motif);
            if (occurrences > maxOccurrences) {
                maxOccurrences = occurrences;
                bestMotif = motif;
            } else if (occurrences == maxOccurrences) {
                if (countConsecutiveRepeats(motif) > countConsecutiveRepeats(bestMotif)) {
                    bestMotif = motif;
                }
            }
        }
        System.out.println(occurrences);
        return bestMotif;
    }
}