import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        
        int nSeq = 1567;
        int seqSize = 8;
        double probA = 0.10;
        double probC = 0.25;
        double probG = 0.35;
        double probT = 0.30;
        int sizeMotif = 6;
        double threshold = 1;

        String[] database = GenerateDatabase.generateDatabase(nSeq, seqSize, probA, probC, probG, probT);

        try (FileWriter writer = new FileWriter("database.txt")) {
            for (String sequence : database) {
                writer.write(sequence + "\n");
            }
        }
        
        
        List<String> databaseList = DetectMotif.readDatabase("database.txt");
        
        long startTime = System.nanoTime();
        String motif = DetectMotif.detectMotif(databaseList, sizeMotif);
        long endTime = (System.nanoTime() - startTime);
        
        

        
        List<String> filteredDatabase = FilterSequences.filterSequences(databaseList, threshold);

        try (FileWriter writer = new FileWriter("FilteredDB.txt")) {
            for (String secuenc1 : filteredDatabase) {
                writer.write(secuenc1 + "\n");
            }
        }
        System.out.println(motif);
        System.out.println(endTime);
        System.out.println("\nFiltrada \n");
        
        long startTimeFiltered = System.nanoTime();
        String motifFiltered = DetectMotif.detectMotif(filteredDatabase, sizeMotif);
        long endTimeFiltered = (System.nanoTime() - startTimeFiltered);

        
        System.out.println(motifFiltered);
        System.out.println(endTimeFiltered);
    }
}