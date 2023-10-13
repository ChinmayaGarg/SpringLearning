public class SpeakerFactory {

    public Speakers getSpeaker(String speakerType){
        if(speakerType == null){
            return null;
        }

        if(speakerType.equalsIgnoreCae("SONY")){
            return new SonySpeakers();
        } else if(speakerType.equalsIgnoreCase("BOSE")){
            return new BoseSpeakers();
        }

        return null;
    }
}