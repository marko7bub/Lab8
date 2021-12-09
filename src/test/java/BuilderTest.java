import builder.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuilderTest {

    @Test
    public void BuilderAgeTest() {
        User user = User.builder().age(19).occupation("student").gender("m").weight(67).build();
        assertEquals(user.getAge(), 19);
    }

    @Test
    public void BuilderNameTest() {
        User user = User.builder().name("Marko").age(19).occupation("student").gender("m").weight(67).build();
        assertEquals(user.getName(), "Marko");
    }
}
