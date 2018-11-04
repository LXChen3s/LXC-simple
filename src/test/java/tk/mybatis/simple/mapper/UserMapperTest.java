package tk.mybatis.simple.mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import tk.mybatis.simple.model.SysPrivilege;
import tk.mybatis.simple.model.SysRole;
import tk.mybatis.simple.model.SysUser;

public class UserMapperTest extends BaseMapperTest {
	
	@Test
	public void testSelectById() {
		SqlSession sqlSession=getSqlSession();
		try {
			UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			SysUser user=userMapper.selectById(1l);
			Assert.assertNotNull(user);
			Assert.assertEquals("admin", user.getUserName());
		}
		finally {
			sqlSession.close();
		}
	}
	
	@Test
	public void testSelectAll() {
		SqlSession sqlSession=getSqlSession();
		try {
			UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			List<SysUser> users=userMapper.selectAll();
			Assert.assertNotNull(users);
		}
		finally {
			sqlSession.close();
		}
	}
	
	@Test
	public void testSelectRolesByUserId() {
		SqlSession sqlSession=getSqlSession();
		try {
			UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			List<SysRole> roles=userMapper.selectRolesByUserId(1l);
			for(SysRole role:roles) {
				System.out.println(role.getRoleName());
			}
			Assert.assertNotNull(roles);
		}
		finally {
			sqlSession.close();
		}
	}
	
	@Test
	public void testInsert() {
		SqlSession sqlSession=getSqlSession();
		try {
			UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			SysUser user=new SysUser();
			user.setUserName("test1");
			user.setCreateTime(new Date());
			int result=userMapper.insert(user);
			Assert.assertEquals(1, result);
			Assert.assertNull(user.getId());
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
			UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			SysUser user=new SysUser();
			user.setUserName("test1");
			user.setCreateTime(new Date());
			int result=userMapper.insert2(user);
			Assert.assertEquals(1, result);
			Assert.assertNotNull(user.getId());
			System.out.println(user.getId());
		}
		finally {
			sqlSession.rollback();
			sqlSession.close();
		}
	}
	
	@Test
	public void testInsert3() {
		SqlSession sqlSession=getSqlSession();
		try {
			UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			SysUser user=new SysUser();
			user.setUserName("test1");
			user.setCreateTime(new Date());
			int result=userMapper.insert3(user);
			Assert.assertEquals(1, result);
			Assert.assertNotNull(user.getId());
			System.out.println(user.getId());
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
			UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			SysUser user=new SysUser();
			user.setId(1l);
			user.setUserName("test1");
			user.setCreateTime(new Date());
			int result=userMapper.updateById(user);
			Assert.assertEquals(1, result);
			System.out.println(user.getUserName());
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
			UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			userMapper.deleteById(1l);
			Assert.assertNull(userMapper.selectById(1l));
		}
		finally {
			sqlSession.rollback();
			sqlSession.close();
		}
	}
	
	@Test
	public void testSelectRolesByUserIdAndEnabled() {
		SqlSession sqlSession=getSqlSession();
		try {
			UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			List<SysRole> result=userMapper.selectRolesByUserIdAndEnabled(1l, new Integer(1));
			Assert.assertNotNull(result);
		}
		finally {
			sqlSession.rollback();
			sqlSession.close();
		}
	}
	@Test
	public void testSelectRolesByUserIdAndEnabled2() {
		SqlSession sqlSession=getSqlSession();
		try {
			UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			SysUser user=new SysUser();
			user.setId(1l);
			SysRole role=new SysRole();
			role.setEnable(1l);
			List<SysRole> result=userMapper.selectRolesByUserIdAndEnabled2(user, role);
			Assert.assertNotNull(result);
		}
		finally {
			sqlSession.rollback();
			sqlSession.close();
		}
	}
	
	@Test
	public void testSelectByUser() {
		SqlSession sqlSession=getSqlSession();
		try {
			System.out.println("----------testSelectByUser----------");
			UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			SysUser user=new SysUser();
			user.setUserName("ad");
			List<SysUser> users=userMapper.selectByUser(user);
			Assert.assertNotNull(users);
		}
		finally {
			sqlSession.close();
		}
	}
	
	@Test
	public void testSelectByUser2() {
		SqlSession sqlSession=getSqlSession();
		try {
			System.out.println("----------testSelectByUser2----------");
			UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			SysUser user=new SysUser();
			user.setUserName("ad");
			List<SysUser> users=userMapper.selectByUser2(user);
			Assert.assertNotNull(users);
		}
		finally {
			sqlSession.close();
		}
	}
	
	@Test
	public void testUpdateByUser() {
		SqlSession sqlSession=getSqlSession();
		try {
			System.out.println("----------testUpdateByUser----------");
			UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			SysUser user=new SysUser();
			user.setId(1l);
			user.setUserName("ad");
			int result=userMapper.updateByUser(user);
			Assert.assertEquals(result, 1);
		}
		finally {
			sqlSession.rollback();;
			sqlSession.close();
		}
	}
	
	@Test
	public void testInsertByUser() {
		SqlSession sqlSession=getSqlSession();
		try {
			System.out.println("----------testInsertByUser----------");
			UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			SysUser user=new SysUser();
			user.setUserName("ad");
			int result=userMapper.insertByUser(user);
			Assert.assertEquals(result, 1);
		}
		finally {
			sqlSession.rollback();;
			sqlSession.close();
		}
	}
	
	@Test
	public void testSelectByIdList() {
		SqlSession sqlSession=getSqlSession();
		try {
			System.out.println("----------testSelectByIdList----------");
			UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			List<Long> list=new ArrayList<Long>();
			list.add(1l);
			list.add(2l);
			list.add(1l);
			//注意校验
			if(list.size()>1) {
				List<SysUser> result=userMapper.selectByIdList(list);
				Assert.assertTrue(result.size()>=1);
			}
		}
		finally {
			sqlSession.rollback();;
			sqlSession.close();
		}
	}
	
	@Test
	public void testInsertByList() {
		SqlSession sqlSession=getSqlSession();
		try {
			System.out.println("----------testInsertByList----------");
			UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			List<SysUser> users=new ArrayList<SysUser>();
			SysUser user=new SysUser();
			user.setUserName("asd");
			users.add(user);
			users.add(user);
			users.add(user);
			//注意校验
			if(users.size()>1) {
				int result=userMapper.insertByList(users);
				Assert.assertTrue(result==3);
			}
			for(SysUser userf:users) {
				System.out.println(userf.getId());
			}
		}
		finally {
			sqlSession.rollback();;
			sqlSession.close();
		}
	}
	
	@Test
	public void testUpdateByMap() {
		SqlSession sqlSession=getSqlSession();
		try {
			System.out.println("----------testUpdateByMap----------");
			UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			Map<String,Object> map=new HashMap<String,Object>();
			map.put("id", 1L);
			map.put("user_name", "asd");
			//注意校验
			if(map.size()>1) {
				int result=userMapper.updateByMap(map);
				Assert.assertTrue(result>=1);
			}
		}
		finally {
			sqlSession.rollback();;
			sqlSession.close();
		}
	}
	
	@Test
	public void testSelectUserAndRoleById() {
		SqlSession sqlSession=getSqlSession();
		try {
			System.out.println("----------testSelectUserAndRoleById----------");
			UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			SysUser user=userMapper.selectUserAndRoleById(1001l);
			Assert.assertNotNull(user.getRole());
		}
		finally {
			sqlSession.rollback();
			sqlSession.close();
		}
	}
	@Test
	public void testSelectUserAndRoleById2() {
		SqlSession sqlSession=getSqlSession();
		try {
			System.out.println("----------testSelectUserAndRoleById2----------");
			UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			SysUser user=userMapper.selectUserAndRoleById2(1001l);
			Assert.assertNotNull(user.getRole());
		}
		finally {
			sqlSession.rollback();
			sqlSession.close();
		}
	}
	@Test
	public void testSelectUserAndRoleById3() {
		SqlSession sqlSession=getSqlSession();
		try {
			System.out.println("----------testSelectUserAndRoleById3----------");
			UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			SysUser user=userMapper.selectUserAndRoleById3(1001l);
			Assert.assertNotNull(user.getRole());
		}
		finally {
			sqlSession.rollback();
			sqlSession.close();
		}
	}
	@Test
	public void testSelectUserAndRoleById4() {
		SqlSession sqlSession=getSqlSession();
		try {
			System.out.println("----------testSelectUserAndRoleById4----------");
			UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			SysUser user=userMapper.selectUserAndRoleById4(1001l);
			Assert.assertNotNull(user.getRole());
		}
		finally {
			sqlSession.rollback();
			sqlSession.close();
		}
	}
	@Test
	public void testSelectUserAndRoleById5() {
		SqlSession sqlSession=getSqlSession();
		try {
			System.out.println("----------testSelectUserAndRoleById5----------");
			UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			SysUser user=userMapper.selectUserAndRoleById5(1001l);
			Assert.assertNotNull(user.getRole());
		}
		finally {
			sqlSession.rollback();
			sqlSession.close();
		}
	}
	@Test
	public void testSelectUserAndRoleById6() {
		SqlSession sqlSession=getSqlSession();
		try {
			System.out.println("----------testSelectUserAndRoleById6----------");
			UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			SysUser user=userMapper.selectUserAndRoleById6(1001l);
			//lazyLoadTriggerMathods 属性
			//user.equals(null);
			Assert.assertNotNull(user.getRole());
		}
		finally {
			sqlSession.rollback();
			sqlSession.close();
		}
	}
	@Test
	public void testSelectUserAndRoleById7() {
		SqlSession sqlSession=getSqlSession();
		try {
			System.out.println("----------testSelectUserAndRoleById7----------");
			UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			List<SysUser> users=userMapper.selectUserAndRoleById7();
			System.out.println("用户数:"+users.size());
			for(SysUser user:users) {
				System.out.println("用户名:"+user.getUserName());
				for(SysRole role:user.getRoles()) {
					System.out.println("角色名:"+role.getRoleName());
				}
			}
		}
		finally {
			sqlSession.rollback();
			sqlSession.close();
		}
	}
	@Test
	public void testSelectUserAndRoleById8() {
		SqlSession sqlSession=getSqlSession();
		try {
			System.out.println("----------testSelectUserAndRoleById8----------");
			UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			List<SysUser> users=userMapper.selectUserAndRoleById8();
			System.out.println("用户数:"+users.size());
			for(SysUser user:users) {
				System.out.println("用户名:"+user.getUserName());
				for(SysRole role:user.getRoles()) {
					System.out.println("  角色名:"+role.getRoleName());
					for(SysPrivilege privilege:role.getPrivileges()) {
						System.out.println("    权限名:"+privilege.getPrivilegeName());
					}
				}
			}
		}
		finally {
			sqlSession.rollback();
			sqlSession.close();
		}
	}
	/*
	 * 一级缓存,存在于SqlSession周期中，insert、delete、update会清空一级缓存
	 */
	@Test
	public void testCache1() {
		SqlSession sqlSession=getSqlSession();
		SysUser user1=null;
		try {
			System.out.println("----------testSelectUserAndRoleById8----------");
			UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			user1=userMapper.selectById(1l);
			System.out.println("user1:"+user1.getUserName());
			user1.setUserName("admin2");
			SysUser user2=userMapper.selectById(1l);
			System.out.println("user2:"+user2.getUserName());
			//user1、user2是同一个对象
			Assert.assertEquals(user1, user2);
		}
		finally {
			sqlSession.rollback();
			sqlSession.close();
		}
		/*
		 * 上边使用的是一级缓存，sqlsession关闭后开始使用二级缓存（存在于SqlSessionFactory生命周期中）
		 */
		System.out.println("开始新sqlsession");
		sqlSession=getSqlSession();
		try {
			UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			SysUser user3=userMapper.selectById(1l);
			System.out.println("user3:"+user3.getUserName());
			SysUser user4=userMapper.selectById(1l);
			System.out.println("user4:"+user4.getUserName());
			//user3、user4不是同一个对象，反序列化生成
			Assert.assertNotEquals(user3, user4);
		}
		finally {
			sqlSession.rollback();
			sqlSession.close();
		}
	}
}
