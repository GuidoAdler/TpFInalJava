public class EmptyTPsException extends Exception {

    @Override
    public String getMessage(){
        return "You  have  already  corrected  all  the  tps";
    }

}