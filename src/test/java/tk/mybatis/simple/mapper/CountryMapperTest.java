package tk.mybatis.simple.mapper;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import tk.mybatis.simple.model.Country;

public class CountryMapperTest {
	private static SqlSessionFactory sqlSessionFactory;
	
	@BeforeClass
	public static void init() {
		try {
			Reader reader=Resources.getResourceAsReader("mybatis-config.xml");
			sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		}
		catch(IOException ioe){
			
		}
	}
	
	@Test
	public void testSelectAll() {
		SqlSession sqlsession=sqlSessionFactory.openSession();
		try {
			List<Country> country=sqlsession.selectList("tk.mybatis.simple.mapper.CountryMapper.selectAll");
			printList(country);
		}
		finally {
			sqlsession.close();
		}
	}
	
	private void printList(List<Country> list) {
		for(Country c:list) {
			System.out.printf("%-4d%4s%4s\n",c.getId(),c.getCountryname(),c.getCountrycode());
		}
	}
}
