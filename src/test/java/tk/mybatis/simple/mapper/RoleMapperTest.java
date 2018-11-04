package tk.mybatis.simple.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import tk.mybatis.simple.model.SysRole;

public class RoleMapperTest extends BaseMapperTest {
	@Test
	public void testSelectById() {
		SqlSession sqlSession=getSqlSession();
		try {
			RoleMapper roleMapper=sqlSession.getMapper(RoleMapper.class);
			SysRole role=roleMapper.selectById(1l);
			Assert.assertNotNull(role);
			Assert.assertEquals("管理员", role.getRoleName());
		}
		finally {
			sqlSession.close();
		}
	}
	
	@Test
	public void testSelectById2() {
		SqlSession sqlSession=getSqlSession();
		try {
			RoleMapper roleMapper=sqlSession.getMapper(RoleMapper.class);
			SysRole role=roleMapper.selectById2(1l);
			Assert.assertNotNull(role);
			Assert.assertEquals("管理员", role.getRoleName());
		}
		finally {
			sqlSession.close();
		}
	}
	
	@Test
	public void testInsert() {
		SqlSession sqlSession=getSqlSession();
		try {
			RoleMapper roleMapper=sqlSession.getMapper(RoleMapper.class);
			SysRole role=new SysRole();
			role.setRoleName("test");
			int result=roleMapper.insert(role);
			Assert.assertNotNull(result);
			Assert.assertNotNull(role.getId());
		}
		finally {
			sqlSession.rollback();
			sqlSession.close();
		}
	}
	
	@Test
	public void testInsert2() {
		SqlSession sqlSession=getSqlSession();
		try {
			RoleMapper roleMapper=sqlSession.getMapper(RoleMapper.class);
			SysRole role=new SysRole();
			role.setRoleName("test");
			int result=roleMapper.insert2(role);
			Assert.assertNotNull(result);
			Assert.assertNotNull(role.getId());
		}
		finally {
			sqlSession.rollback();
			sqlSession.close();
		}
	}
	
	@Test
	public void testUpdateById() {
		SqlSession sqlSession=getSqlSession();
		try {
			RoleMapper roleMapper=sqlSession.getMapper(RoleMapper.class);
			SysRole role=new SysRole();
			role.setId(1l);
			role.setRoleName("test");
			int result=roleMapper.updateById(role);
			Assert.assertNotNull(result);
			Assert.assertEquals("test", roleMapper.selectById(1l).getRoleName());
		}
		finally {
			sqlSession.rollback();
			sqlSession.close();
		}
	}
	
	@Test
	public void testDeleteById() {
		SqlSession sqlSession=getSqlSession();
		try {
			RoleMapper roleMapper=sqlSession.getMapper(RoleMapper.class);
			int result=roleMapper.deleteById(1l);
			Assert.assertEquals(1, result);
		}
		finally {
			sqlSession.rollback();
			sqlSession.close();
		}
	}
	
	@Test
	public void testSelectByIdPro() {
		SqlSession sqlSession=getSqlSession();
		try {
			RoleMapper roleMapper=sqlSession.getMapper(RoleMapper.class);
			SysRole role=roleMapper.selectByIdPro(1l);
			Assert.assertNotNull(role);
		}
		finally {
			sqlSession.rollback();
			sqlSession.close();
		}
	}
}
