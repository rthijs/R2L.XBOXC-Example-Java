import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ControllerInputDataMapper {

	public static ControllerInputData getControllerInputData(String input) {
		ObjectMapper objectMapper = new ObjectMapper();
		ControllerInputData data = null;
		try {
			data = objectMapper.readValue(input, ControllerInputData.class);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return data;
	}
}
