import java.util.HashMap;
import java.util.Map;

/**
 * a simplified voting machine that allows you to add candidates and cast votes.
 * it also prints out the results with the number of votes each candidate has received.
 */
public class VotingMachine {

    // map to store candidate names and their vote counts
    private Map<String, Integer> candidates;

    /**
     * constructs a new voting machne with an empty list of candidates.
     */
    public VotingMachine() {
        candidates = new HashMap<>();
    }

    /**
     * adds a candidate to the list with the specified name.
     * initially, the candidate has 0 votes.
     * 
     * @param name the name of the candidate to be added.
     */
    public void addCandidate(String name) {
        // check if the candidate is already in the list
        if (!candidates.containsKey(name)) {
            candidates.put(name, 0); // new candidate starts with 0 votes
        }
    }

    /**
     * casts a vote to the candidate with the specified name.
     * 
     * @param name the name of the candidate to cast a vote for.
     */
    public void castVote(String name) {
        // if candidate exists, increment their vote count
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1);
        }
    }

    /**
     * returns a string representation of the candidates and their vote counts.
     * the format is: "candidate: number of votes"
     * 
     * @return a string with all candidates and their vote totals.
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append(" votes\n");
        }
        return result.toString();
    }

    // main method for testing the class
    public static void main(String[] args) {
        VotingMachine vm = new VotingMachine();
        vm.addCandidate("Alsobrooks");
        vm.castVote("Alsobrooks");
        vm.addCandidate("Hogan");

        // print the results of the voting
        System.out.println(vm.toString());
    }
}
