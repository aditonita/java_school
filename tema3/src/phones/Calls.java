package phones;

import java.util.ArrayList;
import java.util.List;

public class Calls {
	private List<Call> calls = new ArrayList<Call>();

	public List<Call> getCalls() {
		return calls;
	}

	public void addCall(Call call) {
		this.calls.add(call);
	}

}
