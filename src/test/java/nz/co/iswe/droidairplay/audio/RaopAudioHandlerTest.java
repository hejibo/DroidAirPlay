package nz.co.iswe.droidairplay.audio;

import java.util.regex.Matcher;

import junit.framework.Assert;

import org.junit.Test;


public class RaopAudioHandlerTest {
	
	@Test
	public void testPatternSdpLine(){
		
		String line = "rtpmap:value";
		Matcher matcher = RaopAudioHandler.s_pattern_sdp_a.matcher(line);
		Assert.assertTrue(matcher.matches());
		
		
		line = "min-latency:11400";
		matcher = RaopAudioHandler.s_pattern_sdp_a.matcher(line);
		Assert.assertTrue(matcher.matches());
		
		//line = "min:latency:11400";
		//matcher = RaopAudioHandler.s_pattern_sdp_a.matcher(line);
		//Assert.assertFalse(matcher.matches());
		
	}
	
	
}
