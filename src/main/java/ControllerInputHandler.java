import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public interface ControllerInputHandler {

	default public void handleSocketInput(String input) {

		ControllerInputData data = getControllerInputData(input);
		
		// Here you add a call to a method for the controller items you use.
		switch (data.getItem()) {
		case AXIS_L_STICK_HORIZONTAL_AXIS:
			System.out.println(data.toString());
			break;
		case AXIS_L_STICK_VERTICAL_AXIS:
			System.out.println(data.toString());
			break;
		case AXIS_L_TRIGGER:
			System.out.println(data.toString());
			break;
		case AXIS_R_STICK_HORIZONTAL_AXIS:
			System.out.println(data.toString());
			break;
		case AXIS_R_STICK_VERTICAL_AXIS:
			System.out.println(data.toString());
			break;
		case AXIS_R_TRIGGER:
			System.out.println(data.toString());
			break;
		case BUTTON_A:
			System.out.println(data.toString());
			break;
		case BUTTON_B:
			System.out.println(data.toString());
			break;
		case BUTTON_BACK:
			System.out.println(data.toString());
			break;
		case BUTTON_DPAD_DOWN:
			System.out.println(data.toString());
			break;
		case BUTTON_DPAD_LEFT:
			System.out.println(data.toString());
			break;
		case BUTTON_DPAD_RIGHT:
			System.out.println(data.toString());
			break;
		case BUTTON_DPAD_UP:
			System.out.println(data.toString());
			break;
		case BUTTON_GUIDE:
			System.out.println(data.toString());
			break;
		case BUTTON_L_BUMPER:
			System.out.println(data.toString());
			break;
		case BUTTON_L_STICK:
			System.out.println(data.toString());
			break;
		case BUTTON_R_BUMPER:
			System.out.println(data.toString());
			break;
		case BUTTON_R_STICK:
			System.out.println(data.toString());
			break;
		case BUTTON_START:
			System.out.println(data.toString());
			break;
		case BUTTON_X:
			System.out.println(data.toString());
			break;
		case BUTTON_Y:
			System.out.println(data.toString());
			break;
		case DPAD_CENTER:
			System.out.println(data.toString());
			break;
		case DPAD_EAST:
			System.out.println(data.toString());
			break;
		case DPAD_NORTH:
			System.out.println(data.toString());
			break;
		case DPAD_NORTH_EAST:
			System.out.println(data.toString());
			break;
		case DPAD_NORTH_WEST:
			System.out.println(data.toString());
			break;
		case DPAD_SOUTH:
			System.out.println(data.toString());
			break;
		case DPAD_SOUTH_EAST:
			System.out.println(data.toString());
			break;
		case DPAD_SOUTH_WEST:
			System.out.println(data.toString());
			break;
		case DPAD_WEST:
			System.out.println(data.toString());
			break;
		case UNKNOWN:
			System.out.println(data.toString());
			break;
		default:
			break;
		}
	}

	private static ControllerInputData getControllerInputData(String input) {
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
