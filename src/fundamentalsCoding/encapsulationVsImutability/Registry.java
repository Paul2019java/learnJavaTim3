package fundamentalsCoding.encapsulationVsImutability;

import java.util.List;

public class Registry {

    private List<Name> names;

    public Registry(List<Name> names) {
        this.names = names;
    }

    public List<Name> getNames() {
       return names;
    }

    public void print() {
        /*
        // enhanced FOR LOOP
        for(Name name : names){
            System.out.println(name);
        }*/

        // FOR LOOP
        for(int i=0; i < names.size(); i++){
            System.out.println(names.get(i));
        }


    }

/*    public void addName(Name name) {
        this.names.add(name);
    }*/
}
