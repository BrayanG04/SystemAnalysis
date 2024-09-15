import java.util.Random;

public class GenerateDatabase {

    /* Genero secuencias teniendo en cuenta la probabilidad de que salga cada 
    base, el tamaño de la secuencia y la cantidad y la devuelvo en una lista*/
    public static String[] generateDatabase(int nSeq, int seqSize, double probA, double probC, double probG, double probT) {
        String[] database = new String[nSeq];
        Random random = new Random();

        for (int i = 0; i < nSeq; i++) {
            StringBuilder sequence = new StringBuilder();
            for (int j = 0; j < seqSize; j++) {
                double r = random.nextDouble();
                if (r < probA) {
                    sequence.append('A');
                } else if (r < probA + probC) {
                    sequence.append('C');
                } else if (r < probA + probC + probG) {
                    sequence.append('G');
                } else {
                    sequence.append('T');
                }
            }
            database[i] = sequence.toString();
        }

        return database;
    }
}