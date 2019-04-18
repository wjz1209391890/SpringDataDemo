package com.imooc;

import com.imooc.util.JdbcUtil;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() throws Exception
    {
        Connection connection = JdbcUtil.getConnection();
        Assert.assertNotNull(connection);
    }
}
