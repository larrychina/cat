package com.dianping.cat.message.spi.core;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.unidal.lookup.ComponentTestCase;

public class MessagePathBuilderTest extends ComponentTestCase {

	private MessagePathBuilder m_pathBuilder;

	@Before
	public void prepare() throws Exception {
		m_pathBuilder = lookup(MessagePathBuilder.class);
	}

	@Test
	public void test_getHdfsPath() {
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
		Locale.setDefault(Locale.CHINESE);
		Assert.assertEquals("20121220/17/UNKNOWN/00-c0a82050", m_pathBuilder.getHdfsPath("UNKNOWN-c0a82050-376665-314"));
	}
}
