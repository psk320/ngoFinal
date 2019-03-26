package com.cts.ngo.dao;
import java.util.*;

import com.cts.ngo.bean.User;

public interface UserDAO {
public List<User> getUsers();
public void saveUser(User theUser);
}
