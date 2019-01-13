package collection.step4;

public class House implements Comparable<House>{
	int area;
	int price;
	String city;
	boolean hasFurniture;
	
	public House(int area, int price, String city, boolean hasFurniture)
	{
		this.area = area;
		this.price = price;
		this.city = city;
		this.hasFurniture = hasFurniture;
		this.printRes();
	}
	
	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("House{");
		sb.append("area=").append(area);
		sb.append(", price=").append(price);
		sb.append(", city='").append(city).append('\'');
		sb.append(", hasFurniture=").append(hasFurniture);
		sb.append('}');
		return sb.toString();
	}
	
	public int compareTo(House anotherHouse)
	{
		return Integer.compare(this.area, anotherHouse.area);
	}

	class A {
		public int n = 1;
		public int getInt() {
			return 1;
		}
	}
	class  B extends A {
		public int n = 2;
		public int getInt() {
			return 2;
		}
	}

	public void printRes() {
		A a = new B();
		System.out.println(a.getInt());
		System.out.println(a.n);
	}


}