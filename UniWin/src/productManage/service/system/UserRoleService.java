package productManage.service.system;

/**
 * @author wangye
 * @date 创建时间2016-03-02
 */

import java.util.List;

import productManage.model.wy.Role;
import productManage.model.wy.UserRole;

public interface UserRoleService {
	public List<UserRole> findAll();
	
	public void save(UserRole userRole);//保存一条用户角色信息
	
	public List<UserRole> findByUserId(int userId);//根据用户编码来查询该用户的角色
	
	public void delete(String userRoleId);//根据用户角色id删除记录
	
	public List<Role> findRoleOfUser(int userId);
	
	public void delete(String userId,String roleID);
}
