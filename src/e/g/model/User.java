package e.g.model;

public class User {
	private int object_id;
	private int type_id;
	private String object_name;
	private int lo;
	private int df;
	public int getObject_id() {
		return object_id;
	}
	public void setObject_id(int object_id) {
		this.object_id = object_id;
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public String getObject_name() {
		return object_name;
	}
	public void setObject_name(String object_name) {
		this.object_name = object_name;
	}
	public int getLo() {
		return lo;
	}
	public void setLo(int lo) {
		this.lo = lo;
	}
	public int getDf() {
		return df;
	}
	public void setDf(int df) {
		this.df = df;
	}
	@Override
	public String toString() {
		return "{\"object_id\":" + "\""+object_id+"\"" + ", \"type_id\":" + "\""+type_id+"\""
				+ ", \"object_name\":" + "\""+object_name+"\"" + ", \"lo\":" + "\""+lo+"\"" + ", \"df\":" + "\""+df+"\""
				+ "}";
	}
}
