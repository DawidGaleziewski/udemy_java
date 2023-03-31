import java.util.List;

public class Main {
    public static void main(String[] args) {
        // in general letters used for Type parameters:
        // - T for type
        // - E for element
        // - K for Key used for map types
        // - N for number
        // - V for value
        //using generic class
        // Catapult is a reference type, String is type parameter and string catapult is variable name
        Catapult<Cow> cowCatapult = new Catapult<>(); // we can leave the type parameter empty here, this is called diamond operator and is a shorthand, java will infer the type here to be initialized
        var betsy = new Cow();
        var mike = new FootballPlayer("Mike");
        //cowCatapult.load(mike); //as we specified in generic that this class instance will handle only objects of type Cow we cannot load anything else
        cowCatapult.load(betsy); // but this works as expected

        // Worth mentioning we CANNOT use primitive types in generics
        // var intTeam = new Team<int>();
        var integerTeam = new Team<Integer>(); // but wrapper classes are ok

        // we can narrow generic down using 'extends' so that only types that implement certain interfaces/are inheriting from certain calsses can be used
        // var sportsTeam = new SportsTeam<Integer>(); // wont work
        var sportsTeam = new SportsTeam<FootballPlayer>(); // FootballPlayer implements Player interface so this is fine
    }
}

// java supports both generic classes, interfaces and methods
//
class Catapult<T>{ // T is a type identifier
    private T ammo;

    public void load(T ammo){
        this.ammo = ammo;
    }
}

class Cow {
}

// If we do not specify upper bound of the generic, its type will be Object
class Team<T>{ // instead of creating classes like BaseballTeam and FotballTeam we can create more generic class
    List<T> teamMembers;

    public void addTeamMember(T member){
        if(teamMembers.contains(member)){
            System.out.println("Member already exists");
        } else {
            teamMembers.add(member);
        }
    }
}

class SportsTeam<T extends Player>{ // we can narrow down the type so that we can use only types that implement certain interfaces

}

interface Player {
    void plays();
    void earnsPay();
    void ranksUp();
}
class FootballPlayer implements Player {
    String name;
    public FootballPlayer(String name){
        this.name = name;
    }

    @Override
    public void plays() {

    }

    @Override
    public void earnsPay() {

    }

    @Override
    public void ranksUp() {

    }
}