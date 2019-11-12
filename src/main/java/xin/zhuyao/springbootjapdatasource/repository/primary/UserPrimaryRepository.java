package xin.zhuyao.springbootjapdatasource.repository.primary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xin.zhuyao.springbootjapdatasource.domain.primary.UserPrimaryEntity;

/**
 * @ClassName UserRepository
 * @Author zy
 * @Date 2019/11/12 13:07
 * @Description UserRepository
 * @Version 1.0
 */
@Repository
public interface UserPrimaryRepository extends JpaRepository<UserPrimaryEntity, Long> {

}
