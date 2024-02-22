public class TrafficLightController {
    private TrafficLightState state;

    public TrafficLightController(){
        state = new RedState();
    }

    public void setState(TrafficLightState state){
        this.state = state;
    }

    public TrafficLightState getState(){
        return state;
    }
}