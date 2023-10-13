public class TyreFactory {

    public Tyres getTyre(String tyreType){
        if(tyreType == null){
            return null;
        }

        if(tyreType.equalsIgnoreCae("MICHELIN")){
            return new MichelinTyres();
        } else if(tyreType.equalsIgnoreCase("BRIDGESTONE")){
            return new BridgestoneTyres();
        }

        return null;
    }
}