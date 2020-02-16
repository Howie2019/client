/**
 *
 */
package com.cd.service;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import com.cd.util.MerchantInfoUtil;

/**
 * @author Howie
 */
public class MerchantImplServiceTest {
	MerchantImplService factory;
	MerchantImpl merchantImpl;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		factory = new MerchantImplService();
		merchantImpl = factory.getMerchantImplPort();
	}

	@Test
	public void testSayHello() {

		String result = merchantImpl.sayHello("yuanh11");
		System.out.println("client receive:" + result);
		assertEquals("hello yuanh11", result);

	}

	@Test
	public void testCreateOne() {
		int affectedRows = merchantImpl.createOne(MerchantInfoUtil.randomMerchantInfo());
		System.out.println(affectedRows);
		assertEquals(1, affectedRows);
	}

}
