package example;

import java.util.Date;

import nl.wilcotomassen.loremdatum.generator.dates.DateGeneratorConfiguration;
import nl.wilcotomassen.loremdatum.generator.numerical.FloatGeneratorConfiguration;
import nl.wilcotomassen.loremdatum.timeline.TimelineDataPoint;
import nl.wilcotomassen.loremdatum.timeline.TimelineSeries;

public class TimelineExample {

	public static void main(String[] args) {
		
		FloatGeneratorConfiguration valueGen = new FloatGeneratorConfiguration();
		valueGen.initiator = 1000;
		valueGen.naProbability = 0.01f;
		
		
		TimelineSeries tl = new TimelineSeries(
				new DateGeneratorConfiguration(), 
				valueGen);
		
		for (int i = 0; i < 100; i++) {
			TimelineDataPoint dp = tl.next();
			Date t = dp.getDate();
			Float v = (Float) dp.getValue();
			
			System.out.println(t.toString() + "\t" + v);
		}
		

	}

}

