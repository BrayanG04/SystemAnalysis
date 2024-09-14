# Workshop 1: Detection of Motifs in Genetic Data

## Description

This workshop focuses on detecting motifs in an artificial set of genetic sequences. A motif is a string pattern that appears more frequently in a set of sequences.

### Workshop Steps

1. **Create an Artificial Database:**
   - Generate an artificial database with `n` sequences (1000 <= n <= 2000000), of size `m` (5 <= m <= 100).
   - Each sequence should be composed of the nucleotide bases A, C, G, T.
   - The selection probability of each base should be an adjustable parameter.
   - Save the database in a `.txt` file.
   - Consider using a divide-and-conquer or distributed computing strategy to handle the data size.

2. **Define an Algorithm to Find Motifs:**
   - Implement an algorithm to search for motifs of size `s` (4 <= s <= 10) in the database.
   - Examine all possible combinations of nucleotide bases of size `s`.
   - If there are multiple motifs with the same frequency, select the one with the most consecutive repeated bases.

3. **Optimization and Analysis:**
   - Consider an optimized approach to handle the size and complexity of the data.
   - Apply Shannon entropy to filter out sequences with too many repeated bases, eliminating sequences that do not contribute to diversity.

## Usage Instructions

1. **Set Up the Environment:**
   - Ensure the necessary requirements are installed (e.g., Java, Maven, if applicable).
   - Clone this repository and navigate to the workshop folder:
     ```bash
     git clone https://github.com/your_username/SystemAnalysis.git
     cd SystemAnalysis/workshop1
     ```

2. **Generate the Artificial Database:**
   - Adjust parameters such as Database Size, Probability of Bases, Motif Size, number of sequences, and threshold.
   - Run the program by executing `Main.java` to create the artificial database.

3. **Review the Sequences:**
   - Check the `database.txt` file to view the sequences in the generated database.

4. **View the Results:**
   - Check the output to see how many motifs were generated, the motif itself, and the time it took.

## Report

A PDF report describing the process, results, and analysis of the workshop is available in the `workshop1/` folder. Be sure to review the report for a full understanding of the workshop.

## Contributions

If you have suggestions or improvements for this workshop, follow these steps:
1. Fork the repository.
2. Create a new branch for your changes.
3. Make your changes and commit them.
4. Submit a pull request.

## Contact

For any questions or comments related to this workshop, contact:

[gomezrodriguezbrayanc@gmail.com](mailto:gomezrodriguezbrayanc@gmail.com)
