package com.example.demo.repository;

import com.example.demo.exceptionFiles.AttackOnLoginException;
import com.example.demo.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    final int MAXIMUM_OF_BAD_LOGIN = 2;
    private final Map<Integer, User> usersDatabase;

    public UserRepository() {
        usersDatabase = new HashMap<>();

        usersDatabase.put(1, new User("cracker", "cracker1234", true, 0));
        usersDatabase.put(2, new User("marry", "marietta!#09", true, 0));
        usersDatabase.put(3, new User("silver", "$silver$", true, 0));
    }

    public boolean checkLogin(final String login, final String password)throws AttackOnLoginException  {
        for(int i = 1;i<=usersDatabase.size();i++){
           if(usersDatabase.get(i).getLogin().contains(login)){
               if(usersDatabase.get(i).getIncorrectLoginCounter()>MAXIMUM_OF_BAD_LOGIN) throw new AttackOnLoginException();
               if(usersDatabase.get(i).getPassword().contains(password)){
                   usersDatabase.get(i).resetIncorrectLoginCounter();

                   return true;}
                usersDatabase.get(i).addIncorrectLoginCounter();
               //tutaj jest zreowany;
           }
        }
        return false;
    }
}
