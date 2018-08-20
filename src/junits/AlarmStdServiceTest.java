package junits;

import static org.junit.Assert.*;

import org.junit.Test;

import service.AlarmStdService;

public class AlarmStdServiceTest {

	@Test
	public void testGetAllAlarmStd() {
		AlarmStdService ass = new AlarmStdService();
		System.out.println(ass.getAllAlarmStd());
	}

}
