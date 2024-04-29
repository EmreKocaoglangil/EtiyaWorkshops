import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

class UserManager<T extends BaseClass<Integer>> {
    private List<T> userList;

    public UserManager() {
        this.userList = new ArrayList<>();
    }

    public void add(T user) {
        userList.add(user);
    }

    public void update(T user) {
        for (T existingUser : userList) {
            if (existingUser.getId().equals(user.getId())) {

                ((User) existingUser).setFirstname(((User) user).getFirstname());
                ((User) existingUser).setLastname(((User) user).getLastname());
                ((User) existingUser).setEmail(((User) user).getEmail());
                ((User) existingUser).setPassword(((User) user).getPassword());
                existingUser.setUpdatedDate(new Date());
                return;
            }
        }
        System.out.println("User not found for updating!");
    }

    public void delete(T user) {
        Iterator<T> iterator = userList.iterator();
        while (iterator.hasNext()) {
            T existingUser = iterator.next();
            if (existingUser.getId().equals(user.getId())) {
                iterator.remove();
                return;
            }
        }
        System.out.println("User not found !");
    }

    public List<T> getList() {
        return userList;
    }

    public T getById(Integer id) {
        for (T user : userList) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }
}