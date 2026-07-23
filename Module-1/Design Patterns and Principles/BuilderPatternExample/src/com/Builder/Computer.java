package Week__1.Week_1.BuilderPatternExample.src.com.Builder;

public class Computer {
	private  String cpu;
	private int ram;
	private int Storage;
	
	private Computer(Builder builder) {
		this.cpu =  builder.cpu;
		this.ram = builder.ram;
		this.Storage = builder.Storage;
		                  	
	}
	public void display() {
		System.out.println("CPU : "+ cpu);
		System.out.println("RAM : "+ram);
		System.out.println("STORAGE : "+ Storage);
		System.out.println();
	}
	public static class Builder{
		private String cpu;
		private int ram;
		private int Storage;
		
		public Builder setcpu(String cpu) {
			this.cpu = cpu;
			return this;
		}
		public Builder setRam(int ram) {
			this.ram= ram;
			return this;
		}
		public Builder setStorage(int storage) {
			this.Storage = storage;
			return this;
		}
		public Computer build() {
			return new Computer(this);
		}
	}

}
