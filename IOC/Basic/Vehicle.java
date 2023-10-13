public class Vehicle {

    public void makeVehicle1(){
        SonySpeakers sonySpeakers = new SonySpeakers;
        System.out.println(sonySpeakers.makeSound());
        MichelinTyres michelinTyres = new MichelinTyres;
        System.out.println(michelinTyres.rotate());
    }

    public void makeVehicle2(){
        SonySpeakers sonySpeakers = new SonySpeakers;
        System.out.println(sonySpeakers.makeSound());
        MichelinTyres michelinTyres = new MichelinTyres;
        System.out.println(michelinTyres.rotate());
    }

}