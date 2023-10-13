public class Vehicle {

    public void makeVehicle1(){
        SpeakerFactory speakerFactory = new SpeakerFactory();
        Speakers speakers = SpeakerFactory.getSpeaker("SONY");
        System.out.println(speakers.makeSound());

        TyreFactory tyreFactory = new TyreFactory();
        Tyres tyres = TyreFactory.getTyre("MICHELIN");
        System.out.println(tyres.rotate());

    }

}