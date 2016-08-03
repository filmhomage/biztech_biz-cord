import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.fasterxml.jackson.databind.ObjectMapper;
// 省略

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = JacksonAutoConfiguration.class)
public class RoomControllerTest {

    @Autowired
    private ObjectMapper mapper;

    // 省略

    @Test
    public void testGet__Ok() throws Exception {
        int id = 123;
        mvc.perform(get("/fooes/{id}", id))
            .andExpect(status().isOk())
            .andExpect(content().json(mapper.writeValueAsString(new Foo(id, "foo-" + id)));
    }
}
