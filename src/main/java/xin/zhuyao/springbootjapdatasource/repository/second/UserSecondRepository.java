package xin.zhuyao.springbootjapdatasource.repository.second;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xin.zhuyao.springbootjapdatasource.domain.second.UserSecondEntity;

/**
 * @ClassName UserRepository
 * @Author zy
 * @Date 2019/11/12 13:07
 * @Description UserRepository
 * @Version 1.0
 */
@Repository
public interface UserSecondRepository extends JpaRepository<UserSecondEntity, Long> {

}
