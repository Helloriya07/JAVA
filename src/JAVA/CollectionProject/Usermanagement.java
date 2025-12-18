package CollectionProject;

import javax.sound.midi.Soundbank;
import java.util.*;

public class Usermanagement {
    public static void main(String[] args) {
//       Set<String> user1Roles = new HashSet<>(Arrays.asList("ADMIN","USER"));
//       Users user1 = new Users("Alice",true,user1Roles);
//mock users
        List<User> user = new ArrayList<>();
        user.add(new User("Alice", true,
                new HashSet<>(Arrays.asList("ADMIN", "USER"))));

        user.add(new User("Alisha", false,
                new HashSet<>(Arrays.asList("USER"))));

        user.add(new User("naman", true,
                new HashSet<>(Arrays.asList("Manager"))));

        user.add(new User("koki", false,
                new HashSet<>(Arrays.asList("Hr"))));

        user.add(new User("Jobac", false,
                new HashSet<>(Arrays.asList("ADMIN"))));

        user.add(new User("Roni", true,
                new HashSet<>(Arrays.asList("ADMIN"))));

        user.add(new User("Ashok", true,
                new HashSet<>(Arrays.asList("Prodcut manager"))));

//remove inactive users
        Iterator<User> iterator = user.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().isActive()) {
                iterator.remove();
            }
        }
        //print active user
        System.out.println("Active users");
        for (User users : user)
            System.out.println(users.getName());


        // Count per role
        Map<String, Integer> roleCount = new HashMap<>();
        for (User users: user) {
            for (String role : users.getRoles()) {
                roleCount.put(role, roleCount.getOrDefault(role, 0) + 1);
            }

        }
        System.out.println("Count Users");
        for(Map.Entry<String,Integer> entry :roleCount.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }




    }

