package geekbrains.SpringMvcApplication.Repository;


import geekbrains.SpringMvcApplication.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
