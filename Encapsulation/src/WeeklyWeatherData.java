
public class WeeklyWeatherData {

		static int NUMDAYS = 7;
		private double[] rainFall = { 5.34, 2.34, 0.0, 0.0, 3.23, 0.0, 2.42 };
		private double[] avrPressure = { 99.3, 95.34, 101.3, 98.42, 103.4, 100.0, 102.87 };
		private double avrRain;
		private double maxRain;
		
		public void setData(double[] rain, double[] pressure) {
			rainFall = rain;
			avrPressure = pressure;
		}
		
		public void calculateStats() {
			maxRain = 0.0;
			double rainSum = 0.0;
			
			for(int i = 0; i < rainFall.length; i++) {
				if(rainFall[i] >= maxRain) {
					maxRain = rainFall[i];
				} // end if
				rainSum += rainFall[i];
			} //end for
			avrRain = rainSum/NUMDAYS;
		}
		
		public double getAvrRain() {
			return avrRain;
		}
		
		public double getMaxRain() {
			return maxRain;
		}

}
