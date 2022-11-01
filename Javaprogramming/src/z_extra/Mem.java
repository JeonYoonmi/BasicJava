package z_extra;

import java.util.Objects;

public class Mem {

	private String name;

	public Mem(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Mem)) {
			return false;
		}
		Mem other = (Mem) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Mem [name=" + name + "]";
	}
	
	
}
