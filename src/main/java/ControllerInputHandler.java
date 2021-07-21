import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ControllerInputHandler {

	public static void handleSocketInput(String input) {

		ControllerInputData data = getControllerInputData(input);
		
		// Here you add a call to a method for the controller items you use.
		switch (data.getItem()) {
		case AXIS_L_STICK_HORIZONTAL_AXIS:
			break;
		case AXIS_L_STICK_VERTICAL_AXIS:
			break;
		case AXIS_L_TRIGGER:
			break;
		case AXIS_R_STICK_HORIZONTAL_AXIS:
			break;
		case AXIS_R_STICK_VERTICAL_AXIS:
			break;
		case AXIS_R_TRIGGER:
			break;
		case BUTTON_A:
			if (data.getValue().equals(Float.valueOf(1f))) {
				System.out.println("Button A was pressed");
			} else {
				System.out.println("Button A was released");
			}
			break;
		case BUTTON_B:
			break;
		case BUTTON_BACK:
			break;
		case BUTTON_DPAD_DOWN:
			break;
		case BUTTON_DPAD_LEFT:
			break;
		case BUTTON_DPAD_RIGHT:
			break;
		case BUTTON_DPAD_UP:
			break;
		case BUTTON_GUIDE:
			break;
		case BUTTON_L_BUMPER:
			break;
		case BUTTON_L_STICK:
			break;
		case BUTTON_R_BUMPER:
			break;
		case BUTTON_R_STICK:
			break;
		case BUTTON_START:
			break;
		case BUTTON_X:
			break;
		case BUTTON_Y:
			break;
		case DPAD_CENTER:
			break;
		case DPAD_EAST:
			break;
		case DPAD_NORTH:
			break;
		case DPAD_NORTH_EAST:
			break;
		case DPAD_NORTH_WEST:
			break;
		case DPAD_SOUTH:
			break;
		case DPAD_SOUTH_EAST:
			break;
		case DPAD_SOUTH_WEST:
			break;
		case DPAD_WEST:
			break;
		case UNKNOWN:
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
