import java.util.LinkedList;

public class election {
        public static void main(String[] args) {
            heap election = new heap();
            LinkedList<String> candidates = new LinkedList<>();
            candidates.add("Marcus Fenix");
            candidates.add("Dominic Santiago");
            candidates.add("Damon Baird");
            candidates.add("Cole Train");
            candidates.add("Anya Stroud");

            election.initializeCandidates(candidates);

            int p = 5; // Number of electorate votes

            election.castVote("Cole Train");
            election.castVote("Cole Train");
            election.castVote("Marcus Fenix");
            election.castVote("Anya Stroud");
            election.castVote("Anya Stroud");

            System.out.println("Top 3 candidates after 5 votes: " + election.getTopKCandidates(3));

            election.rigElection("Marcus Fenix", 2);

            System.out.println("Top 3 candidates after rigging the election: " + election.getTopKCandidates(3));

            System.out.println("Audit of the election:");
            election.auditElection();
            //System.out.println("Top 3 candidates after auditing the election: " + election.getTopKCandidates(3));
        }
    }

