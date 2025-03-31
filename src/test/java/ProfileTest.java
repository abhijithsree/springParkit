import com.carparking.project.Application;
import com.carparking.project.entities.Slots;
import com.carparking.project.helper.SlotsHelper;
import com.carparking.project.service.AdruinoService;
import com.carparking.project.service.ImageService;
import com.carparking.project.service.ProfileService;
import com.carparking.project.service.SlotsService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK,classes = Application.class)
@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:application-test.properties")
@ExtendWith(SpringExtension.class)
@ExtendWith(MockitoExtension.class)
public class ProfileTest {


    private final String FORM_ID="250874001847053";
    @Autowired
    private MockMvc mockMvc;  // MockMvc will be injected by Spring

    @Mock
    private ImageService imageService;


    @Test
    public void testprofilecreation() throws Exception {
        String jsonPayload = "{ \"sensorId\": \"123\", \"status\": \"active\" }";
        Map<String,String>  requestmap = new HashMap<>();
        MvcResult result = mockMvc.perform( post("/updateSensor")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonPayload)) // Attach JSON body
                .andExpect(status().isOk())
                .andReturn();

        String responseBody = result.getResponse().getContentAsString();
        Assertions.assertTrue(responseBody.contains("up"),responseBody);
        System.out.println("Response: " + responseBody);
    }
}
