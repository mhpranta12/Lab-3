
public class Calculator {
		private double n1;
		private double n2;
		public Calculator(double n1, double n2) {
			super();
			this.n1 = n1;
			this.n2 = n2;
		}
		public Calculator() {
			super();
		}
		public double add(double n1,double n2)
		{
			double res;
			this.n1=n1;
			this.n2=n2;
			res =n1+n2;
			return res;
		}
		public double mul(double n1,double n2)
		{
			double res;
			this.n1=n1;
			this.n2=n2;
			res =n1*n2;
			return res;
		}
		public double div(double n1,double n2)
		{
			double res;
			res =n1/n2;
			return res;
		}
		
}
