package project;

public class Demo9 {
	private int id;
	String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Demo9 c = new Demo9();
		c.setId(10);
		c.setName("Chandu");
		System.out.println(c);
//		System.out.println(c.getId());
//		System.out.println(c.getName());
//		
	}

	@Override
	public String toString() {
		return "Demo9 [id=" + id + ", name=" + name + "]";
	}
}
