import java.util.ArrayList;
import java.util.List;

public class Blog {
    List<BlogPost> listOfBlogs = new ArrayList<>();
    public void add(BlogPost blogPost) {
        this.listOfBlogs.add(blogPost);
    }
    public void delete(int index) {
        this.listOfBlogs.remove(index);
    }
    public void update(int index, BlogPost blogPost) {
        this.listOfBlogs.set(index, blogPost);
    }
}
