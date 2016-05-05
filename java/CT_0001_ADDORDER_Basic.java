package eaidelegation;

import de.o2.eai.citrus.EaiRcsTestNgCitrusTest;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class CT_0001_ADDORDER_Basic extends EaiRcsTestNgCitrusTest {

	@Test
	(groups={"integration_test1"})

	public void trigger(ITestContext testContext) {
		executeTest(testContext);
	}
}
