## Mybatis-Plus通过注解自定义SQL语句

其实Mybatis-Plus在Mybatis的基础上封装了CRUD,故保留着原来的功能!

和以前的Mybatis使用相同

示例:

1. 在UserMapper定义SQL语句

   ```java
   public interface UserMapper extends BaseMapper<User> {
   
       // 自定义sql语句查询(查询数据库中其他表)
       @Select(" select *  from sys_user")
       public List<User> findAllUser();
   }
   ```

2. 在UserService接口中写入方法

   ```java
   public interface UserService extends IService<User> {
       public List<User> findAllUser();
   }
   ```

3. 在UserService.java中实现方法

   ```java
   @Service
   public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
   
       @Autowired
       private UserMapper userMapper;
   
       // 调用自己的sql语句查询
       @Override
       public List<User> findAllUser() {
           return userMapper.findAllUser();
       }
   }
   ```

4. 在UserController中调用

   ```java
   @RestController
   @RequestMapping("/user")
   public class UserController {
   
       @Autowired
       UserService userService;
   
       @GetMapping("/index")
       public User index(){
           return userService.getById(1L);
       }
   
       @PostMapping("/save")
       public Result save(@Validated @RequestBody User user) {
           return Result.succ(user);
       }
   
       // 自定义sql语句查询其他表数据
       @GetMapping("/all")
       public List<User> findAllUser(){
           return userService.findAllUser();
       }
   }
   ```

   ### 这样就可以实现自定义SQL语句了

   还可以通过相应的注解写入复杂的SQL语句

