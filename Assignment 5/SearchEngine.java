import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SearchEngine {
    // Example data
    private List<String> data = List.of(
            "Example string containing keyword",
            "Another example string without keyword",
            "Yet another string with the keyword"
    );

    public List<String> search(String keyword) {
        List<String> results = new ArrayList<>();
        for (String item : data) {
            if (item.contains(keyword)) {
                results.add(item);
            }
        }
        return results;
    }

    public List<String> search(String keyword, Date startDate, Date endDate) {
        // Implement search by date range
        return null;
    }

    public List<String> search(String keyword, Date startDate, Date endDate, int relevanceThreshold) {
        // Implement search by date range and relevance threshold
        return null;
    }

    public List<String> search(int relevanceThreshold) {
        // Implement search by relevance threshold
        return null;
    }

    public static void main(String[] args) {
        SearchEngine searchEngine = new SearchEngine();
        // Example usage of different search methods
        List<String> results1 = searchEngine.search("keyword");
        List<String> results2 = searchEngine.search("keyword", new Date(), new Date());
        List<String> results3 = searchEngine.search("keyword", new Date(), new Date(), 5);
        List<String> results4 = searchEngine.search(5);

        // Print out results for demonstration
        System.out.println("Results for search(\"keyword\"): " + results1);
        System.out.println("Results for search(\"keyword\", startDate, endDate): " + results2);
        System.out.println("Results for search(\"keyword\", startDate, endDate, relevanceThreshold): " + results3);
        System.out.println("Results for search(relevanceThreshold): " + results4);
    }
}
