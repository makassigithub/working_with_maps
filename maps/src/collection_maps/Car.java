package collection_maps;

public class Car {

	private String made;
	private String series;
	private long millage;
	private boolean isNew;
	
	public Car(String md,String ser,long mil,boolean cond){
		made = md;
		series = ser;
		millage=mil;
		isNew = cond;
	}
	
	public String getMade() {
		return made;
	}
	public void setMade(String made) {
		this.made = made;
	}
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public long getMillage() {
		return millage;
	}
	public void setMillage(long millage) {
		this.millage = millage;
	}
	public boolean isNew() {
		return isNew;
	}
	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	@Override
	public String toString() {
		return "["+ made + "-"+ series + "-"+ millage + "-"+ isNew + "]";
	}
	
	
}
