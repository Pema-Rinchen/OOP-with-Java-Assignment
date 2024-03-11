import java.util.ArrayList;
import java.util.List;

// User class
class User {
    private String userId;
    private String username;
    private List<Post> posts;

    public User(String userId, String username) {
        this.userId = userId;
        this.username = username;
        this.posts = new ArrayList<>();
    }

    // Getters and setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Post> getPosts() {
        return posts;
    }

    // Method to add a post
    public void addPost(Post post) {
        posts.add(post);
    }
}

// Post class
class Post {
    private String postId;
    private String content;
    private User author;
    private List<Comment> comments;

    public Post(String postId, String content, User author) {
        this.postId = postId;
        this.content = content;
        this.author = author;
        this.comments = new ArrayList<>();
    }

    // Getters and setters
    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public List<Comment> getComments() {
        return comments;
    }

    // Method to add a comment
    public void addComment(Comment comment) {
        comments.add(comment);
    }
}

// Comment class
class Comment {
    private String commentId;
    private String content;
    private User commenter;

    public Comment(String commentId, String content, User commenter) {
        this.commentId = commentId;
        this.content = content;
        this.commenter = commenter;
    }

    // Getters and setters
    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getCommenter() {
        return commenter;
    }

    public void setCommenter(User commenter) {
        this.commenter = commenter;
    }
}

// Main class
public class SocialMediaPlatform {
    public static void main(String[] args) {
        // Create users
        User user1 = new User("U001", "Alice");
        User user2 = new User("U002", "Bob");

        // Create posts
        Post post1 = new Post("P001", "Hello, world!", user1);
        Post post2 = new Post("P002", "Goodbye, world!", user2);

        // Add comments
        Comment comment1 = new Comment("C001", "Nice post!", user2);
        Comment comment2 = new Comment("C002", "Thanks!", user1);
        post1.addComment(comment1);
        post2.addComment(comment2);

        // Add posts to users
        user1.addPost(post1);
        user2.addPost(post2);

        // Display user posts and comments
        for (User user : List.of(user1, user2)) {
            System.out.println("User: " + user.getUsername());
            for (Post post : user.getPosts()) {
                System.out.println("- Post: " + post.getContent());
                for (Comment comment : post.getComments()) {
                    System.out.println("  - Comment: " + comment.getContent());
                }
            }
        }
    }
}
