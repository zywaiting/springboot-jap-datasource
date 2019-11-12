package xin.zhuyao.springbootjapdatasource.domain.primary;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @ClassName UserSecondEntity
 * @Author zy
 * @Date 2019/11/12 13:00
 * @Description UserSecondEntity
 * @Version 1.0
 */
@Data
@Entity
@NoArgsConstructor
@Table(name = "t_user")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserPrimaryEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    /**
     * 名称
     */
    String name;

    /**
     * 性别
     */
    String sex;
}
