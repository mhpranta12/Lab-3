
public class Rectangle {
		private double height;
		private double weight;
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		public double getWeight() {
			return weight;
		}
		public void setWeight(double weight) {
			this.weight = weight;
		}
		@Override
		public String toString() {
			return "Rectangle [height=" + height + ", weight=" + weight + "]";
		}
		public Rectangle(double height, double weight) {
			super();
			this.height = height;
			this.weight = weight;
		}
		public double Calculatearea()
		{
			this.height= height;
			this.weight=weight;
			double a;
			a=height*weight;
			return a;
		}
		
}
