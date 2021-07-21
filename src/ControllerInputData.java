
public class ControllerInputData {

	private Integer controllerIndex;
	private ControllerButtons item;
	private Float value;

	public Integer getControllerIndex() {
		return controllerIndex;
	}

	public void setControllerIndex(Integer controllerIndex) {
		this.controllerIndex = controllerIndex;
	}

	public ControllerButtons getItem() {
		return item;
	}

	public void setItem(ControllerButtons item) {
		this.item = item;
	}

	public Float getValue() {
		return value;
	}

	public void setValue(Float value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "controller :" + controllerIndex + ": " + item.name() + " - " + value;
	}

}
