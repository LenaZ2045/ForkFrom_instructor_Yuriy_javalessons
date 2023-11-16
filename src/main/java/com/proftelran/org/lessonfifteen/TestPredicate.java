package com.proftelran.org.lessonfifteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestPredicate {

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Alex", "Admin", 25),
                new User("Oleg", "Member", 45),
                new User("Max", "Member", 20));

//        List<User> admins = collect(users);
//        System.out.println(admins);

        Predicate<User> userAdminPredicate = user -> "Admin".equals(user.getRole());

        boolean test = userAdminPredicate.test(users.get(1));
        System.out.println("User with name " + users.get(1) + " is admin = " + test);

        List<User> adminList = collect(users, userAdminPredicate);
        System.out.println("Admin users " + adminList);

        Predicate<User> memberUser = user -> "Member".equals(user.getRole());
        List<User> memberList = collect(users, memberUser);
        System.out.println("Member users " + memberList);

        Predicate<User> ageUser = user -> user.getAge() > 30;
        List<User> oldUsers = collect(users, ageUser);
        System.out.println("Old users " + oldUsers);

    }

    private static List<User> collect(List<User> users, Predicate<User> filter) {
        List<User> result = new ArrayList<>();
        for (User user : users) {
            if (filter.test(user)) {
                result.add(user);
            }
        }
        return result;
    }
}
