class Post {
    public void publish() {
        System.out.println("This is a generic post.");
    }
}

class TextPost extends Post {
    public void publish() {
        System.out.println("This is a text post.");
    }
}

class ImagePost extends Post {
    public void publish() {
        System.out.println("This is an image post.");
    }
}

class VideoPost extends Post {
    public void publish() {
        System.out.println("This is a video post.");
    }
}

public class SocialMediaSystem {
    public static void main(String[] args) {
        Post textPost = new TextPost();
        Post imagePost = new ImagePost();
        Post videoPost = new VideoPost();
        textPost.publish();
        imagePost.publish();
        videoPost.publish();
    }
}
